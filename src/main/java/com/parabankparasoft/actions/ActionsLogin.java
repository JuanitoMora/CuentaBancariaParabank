package com.parabankparasoft.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ActionsLogin {

    public static void navigateurl(WebDriver robot, String url) {
        robot.navigate().to(url);
    }

    public static void sendData(WebDriver robot, By target, String strData) {
        robot.findElement(target).sendKeys(strData);
    }

    public static void clicBoton(WebDriver robot, By target) {
        robot.findElement(target).click();
    }

    public static String getTitulo(WebDriver robot, By target) {
        return robot.findElement(target).getText();
    }
}
