package com.example.myapplication.Routines

fun generateChestWorkout():Map<String,String>{
    val chestCategories: MutableMap<String, List<String>> = mutableMapOf(
        "Upper Pectoralis Major" to emptyList(),
        "Middle Pectoralis Major" to emptyList(),
        "Lower Pectoralis Major" to emptyList(),
        "Pectoralis Minor" to emptyList(),
        "Serratus Anterior" to emptyList(),
        "Subclavius" to emptyList()
    )

    chestCategories["Upper Pectoralis Major"] = listOf(
        "Cable Crossover",
        "Dumbbell Bench Press",
        "Incline Dumbbell Fly",
        "Lean Back Cable Presses",
        "Upper Chest Upper Cut"
    )

    chestCategories["Middle Pectoralis Major"] = listOf(
        "Upper Cable Crossover",
        "One-arm Dumbbell Bench Press",
        "Dumbbell Pullover"
    )

    chestCategories["Lower Pectoralis Major"] = listOf(
        "Jackhammer Pushdown",
        "Standing Cable LC Press"
    )

    chestCategories["Pectoralis Minor"] = listOf(
        "Chest Dips",
        "Standing Fly",
        "Dumbbell Fly on Bench"
    )

    chestCategories["Serratus Anterior"] = listOf(
        "Dumbbell Pullover",
        "Unilateral Banded Chest Press",
        "Incline Dumbbell Shoulder Raise"
    )

    chestCategories["Subclavius"] = listOf(
        "Dumbbell Shrug",
        "Overhead Dumbbell Stability Press"
    )

// Generate a workout using the workoutGenerator function
    val workout = workoutGenerator(chestCategories)

// Print the generated workout
    return workout
}