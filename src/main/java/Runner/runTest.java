package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "StepDef",
        tags = "@bug_5",
        plugin = {"pretty", "html:target/RegressionReport.html"}
)

public class runTest {
}
