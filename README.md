# MyFirstTestAppSpringBoot

Лабораторная работа №1 по дисциплине «Spring Boot».
Выполнил: Урабов Николай Михайлович, группа РИЗ-250213у.

Простейшее веб-приложение на Spring Boot 4.1.2 (Java 25, Maven).

## Запуск

```
./mvnw spring-boot:run
```

или запустить класс `MyFirstTestAppSpringBootApplication` из IntelliJ IDEA.


Приложение стартует на http://localhost:8080

## Эндпоинты

| Метод | URL | Описание |
|-------|-----|----------|
| GET | `/hello?name=...` | Приветствие, по умолчанию `Hello World!` |
| GET | `/update-array?s=...` | Первый вызов создаёт пустой ArrayList, следующие добавляют значение |
| GET | `/show-array` | Все элементы ArrayList |
| GET | `/update-map?s=...` | Первый вызов создаёт пустой HashMap, следующие добавляют значение с ключом 1, 2, 3... |
| GET | `/show-map` | Все элементы HashMap |
| GET | `/show-all-lenght` | Количество элементов в ArrayList и HashMap |
