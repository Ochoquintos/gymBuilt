package com.example.myapplication.Routines



fun generateShouldersWorkout(): Map<String, String> {
// Define shoulderCategories map
    val shoulderCategories = mutableMapOf<String, MutableList<String>>()

// Populate the map with exercises
    shoulderCategories["Anterior Deltoid 1"] = mutableListOf("Overhead Press", "Arnold Press")
    shoulderCategories["Anterior Deltoid 2"] =
        mutableListOf("Front Dumbbell Raise", "Incline Front Raise")
    shoulderCategories["Lateral Deltoid 1"] =
        mutableListOf("Dumbbell Lateral Raie", "Cable Lateral Raise")
    shoulderCategories["Lateral Deltoid 2"] = mutableListOf("Upright Rows", "Incline Front Raise")
    shoulderCategories["Posterior Deltoid 1"] = mutableListOf("Face Pulls", "Rear Delt Rows")
    shoulderCategories["Posterior Deltoid 2"] =
        mutableListOf("Reverse Flyes", "Bent-Over Dumbbell Lateral Raises")

// Generate a workout using the workoutGenerator function
    val workout = workoutGenerator(shoulderCategories)

// Print the generated workout
    return workout
}

