package me.programmer.randomizer

enum class ExerciseType {
    THEORY, PRACTICE
}

enum class ExerciseCategory {
    PATTERNS
}

data class Exercise(val type: ExerciseType, val category: ExerciseCategory, val task: String)