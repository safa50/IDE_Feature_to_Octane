package com.opentext;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import com.hp.lft.sdk.*;
import com.hp.lft.verifications.*;

import unittesting.*;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"com.hp.lft.cucumberv4.CucumberReporter",
        "com.hpe.alm.octane.OctaneGherkinFormatter:target/octane-gherkin-results.xml"},
                 features = "classpath:com/opentext")
public class FTDTest extends UnitTestClassBase {

    public FTDTest() {
        //Change this constructor to private if you supply your own public constructor
    }

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        // Manually set the address before the SDK initializes
        System.setProperty("lft.server.address", "ws://192.168.1.79:5095");

        instance = new FTDTest();
        globalSetup(FTDTest.class);
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        globalTearDown();
    }

    @Test
    public void test() throws GeneralLeanFtException {
    }

}