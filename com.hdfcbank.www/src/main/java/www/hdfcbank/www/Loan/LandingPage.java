package www.hdfcbank.www.Loan;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LandingPage {
	private WebDriverWait wait;
	private Actions action;
	// @FindBy(xpath = "//img[contains(@class,'popupCloseButton')]") // Pop-up
	// window handle
	@FindBy(xpath = "//img[contains(@src,'cancel.png')]")
	private WebElement clickClosePopupWindow;// variable for Pop-up window

//******************************************************//	

	// @FindBy(xpath="//div[contains(@class,'selectWrapper')]")
	// @FindBy(xpath="//div[contains(@class,'selectedvalue')]")
	// @FindBy(xpath=" //ul[contains(@class,'loginOption')]")
	@FindBy(xpath = "//div[contains(text(),'NetBanking')]")
	private WebElement clickLoginExpander;

//	@FindBy(xpath = "//div[contains(@class,'expand')]") // click on the login menu
//	private WebElement clickLoginOption;
//
//	@FindBy(xpath = "//li[contains(@id,'prepaidcard')]") // clik on Forex & Prepaid Login / Forex Card Quick Reload
//	private WebElement clickPrepaidCard;
//
//	@FindBy(xpath = "//a[contains(@id,'loginsubmit')]")
//	private WebElement clickLoginButton;

	public LandingPage(WebDriver driver) { /// Constructor and Page Factory code
		PageFactory.initElements(driver, this);
		// actions = new Actions(driver);// create Actions class Object
		wait = new WebDriverWait(driver, 10);// create WebDriverWait class object
		action = new Actions(driver);
	}

	/*********************************
	 * Close Alert window
	 * 
	 * @throws InterruptedException
	 **********************************************************/

	public void closePopupWindow() throws InterruptedException {
		// wait.until(ExpectedConditions.elementToBeClickable(clickClosePopupWindow));
		// Thread.sleep(5000);
		clickClosePopupWindow.click();
	}

	public void ClickLogin() throws InterruptedException {
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(clickLoginExpander));
		
		action.click(clickLoginExpander).perform();

		// clickLoginExpander.click();
//		clickLoginOption.click();
//		clickPrepaidCard.click();
//		clickLoginButton.click();

	}

}
