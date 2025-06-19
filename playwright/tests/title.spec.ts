import { test, expect } from '@playwright/test';

test('проверка заголовка страницы Playwright.dev', async ({ page }) => {
  // Переходим на страницу
  await page.goto('https://playwright.dev/');

  // Ожидаемый заголовок
  const expectedTitle = 'Fast and reliable end-to-end testing for modern web apps | Playwright';

  // Проверяем, что title соответствует ожидаемому
  await expect(page).toHaveTitle(expectedTitle);
});
