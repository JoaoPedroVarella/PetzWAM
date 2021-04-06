package general;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {
    protected WebDriver driver;//ao usar o pagefactory deve usar o protected inves do public

    //criar um construtor para iniciar o pagefactory
    public Base(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this );
    }
}
