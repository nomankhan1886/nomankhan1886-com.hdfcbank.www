package www.hdfcbank.www.Loan;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BaseClass {
	WebDriver driver;
	
/************* Landing Page declaration */

	LandingPage landingPage;
	
	PrepaidCarWindow_2 prepaidCarWindow_2;
	
	EGiftPluscard_3 eGiftPluscard_3;
	
	SelectBirthdaCard_4 selectBirthdaCard_4;
	
	
	@BeforeClass

	public void openBrowser() {// Opening the ChromeBrowser
		System.setProperty("webdriver.chrome.driver", "Chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		//opt.addArguments("--disable-notifications");
		driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://www.hdfcbank.com");
	
	
		landingPage = new LandingPage(driver);
		prepaidCarWindow_2 = new PrepaidCarWindow_2(driver);
		eGiftPluscard_3 = new EGiftPluscard_3(driver);
		selectBirthdaCard_4 = new SelectBirthdaCard_4(driver);
}
}