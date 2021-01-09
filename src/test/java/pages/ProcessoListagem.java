package pages;

import support.DriverQA;

public class ProcessoListagem extends BasePage {
    public ProcessoListagem(DriverQA stepDriver) {
        super(stepDriver);
    }

    public void clicouNovoProcesso() {
        driver.click("btn-novo");
    }
}
