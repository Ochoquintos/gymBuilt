package com.example.myapplication.Routines

fun generateAbdominalsWorkout():Map<String,String> {

    val abdsCategories = mutableMapOf(
        "Rectus Abdominis" to listOf(
            "Crunches", "Hanging Leg Raises", "Ab Wheel Rollouts", "Cable Crunches",
            "Reverse Crunches", "Sit-Ups", "Plank-to-Pike on Stability Ball"
        ),
        "Transverse Abdominis" to listOf(
            "Plank",
            "Stomach Vacuum",
            "Dead Bug",
            "Pallof Press",
            "Bird Dog",
            "Side Plank",
            "Knee Tucks"
        ),
        "External Obliques" to listOf(
            "Russian Twists", "Side Plank with Hip Dips", "Bicycle Crunches", "Woodchoppers",
            "Mountain Climbers", "Twisting Sit-Ups", "Oblique V-Ups"
        ),
        "Internal Obliques" to listOf(
            "Side Plank with Rotation", "Cable Rotations", "Hanging Side Knee Raises",
            "Torso Twists", "Side Crunches", "Lying Windshield Wipers", "Standing Oblique Crunches"
        ),
        "Erector Spinae" to listOf(
            "Plank Variations", "Deadlifts", "Bird Dog", "Superman Hold",
            "Stir the Pot", "Farmer’s Carry", "Loaded Carries"
        ),
        "Multifidus" to listOf(
            "Plank Variations", "Deadlifts", "Bird Dog", "Superman Hold",
            "Stir the Pot", "Farmer’s Carry", "Loaded Carries"
        )
    )

    val workout = workoutGenerator(abdsCategories)
    return workout

}