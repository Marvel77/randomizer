package me.programmer.randomizer

fun main() {

    val randomizer = Randomizer()
//    randomizer.addExercise(Exercise(ExerciseType.PRACTICE, ))


    /** Monitoring **/
    randomizer.addExercise(Exercise(ExerciseType.PRACTICE, ExerciseCategory.MONITORING,
        "Monitoring. " +
                "Создайте Spring Boot приложение и постройте мониторинг на каждом уровне в контейнерах при помощи Prometheus и Grafana"))

    /** Patterns Theory **/
    randomizer.addExercise(Exercise(ExerciseType.THEORY, ExerciseCategory.PATTERNS,
        "Patterns. " +
                "Объясните разницу между Адаптером, Декоратором, Фасадом и Заместителем (Proxy). "))

    randomizer.addExercise(Exercise(ExerciseType.THEORY, ExerciseCategory.PATTERNS,
        "Patterns. " +
                "Объясните Адаптер и проблему, которую он решает"))

    randomizer.addExercise(Exercise(ExerciseType.THEORY, ExerciseCategory.PATTERNS,
        "Patterns. " +
                "Объясните Мост и проблему, которую он решает"))

    randomizer.addExercise(Exercise(ExerciseType.THEORY, ExerciseCategory.PATTERNS,
        "Patterns. " +
                "Объясните Компоновщик и проблему, которую он решает"))

    randomizer.addExercise(Exercise(ExerciseType.THEORY, ExerciseCategory.PATTERNS,
        "Patterns. " +
                "Объясните Декоратор и проблему, которую он решает"))

    randomizer.addExercise(Exercise(ExerciseType.THEORY, ExerciseCategory.PATTERNS,
        "Patterns. " +
                "Объясните Фасад и проблему, которую он решает"))

    randomizer.addExercise(Exercise(ExerciseType.THEORY, ExerciseCategory.PATTERNS,
        "Patterns. " +
                "Объясните Легковес и проблему, которую он решает"))

    randomizer.addExercise(Exercise(ExerciseType.THEORY, ExerciseCategory.PATTERNS,
        "Patterns. " +
                "Объясните Заместитель и проблему, которую он решает"))

    randomizer.addExercise(Exercise(ExerciseType.THEORY, ExerciseCategory.PATTERNS,
        "Patterns. " +
                "Объясните Цепочку обязанностей и проблему, которую он решает"))

    randomizer.addExercise(Exercise(ExerciseType.THEORY, ExerciseCategory.PATTERNS,
        "Patterns. " +
                "Объясните Команду и проблему, которую он решает"))


//TODO(yuriy) добавить уровень сложности к заданиям

    /** Patterns Practice **/
    randomizer.addExercise(Exercise(ExerciseType.PRACTICE, ExerciseCategory.PATTERNS,
        "Patterns. " +
                "Придумайте пример из реальной жизни и имплементируйте Адаптер"))

    randomizer.addExercise(Exercise(ExerciseType.PRACTICE, ExerciseCategory.PATTERNS,
        "Patterns. " +
                "Придумайте пример из реальной жизни и имплементируйте Мост"))

    randomizer.addExercise(Exercise(ExerciseType.PRACTICE, ExerciseCategory.PATTERNS,
        "Patterns. " +
                "Придумайте пример из реальной жизни и имплементируйте Компоновщик (Композит)"))

    randomizer.addExercise(Exercise(ExerciseType.PRACTICE, ExerciseCategory.PATTERNS,
        "Patterns. " +
                "Придумайте пример из реальной жизни и имплементируйте Декоратор"))

    randomizer.addExercise(Exercise(ExerciseType.PRACTICE, ExerciseCategory.PATTERNS,
        "Patterns. " +
                "Придумайте пример из реальной жизни и имплементируйте Фасад"))

    randomizer.addExercise(Exercise(ExerciseType.PRACTICE, ExerciseCategory.PATTERNS,
        "Patterns. " +
                "Придумайте пример из реальной жизни и имплементируйте Легковес"))

    randomizer.addExercise(Exercise(ExerciseType.PRACTICE, ExerciseCategory.PATTERNS,
        "Patterns. " +
                "Придумайте пример из реальной жизни и имплементируйте Заместитель"))

    randomizer.addExercise(Exercise(ExerciseType.PRACTICE, ExerciseCategory.PATTERNS,
        "Patterns. " +
                "Придумайте пример из реальной жизни и имплементируйте Цепочка обязанностей"))


    randomizer.addExercise(Exercise(ExerciseType.PRACTICE, ExerciseCategory.PATTERNS,
        "Patterns. " +
                "Придумайте пример из реальной жизни и имплементируйте Команду"))


    //Advanced

    randomizer.addExercise(Exercise(ExerciseType.PRACTICE, ExerciseCategory.PATTERNS,
        "Patterns. " +
                "Имплементируйте Строитель, который пошагово сооружает дерево Компоновщика"))

    randomizer.addExercise(Exercise(ExerciseType.PRACTICE, ExerciseCategory.PATTERNS,
        "Patterns. " +
                "Имплементируйте Цепочку обязанностей, которая сооружает цепочку динамически на базе дерева Компоновщика"))

    randomizer.addExercise(Exercise(ExerciseType.PRACTICE, ExerciseCategory.PATTERNS,
        "Patterns. " +
                "Имплементируйте Компоновщик, который использует Декоратор, чтобы переопределить функции отдельных частей дерева компонентов."))

    randomizer.addExercise(Exercise(ExerciseType.PRACTICE, ExerciseCategory.PATTERNS,
        "Patterns. " +
                "Имплементируйте Компоновщик, который использует Легковес, чтобы сэкономить оперативную память"))

    randomizer.addExercise(Exercise(ExerciseType.PRACTICE, ExerciseCategory.PATTERNS,
        "Patterns. " +
                "Имплементируйте Цепочку обязанностей, где обработчики выполнены в виде Команды. Следом имплементируйте Цепочку обязанностей где Командой будет сам запрос посланный по цепочке объектов"))



    /** Spring Boot **/
    randomizer.addExercise(Exercise(ExerciseType.PRACTICE, ExerciseCategory.SPRING_BOOT,
        "Spring Boot Actuator. " +
                "Придумать и реализовать кастом health check для Actuator`a. " +
                "Закрыть Actuator Spring Security - открыть только для определенных ролей. " +
                "Добавить дополнительные свойства к health endpoint'y. Например, response_code. " +
                "Добавить дополнительную информацию к info endpoint'y. Например, project_name, project_info. " +
                "Расширить стандартный набор метрик при помощи MeterRegistry, добавить custom метрику. " +
                "Реализовать Custom Actuator Endpoint. "))

    println(randomizer.randomExercise())
}

class Application {

}