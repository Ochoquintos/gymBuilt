package com.example.myapplication.Routines

fun generateArmsWorkout(arms:Int, biceps:Int, triceps:Int): Map<String, String> {
    // Define categories
    val bicepsCategory = mutableMapOf(
        "Long Head Bicep" to mutableListOf<String>(),
        "Short Head Bicep" to mutableListOf(),
        "Brachialis" to mutableListOf(),
        "Coracobrachialis" to mutableListOf()
    )

    val tricepsCategory = mutableMapOf(
        "Long Head Tricep" to mutableListOf<String>(),
        "Lateral Head Tricep" to mutableListOf(),
        "Medial Head Tricep" to mutableListOf()
    )

    val armsCategory = mutableMapOf(
        "Extensors" to mutableListOf<String>(),
        "Flexors" to mutableListOf(),
        "Brachioradialis" to mutableListOf()
    )

    // Populate exercises in categories
    bicepsCategory["Long Head Bicep"]?.addAll(
        listOf("Incline Dumbbell Curl", "Overhead Cable Curl", "Drag Curl")
    )
    bicepsCategory["Short Head Bicep"]?.addAll(
        listOf("Preacher Curl", "Hammer Curl", "Concentration Curl")
    )
    bicepsCategory["Brachialis"]?.addAll(
        listOf("Reverse Curl", "Zottman Curl", "Alternating Dumbbell Curl")
    )
    bicepsCategory["Coracobrachialis"]?.addAll(
        listOf("Dumbbell Front Raise", "Pull-over")
    )

    tricepsCategory["Long Head Tricep"]?.addAll(
        listOf("Overhead Triceps Extension", "Dips", "Triceps Kickback", "Single Arm Overhead Triceps Extension")
    )
    tricepsCategory["Lateral Head Tricep"]?.addAll(
        listOf("Close-Grip Bench Press", "Triceps Pushdown", "Reverse-Grip Triceps Pushdown")
    )
    tricepsCategory["Medial Head Tricep"]?.addAll(
        listOf("Reverse-Grip Dumbbell Triceps Extension", "Triceps Pressdown", "Close-Grip Bench Press")
    )

    armsCategory["Extensors"]?.addAll(
        listOf("Wrist Extensions", "Reverse Wrist Curls", "Wrist Roller")
    )
    armsCategory["Flexors"]?.addAll(
        listOf("Dead Hangs", "Cable Wrist Flexion")
    )
    armsCategory["Brachioradialis"]?.addAll(
        listOf("Zottman Curls", "Reverse Curls")
    )

    // Define muscles to include
    val musclesToInclude = listOf(
        listOf("Extensors", "Flexors"),
        listOf("Long Head Bicep", "Short Head Bicep"),
        listOf("Long Head Tricep", "Lateral Head Tricep")
    )

    // Define list categories and importance
    val listCategories = listOf(armsCategory, bicepsCategory, tricepsCategory)
    val listImportance = listOf(arms,biceps,triceps)

    // Generate workout using the workoutGenerator function
    return workoutGenerator(
        listCategories = listCategories,
        listImportance = listImportance,
        musclesToInclude = musclesToInclude
    )
}
