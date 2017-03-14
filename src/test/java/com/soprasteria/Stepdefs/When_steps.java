package com.soprasteria.Stepdefs;

import com.soprasteria.support.World;
import cucumber.api.PendingException;
import cucumber.api.java.en.When;

public class When_steps {

  @When("^he selects mortgage and loans$")
  public void he_selects_mortgage_and_loans() throws Throwable {
    World.gps.performBusinessClickMortgagesAndLoans();
  }

}
