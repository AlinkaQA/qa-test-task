# QA Test Task

В этом репозитории собраны выполненные тестовые задания кандидата для демонстрации портфолио.

## Структура репозитория

* **docs/test\_cases.md** — описание позитивных и негативных тест-кейсов для выпадающего списка выбора страны.
* **docs/theory/probability.md** — решение задачи по теории вероятностей.
* **playwright/** — тесты Playwright:

  * **playwright.config.ts** — конфигурация для запуска тестов на нескольких браузерах.
  * **tests/title.spec.ts** — тест, проверяющий заголовок [https://playwright.dev/](https://playwright.dev/).
* **.gitignore** — список файлов и папок, игнорируемых Git.

## Открытие файлов

* [Тест-кейсы](docs/test_cases.md)
* [Решение задачи по теории вероятностей](docs/theory/probability.md)
* [Тест Playwright](playwright/tests/title.spec.ts)

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
4. (Опционально) Запустите конкретный тест:

   ```bash
   npx playwright test tests/title.spec.ts
   ```

---

> Тесты выполняются на Chromium и Firefox по конфигурации в `playwright.config.ts`. Вывод отчёта можно получить с помощью `--reporter=html`.
