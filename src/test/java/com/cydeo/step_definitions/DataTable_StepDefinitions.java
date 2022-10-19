package com.cydeo.step_definitions;

import com.cydeo.pages.DropdownsPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class DataTable_StepDefinitions {

    @Then("user should see fruits I like")
    public void user_should_see_fruits_i_like(List<String> fruits) {
        System.out.println(fruits);
        System.out.println(fruits.get(1));

    }

    @Given("User is on the dropdowns page of practice tool")
    public void user_is_on_the_dropdowns_page_of_practice_tool() {
        Driver.getDriver().get("https://practice.cydeo.com/dropdown");

    }

    DropdownsPage dropdownsPage = new DropdownsPage();
    @Then("User should see below info on month dropdown")
    public void user_should_see_below_info_on_month_dropdown(List<String> expectedMonths) {

        //System.out.println("expectedMonths = " + expectedMonths); //expectedMonths = [January, February, March, April, May, June, July, August, September, October, November, December]

        /*
        Select select = new Select(dropdownsPage.monthDropdown);
        List<WebElement> actualOptionsAsWebElement = select.getOptions();

        List<String> actualMonths = new ArrayList<>();

        for (WebElement webElement : actualOptionsAsWebElement) {
            actualMonths.add(webElement.getText());
        }
         */

        // We can use dropdownOptionsAsString() method from BrowserUtils instead of lines above

        List<String> actualMonths = BrowserUtils.dropdownOptionsAsString(dropdownsPage.monthDropdown);

        System.out.println("actualMonths = " + actualMonths); // actualMonths = [January, February, March, April, May, June, July, August, September, October, November, December]

        Assert.assertEquals("It is not as expected!!!", expectedMonths, actualMonths);

        // Assert will check the size of the list first. If it is matching it will check content one by one


    }
}
