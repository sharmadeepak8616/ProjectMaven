package ProjectMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MavenSelenium_WordPress {

	@Test
	public void trySelenium_inMaven()
	{
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://demosite.center/wordpress/wp-login.php");
		driver.quit();
	}

}
