package com.gamzeyilmazer.pages;

import com.gamzeyilmazer.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase{

    @FindBy(id="accountBtn")
    private WebElement accountBtn;

    @FindBy(css = "div.account-button.login")
    private WebElement loginBtn;

    @FindBy(css = "a[href*='kadin']")
    private WebElement womanTab;

    @FindBy(css = "a[href*='erkek']")
    private WebElement manTab;

    @FindBy(css = "a[href*='cocuk']")
    private WebElement kidTab;

    @FindBy(css = "a[href*='ev--yasam']")
    private WebElement homeTab;

    @FindBy(css = "a[href*='supermarket']")
    private WebElement marketTab;

    @FindBy(css = "a[href*='kozmetik']")
    private WebElement cosmetiscTab;

    @FindBy(css = "a[href*='ayakkabi--canta']")
    private WebElement shoesBagTab;

    @FindBy(css = "a[href*='saat--aksesuar']")
    private WebElement watchAccessoriesTab;

    @FindBy(css = "a[href*='elektronik']")
    private WebElement electronicsTab;


    public HomePage(){
        PageFactory.initElements(driver,this);
    }


    public void clickOutside() {
        Actions action = new Actions(driver);
        action.moveByOffset(0, 0).click().build().perform();
    }


    public LoginPage navigateToLoginPage() {
        clickOutside();
        Actions hover = new Actions(driver);
        hover.moveToElement(accountBtn).build().perform();
        loginBtn.click();
        return new LoginPage();
    }


    public HomePage checkImagesAreLoadedInTabs(String tab){
        return new HomePage();
    }

}
