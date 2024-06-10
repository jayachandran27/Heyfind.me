package page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Utilies;

public class CreatAccount_page extends Utilies {
	public WebDriver driver;
	
	public CreatAccount_page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		
	}
	@FindBy(xpath ="//div[@class='menu-btn-container']")
	 WebElement Menu;
	@FindBy(xpath ="//a[text()='Account Sign In']")
	WebElement accsignin;
	
	@FindBy(id="createAccount")
	WebElement creatacc;
	@FindBy(id="hash_tag")
	WebElement hashtag;
	@FindBy(id="nextBtn")
	WebElement checkavail ;
	@FindBy(xpath="//a[text()='Buy Hashtag']")
	WebElement buyhash;
	@FindBy(id="firstName")
	WebElement firstnam;
	@FindBy(id="lastName")
	WebElement lstnam;
	@FindBy(id="phoneNumber")
	WebElement phnum;
	@FindBy(id="accountPassword")
	WebElement passwrd;
	@FindBy(id="emailAddress")
	WebElement email;
	@FindBy(xpath="//a[text()='Create Account']")
	WebElement cretsubmit;
	@FindBy(xpath="//select[@class='date activateinput']")
	WebElement day;
	@FindBy(id="dobmonth")
	WebElement mont ;
	@FindBy(id="dobyear")
	WebElement year ;
	@FindBy(xpath="//select[@class='activateinput']")
	WebElement gender ;
	////a[text()='Complete Payment']
	@FindBy(xpath="//a[text()='Complete Payment']")
	WebElement compaym;
	
	
	public void Menu() {
		Menu.click();
	}
	
	public void Signin() {
		accsignin.click();
	}
	
	public void CreatAccount() {
		creatacc.click();
	}
	public void Hashtag(String Hashtagg) {
		hashtag.sendKeys(Hashtagg);
		
	}
	public void CheckAvailability() {
		checkavail.click();
		
	}
	public void BuyHastag() {
		buyhash.click();
	}
	public void FirstName(String FirstName) {
		firstnam.sendKeys(FirstName);
		
		
	}
	public void LastName(String LastName) {
		lstnam.sendKeys(LastName);
		
	}
	public void Number(String Number) {
		phnum.sendKeys(Number);
		
	}
	public void Password(String Password) {
		passwrd.sendKeys(Password);
		
	}
	public void Email(String Email) {
		email.sendKeys(Email);
		
	}
	
	public void DroupDown() {
		driver.findElement(By.xpath("//select[@class='date activateinput']")).click();
		select(day,"04","val");
		driver.findElement(By.id("dobmonth")).click();
		select(mont,"11","val");
		driver.findElement(By.id("dobyear")).click();
		select(year,"1998","val");
		driver.findElement(By.xpath("//select[@class='activateinput']")).click();
		select(gender,"1","val");
		
	}	
		
	public void CreatAccountSubmit() {
		cretsubmit.click();
	}
	public void CompletePayment() {
		
		compaym.click();
	}
	
}
	
	
	
	
	
	
	

	


