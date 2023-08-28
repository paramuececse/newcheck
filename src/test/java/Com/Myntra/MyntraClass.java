package Com.Myntra;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MyntraClass {
	WebDriver driver;
	public MyntraClass(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath = "//a[@data-group='men']")
	WebElement CursorMoveMen;
	
	
	
	@FindBy(xpath="//a[@href='/men-jackets']")
	WebElement jacketClickButton;
	
	@FindBy(xpath="(//div[@class='common-checkboxIndicator'])[1]")
	WebElement ClickButton;
	
	@FindBy(xpath="(//span[@class='title-count'])[1]")
	WebElement titlecount;
	
	@FindBy(xpath="//div[@class='brand-more']")
	WebElement clickaddmore;
	 
	@FindBy(xpath="//input[@placeholder='Search brand']")
	WebElement sendDuke;
	
	//@FindBy(css ="input[value='Duke']")
	//@FindBy(linkText =  "Duke")
	
	@FindBy(xpath="(//div[contains(@class,'FilterDirectory-panel FilterDirectory')]//label//div")
//	
//	@FindBy(xpath="//body[1]/div[2]/div[1]/main[1]/div[3]/div[1]/section[1]/div[1]/div[2]/div[3]/div[2]/ul[1]/li[2]/label[1]")
WebElement SelectDukeCheckbox;
	
	//body[1]/div[2]/div[1]/main[1]/div[3]/div[1]/section[1]/div[1]/div[2]/div[3]/div[2]/ul[1]/li[2]/label[1]
	
//	@FindBy(css="input[value='Duke Stardust']")
//	WebElement SelectDukeStardustecheckbox;
//	
	@FindBy(xpath="//span[@class='myntraweb-sprite filter-search-closeSearch sprites-remove']")
	WebElement closeFilter;
//	
	
	public void MouseHover() {
		Actions action=new Actions(driver);
		action.moveToElement(CursorMoveMen).perform();
	}
	public void JacketClickButton() {
		jacketClickButton.click();
		
	}
	public void CheckBoxClickButton() {
		ClickButton.click();
		
	}
	public void TitleCount() {
		String totalitemscount=titlecount.getText();
		System.out.println(totalitemscount);
		
	}
	public void addmore() {
		clickaddmore.click();
		
	}
	public void SendDuke(String SendingDuke) {
		sendDuke.sendKeys(SendingDuke);
		
	}
//	public void DukeCheckBox1() {
//		SelectDukeCheckbox.click();
//	}
//	public void DukeCheckBox2() {
//		SelectDukeStardustecheckbox.click();
//	}
	public void CloseFilter() {
		Actions action=new Actions(driver);
		action.moveToElement(closeFilter).click().perform();
		closeFilter.click();
	}
}
