package com.soprasteria.pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract  class BasePage {
  protected WebDriver driver;
  protected static BasePage gps;

  public BasePage(WebDriver driver) {
    this.driver = driver;
  }

  public abstract void go();

  public abstract void performBusinessClickMortgagesAndLoans();

  public abstract void assertVisibleMortgageSimulator();
}