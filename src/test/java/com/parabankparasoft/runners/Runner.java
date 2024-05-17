package com.parabankparasoft.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = "com.parabankparasoft.steps",
        features = "src/test/com.parabankparasoft.resources/features/parabank.feature",
        snippets = SnippetType.CAMELCASE,
        monochrome = true,
        dryRun = false
)

public class Runner {
}
