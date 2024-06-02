package tests;


import org.testng.Assert;
import tests.util.JsonDataParser;
import org.example.Pages.HomePage;
import org.example.Pages.LogoutPage;
import org.example.Pages.UserSignupPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class UserSignupTest extends TestBase {

    HomePage homeObject;
    UserSignupPage registerObject;


    @Test(priority = 1, alwaysRun = true)
    public void UserSignedUpSuccessfully() throws Exception {
        JsonDataParser jsonReader = new JsonDataParser();
        jsonReader.JsonReader();

        homeObject = new HomePage((WebDriver) driver);
        homeObject.openRegistrationPage();
        registerObject = new UserSignupPage((WebDriver) driver);
        registerObject.signup
                (jsonReader.name, jsonReader.email, jsonReader.password,
                        jsonReader.firstname, jsonReader.lastname, jsonReader.address, jsonReader.city,
                        jsonReader.zipcode, jsonReader.state, jsonReader.mobile);

        LogoutPage logoutPage = new LogoutPage(driver);
        // to close advertisements
        Thread.sleep(2000);
        Assert.assertTrue(logoutPage.getLogoutLink().getText().equalsIgnoreCase("Logout"));
        logoutPage.logoutUser();
        Thread.sleep(3000);
    }

}
