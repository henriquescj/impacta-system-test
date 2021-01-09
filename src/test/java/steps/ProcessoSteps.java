package steps;

import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pages.*;
import support.RESTSupport;
import support.BaseSteps;

public class ProcessoSteps extends BaseSteps {
    private static HomePage homePage = new HomePage(driver);
    private static MenuLateral menuLateral = new MenuLateral(driver);
    private static ProcessoListagem listagem = new ProcessoListagem(driver);
    private static ProcessoCadastro cadastro = new ProcessoCadastro(driver);
    private static ProcessoIndividual individual =  new ProcessoIndividual(driver);

    @Dado("^que estou na página principal$")
    public void queEstouNaPáginaPrincipal() {
        homePage.open();
    }

    @E("^clicou em Processos no menu lateral$")
    public void clicouEmProcessosNoMenuLateral() {
        menuLateral.clickProcessos();
    }

    @E("^clicou em Novo Processo$")
    public void clicouEmNovoProcesso() {
        listagem.clicouNovoProcesso();
    }

    @E("^em processo preencher campo \"([^\"]*)\" com valor de \"([^\"]*)\"$")
    public void emProcessoPreencherCampoComValorDe(String campo, String valor) {
        cadastro.insertText(campo, valor);
    }

    @E("^radio button \"([^\"]*)\" selecionar \"([^\"]*)\"$")
    public void radioButtonSelecionar(String campo, String valor) throws Throwable {
        cadastro.setRadioButton(campo, valor);
    }

    @E("^combobox \"([^\"]*)\" selecionar \"([^\"]*)\"$")
    public void comboboxSelecionar(String campo, String valor) throws Throwable {
        cadastro.setCombobox(campo, valor);
    }

    @Quando("^em processo clicar em Salvar$")
    public void emProcessoClicarEmSalvar() {
        cadastro.save();
    }


    @Então("^na tela de confirmação deveria retornar mensagem \"([^\"]*)\"$")
    public void naTelaDeConfirmaçãoDeveriaRetornarMensagem(String mensagem) throws Throwable {
        individual.checkMessage(mensagem);
    }

    @E("^obter o código do processo$")
    public void obterOCódigoDoProcesso() {
        individual.clickGoBack();
    }

    @E("^clicar em Voltar na tela do processo$")
    public void clicarEmVoltarNaTelaDoProcesso() {
        
    }

    @E("^clicar no botão mostrar na linha do registro do processo$")
    public void clicarNoBotãoMostrarNaLinhaDoRegistroDoProcesso() {
        
    }

    @Então("^na tela do processo o código deveria ser do registro cadastrado$")
    public void naTelaDoProcessoOCódigoDeveriaSerDoRegistroCadastrado() {
    }

    @E("^o campo \"([^\"]*)\" deve estar com valor \"([^\"]*)\"$")
    public void oCampoDeveEstarComValor(String arg0, String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
