package com.opentext;

import java.io.IOException;
import com.hp.lft.report.ReportException;
import com.hp.lft.sdk.GeneralLeanFtException;
import com.hp.lft.sdk.*;
import com.hp.lft.verifications.*;
import static org.junit.Assert.*;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class FTDStepDefinitions {

    public FTDStepDefinitions() {}

    //Implementation of feature’s steps
    private int calcResult;

    @Given("I have a calculator")
    public void i_have_a_calculator() {
        // Here you would typically initialize UFT Developer objects if automating a UI
        // For this logic-based example, we just reset our result
        calcResult = 0;
    }

    @When("I add {int} and {int}")
    public void i_add_and(int num1, int num2) {
        calcResult = num1 + num2;
    }

    @Then("The result should be {int}")
    public void the_result_should_be(int expected) {
        Assert.assertEquals("Calculator sum mismatch!", expected, calcResult);
    }
}