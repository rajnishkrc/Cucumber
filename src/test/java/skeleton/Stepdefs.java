package skeleton;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import workflow.Workflow;

public class Stepdefs {
	Workflow w = new Workflow();
    @Given("^I have launched the browser$")
    public void I_have_launched_the_browser() throws Throwable {
        w.launchBrowser();
     
    }@When("^TechCanvass home page is navigated to$")
    public void TechCanvass_home_page_is_navigated_to() throws Throwable{
   	 w.navigate();
   	 
    }
    @Then("^Page Title Contains (.*)$")
    public void page_Title_contains_TechCanvass(String expected) throws Throwable{
    	Assert.assertTrue("Title Error!", w.matchResults(expected));
    	w.closeBrowsers();
    }
}
