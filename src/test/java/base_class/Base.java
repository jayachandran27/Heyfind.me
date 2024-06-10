package base_class;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utility.Utilies;

public class Base extends Utilies {
	
	@BeforeMethod

	public void startup() throws IOException{
		driver= Inititalizilizedriver();
		driver.get(pro.getProperty("URL"));
		
	}
	@AfterMethod
		
		public void close() {
			driver.quit();
			
		}
		
	

}
