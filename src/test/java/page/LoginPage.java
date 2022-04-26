package page;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageObject {
    @FindBy(name = "uid")
    private WebElementFacade txtUsername;

    @FindBy(name = "password")
    private WebElementFacade txtPassword;

    @FindBy(xpath = "//input[@name='btnLogin']")
    private WebElementFacade btnLogin;

    public void typeUsername(String value){
        txtUsername.waitUntilVisible().then().type(value);
    }

    public void typePassword(String value){
        txtPassword.waitUntilVisible().then().type(value);
    }

    public void clickBtnLogin(){
        btnLogin.waitUntilClickable().then().click();
    }

    public void shouldTheTitleShownAs(String expectedResult){
        String actualResult = getDriver().getTitle();
        if(expectedResult.equals(actualResult)){
            Assert.assertTrue(true);
        }else{
            Assert.assertTrue(false);
        }
    }

    public void navigateBackToLoginPage(){
        getDriver().navigate().back();
    }

    public void shouldTheTitleAndAlertShownAs(String alertText,String expectedTitle){
        Alert alert = null;
        alert = getAlert();

        if(alert.getText().equals(alertText)){
            alert.accept();
            String actualResult = getDriver().getTitle();
            if(expectedTitle.equals(actualResult)){
                Assert.assertTrue(true);
            }else{
                Assert.assertTrue(false);
            }
        }else {
            Assert.assertTrue(false);
        }
    }

    public void pressEnterButton(){
        txtPassword.waitUntilVisible().then().type(Keys.ENTER);
    }


}
