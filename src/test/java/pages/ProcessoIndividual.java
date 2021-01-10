package pages;

import org.junit.Assert;
import support.DriverQA;

public class ProcessoIndividual extends BasePage {
    private String processoCode = "";

    public ProcessoIndividual(DriverQA stepDriver) {
        super(stepDriver);
    }

    public void checkMessage(String mensagem) {
        String messageToCheck = driver.getText("notice");
        Assert.assertEquals(mensagem, messageToCheck);
    }

    public void clickVoltar() {
        driver.click(".ls-btn-primary-danger", "css");
    }

    public void storeProcessoCode() {
        this.processoCode = driver.getText("codigo");
    }

    public String getProcessoCode() {
        return this.processoCode;
    }

    public String getCodeFromScreen() {
        return driver.getText("codigo");
    }

    public void checkField(String campo, String valor) {
        String viewed = driver.getText(campo);
        Assert.assertEquals(viewed, valor);
    }
}
