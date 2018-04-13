package seleniumBasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSeleniumCode {

	public static void main(String[] args) {
		// this program is for training page
		// create object ChromeDriver
		WebDriver driver = new ChromeDriver();
		// navigate to test page
		driver.get("http://www.training.qaonlinetraining.com/testPage.php");
		// type in web element with name "name"		
		driver.findElement(By.name("name")).sendKeys("Your name");
		// type in web element with id "eml"
		driver.findElement(By.id("eml")).sendKeys("asdfsdg");
		driver.findElement(By.name("website")).sendKeys("wwwwww");
		driver.findElement(By.name("comment")).sendKeys("my comment is here");
		// locate all radio buttons with name "gender", choose second element and click
		driver.findElements(By.name("gender")).get(1).click();
		// create collection of elements with type "checkbox"
		List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
		for (WebElement oneCheckBox : checkBoxes) {
			if(oneCheckBox.isSelected()) oneCheckBox.click();
		}
		
		checkBoxes.get(3).click();
		
	}

}
