package com.parabankparasoft.steps;

import com.parabankparasoft.pages.Home;
import com.parabankparasoft.pages.Login;
import com.parabankparasoft.pages.NewAccount;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class LoginStepDefinitions {

    Login loginPage;

    @Before
    public void actor() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("juanito");
    }

    @Given("^Deseo ir \"([^\"]*)\"$")
    public void deseoIr(String strUrl) {
        loginPage.navigate(strUrl);
    }

    @When("^Ingresando usuario \"([^\"]*)\" y password \"([^\"]*)\"$")
    public void ingresandoUsuarioYPassword(String strUsuario, String strPassword) {
        loginPage.data(strUsuario, strPassword);
    }
}
