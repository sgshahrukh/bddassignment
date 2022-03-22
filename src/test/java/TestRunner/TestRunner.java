package TestRunner;

import org.junit.*;

import cucumber.api.junit.Cucumber;

@Runwith(Cucumber.class)
@CucumberOptions(
 features = {"src/test/java/AppFeatures"}
 ,glue="StepsDefinitions"
 ,monochrome=true
 ,tags="@run"
 ,plugin = {"pretty", "html:target/reports"}
)
public class TestRunner {
	
}