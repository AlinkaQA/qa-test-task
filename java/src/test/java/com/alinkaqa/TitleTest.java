package com.alinkaqa;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;


import static org.junit.Assert.assertEquals;

public class TitleTest {
    private WebDriver driver;
    private WebDriverWait wait;

    @Before
    public void setUp() {
        String browser = System.getProperty("browser", "chrome").toLowerCase();
        switch (browser) {
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            default:
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
        }
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Test
    public void testPageTitle() {
        driver.get("https://playwright.dev/");

        String expectedTitle = "Fast and reliable end-to-end testing for modern web apps | Playwright";

        wait.until(ExpectedConditions.titleIs(expectedTitle));

        assertEquals(expectedTitle, driver.getTitle());
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
