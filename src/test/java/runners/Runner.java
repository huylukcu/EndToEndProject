package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "./src/test/resources/features",
        dryRun = false,
        glue = "stepdefinitions",
        tags = "@Doctor_Appt"

)

public class Runner {
}
