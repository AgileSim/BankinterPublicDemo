package com.soprasteria;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/selenium-reports", "json:target/cucumber.json"})
public class RunCukesTest {
  public RunCukesTest() {
    super();

    String chromedriverPath = System.getenv("CHROMEDRIVER_PATH");
    if(chromedriverPath != null || !chromedriverPath.equals("")) {
      System.setProperty("webdriver.chrome.driver", chromedriverPath);
    }

  }

}
