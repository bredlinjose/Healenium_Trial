package trial.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.epam.healenium.SelfHealingDriver;

public class BaseTest {
	
	protected SelfHealingDriver driver;

    @BeforeClass
    public void setUp() {
        WebDriver delegate = new ChromeDriver();
        driver = SelfHealingDriver.create(delegate);
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
    
}
