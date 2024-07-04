package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class loginDefination {

	public static WebDriver driver;

	@Given("user is on google page")
	public void user_is_on_google_page() {
		driver = new ChromeDriver();
		driver.get("http://www.google.com");
	}

	@When("user enter {string} in search box")
	public void user_enter_in_search_box(String name) {
		WebElement searchbox = driver.findElement(By.id("APjFqb"));

		searchbox.sendKeys(name);
	}

	@When("click on search button")
	public void click_on_search_button() {
		WebElement button = driver
				.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//child::input[@value='Google Search']"));
		button.click();
	}

}
