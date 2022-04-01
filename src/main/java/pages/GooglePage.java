package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GooglePage {

	WebDriver driver = new ChromeDriver();

	public void caminhosite() {
		System.setProperty("webdriver.chrome.driver", ".\\chromedriver.exe");
		driver.get("https://www.google.com.br/");
		driver.manage().window();
	}

	public void inserindopesquisa() {
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Sapato feminino");
		driver.findElement(By.xpath("(//input[@class='gNO89b'])")).submit();
	}

	public boolean validandotela() {
		if (driver.findElement(By.xpath("//div[@class='hdtb-mitem hdtb-msel']")) != null) {
			driver.quit();
		return true;
			} else {
			return false;
}
	}
}