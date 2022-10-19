package com.cydeo.pages;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTableLoginPage {

    public WebTableLoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name="username")
    public WebElement inputUserName;

    @FindBy(name="password")
    public WebElement inputPassword;

    @FindBy(xpath = "//button[.='Login']")
    public WebElement loginButton;

    /**
     * No parametrs
     * When we call this method, it will directly login with using
     * Username: Test
     * Password: Tester
     */
    public void login(){
        this.inputUserName.sendKeys("Test");
        this.inputPassword.sendKeys("Tester");
        this.loginButton.click();
    }

    /**
     * This method will accept two arguments and login
     * @param username
     * @param password
     */
    public void login (String username, String password){
        this.inputUserName.sendKeys(username);
        inputPassword.sendKeys(password); // this keyword optional ???
        loginButton.click();
    }

    /**
     * This method will log in using credentials from
     * configuration.properties
     */
    public void loginWithConfig(){
        inputUserName.sendKeys(ConfigurationReader.getProperty("webtable.username"));
        inputPassword.sendKeys(ConfigurationReader.getProperty("webtable.password"));
        loginButton.click();
    }

}
