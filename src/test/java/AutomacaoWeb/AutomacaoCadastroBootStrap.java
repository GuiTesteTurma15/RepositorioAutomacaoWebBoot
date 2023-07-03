package AutomacaoWeb;



import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomacaoCadastroBootStrap {

	WebDriver driver;
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		//codigo para abrir o navegador 
		driver = new ChromeDriver();
		// comando para passar o caminho so site
		driver.get("https://www.grocerycrud.com/v1.x/demo/my_boss_is_in_a_hurry/bootstrap");
		// comando para maximizar o site
		driver.manage().window().maximize();
		//comando para pausa
		//Thread.sleep(5000);
		//comando para clicar
		//driver.findElement(By.xpath("//*[@id=\"switch-version-select\"]/option[4]")).click();
	//	driver.findElement(By.xpath("//*[@id=\"gcrud-search-form\"]/div[1]/div[1]/a")).click();
	//	driver.findElement(By.id("field-customerName")).sendKeys("Teste");
		Thread.sleep(5000);
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
