package br.com.testeAutomacao.steps;

import java.util.Map;

import org.junit.Assert;

import br.com.testeAutomacao.core.Driver;
import br.com.testeAutomacao.enums.Browser;
import br.com.testeAutomacao.pages.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class LoginSteps {
	LoginPage loginPage;

	@Before
	public void startBrowser() {
		new Driver(Browser.CHROME);
	}

	@After
	public void closeBrowser() {
		Driver.getDriver().quit();
	}

	@Dado("que a pagina de login esteja sendo exibida")
	public void queAPaginaDeLoginEstejaSendoExibida() {
		Driver.getDriver().get("https://www.saucedemo.com/");
		loginPage = new LoginPage();
	}

	@Quando("os campos de login forem preenchidos da seguinte forma")
	public void osCamposDeLoginForemPreenchidosDaSeguinteForma(Map<String, String> map) {
		String username = map.get("login");
		String password = map.get("password");
		loginPage.setInpUserName(username);
		loginPage.setInpPassword(password);
	}

	@Quando("for realizado um clique no botao login")
	public void forRealizadoUmCliqueNoBotaoLogin() {
		loginPage.clickBtnLogin();
	}

	@Entao("deve ser possivel logar no sistema")
	public void deveSerPossivelLogarNoSistema() {
		Assert.assertEquals("PRODUCTS", loginPage.getTxtLogado());
	}
	
	@Quando("selecionar no filtro de ordenacao o menor preco para o maior")
	public void selecionarNoFiltroDeOrdenacaoOMenorPrecoParaOMaior() {
	  loginPage.ordenarMenorPrecoParaMaior();
	}
	@Entao("o sistema deve ordenar os produtos")
	public void oSistemaDeveOrdenarOsProdutos() {
		Assert.assertFalse(loginPage.verificaOpacaoSelecionada());
	}
	
	@Quando("reazar um clique em add to cart nos produtos Sauce Labs Onesie e TestallTheThings TShirt Red")
	public void reazarUmCliqueEmAddToCartNosProdutosSauceLabsOnesieETestallTheThingsTShirtRed() {
	    loginPage.addProdutoSauceLabsOnesie();
	    loginPage.addProdTestAllTheThingsTShirtRed();
	}
	@Entao("os produtos sao adicionados no carrinho")
	public void osProdutosSaoAdicionadosNoCarrinho() {
	Assert.assertEquals("2", loginPage.getProdAdicionadoAoCarrinho());
	}

	@Quando("der um clique no carrinho")
	public void derUmCliqueNoCarrinho() {
	    loginPage.entrarNoCarrinho();
	}
	@Quando("selecionar Checkout")
	public void selecionarCheckout() {
	    loginPage.clicarCheckout();
	}
	@Quando("preencher os dados com")
	public void preencherOsDadosCom(Map<String, String> map) {
		String firstName = map.get("firstName");
		String lastName = map.get("lastName");
		loginPage.setInpFirstName(firstName);
		loginPage.setInpLast(lastName);
		loginPage.setInpCep("1233455677");
		
	}
	@Quando("clicar em continue")
	public void clicarEmContinue() {
		loginPage.clicarContinue();
	}
	@Quando("clicar em Finish")
	public void clicarEmFinish() {
		loginPage.clicarFinish();
	}
	@Entao("o pedido é finalizado")
	public void oPedidoÉFinalizado() {
		Assert.assertTrue(loginPage.pedidoFinalidado().contains("THANK YOU FOR YOUR ORDER"));
	}


}
