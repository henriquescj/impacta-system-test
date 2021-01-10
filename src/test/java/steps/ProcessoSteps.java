package steps;

import pages.*;
import org.junit.Assert;
import support.BaseSteps;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class ProcessoSteps extends BaseSteps {
    private static final HomePage homePage = new HomePage(driver);
    private static final MenuLateral menuLateral = new MenuLateral(driver);
    private static final ProcessoListagem listagem = new ProcessoListagem(driver);
    private static final ProcessoCadastro cadastro = new ProcessoCadastro(driver);
    private static final ProcessoIndividual individual =  new ProcessoIndividual(driver);

    @Dado("^que o usuário está na página inicial$")
    public void queoUsuarioEstaNaPaginaInicial() {
        homePage.open();
    }

    @E("^clica em Processos no menu lateral$")
    public void clicaEmProcessosNoMenuLateral() {
        menuLateral.clickProcessos();
    }

    @E("^clica em Novo Processo$")
    public void clicaEmNovoProcesso() {
        listagem.clickNovoProcesso();
    }

    @E("^preenche campo \"([^\"]*)\" com valor \"([^\"]*)\"$")
    public void preencheCampoComValor(String campo, String valor) {
        cadastro.insertText(campo, valor);
    }

    @E("^no radio button \"([^\"]*)\" seleciona \"([^\"]*)\"$")
    public void noRadioButtonSeleciona(String campo, String valor) throws Throwable {
        cadastro.setRadioButton(campo, valor);
    }

    @E("^no select \"([^\"]*)\" seleciona \"([^\"]*)\"$")
    public void noSelectSeleciona(String campo, String valor) throws Throwable {
        cadastro.setSelect(campo, valor);
    }

    @Quando("^clica em Salvar$")
    public void clicaEmSalvar() {
        cadastro.clickSalvar();
    }


    @Então("^na tela de confirmação deve retornar mensagem \"([^\"]*)\"$")
    public void naTelaDeConfirmacaoDeveRetornarMensagem(String mensagem) {
        individual.checkMessage(mensagem);
    }

    @E("^obtém o código do processo$")
    public void obtemOCodigoDoProcesso() {
        individual.storeProcessoCode();
    }

    @E("^clica em Voltar na tela do processo$")
    public void clicaEmVoltarNaTelaDoProcesso() {
        individual.clickVoltar();
    }

    @E("^clica em Mostrar na linha do processo$")
    public void clicaEmMostrarNaLinhaDoProcesso() {
        listagem.clickMostrar(
                individual.getProcessoCode()
        );
    }

    @Então("^na tela do processo o código deve ser igual ao obtido$")
    public void naTelaDoProcessoOCodigoDeveSerIgualAoObtido() {
        String obtained = individual.getProcessoCode();
        String viewed = individual.getCodeFromScreen();
        Assert.assertEquals(obtained, viewed);
    }

    @E("^o campo \"([^\"]*)\" deve estar com valor \"([^\"]*)\"$")
    public void oCampoDeveEstarComValor(String campo, String valor) {
        individual.checkField(campo, valor);
    }

    @E("^clica em Editar na linha do processo$")
    public void clicaEmEditarNaLinhaDoProcesso() {
        listagem.clickEditar(
                individual.getProcessoCode()
        );
    }

    @E("^clica em Apagar na linha do processo$")
    public void clicaEmApagarNaLinhaDoProcesso() {
        listagem.clickApagar(
                individual.getProcessoCode()
        );
    }

    @E("^confirma que deseja apagar o processo$")
    public void confirmaQueDesejaApagarOProcesso() {
        listagem.confirmDeleted();
    }

    @Então("^o processo não deve aparecer na lista de processos$")
    public void oProcessoNaoDeveAparecerNaListaDeProcessos() {
        listagem.checkIfRegistryDoesntExist(
                individual.getProcessoCode()
        );
    }
}
