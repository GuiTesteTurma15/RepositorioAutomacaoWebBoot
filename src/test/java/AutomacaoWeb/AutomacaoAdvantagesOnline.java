package AutomacaoWeb;

import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomacaoAdvantagesOnline {

	WebDriver driver;
	@Before
	public void setUp() throws Exception {
		// codigo para mostrar o caminho do chrome
				System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
				//codigo para abrir o navegador 
				driver = new ChromeDriver();
				// comando para passar o caminho so site
				driver.get("https://advantageonlineshopping.com/#/");
				// comando para maximizar o site
				driver.manage().window().maximize();
				//comando para pausa
				Thread.sleep(5000);
				//comando para clicar
				driver.findElement(By.id("menuUser")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("/html/body/login-modal/div/div/div[3]/a[2]"));
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
