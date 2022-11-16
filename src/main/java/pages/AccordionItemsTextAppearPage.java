package pages;

import base.Test_Base;
import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import locators.AccordionItemsTextAppearLocators;
import locators.MainPageLocators;
import org.openqa.selenium.support.PageFactory;

public class AccordionItemsTextAppearPage extends Test_Base {

    public AccordionItemsTextAppearPage() {
        PageFactory.initElements(driver, this);
    }

    public void openAccordionItemsTextAppearLink() {
        element(MainPageLocators.appearDisappear).click();
        changeTab();
    }

    @Attachment
    public void manualTestingButtonClick() {
        element(AccordionItemsTextAppearLocators.manualTestingButton).click();
    }

    @Step("Get manual testing description")
    @Attachment
    public String manualTestingGetDescription() {
        return element(AccordionItemsTextAppearLocators.manualTestingDescription).getText();
    }

    public void cucumberButtonClick() {
        element(AccordionItemsTextAppearLocators.cucumberButton).click();
    }

    @Step("Get cucumber description")
    @Attachment
    public String cucumberGetDescription() {
        return element(AccordionItemsTextAppearLocators.cucumberDescription).getText();
    }

    public void automationTestingButtonClick() {
        element(AccordionItemsTextAppearLocators.automationTestingButton).click();
    }

    @Step("Get automation testing description")
    @Attachment
    public String automationTestingGetDescription() {
        return element(AccordionItemsTextAppearLocators.automationTestingDescription).getText();
    }
}
