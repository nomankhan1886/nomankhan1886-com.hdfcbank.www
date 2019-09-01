package www.hdfcbank.www.Loan;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EGiftPluscard_3 {
	private WebDriverWait wait;
	
	public EGiftPluscard_3 (WebDriver driver) { /// Constructor and Page Factory code
		PageFactory.initElements(driver, this);
	
		wait = new WebDriverWait(driver, 10);
	}
	

	@FindBy(xpath="//img[contains(@src,'friend.png')]")
	private WebElement selectEGiftPluscard;
	
	


public void ClickEGiftPluscard() {
	wait.until(ExpectedConditions.elementToBeClickable(selectEGiftPluscard));
	selectEGiftPluscard.click();

	
	
}	
	
}
