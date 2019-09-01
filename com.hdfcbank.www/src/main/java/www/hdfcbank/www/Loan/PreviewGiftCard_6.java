package www.hdfcbank.www.Loan;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PreviewGiftCard_6 {
	private WebDriverWait wait;
	
	@FindBy (xpath ="//a[contains(@class,'button1')]")
	private WebElement 	clickNext;
	
	
	public PreviewGiftCard_6(WebDriver driver) { /// Constructor and Page Factory code
		PageFactory.initElements(driver, this);
		//actions = new Actions(driver);// create Actions class Object
		wait = new WebDriverWait(driver, 10);// create WebDriverWait class object
	}
	
	

	

public void enterDetails() {
	
	clickNext.click();
}
}