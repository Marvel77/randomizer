package me.programmer.randomizer

class Randomizer {

    private val exercises = mutableListOf<Exercise>()

    fun randomExercise(): Exercise {
        if (exercises.isEmpty()) throw IllegalStateException("Пожалуйста, наполните список упражнений")
        return exercises.random()
    }

    fun addExercise(exercise: Exercise) {
        exercises.add(exercise)
    }

    fun getExercises(): List<Exercise> = exercises

}