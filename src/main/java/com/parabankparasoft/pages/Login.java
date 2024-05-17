package com.parabankparasoft.pages;

import com.parabankparasoft.actions.ActionsLogin;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class Login extends PageObject {

    By userName = By.name("username");
    By password = By.name("password");
    By btnLogin = By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input");

    public void navigate(String strUrl) {
        ActionsLogin.navigateurl(getDriver(), strUrl);
    }

    public void data(String strUsuario, String strPassword) {
        ActionsLogin.sendData(getDriver(), userName, strUsuario);
        ActionsLogin.sendData(getDriver(), password, strPassword);
        ActionsLogin.clicBoton(getDriver(), btnLogin);
    }
}
