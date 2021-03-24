package me.programmer.randomizer

fun main() {

    val randomizerOfBasics = Randomizer()


    /** Monitoring **/
    randomizerOfBasics.addExercise(Exercise(ExerciseType.PRACTICE, ExerciseCategory.MONITORING, ExerciseLevel.BASIC,
        "Monitoring. " +
                "Создайте Spring Boot приложение и постройте мониторинг на каждом уровне в контейнерах при помощи Prometheus и Grafana"))

    /** Patterns Theory **/
    randomizerOfBasics.addExercise(Exercise(ExerciseType.THEORY, ExerciseCategory.PATTERNS, ExerciseLevel.BASIC,
        "Patterns. " +
                "Объясните разницу между Адаптером, Декоратором, Фасадом и Заместителем (Proxy). "))

    randomizerOfBasics.addExercise(Exercise(ExerciseType.THEORY, ExerciseCategory.PATTERNS, ExerciseLevel.BASIC,
        "Patterns. " +
                "Объясните Адаптер и проблему, которую он решает"))

    randomizerOfBasics.addExercise(Exercise(ExerciseType.THEORY, ExerciseCategory.PATTERNS, ExerciseLevel.BASIC,
        "Patterns. " +
                "Объясните Мост и проблему, которую он решает"))

    randomizerOfBasics.addExercise(Exercise(ExerciseType.THEORY, ExerciseCategory.PATTERNS, ExerciseLevel.BASIC,
        "Patterns. " +
                "Объясните Компоновщик и проблему, которую он решает"))

    randomizerOfBasics.addExercise(Exercise(ExerciseType.THEORY, ExerciseCategory.PATTERNS, ExerciseLevel.BASIC,
        "Patterns. " +
                "Объясните Декоратор и проблему, которую он решает"))

    randomizerOfBasics.addExercise(Exercise(ExerciseType.THEORY, ExerciseCategory.PATTERNS, ExerciseLevel.BASIC,
        "Patterns. " +
                "Объясните Фасад и проблему, которую он решает"))

    randomizerOfBasics.addExercise(Exercise(ExerciseType.THEORY, ExerciseCategory.PATTERNS, ExerciseLevel.BASIC,
        "Patterns. " +
                "Объясните Легковес и проблему, которую он решает"))

    randomizerOfBasics.addExercise(Exercise(ExerciseType.THEORY, ExerciseCategory.PATTERNS, ExerciseLevel.BASIC,
        "Patterns. " +
                "Объясните Заместитель и проблему, которую он решает"))

    randomizerOfBasics.addExercise(Exercise(ExerciseType.THEORY, ExerciseCategory.PATTERNS, ExerciseLevel.BASIC,
        "Patterns. " +
                "Объясните Цепочку обязанностей и проблему, которую он решает"))

    randomizerOfBasics.addExercise(Exercise(ExerciseType.THEORY, ExerciseCategory.PATTERNS, ExerciseLevel.BASIC,
        "Patterns. " +
                "Объясните Команду и проблему, которую он решает"))

    randomizerOfBasics.addExercise(Exercise(ExerciseType.THEORY, ExerciseCategory.PATTERNS, ExerciseLevel.BASIC,
        "Patterns. " +
                "Объясните Итератор и проблему, которую он решает"))

    randomizerOfBasics.addExercise(Exercise(ExerciseType.THEORY, ExerciseCategory.PATTERNS, ExerciseLevel.BASIC,
        "Patterns. " +
                "Объясните Посредник (Mediator) и проблему, которую он решает"))

    randomizerOfBasics.addExercise(Exercise(ExerciseType.THEORY, ExerciseCategory.PATTERNS, ExerciseLevel.BASIC,
        "Patterns. " +
                "Объясните Снимок и проблему, которую он решает"))

    randomizerOfBasics.addExercise(Exercise(ExerciseType.THEORY, ExerciseCategory.PATTERNS, ExerciseLevel.BASIC,
        "Patterns. " +
                "Объясните Наблюдатель и проблему, которую он решает"))

    randomizerOfBasics.addExercise(Exercise(ExerciseType.THEORY, ExerciseCategory.PATTERNS, ExerciseLevel.BASIC,
        "Patterns. " +
                "Объясните Состояние и проблему, которую он решает"))

    randomizerOfBasics.addExercise(Exercise(ExerciseType.THEORY, ExerciseCategory.PATTERNS, ExerciseLevel.BASIC,
        "Patterns. " +
                "Объясните Стратегию и проблему, которую он решает"))

    randomizerOfBasics.addExercise(Exercise(ExerciseType.THEORY, ExerciseCategory.PATTERNS, ExerciseLevel.BASIC,
        "Patterns. " +
                "Объясните Шаблонный метод и проблему, которую он решает"))

    randomizerOfBasics.addExercise(Exercise(ExerciseType.THEORY, ExerciseCategory.PATTERNS, ExerciseLevel.BASIC,
        "Patterns. " +
                "Объясните Посетитель и проблему, которую он решает"))


    /** Patterns Practice **/
    randomizerOfBasics.addExercise(Exercise(ExerciseType.PRACTICE, ExerciseCategory.PATTERNS, ExerciseLevel.BASIC,
        "Patterns. " +
                "Придумайте пример из реальной жизни и имплементируйте Адаптер"))

    randomizerOfBasics.addExercise(Exercise(ExerciseType.PRACTICE, ExerciseCategory.PATTERNS, ExerciseLevel.BASIC,
        "Patterns. " +
                "Придумайте пример из реальной жизни и имплементируйте Мост"))

    randomizerOfBasics.addExercise(Exercise(ExerciseType.PRACTICE, ExerciseCategory.PATTERNS, ExerciseLevel.BASIC,
        "Patterns. " +
                "Придумайте пример из реальной жизни и имплементируйте Компоновщик (Композит)"))

    randomizerOfBasics.addExercise(Exercise(ExerciseType.PRACTICE, ExerciseCategory.PATTERNS, ExerciseLevel.BASIC,
        "Patterns. " +
                "Придумайте пример из реальной жизни и имплементируйте Декоратор"))

    randomizerOfBasics.addExercise(Exercise(ExerciseType.PRACTICE, ExerciseCategory.PATTERNS, ExerciseLevel.BASIC,
        "Patterns. " +
                "Придумайте пример из реальной жизни и имплементируйте Фасад"))

    randomizerOfBasics.addExercise(Exercise(ExerciseType.PRACTICE, ExerciseCategory.PATTERNS, ExerciseLevel.BASIC,
        "Patterns. " +
                "Придумайте пример из реальной жизни и имплементируйте Легковес"))

    randomizerOfBasics.addExercise(Exercise(ExerciseType.PRACTICE, ExerciseCategory.PATTERNS, ExerciseLevel.BASIC,
        "Patterns. " +
                "Придумайте пример из реальной жизни и имплементируйте Заместитель"))

    randomizerOfBasics.addExercise(Exercise(ExerciseType.PRACTICE, ExerciseCategory.PATTERNS, ExerciseLevel.BASIC,
        "Patterns. " +
                "Придумайте пример из реальной жизни и имплементируйте Цепочка обязанностей"))


    randomizerOfBasics.addExercise(Exercise(ExerciseType.PRACTICE, ExerciseCategory.PATTERNS, ExerciseLevel.BASIC,
        "Patterns. " +
                "Придумайте пример из реальной жизни и имплементируйте Команду"))

    randomizerOfBasics.addExercise(Exercise(ExerciseType.PRACTICE, ExerciseCategory.PATTERNS, ExerciseLevel.BASIC,
        "Patterns. " +
                "Придумайте пример из реальной жизни и имплементируйте Итератор"))

    randomizerOfBasics.addExercise(Exercise(ExerciseType.PRACTICE, ExerciseCategory.PATTERNS, ExerciseLevel.BASIC,
        "Patterns. " +
                "Придумайте пример из реальной жизни и имплементируйте Посредник"))

    randomizerOfBasics.addExercise(Exercise(ExerciseType.PRACTICE, ExerciseCategory.PATTERNS, ExerciseLevel.BASIC,
        "Patterns. " +
                "Придумайте пример из реальной жизни и имплементируйте Снимок"))

    randomizerOfBasics.addExercise(Exercise(ExerciseType.PRACTICE, ExerciseCategory.PATTERNS, ExerciseLevel.BASIC,
        "Patterns. " +
                "Придумайте пример из реальной жизни и имплементируйте Наблюдатель"))

    randomizerOfBasics.addExercise(Exercise(ExerciseType.PRACTICE, ExerciseCategory.PATTERNS, ExerciseLevel.BASIC,
        "Patterns. " +
                "Придумайте пример из реальной жизни и имплементируйте Состояние"))

    randomizerOfBasics.addExercise(Exercise(ExerciseType.PRACTICE, ExerciseCategory.PATTERNS, ExerciseLevel.BASIC,
        "Patterns. " +
                "Придумайте пример из реальной жизни и имплементируйте Стратегия"))

    randomizerOfBasics.addExercise(Exercise(ExerciseType.PRACTICE, ExerciseCategory.PATTERNS, ExerciseLevel.BASIC,
        "Patterns. " +
                "Придумайте пример из реальной жизни и имплементируйте Шаблонный метод"))

    randomizerOfBasics.addExercise(Exercise(ExerciseType.PRACTICE, ExerciseCategory.PATTERNS, ExerciseLevel.BASIC,
        "Patterns. " +
                "Придумайте пример из реальной жизни и имплементируйте Посетитель"))


    //Advanced

    val randomizerOfAdvanced = Randomizer()

    randomizerOfAdvanced.addExercise(Exercise(ExerciseType.PRACTICE, ExerciseCategory.PATTERNS, ExerciseLevel.ADVANCED,
        "Patterns. " +
                "Имплементируйте Строитель, который пошагово сооружает дерево Компоновщика"))

    randomizerOfAdvanced.addExercise(Exercise(ExerciseType.PRACTICE, ExerciseCategory.PATTERNS, ExerciseLevel.ADVANCED,
        "Patterns. " +
                "Имплементируйте Цепочку обязанностей, которая сооружает цепочку динамически на базе дерева Компоновщика"))

    randomizerOfAdvanced.addExercise(Exercise(ExerciseType.PRACTICE, ExerciseCategory.PATTERNS, ExerciseLevel.ADVANCED,
        "Patterns. " +
                "Имплементируйте Компоновщик, который использует Декоратор, чтобы переопределить функции отдельных частей дерева компонентов."))

    randomizerOfAdvanced.addExercise(Exercise(ExerciseType.PRACTICE, ExerciseCategory.PATTERNS, ExerciseLevel.ADVANCED,
        "Patterns. " +
                "Имплементируйте Компоновщик, который использует Легковес, чтобы сэкономить оперативную память"))

    randomizerOfAdvanced.addExercise(Exercise(ExerciseType.PRACTICE, ExerciseCategory.PATTERNS, ExerciseLevel.ADVANCED,
        "Patterns. " +
                "Имплементируйте Цепочку обязанностей, где обработчики выполнены в виде Команды. Следом имплементируйте Цепочку обязанностей где Командой будет сам запрос посланный по цепочке объектов"))

    randomizerOfAdvanced.addExercise(Exercise(ExerciseType.PRACTICE, ExerciseCategory.PATTERNS, ExerciseLevel.ADVANCED,
        "Patterns. " +
                "Придумайте пример из реальной жизни и имплементируйте Снимок с реализацией во вложенных классах"))

    randomizerOfAdvanced.addExercise(Exercise(ExerciseType.PRACTICE, ExerciseCategory.PATTERNS, ExerciseLevel.ADVANCED,
        "Patterns. " +
                "Придумайте пример из реальной жизни и имплементируйте Снимок с реализацией с пустым промежуточным интерфейсом"))

    randomizerOfAdvanced.addExercise(Exercise(ExerciseType.PRACTICE, ExerciseCategory.PATTERNS, ExerciseLevel.ADVANCED,
        "Patterns. " +
                "Придумайте пример из реальной жизни и имплементируйте Снимок с реализацией с возможностью восстановления в самом снимке"))




    /** Spring Boot **/
    randomizerOfAdvanced.addExercise(Exercise(ExerciseType.PRACTICE, ExerciseCategory.SPRING_BOOT, ExerciseLevel.ADVANCED,
        "Spring Boot Actuator. " +
                "Придумать и реализовать кастом health check для Actuator`a. " +
                "Закрыть Actuator Spring Security - открыть только для определенных ролей. " +
                "Добавить дополнительные свойства к health endpoint'y. Например, response_code. " +
                "Добавить дополнительную информацию к info endpoint'y. Например, project_name, project_info. " +
                "Расширить стандартный набор метрик при помощи MeterRegistry, добавить custom метрику. " +
                "Реализовать Custom Actuator Endpoint. "))


    println("Основы")
    val resultBasics = randomizerOfBasics.randomExercise(5)
    resultBasics.forEach { println(it) }

    println("Вишенка")
    val resultAdvanced = randomizerOfAdvanced.randomExercise(1)
    resultAdvanced.forEach { println(it) }
}

class Application {

}