package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Allure;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.*;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Set;

public class Test_Base {
    public static WebDriver driver;
    public static Properties prop;
    public static Actions action;
    public static WebDriverWait webDriverWait;
    protected static AccordionItemsTextAppearPage accordionItemsTextAppearPage;

    public Test_Base() {

        try {
            prop = new Properties();
            FileInputStream ip = new FileInputStream(System.getProperty("user.dir") +
                    "/src/main/java/config/config.properties");
            prop.load(ip);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void initialization() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        action = new Actions(driver);
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get(prop.getProperty("url"));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
        initObjects();
    }

    private static void initObjects() {

        accordionItemsTextAppearPage = new AccordionItemsTextAppearPage();
    }

    public static void changeTab() throws NoSuchWindowException {

        Set<String> handles = driver.getWindowHandles();
        String current = driver.getWindowHandle();
        if (handles.size() > 1) {
            handles.remove(current);
        }
        String newTab = handles.iterator().next();
        driver.switchTo().window(newTab);
    }


    public static void disable() {

        driver.quit();
    }

    public static void attach() {
        Allure.addAttachment("Attachment", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
    }


    public static WebElement element(By ByElement) {

        return driver.findElement(ByElement);
    }
}
