package com.example.myapplication.Routines



fun generateFrontLegsWorkout():Map<String,String>{
    val frontLegsCategories: MutableMap<String, List<String>> = mutableMapOf(
        "Rectus Femoris" to emptyList(),
        "Vastus Lateralis" to emptyList(),
        "Vastus Medialis" to emptyList(),
        "Vastus Intermedius" to emptyList(),
        "Psoas Major" to emptyList(),
        "Sartorius" to emptyList()
    )

    frontLegsCategories["Rectus Femoris"] = listOf(
        "Front Squats",
        "Walking Lunges",
        "Bulgarian Split Squats",
        "Leg Press",
        "Step-Ups",
        "Goblet Squats",
        "Hack Squats"
    )

    frontLegsCategories["Vastus Lateralis"] = listOf(
        "Leg Press",
        "Sissy Squats",
        "Barbell Squats",
        "Step-Ups",
        "Single-Leg Press",
        "Bulgarian Split Squats",
        "Walking Lunges (Wide Stance)"
    )

    frontLegsCategories["Vastus Medialis"] = listOf(
        "Close-Stance Leg Press",
        "Heel-Elevated Squats",
        "Terminal Knee Extensions",
        "Sissy Squats",
        "Step-Downs",
        "Goblet Squats",
        "Wall Sits with Ball Squeeze"
    )

    frontLegsCategories["Vastus Intermedius"] = listOf(
        "Barbell Back Squats",
        "Leg Press",
        "Lunges",
        "Hack Squats",
        "Bulgarian Split Squats",
        "Step-Ups",
        "Wall Sits"
    )

    frontLegsCategories["Psoas Major"] = listOf(
        "Hanging Leg Raises",
        "Seated Knee Tucks",
        "Cable Knee Drives",
        "Lying Leg Raises",
        "High-Knee Marches with Resistance Bands",
        "Mountain Climbers",
        "Step-Ups"
    )

    frontLegsCategories["Sartorius"] = listOf(
        "Forward Lunges",
        "Diagonal Step-Ups",
        "Side-Lying Leg Lifts",
        "Clamshells",
        "Knee Tucks",
        "Crossover Lunges",
        "Standing Hip Flexion"
    )


// Generate the workout
    val workout = workoutGenerator(frontLegsCategories)
    return workout
}
