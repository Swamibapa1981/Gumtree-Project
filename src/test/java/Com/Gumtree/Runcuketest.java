package Com.Gumtree;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src\\test\\Resources\\Searchcars.feature",tags = "@Smoke"
)
public class Runcuketest {
}
