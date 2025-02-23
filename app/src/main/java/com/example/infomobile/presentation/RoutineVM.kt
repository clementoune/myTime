package com.example.infomobile.presentation

data class RoutineVM(
    val title: String = "",
    val description: String= "",
    val horaire: String= ""
)

val routines = listOf(
    RoutineVM("RDV Kiné",
        description = "Séance hebdomadaire",
        horaire = "15h"),

    RoutineVM("Réunion",
        description = "Réunion avec mes collègues de travail",
        horaire = "10h"),

    RoutineVM("Restaurant",
        description = "Repas avec mes amis",
        horaire = "19h")
)