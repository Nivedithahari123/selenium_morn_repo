package cars;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class LamborghiniTest {
	
		@Test(groups="system")
		public  void launch() {
			WebDriver driver =new ChromeDriver();
			
			driver.get("https://www.lamborghini.com/en-en");
			Reporter.log("Lomborghini launched successfully", true);
			
		}

	}






