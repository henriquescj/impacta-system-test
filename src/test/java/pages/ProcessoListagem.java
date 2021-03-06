package pages;

import org.junit.Assert;
import support.DriverQA;

public class ProcessoListagem extends BasePage {
    public ProcessoListagem(DriverQA stepDriver) {
        super(stepDriver);
    }

    public void clickNovoProcesso() {
        driver.click("btn-novo");
    }

    public void clickMostrar(String code) {
        driver.click("btn-show_" + code);
    }

    public void clickEditar(String code) {
        driver.click("btn-edit_" + code);
    }

    public void clickApagar(String code) {
        driver.click("btn-delete_" + code);
    }

    public void confirmDeleted() {
        driver.ChooseOkOnNextConfirmation();
    }

    public void checkIfRegistryDoesntExist(String code) {
        Assert.assertFalse(driver.isDisplayed("codigo_" + code));
    }
}
