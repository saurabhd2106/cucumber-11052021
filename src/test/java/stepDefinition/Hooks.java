package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class Hooks {
	
	@Before(order = 1)
	public void preSetup() {
		System.out.println("Pre Setup");
	}
	
	@Before(order = 2)
	public void setup() {
		System.out.println("Setup");
	}
	
	@After(order = 2)
	public void cleanUp() {
		System.out.println("Clean Up");
	}
	
	@After(order = 1)
	public void postCleanUp() {
		System.out.println("Post Clean up");
	}
	
	@BeforeStep
	public void beforeEveryStep() {
		System.out.println("Before every step");
	}
	
	@AfterStep
	public void afterEveryStep() {
		System.out.println("After every step");
	}

}
