# QA Test Task

В этом репозитории собраны выполненные тестовые задания кандидата для демонстрации портфолио.

## Структура репозитория

* **docs/test\_cases.md** — позитивные и негативные тест-кейсы для выпадающего списка выбора страны.
* **docs/theory/probability.md** — решение задачи по теории вероятностей.
* **playwright/** — тесты Playwright:

  * **playwright.config.ts** — конфигурация для запуска тестов на нескольких браузерах.
  * **tests/title.spec.ts** — проверка заголовка [https://playwright.dev/](https://playwright.dev/).
* **java/** — модуль автотестов на Java.
* **.gitignore** — файлы и папки, игнорируемые Git.

## Открытие файлов

* [Тест-кейсы](docs/test_cases.md)
* [Решение задачи по теории вероятностей](docs/theory/probability.md)
* [Playwright-тест](playwright/tests/title.spec.ts)
* [Java-тесты (TitleTest)](java/src/test/java/com/alinkaqa/TitleTest.java)

## Установка и запуск тестов Playwright

1. Перейдите в папку с тестами:

   ```bash
   cd playwright
   ```
2. Установите зависимости:

   ```bash
   npm install
   ```
3. Запустите все тесты:

   ```bash
   npx playwright test
   ```
4. Для генерации HTML-отчета:

   ```bash
   npx playwright test --reporter=html
   npx playwright show-report
   ```

## Установка и запуск Java-тестов

> Для работы требуется **Java 11** и **Maven**.
> Если они не установлены, можно установить через Homebrew:
>
> ```bash
> brew install java11
> brew install maven
> ```

1. Перейдите в папку Java-модуля:

   ```bash
   cd java
   ```
2. Запустите все тесты:

   ```bash
   mvn clean test
   ```
3. Для запуска только в браузере Firefox используйте параметр:

   ```bash
   mvn clean test -Dbrowser=firefox
   ```

---

> Ветка `main` содержит все тестовые задания: тест-кейсы, Playwright и Java-тесты.

