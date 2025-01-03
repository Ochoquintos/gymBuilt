package com.example.myapplication.Routines

fun generateBackWorkout():Map<String, String>{

// Define backCategories map
    val backCategories = mutableMapOf(
        "Latissimus Dorsi" to listOf("Pull-Ups", "Lat Pulldowns", "Barbell Rows", "Single-Arm Dumbbell Rows", "Straight-Arm Pulldown"),
        "Trapezius Upper" to listOf("Barbell Shrugs", "Dumbbell Shrugs", "Face Pulls with External Rotation", "Farmer's Walk"),
        "Trapezius Middle" to listOf("Neutral Face Pulls", "Reverse Flyes", "T-Bar Rows", "Seated Cable Rows"),
        "Trapezius Lower" to listOf("Prone Y Raise", "Cable Y Raise", "Narrow Pull-Ups", "Overhead Shrugs"),
        "Rhomboids" to listOf("Neutral Face Pulls", "Reverse Flyes", "Seated Cable Rows", "Bent-Over Rows", "T-Raise"),
        "Teres Major and Minor" to listOf("Pull-Ups", "Lat Pulldowns", "Dumbbell Pullover", "Face Pulls with External Rotation", "Single-Arm Cable Row"),
        "Erector Spinae" to listOf("Good Morning", "Deadlifts", "Kettlebell Swings", "Hyperextensions/Back Extensions")
    )

// Generate a workout using the workoutGenerator function
    val workout = workoutGenerator(backCategories)

// Print the generated workout
   return workout
}