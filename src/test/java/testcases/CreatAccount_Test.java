package testcases;

import org.testng.annotations.Test;

import base_class.Base;
import page_object.CreatAccount_page;
import utility.Utilies;

public class CreatAccount_Test extends Base {
	
	@Test
	
	public void CreateAccount() throws InterruptedException {
		
		
		CreatAccount_page CA = new CreatAccount_page(driver);
		
		CA.Menu();
		CA.Signin();
		CA.CreatAccount();
		CA.Hashtag(pro.getProperty("Hastagg"));
		CA.CheckAvailability();
		CA.BuyHastag();
		CA.FirstName(pro.getProperty("FirstName"));
		Thread.sleep(3000);
		CA.LastName(pro.getProperty("LastName"));
		Thread.sleep(3000);
		CA.Number(pro.getProperty("Number"));
		CA.Password(pro.getProperty("Password"));
		CA.Email(pro.getProperty("Email"));
		Thread.sleep(3000);
		CA.DroupDown();
		Thread.sleep(3000);
		
		CA.CreatAccountSubmit();
		Thread.sleep(3000);
		CA.CompletePayment();
		Thread.sleep(3000);
		
		
		
		
	}
	

	

}
