package me.programmer.randomizer

enum class ExerciseType {
    THEORY, PRACTICE
}

enum class ExerciseCategory {
    PATTERNS,
    SPRING_BOOT,
    MONITORING
}

enum class ExerciseLevel {
    BASIC,
    ADVANCED
}

data class Exercise(val type: ExerciseType, val category: ExerciseCategory, val level: ExerciseLevel, val task: String) {
    override fun toString(): String {
        return task
    }
}