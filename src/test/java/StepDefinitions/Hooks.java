package StepDefinitions;

import Utilities.GWD;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    @After
    public void after(Scenario scenario){

        if (scenario.isFailed()){
            TakesScreenshot ts=(TakesScreenshot) GWD.getDriver();
            final byte[] inMemory=ts.getScreenshotAs(OutputType.BYTES);
            scenario.attach(inMemory, "image/png","screenshot name");
        }
        GWD.quitDriver();
    }
}
