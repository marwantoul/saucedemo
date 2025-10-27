package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features = {"src/test/resources/Features"},
        glue = {"Hooks", "Steps"}

)
public class RunnerTest extends AbstractTestNGCucumberTests {
    public RunnerTest() {
    }

    @DataProvider(
            parallel = true
    )
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
