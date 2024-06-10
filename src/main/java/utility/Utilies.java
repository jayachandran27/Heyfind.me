package utility;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Utilies {
	public static WebDriver driver;
	public static Properties pro;

	public WebDriver Inititalizilizedriver() throws IOException {

		pro = new Properties();
		File f = new File("C:\\eclipse workspace1\\hey_findme\\src\\main\\java\\resources\\data.properties");
		FileInputStream fi = new FileInputStream(f);
		pro.load(fi);

		System.setProperty("webdriver.chrome.driver",
				"C:\\eclipse workspace1\\selinieum practice\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		return driver;

	}
	// METHOD TO TAKE SCREENSHOT...

	public static void screenshot(String testname, WebDriver driver) throws IOException {
		TakesScreenshot s = (TakesScreenshot) driver;
		File source = s.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\eclipse workspace1\\hey_findme\\screenshot");
		FileHandler.copy(source, dest);

	}

	// method to scroll down
	public static void scrolldown() {
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("windows.scrollby(0,2000);");

	}

	// To print page title
	public static void getpagetitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	// To perform mouse event
	public static void action(String method, WebElement element) {
		Actions ac = new Actions(driver);
		if (method.equalsIgnoreCase("doubleclick")) {
			ac.doubleClick();
		} else if (method.equalsIgnoreCase("move")) {
			ac.moveToElement(element);
		} else if (method.equalsIgnoreCase("drag")) {
			ac.dragAndDrop(element, element);

		} else if (method.equalsIgnoreCase("hold")) {
			ac.dragAndDrop(element, element);
		} else if (method.equalsIgnoreCase("click")) {
			ac.click();
		}

	}

	// TO PERFORM DROUP DOWN
	public static void select(WebElement element, String value, String method) {
		Select s = new Select(element);
		if (method.equalsIgnoreCase("val")) {
			s.selectByValue(value);
		} else if (method.equalsIgnoreCase("vis")) {
			s.selectByVisibleText(value);
		} else if (method.equalsIgnoreCase("index")) {
			int i = Integer.parseInt(value);
			s.selectByIndex(i);
		}
	}

	public static void robert(String key) throws AWTException {
		Robot rob = new Robot();
		rob.keyPress(KeyEvent.VK_ENTER);
		// rob.keyRelease(KeyEvent.VK_ENTER);
	}

	
}
