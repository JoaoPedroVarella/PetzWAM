package pages;

import general.Base;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home extends Base {
    //Mapeamento
    @FindBy(id = "search")
    private WebElement inputSearchTextBox;

    @FindBy(css = "button.button-search")
    private WebElement buttonSearch;

    //construtor
    public Home (WebDriver driver){
        super(driver);
    }

    //Ações nos elementos

    public void search(String product){
        inputSearchTextBox.click();//clicar na caixa de pesquisa
        inputSearchTextBox.clear();
        inputSearchTextBox.sendKeys(product);
    }

    public void searchWithMagnifierButton(String product){
        search(product);
        buttonSearch.click();
    }

    public void searchWithEnter(String product){
        search(product);
        inputSearchTextBox.sendKeys(Keys.ENTER);
    }

}
