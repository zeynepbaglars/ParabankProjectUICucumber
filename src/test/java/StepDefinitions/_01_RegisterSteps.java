package StepDefinitions;

import Pages.Parent;
import Pages.RightPanel;
import Pages.LeftPanel;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _01_RegisterSteps {
    LeftPanel lp = new LeftPanel();
    RightPanel rp = new RightPanel();


    @Given("Navigate to ParaBank")
    public void navigateToParaBank() {
        GWD.getDriver().get("https://parabank.parasoft.com/parabank/index.htm");
    }

    @When("User clicks on Element on Left Panel")
    public void UserClicksOnElementOnLeftPanel(DataTable items) {
        List<String> stringList = items.asList(String.class);
        for (String str : stringList) {
            WebElement element = lp.getWebElement(str);
            lp.clickFunction(element);
        }
    }

    @And("User sends key on Right Panel")
    public void userSendsKeyOnRightPanel(DataTable items) {
        List<List<String>> stringList = items.asLists(String.class);
        for (int i = 0; i < stringList.size(); i++) {
            WebElement element = rp.getWebElement(stringList.get(i).get(0));
            if (stringList.get(i).get(1).equals("-changeIt-"))
                rp.sendKeysFunction(element, Parent.changeIt.get());
            else
                rp.sendKeysFunction(element, stringList.get(i).get(1));
        }
    }

    @Then("Customer should be registered successfully")
    public void customerShouldBeRegisteredSuccessfully() {
        rp.verifyContainsTextFunction(rp.getMessage(), "success");
    }

    @And("User clicks on Element on Right Panel")
    public void userClicksOnElementOnRightPanel(DataTable items) {
        List<String> stringList = items.asList(String.class);

        for (String str : stringList) {
            WebElement element = rp.getWebElement(str);
            rp.clickFunction(element);
        }
    }
}
