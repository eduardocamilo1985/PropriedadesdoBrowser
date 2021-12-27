package estrutura;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import static estrutura.Utilidades.temp;

public class DriverFactory {
	
private static WebDriver driver;
static FirefoxProfile profile = new FirefoxProfile();
static FirefoxOptions options = new FirefoxOptions();
	
	private DriverFactory() {
	}
	
	public static WebDriver getDriver() {
			
		if (driver == null) {
			System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\drivers\\geckodriver.exe");
		  
		    profile.setPreference("browser.download.folderList", 2);
			profile.setPreference("browser.helperApps.neverAsk.saveToDisk","application/xlsx, xlsx");
			profile.setPreference("browser.download.dir", temp);
				
			options.setProfile(profile);
			driver = new FirefoxDriver(options);
						
		}
		return driver;
	}
		
	public static void killDriver(){
		        if (driver !=null) {
		            driver.quit();
		            driver = null;
		        }
		    }}
