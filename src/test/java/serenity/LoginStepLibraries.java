package serenity;

import net.thucydides.core.annotations.Step;
import page.LoginPage;

public class LoginStepLibraries {
    LoginPage loginPage;
    @Step
    public void typeUsernameAndPassword(String username,String password){
        loginPage.typeUsername(username);
        loginPage.typePassword(password);
    }

    @Step
    public void clickLoginButton(){
        loginPage.clickBtnLogin();
    }

    @Step
    public void checkTheTitlePageAfterSuccessfullyLogging(String expectedTitle){
        loginPage.shouldTheTitleShownAs(expectedTitle);
    }

    @Step
    public void pressENTERFromPasswordField(){
        loginPage.pressEnterButton();
    }

    @Step
    public void checkTheTitleAndAlertAfterLoggingUnsuccessfully(String alert,String title){
        loginPage.shouldTheTitleAndAlertShownAs(alert,title);
    }
}
