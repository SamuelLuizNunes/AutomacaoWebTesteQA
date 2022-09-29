package br.com.testeAutomacao.steps;

import br.com.testeAutomacao.core.Driver;
import br.com.testeAutomacao.enums.Browser;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class LoginSteps {
	
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
	    throw new io.cucumber.java.PendingException();
	}
	
	@Quando("os campos de login forem preenchidos da seguinte forma")
	public void osCamposDeLoginForemPreenchidosDaSeguinteForma(io.cucumber.datatable.DataTable dataTable) {
	    throw new io.cucumber.java.PendingException();
	}
	
	@Quando("for realizado um clique no botao login")
	public void forRealizadoUmCliqueNoBotaoLogin() {
	    throw new io.cucumber.java.PendingException();
	}
	
	@Entao("deve ser possivel logar no sistema")
	public void deveSerPossivelLogarNoSistema() {
	    throw new io.cucumber.java.PendingException();
	}

}
