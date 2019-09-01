package www.hdfcbank.www.Loan;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PaymentDetails_7 {
	private WebDriverWait wait;
	private Alert alert;   
	private WebDriver driver;           
	
	@FindBy (xpath ="//a[contains(@class,'btn2 anothrCards')]")
	private WebElement 	clickGiftAnotherCard;
	
	
	public PaymentDetails_7(WebDriver driver) { /// Constructor and Page Factory code
		PageFactory.initElements(driver, this);
		//actions = new Actions(driver);// create Actions class Object
		wait = new WebDriverWait(driver, 10);// create WebDriverWait class object
		//alert = new Alert(driver);
	
	}
	
	
public void enterDetails() {
	
	clickGiftAnotherCard.click();
	Alert alert = driver.switchTo().alert();
	alert.accept();
}
}