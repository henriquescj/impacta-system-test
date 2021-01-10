package pages;

import support.DriverQA;

public class ProcessoCadastro extends BasePage {
    public ProcessoCadastro(DriverQA stepDriver) {
        super(stepDriver);
    }

    public void insertText(String field, String value) {
        driver.sendKeys(value, field);
    }

    public void setRadioButton(String field, String value) throws Exception {
        if ("Arbitramento".equals(field)) {
            if (value.equals("Sim")) {
                driver.click("processo_arbitramento_s");
            } else {
                driver.click("processo_arbitramento_n");
            }
        } else {
            throw new Exception("Without valid field");
        }
    }

    public void setSelect(String field, String value) throws Exception {
        if ("Urgente".equals(field)) {
            driver.selectByText(value, "processo_urgente");
        } else {
            throw new Exception("Without valid field");
        }
    }

    public void clickSalvar() {
        driver.click("btn-save");
    }
}
