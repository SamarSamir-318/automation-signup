package org.example.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutPage extends PageBase {
    public LogoutPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath="//*[@id='header']/div/div/div/div[2]/div/ul/li[4]/a")
     WebElement logoutLink;

    public void logoutUser()
    {
        clickButton(logoutLink);
    }

    public WebElement getLogoutLink() {
        return logoutLink;
    }
}
