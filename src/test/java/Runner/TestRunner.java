package Runner;

import org.junit.*;
import org.junit.runner.RunWith;

import cucumber.api.*;
import cucumber.api.junit.Cucumber;
import cucumber.api.*;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/Features/RCB.feature",glue=("StepDefinations"))
public class TestRunner {

}
