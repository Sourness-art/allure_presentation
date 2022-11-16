package locators;

import org.openqa.selenium.By;

public class AccordionItemsTextAppearLocators {

//    public static final By manualTestingButton = By.xpath("//*[@id='manual-testing-error']");
    public static final By manualTestingButton = By.xpath("//*[@id='manual-testing-accordion']");
    public static final By cucumberButton = By.xpath("//*[@id='cucumber-accordion']");
    public static final By automationTestingButton = By.xpath("//*[@id='automation-accordion']");

    public static final By manualTestingDescription = By.xpath("//*[@id='manual-testing-description']");
    public static final By cucumberDescription = By.xpath("//*[@id='cucumber-testing-description']");
    public static final By automationTestingDescription = By.xpath("//*[@id='automation-testing-description']");
}
