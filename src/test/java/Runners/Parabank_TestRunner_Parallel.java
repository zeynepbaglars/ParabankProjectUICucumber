package Runners;

import Pages.Parent;
import Utilities.GWD;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

@CucumberOptions(
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"},
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)

public class Parabank_TestRunner_Parallel extends AbstractTestNGCucumberTests {

    @BeforeClass
    @Parameters({"browserTipi","changeIt"})
    public void beforClass(String browser, String changeIt){
        Parent.changeIt.set(changeIt);
        GWD.threadBrowserSet(browser);
    }
}
