package gradle.cucumber;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.Then;

public class CucumberIsWorkingStepdefs {

	private String cliMessage;

	@After
	public void after(Scenario scenario) {
		if (this.cliMessage != null)
			scenario.write(this.cliMessage);
	}

	@Then("^on the cli I can see \"([^\"]*)\"$")
	public void on_the_cli_I_can_see(String cliMessage) throws Throwable {
		this.cliMessage = cliMessage;
	}
}
