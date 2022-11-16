import base.Test_Base;
import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.junit.*;

public class AccordionItemsTextAppearTest extends Test_Base {

    @Before
    public void beforeMethod() {
        initialization();
        accordionItemsTextAppearPage.openAccordionItemsTextAppearLink();
        attach();
    }

    @DisplayName("Manual testing")
    @Description("Must show text about manual testing")
    @Test
    public void testManualTestingButtonClick() {

        accordionItemsTextAppearPage.manualTestingButtonClick();
        Assert.assertTrue(accordionItemsTextAppearPage.manualTestingGetDescription().contains("Manual testing"));

    }

    @DisplayName("Cucumber (BDD)")
    @Description("Must show text 'Cucumber (BDD)'")
    @Test
    public void testCucumberButtonClick() {
        accordionItemsTextAppearPage.cucumberButtonClick();
        Assert.assertTrue(accordionItemsTextAppearPage.cucumberGetDescription().contains("Cucumber (BDD)"));
    }

    @DisplayName("Automation testing")
    @Description("Must show text about automation testing")
    @Test
    public void testAutomationTestingButtonClick() {
        accordionItemsTextAppearPage.automationTestingButtonClick();
        Assert.assertTrue(accordionItemsTextAppearPage.automationTestingGetDescription().contains("Automation testing"));
    }

    @After
    public void afterMethod() {
        attach();
        disable();
    }
}
