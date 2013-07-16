package gradle.cucumber.webapp;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.junit.Test;

import gradle.cucumber.webapp.selenium.SharedDriver;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WebApplicationIsWorkingStepdefs {

	private SharedDriver browser;

	public WebApplicationIsWorkingStepdefs(SharedDriver sharedDriver) {
		this.browser = sharedDriver;
	}
	
	@Then("^I can see the home page's title \"([^\"]*)\"$")
	public void I_can_see_the_home_page_s_title(String pageTitle) throws Throwable {
		this.browser.get("http://localhost:8080/gof-katas-base-java/home.jsp");
		assertThat(this.browser.getTitle(), is(pageTitle));
	}
	
}
