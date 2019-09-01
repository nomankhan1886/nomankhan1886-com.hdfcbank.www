package www.hdfcbank.www.Loan;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SendCard_5 {
	private WebDriverWait wait;
	
	@FindBy (xpath ="//textarea[contains(@id,'message-text-area')]")
	private WebElement greetingMsg;

	@FindBy (xpath ="//input[contains(@id,'fname')]")
	private WebElement FirstName;
	
	@FindBy (xpath ="//input[contains(@id,'lname')]")
	private WebElement LastName;
	
	@FindBy (xpath ="//input[contains(@id,'email')]")
	private WebElement emailAddress;
	
	@FindBy (xpath ="//input[contains(@id,'mobile')]")
	private WebElement 	mobileNumber;
	
	@FindBy (xpath ="//textarea[contains(@id,'giftdate')]")
	private WebElement 	sendEGiftcardDate;
	
	@FindBy (xpath ="//a[contains(@id,'a500')]")
	private WebElement 	click500RS;
	
	@FindBy (xpath ="//img[contains(@src,'gift.png')]")
	private WebElement 	clickShowPreview;
	
	
	public SendCard_5(WebDriver driver) { /// Constructor and Page Factory code
		PageFactory.initElements(driver, this);
		//actions = new Actions(driver);// create Actions class Object
		wait = new WebDriverWait(driver, 10);// create WebDriverWait class object
	}
	

	

public void enterDetails() {
	greetingMsg.clear();
	greetingMsg.sendKeys("Congratulations,Happy Birthday, Buddy!");
	FirstName.sendKeys("Noman");
	LastName.sendKeys("Noman");
	emailAddress.sendKeys("Noman");
	mobileNumber.sendKeys("90512312346");
	sendEGiftcardDate.sendKeys("10-10-2019");
	click500RS.click();
	clickShowPreview.click();
}
}