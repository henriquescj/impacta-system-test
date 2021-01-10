package pages;

import support.DriverQA;

public class ProcessoCadastro extends BasePage {
    public ProcessoCadastro(DriverQA stepDriver) {
        super(stepDriver);
    }

    public void insertText(String campo, String valor) {
        driver.sendKeys(valor, campo);
    }

    public void setRadioButton(String campo, String valor) throws Exception {
        switch (campo) {
            case "Arbitramento":
                if (valor.equals("Sim")) {
                    driver.click("processo_arbitramento_s");
                } else {
                    driver.click("processo_arbitramento_n");
                }
                break;
            default:
                throw new Exception("Without valid field");
        }
    }

    public void setSelect(String campo, String valor) throws Exception {
        switch (campo) {
            case "Urgente":
                driver.selectByText(valor, "processo_urgente");
                break;
            default:
                throw new Exception("Without valid field");
        }
    }

    public void clickSalvar() {
        driver.click("btn-save");
    }
}
