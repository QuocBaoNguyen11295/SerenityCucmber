package cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import serenity.LoginStepLibraries;


public class LoginStepDef {
    @Steps
    LoginStepLibraries loginStepLibraries;

    @Given("user types username {string} and password {string}")
    public void user_types_username_and_password(String username, String password) {
        // Write code here that turns the phrase above into concrete actions
        loginStepLibraries.typeUsernameAndPassword(username,password);
    }
    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        // Write code here that turns the phrase above into concrete actions
        loginStepLibraries.clickLoginButton();
    }
    @Then("the page {string} is opened")
    public void the_page_is_opened(String string) {
        // Write code here that turns the phrase above into concrete actions
        loginStepLibraries.checkTheTitlePageAfterSuccessfullyLogging(string);
    }

    @When("user presses Enter button")
    public void user_presses_Enter_button(){
        loginStepLibraries.pressENTERFromPasswordField();
    }

    @Then("the windows alert is shown that {string} and the user is navigated back to the page {string}")
    public void the_windows_alert_is_shown_that_and_the_user_is_navigated_back_to_the_page(String alertText,String page){
        loginStepLibraries.checkTheTitleAndAlertAfterLoggingUnsuccessfully(alertText, page);
    }

}
