package com.soprasteria.Stepdefs;

import com.soprasteria.support.World;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;

public class Then_steps {

  @Then("^he should see a mortage simulator$")
  public void he_should_see_a_mortage_simulator() throws Throwable {
    World.gps.assertVisibleMortgageSimulator();
  }

}
