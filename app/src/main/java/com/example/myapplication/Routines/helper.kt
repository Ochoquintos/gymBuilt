package com.example.myapplication.Routines

import kotlin.random.Random

// Function to get a random exercise from a list
fun randomExercise(exercisesList: List<String>): String {
    val n = exercisesList.size
    val a = Random.nextDouble()
    val index = (a * n).toInt()
    return exercisesList[index]
}

// Function to add a new exercise to the workout
fun addNewExercise(
    exercises: MutableSet<String>,
    workout: MutableMap<String, String>,
    exercisesList: List<String>,
    muscle: String
) {
    val initialSize = exercises.size
    while (exercises.size == initialSize) {
        val exercise = randomExercise(exercisesList)
        if (!exercises.contains(exercise)) {
            workout[muscle] = exercise
            exercises.add(exercise)
        }
    }
}

// Function to generate a workout plan
fun workoutGenerator(
    listCategories: Any,
    listImportance: List<Int>? = null,
    musclesToInclude: List<List<String>>? = null
): Map<String, String> {
    val workout = mutableMapOf<String, String>()
    val exercises = mutableSetOf<String>()

    if (listCategories is Map<*, *>) {
        val category = listCategories as Map<String, List<String>>
        for ((muscle, exercisesList) in category) {
            addNewExercise(exercises, workout, exercisesList, muscle)
        }
    } else if (listCategories is List<*>) {
        val categories = listCategories as List<Map<String, List<String>>>
        listImportance?.forEachIndexed { index, importance ->
            val category = categories[index]
            if (importance == 1) {
                for ((muscle, exercisesList) in category) {
                    addNewExercise(exercises, workout, exercisesList, muscle)
                }
            } else {
                musclesToInclude?.get(index)?.forEach { muscle ->
                    val exercisesList = category[muscle] ?: emptyList()
                    addNewExercise(exercises, workout, exercisesList, muscle)
                }
            }
        }
    }

    return workout
}
