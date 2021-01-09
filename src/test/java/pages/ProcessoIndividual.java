package pages;

import org.junit.Assert;
import support.DriverQA;

public class ProcessoIndividual extends BasePage {
    public ProcessoIndividual(DriverQA stepDriver) {
        super(stepDriver);
    }

    public void checkMessage(String mensagem) {
        String alertMessage = driver.getText("notice");
        Assert.assertEquals(mensagem, alertMessage);
    }

    public void clickGoBack() {
        driver.click(".ls-btn-primary-danger", "css");
    }
}
