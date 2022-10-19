package com.cydeo.step_definitions;

import com.cydeo.pages.GoogleSearchPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class GoogleStepDefinitions {

    GoogleSearchPage googleSearchPage = new GoogleSearchPage();

    @When("user is on Google search page")
    public void user_is_on_google_search_page() {
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();

        Driver.getDriver().get("https://www.google.com/");
        //Driver.getDriver().findElement(By.xpath("//button[@id=\"W0wltc\"]")).click();
        googleSearchPage.avvisAlleButton.click();
        // System.out.println("User is on google search page");
    }

    @Then("user should see title is Google")
    public void user_should_see_title_is_google() {
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
        // System.out.println("User is seeing title is Google");

        String expectedTitle = "Google";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(actualTitle, expectedTitle);

        // Driver.closeDriver(); // removed to --> Hooks/  @After public void tearDownScenario() method

    }

    /*
    @When("user types apple and clicks enter")
    public void user_types_apple_and_clicks_enter() {
        googleSearchPage.searchBox.sendKeys("apple" + Keys.ENTER);
    }
     */

    @Then("user sees apple in the google title") // apple -> {word} parameterization
    public void user_sees_apple_in_the_google_title() {
        String expectedTitle = "apple - Google-søk";
        String actualTitle = Driver.getDriver().getTitle();

        // JUnit assertion accepts first argument as expected, second argument as actual
        // and message if test fails is first
        Assert.assertEquals("Title is not as expected", expectedTitle, actualTitle);
        // Assert.assertTrue(actualTitle.equals(expectedTitle));
    }

    @When("user types {string} and clicks enter")
    public void user_types_and_clicks_enter(String searchKeyword) { // string -> searchKeyword
        googleSearchPage.searchBox.sendKeys(searchKeyword + Keys.ENTER);
    }

    @When("user types apple and clicks enter")
    public void user_types_and_clicks_enter2() {
        googleSearchPage.searchBox.sendKeys("apple"+ Keys.ENTER);
    }

    @Then("user sees {string} in the google title")
    public void user_sees_in_the_google_title(String string) {
        String expectedTitle = string + " - Google-søk"; // String expectedTitle = "apple - Google-søk";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals("Title is not as expected", expectedTitle, actualTitle);

    }


}
