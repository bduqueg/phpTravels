package net.phptravels.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/phpTravel.feature",
        tags = "@tag1",
        glue = "net.phptravels.stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class RunnerTags {
}