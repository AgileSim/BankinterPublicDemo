package com.soprasteria.pageObjects;


import com.soprasteria.support.World;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WelcomePage extends BasePage {

  public static class Selector {
    public static String mortgageAndLoansTitle = "#hipotecas_y_prestamos";
    public static String mortgageSimulatorName = "#nombreSim";
    public static String mortgageSimulatorPhone = "#telefonoSim";
    public static String mortgageSimulatorAmount = "#precio";
  }

  public WelcomePage(WebDriver driver) {
    super(driver);
  }

  public void assertVisibleMortgageSimulator() {
    driver.findElement(By.cssSelector(Selector.mortgageSimulatorName));
    driver.findElement(By.cssSelector(Selector.mortgageSimulatorPhone));
    driver.findElement(By.cssSelector(Selector.mortgageSimulatorAmount));
  }
  public void performBusinessClickMortgagesAndLoans() {
    driver.findElement(By.cssSelector(Selector.mortgageAndLoansTitle)).click();
  }

  public void go() {
    this.driver.navigate().to("https://www.bankinter.com/banca/inicio");
    World.gps = this;
  }

}
