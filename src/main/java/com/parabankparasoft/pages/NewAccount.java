package com.parabankparasoft.pages;

import com.parabankparasoft.actions.ActionsLogin;
import com.parabankparasoft.actions.ActionsNewAccount;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.pages.WrongPageError;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class NewAccount extends PageObject {

    By open = By.linkText("Open New Account");
    By account = By.xpath("(//select[@id='type'])");
    By accountType = By.xpath("(//select[@id='type'])//following-sibling::option[@value='1']");
    By btnOpenNewAccount = By.xpath("//input[@type='button']");
    By numAccount = By.id("newAccountId");
    By accountTypeSavings = By.xpath("//td[contains(text(), 'SAVIN')]");
    String expectAccount = "SAVINGS";

    public void openNewAccount() {
        ActionsNewAccount.openNewA(getDriver(), open);
    }

    public void selectSavings() {
        ActionsNewAccount.clicAccount(getDriver(), account);
        ActionsNewAccount.clicSavings(getDriver(), accountType);
        ActionsNewAccount.clicBoton(getDriver(), btnOpenNewAccount);
    }

    public void validateAccount() {
        ActionsNewAccount.clicAccount(getDriver(), numAccount);
        Assert.assertEquals(expectAccount, ActionsNewAccount.getAccount(getDriver(), accountTypeSavings));
    }
}
