package me.programmer.randomizer

import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.booleans.shouldBeTrue
import io.kotest.matchers.collections.shouldContain
import io.kotest.matchers.nulls.shouldNotBeNull
import io.kotest.matchers.shouldBe
import io.kotest.matchers.string.shouldNotBeBlank
import io.kotest.matchers.types.shouldBeTypeOf

class RandomizerSpec : FreeSpec() {


    init {
        "Должен возвращать одно упражнения для выполнения" - {

            val exercise: Exercise = Randomizer().randomExercise()

            exercise.shouldNotBeNull()
            exercise.type.shouldNotBeNull()
            exercise.type.shouldBeTypeOf<ExerciseType>()
            exercise.category.shouldBeTypeOf<ExerciseCategory>()
            exercise.task.shouldNotBeBlank()

        }

        "Должен помещать упражнение в хранилище" - {
            val randomizer = Randomizer()
            val exercise =
                Exercise(ExerciseType.PRACTICE, ExerciseCategory.PATTERNS, "Реализовать паттерн Фабричный метод")

            randomizer.addExercise(exercise)
            randomizer.getExercises().shouldContain(exercise)

        }

        "Должен возвращать из нескольких упражнений случайное" - {

            val randomizer = Randomizer()
            val someExercises = listOf(
                Exercise(ExerciseType.PRACTICE, ExerciseCategory.PATTERNS, "Реализовать паттерн Фабричный метод"),
                Exercise(ExerciseType.PRACTICE, ExerciseCategory.PATTERNS, "Реализовать паттерн Одиночка"),
                Exercise(ExerciseType.THEORY, ExerciseCategory.PATTERNS, "Реализовать паттерн Строитель"),
                Exercise(ExerciseType.THEORY, ExerciseCategory.PATTERNS, "Реализовать паттерн Абстрактная фабрика"),
                Exercise(ExerciseType.THEORY, ExerciseCategory.PATTERNS, "Реализовать паттерн Прототип")
            )

            someExercises.forEach { randomizer.addExercise(it) }

            val actualExercise1 = randomizer.randomExercise()
            val actualExercise2 = randomizer.randomExercise()
            val actualExercise3 = randomizer.randomExercise()

            val isKindOfRandom = (actualExercise1 != actualExercise2) || (actualExercise1 != actualExercise3)
            isKindOfRandom.shouldBeTrue()

        }

    }


}