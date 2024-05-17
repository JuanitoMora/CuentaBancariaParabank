package com.parabankparasoft.steps;

import com.parabankparasoft.pages.NewAccount;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class NewAccountStepDefinitions {
    NewAccount newAccountPage;

    @Given("^Necesito agregar una nueva cuenta Ahorros$")
    public void necesitoAgregarUnaNuevaCuentaAhorros() {
        newAccountPage.openNewAccount();
    }

    @When("^Seleccionando el tipo de cuenta Ahorros$")
    public void seleccionandoElTipoDeCuentaAhorros() { newAccountPage.selectSavings(); }

    @Then("^Valido la creacion de la nueva cuenta$")
    public void validoLaCreacionDeLaNuevaCuenta() {
        newAccountPage.validateAccount();
    }
}
