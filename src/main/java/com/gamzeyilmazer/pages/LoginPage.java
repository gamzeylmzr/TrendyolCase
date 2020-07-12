package com.gamzeyilmazer.pages;

import com.gamzeyilmazer.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {

//    By emailTxt=By.id("email");
//    By passTxt=By.id("password");
//    By submitBtn=By.id("loginSubmit");

    @FindBy(id="email")
    private WebElement emailTxt;

    @FindBy(id="password")
    private WebElement passTxt;

    @FindBy(id="loginSubmit")
    private WebElement submitBtn;

    public LoginPage(){
        PageFactory.initElements(driver,this);
    }

    public HomePage login(String mail, String pass){
        emailTxt.sendKeys(mail);
        passTxt.sendKeys(pass);
        submitBtn.click();
        return new HomePage(); //after login, it will directly navigate to homepage so it should return HomePage
    }



}
