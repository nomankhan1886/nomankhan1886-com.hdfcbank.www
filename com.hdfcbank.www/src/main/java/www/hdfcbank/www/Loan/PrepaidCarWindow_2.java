package www.hdfcbank.www.Loan;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PrepaidCarWindow_2 {

	private WebDriverWait wait;
	@FindBy(xpath = "//a[contains(@class,'btn btn-default moreBtn')])[3]")
	private WebElement selectPrepadeCard;

	public PrepaidCarWindow_2(WebDriver driver) {/// Constructor and Page Factory code
		PageFactory.initElements(driver, this);
	}

	public void selectPrepadeCard() {
		wait.until(ExpectedConditions.elementToBeClickable(selectPrepadeCard));
		selectPrepadeCard.click();
	}

}
