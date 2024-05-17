package com.parabankparasoft.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ActionsNewAccount {

    public static void openNewA(WebDriver robot, By target) {
        robot.findElement(target).click();
    }

    public static void clicAccount(WebDriver robot, By target) {
        robot.findElement(target).click();
    }

    public static void clicSavings(WebDriver robot, By target) {
        robot.findElement(target).click();
    }

    public static void clicBoton(WebDriver robot, By target) {
        robot.findElement(target).click();
    }

    public static String getAccount(WebDriver robot, By target) {
        return robot.findElement(target).getText();
    }
}
