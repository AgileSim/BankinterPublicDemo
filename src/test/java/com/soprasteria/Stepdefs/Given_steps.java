package com.soprasteria.Stepdefs;

import com.soprasteria.pageObjects.WelcomePage;
import com.soprasteria.support.World;
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;

public class Given_steps {

  WebDriver driver;

  @Given("^a potential customer at welcome page$")
  public void a_potential_customer_at_welcome_page() throws Throwable {
    WelcomePage welcomePage = new WelcomePage(World.driver);
    welcomePage.go();
  }
}
