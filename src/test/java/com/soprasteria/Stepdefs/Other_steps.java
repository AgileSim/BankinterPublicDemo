package com.soprasteria.Stepdefs;

import com.soprasteria.support.World;
import cucumber.api.Scenario;
import cucumber.api.java.en.Then;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;

public class Other_steps {

  @Then("^take a screenshot$")
  public void take_a_screenshot() throws Throwable {
    byte[] screenshot = ((TakesScreenshot)World.driver).getScreenshotAs(OutputType.BYTES);
    World.scenario.embed(screenshot, "image/png");
//    File scrFile = ((TakesScreenshot) World.driver).getScreenshotAs(OutputType.FILE);
//    FileUtils.copyFile(scrFile, new File("target/screenshot.jpg"));
  }

}
