package com.soprasteria.support;

import com.soprasteria.pageObjects.BasePage;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class World {

  public static WebDriver driver;
  public static BasePage gps;
  public static Scenario scenario;

  @Before
  public void startUp(Scenario scenario) {
    System.out.println("-------------------------------------------");
    System.out.println("       S T A R T   U P");
    System.out.println("-------------------------------------------");

    driver = new ChromeDriver();
    this.scenario = scenario;
  }

  @After
  public void tearDown() {
    System.out.println("-------------------------------------------");
    System.out.println("       S H U T T I N G   D O W N");
    System.out.println("-------------------------------------------");
    driver.quit();
  }

}
