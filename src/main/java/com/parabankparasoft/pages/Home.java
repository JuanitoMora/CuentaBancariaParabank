package com.parabankparasoft.pages;

import com.parabankparasoft.actions.ActionsLogin;
import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;

public class Home extends PageObject {

    By title = By.xpath("//*[@id=\"leftPanel\"]/p/b");

    public void validarTexto(String strTitle) {
        Assert.assertEquals(strTitle, ActionsLogin.getTitulo(getDriver(), title));

    }
}
