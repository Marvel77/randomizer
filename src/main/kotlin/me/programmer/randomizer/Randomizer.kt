package me.programmer.randomizer

class Randomizer {

    private val exercises = mutableListOf<Exercise>()

    fun randomExercise(): Exercise {
        if (exercises.isEmpty()) throw IllegalStateException("Пожалуйста, наполните список упражнений")
        return exercises.random()
    }

    fun randomExercise(quantity: Int): List<Exercise> {
        if (exercises.isEmpty()) throw IllegalStateException("Пожалуйста, наполните список упражнений")

        val result = mutableListOf<Exercise>()

        for (i: Int in 1 .. quantity) result.add(exercises.random())

        return result
    }

    fun addExercise(exercise: Exercise) {
        exercises.add(exercise)
    }

}