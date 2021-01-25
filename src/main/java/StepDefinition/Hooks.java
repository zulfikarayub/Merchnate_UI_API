package StepDefinition;

import org.openqa.selenium.WebDriver;

import cucumber.TestContext;
//import io.cucumber.core.api.Scenario;
//import cucumber.TestContext;
//import io.cucumber.java.Scenario;
//import cucumber.api.Scenario;
//import cucumber.api.java.After;
//import cucumber.api.java.AfterStep;
//import cucumber.api.java.Before;
import pageObject.Merchate_User_PageObjects;

public class Hooks {

	Merchate_User_PageObjects Merchate_User_PageObjects;
	WebDriver driver;

	private final TestContext context;

	public Hooks(TestContext context) {
		this.context = context;
		Merchate_User_PageObjects = new Merchate_User_PageObjects(driver);
	}

	
//	@Before
//	public void beforeSteps(Scenario scenario) throws IOException {
//
//		// for driver version please the suitable and change it accordingly to run in
//		// your system
//
//		WebDriverManager.chromedriver().version("87.0.4280.20").setup();
//		driver = new ChromeDriver();
//		context.setDriver(driver);
//		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//	}

//	@AfterStep
//	public void afterStep(Scenario scenario) {
//
//		final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
//		scenario.attach(screenshot, "image/jpg", "jpg");
//
//	}

//	@After
//	public void tearDown(Scenario scenario) throws IOException {
//
//		context.getDriver().close();
//
//	}

}
