package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class OrderPage extends BasePage {

    public OrderPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name="product")
    public WebElement inputProduct;

    @FindBy(name = "quantity")
    public WebElement inputQuantity;

    @FindBy(name = "name")
    public WebElement inputName;

    @FindBy(name = "street")
    public WebElement inputStreet;

    @FindBy(name = "city")
    public WebElement inputCity;

    @FindBy(name = "state")
    public WebElement inputState;

    @FindBy(name = "zip")
    public WebElement inputZip;

    @FindBy(name = "card")
    public List<WebElement> cardType;

    // below it can select only MasterCard. We want to be able to use other cards also
//    @FindBy(xpath = "//input[@value='MasterCard']")
//    public WebElement inputMasterCard;

    @FindBy(name="cardNo")
    public WebElement inputCardNo;

    @FindBy(name="cardExp")
    public WebElement inputCardExp;

    @FindBy(xpath = "//button[.='Process Order']")
    public WebElement submitButton;
}
