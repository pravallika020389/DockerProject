package grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;


public class DockerChrome1 {

	
		
		@Test
		public void test1()  throws MalformedURLException {
		
		ChromeOptions options = new ChromeOptions();
		options.setCapability("browserName", "chrome");
        // Replace "localhost" with the actual address of your Selenium Grid hub
        URL Url = new URL("http://localhost:4444/wd/hub");

        // Create a RemoteWebDriver instance pointing to the hub
        WebDriver driver = new RemoteWebDriver(Url, options);
        
        driver.get("https://www.google.com/");
        System.out.println("the title is "+driver.getTitle());
        
        driver.quit();
	}

}
