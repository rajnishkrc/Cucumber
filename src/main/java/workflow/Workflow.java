package workflow;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Workflow {
	private WebDriver driver;

	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		driver = new ChromeDriver();

	}

	public void navigate() {
		driver.get("http://techcanvass.com");

	}

	public boolean matchResults(String expected) {
		if (driver.getTitle().contains(expected))
			return true;
		else
			return false;
	}

	public void closeBrowsers() {
		driver.quit();
	}

}