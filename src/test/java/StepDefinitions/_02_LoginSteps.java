package StepDefinitions;

import Pages.Parent;
import Pages.RightPanel;
import Pages.LeftPanel;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _02_LoginSteps {
    LeftPanel lp = new LeftPanel();
    RightPanel rp = new RightPanel();

    @Given("User sends key on Left Panel")
    public void userSendsKeyOnLeftPanel(DataTable items) {
        List<List<String>> stringList = items.asLists(String.class);
        for (int i = 0; i < stringList.size(); i++) {
            WebElement element = lp.getWebElement(stringList.get(i).get(0));
            if (stringList.get(i).get(1).equals("-changeIt-"))
                rp.sendKeysFunction(element, Parent.changeIt.get());
            else
                lp.sendKeysFunction(element, stringList.get(i).get(1));
        }
    }

    @Then("Customer should not be registered")
    public void customerShouldNotBeRegistered() {
        rp.verifyContainsTextFunction(rp.getMessage(), "error");
    }

    @Then("Customer should login successfully")
    public void customerShouldLoginSuccessfuly() {
        lp.verifyElementIsDisplayed(lp.getLogOut());
    }

    @Then("Verify BillPayment successful")
    public void verifyBillPaymentSuccessful() {
        rp.verifyElementIsDisplayed(rp.getPaymentMessage());
    }

}
