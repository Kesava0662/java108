package stepdefinitions;
    
import io.cucumber.java.en.*;
import workflows.SeleniumWorkFlow;
import common.*;

  @SuppressWarnings("all")
  public class AlgoshackStepDefinition
	{
      SeleniumWorkFlow workFlow = new SeleniumWorkFlow();
      
             @Then("^verify displayed AlgoQA Dashboard in algoshack$")			
            public void thenVerifyDisplayedAlgoqaDashboardInAlgoshack()
            {
                Assertion.isTrue(workFlow.verifyTextInLink(0, "Algoshack", "Algoshack.AlgoQADashboardLabelXPATH", "XPATH"), "Then verify displayed AlgoQA Dashboard in algoshack");
        WebBrowserUtil.captureScreenshot();
                
            }
             @Then("^verify displayed Dashboard in algoshack$")			
            public void thenVerifyDisplayedDashboardInAlgoshack()
            {
                Assertion.isTrue(workFlow.verifyTextInLink(0, "Algoshack", "Algoshack.DashboardLabelXPATH", "XPATH"), "Then verify displayed Dashboard in algoshack");
        WebBrowserUtil.captureScreenshot();
                
            }
            @When("^I entered Enter your email in algoshack as '(.*)'$")			
            public void whenIEnteredEnterYourEmailInAlgoshackAsenterYourEmail(String  varenterYourEmail)
            {
                workFlow.enterText(varenterYourEmail, 0, "Algoshack", "Algoshack.EnteryouremailTextBoxXPATH", "XPATH");
                
            }
            @When("^I entered Enter your password in algoshack as '(.*)'$")			
            public void whenIEnteredEnterYourPasswordInAlgoshackAsenterYourPassword(String  varenterYourPassword)
            {
                workFlow.enterText(varenterYourPassword, 0, "Algoshack", "Algoshack.EnteryourpasswordTextBoxXPATH", "XPATH");
                
            }
            @When("^I selected Login in algoshack$")			
            public void whenISelectedLoginInAlgoshack()
            {
                workFlow.clickedElement(0, "Algoshack", "Algoshack.LoginButtonXPATH", "XPATH");
                
            }
             @Then("^verify text Login to in algoshack$")			
            public void thenVerifyTextLoginToInAlgoshack()
            {
                Assertion.isTrue(workFlow.verifyTextInLink(0, "Algoshack", "Algoshack.LogintoLabelXPATH", "XPATH"), "Then verify text Login to in algoshack");
        WebBrowserUtil.captureScreenshot();
                
            }
            @When("^I selected skip in algoshack$")			
            public void whenISelectedSkipInAlgoshack()
            {
                workFlow.clickedElement(0, "Algoshack", "Algoshack.skipButtonXPATH", "XPATH");
                
            }
             @Then("^verify displayed User signed in successfully in algoshack$")			
            public void thenVerifyDisplayedUserSignedInSuccessfullyInAlgoshack()
            {
                Assertion.isTrue(workFlow.verifyTextInLink(0, "Algoshack", "Algoshack.UsersignedinsuccessfullyLabelXPATH", "XPATH"), "Then verify displayed User signed in successfully in algoshack");
        WebBrowserUtil.captureScreenshot();
                
            }
             @Then("^'(.*)' is displayed with '(.*)'$")			
            public void thenpageIsDisplayedWithcontent(String  varpage, String varcontent)
            {
                Assertion.isTrue(workFlow.verifyDefaultpageIsdisplayed(varpage), "Then '<page>' is displayed with '<content>'");
                Assertion.isTrue(workFlow.verifymessageIsDisplayed(varcontent), "");
                
            }
    }