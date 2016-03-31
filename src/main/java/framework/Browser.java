package framework;

import org.openqa.selenium.chrome.*;

public class Browser {

	private static String baseUrl = "https://bpm856ps:9443/ProcessPortal";
	private static ChromeDriver chromeWebDriver;
	
	public Browser(ChromeDriver chromeDriver) {
		chromeWebDriver = chromeDriver;
	}
	
	public static void setChromeWebDriver(ChromeDriver chromeWebDriver) {
		Browser.chromeWebDriver = chromeWebDriver;
	}

	public static ChromeDriver getChromeWebDriver() {
		return chromeWebDriver;
	}

	public static void Initialize() {
		Goto("");
    }
	
	public static void Goto(String url) {
		chromeWebDriver.get(baseUrl + url);
    }
	
	public static void Close() {
        chromeWebDriver.close();
    }
}
