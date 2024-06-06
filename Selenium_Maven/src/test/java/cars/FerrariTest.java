package cars;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FerrariTest {
	@Test(groups="smoke")
	public  void launch() {
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.ferrari.com/en-IN");
		Reporter.log("Ferrari launched successfully", true);
		
	}

}

// in maven suite file under test we have to create groups
// in pom.xml file under dependencies we have to create build(in chrome maven surefire we have to copy Using Suite XML Files)ans suitexml files we have to mention our file name.
