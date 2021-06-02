package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorldPopulation {

	static WebDriver driver;
	public static void main(String[] args)throws InterruptedException {
		
		String xpath_current_pop = "//div[@class='maincounter-number']/span[@class='rts-counter']";
		String xpath_today_pop = "//div[text()='Today']//parent::div//span[@class='rts-counter']";
		String xpath_thisyear_pop = "//div[text()='This year']//parent::div//span[@class='rts-counter']";
		String xpath_today_thisYear_pop = "//div[text()='This year' or text()='Today']//parent::div//span[@class='rts-counter']";
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.worldometers.info/world-population/");
		
		int count = 1;
		
		while(count <=20) {
			
			System.out.println(count + " sec");
			if(count == 21) break;
			
			System.out.println("---------current population count-----------");
			printPopulationData(xpath_current_pop);
			
			System.out.println("---------Today and This Year population count-----------");
			printPopulationData(xpath_today_thisYear_pop);
			System.out.println("==================================================");
			Thread.sleep(1000);
			count++;

			}
	}
		
	public static void printPopulationData(String locator) throws InterruptedException {
	
	driver.findElements(By.xpath(locator)).stream().forEach(e -> System.out.println(e.getText()));

	}
	{
driver.quit();

	}
}
