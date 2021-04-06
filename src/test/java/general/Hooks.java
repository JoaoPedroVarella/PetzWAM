package general;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks extends Base {
    private Base base;

    public Hooks (Base base){
        super(base.driver);
        this.base = base;
    }

    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "drivers/chrome/88/chromedriver.exe");
        base.driver = new ChromeDriver();

        base.driver.manage().window().maximize();
        base.driver.manage().timeouts().implicitlyWait(60000, TimeUnit.MILLISECONDS);


    }

    @After
    public void tearDown(){
        base.driver.quit();
    }
}
