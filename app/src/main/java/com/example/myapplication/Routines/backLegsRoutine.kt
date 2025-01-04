package com.example.myapplication.Routines

fun generateBackLegsWorkout():Map<String,String>{
    val backLegsCategories: MutableMap<String, List<String>> = mutableMapOf(
        "Gluteus Maximus" to emptyList(),
        "Gluteus Medius" to emptyList(),
        "Gluteus Minimus" to emptyList(),
        "Biceps Femoris" to emptyList(),
        "Semitendinosus" to emptyList(),
        "Semimembranosus" to emptyList(),
        "Gastrocnemius" to emptyList(),
        "Soleus" to emptyList()
    )

    backLegsCategories["Gluteus Maximus"] = listOf(
        "Hip Thrusts",
        "Deadlifts",
        "Bulgarian Split Squats",
        "Glute Bridges",
        "Step-Ups",
        "Reverse Lunges"
    )

    backLegsCategories["Gluteus Medius"] = listOf(
        "Side-Lying Leg Raises",
        "Banded Side Walks",
        "Cable Hip Abduction",
        "Single-Leg Deadlifts",
        "Lateral Step-Ups",
        "Clamshells",
        "Curtsy Lunges"
    )

    backLegsCategories["Gluteus Minimus"] = listOf(
        "Hip Abduction Machine",
        "Side Plank with Leg Lift",
        "Standing Cable Hip Abduction",
        "Single-Leg Glute Bridges",
        "Banded Side Steps",
        "Cossack Squats",
        "Lateral Band Walks"
    )

    backLegsCategories["Biceps Femoris"] = listOf(
        "Romanian Deadlifts",
        "Hamstring Curls",
        "Cable Hamstring Curls",
        "Deficit Deadlifts",
        "Kettlebell Swings",
        "Nordic Hamstring Curls"
    )

    backLegsCategories["Semitendinosus"] = listOf(
        "Glute-Ham Raises",
        "Bridge Walkouts",
        "Swiss Ball Leg Curls",
        "Single-Leg Romanian Deadlifts",
        "Lying Hip Extensions"
    )

    backLegsCategories["Semimembranosus"] = listOf(
        "Seated Hamstring Curls",
        "Romanian Deadlifts",
        "Stiff-Legged Deadlifts",
        "Nordic Hamstring Curls",
        "Step-Downs",
        "Deficit Romanian Deadlifts",
        "Cable Pull-Throughs"
    )

    backLegsCategories["Gastrocnemius"] = listOf(
        "Standing Calf Raises",
        "Donkey Calf Raises",
        "Jump Squats",
        "Box Jumps",
        "Hill Sprints",
        "Skipping",
        "Single-Leg Standing Calf Raises"
    )

    backLegsCategories["Soleus"] = listOf(
        "Seated Calf Raises",
        "Tibialis Raises",
        "Incline Walks",
        "Toe Taps",
        "Isometric Calf Holds",
        "Farmer’s Walk on Toes",
        "Bent-Knee Calf Raises"
    )

// Generate the workout
    val workout = workoutGenerator(backLegsCategories)
    return workout

}