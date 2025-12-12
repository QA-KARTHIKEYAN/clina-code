package hooks;

import factory.Driverfactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	@Before
	public void setup() {
		System.out.println("==Launching==");
		Driverfactory.getDriver();
	}

	@After
	public void close() {
		System.out.println("==Closed==");
		Driverfactory.getDriver();
	}
}
