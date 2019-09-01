package www.hdfcbank.www.Loan;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectBirthdaCard_4 {
	
	private WebDriverWait wait;
	
	@FindBy(xpath="//img[contains(@src,'HBD008-BIG.png')]")
	private WebElement selectBirthdaCard;
	
	
	
	public SelectBirthdaCard_4(WebDriver driver) {
		PageFactory.initElements(driver, this);
		//actions = new Actions(driver);// create Actions class Object
		wait = new WebDriverWait(driver, 10);// create WebDriverWait class object

	}



	public void selectBirthdaCard() {
		
		wait.until(ExpectedConditions.elementToBeClickable(selectBirthdaCard));
		selectBirthdaCard.click();
		
		
	}
	

}
