package www.hdfcbank.www.Loan;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class TC1_SelectEGiftCard extends BaseClass {
	private ArrayList<String> windows;

	@Test
	public void EGiftCard() throws InterruptedException {
		// landing Page
		landingPage.closePopupWindow();
		landingPage.ClickLogin();

		// Page2
		windows = new ArrayList<String>(driver.getWindowHandles());// creating object 'windows' for arrylist class
		driver.switchTo().window(windows.get(1));// selenium driver focus change to second window
		prepaidCarWindow_2.selectPrepadeCard();
		
		// Page3
	
		eGiftPluscard_3.ClickEGiftPluscard();
	
		// Page4
				
		selectBirthdaCard_4.selectBirthdaCard();

	}

}
