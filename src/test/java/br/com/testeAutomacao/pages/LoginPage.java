package br.com.testeAutomacao.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import br.com.testeAutomacao.core.Driver;
import br.com.testeAutomacao.maps.LoginMap;

public class LoginPage {
	LoginMap loginMap;
	
	public LoginPage() {
		loginMap = new LoginMap();
		PageFactory.initElements(Driver.getDriver(), loginMap);
	}
	
	public void clickBtnLogin() {
		loginMap.btnLogin.click();
	}
	
	public void setInpUserName(String username) {
		loginMap.inpUserName.sendKeys(username);
	}
	
	public void setInpPassword(String password) {
		loginMap.inpPassword.sendKeys(password);
	}			
	
	public void setInpFirstName(String firstName) {
		loginMap.inpFirstName.sendKeys(firstName);
	}
	
	public void setInpLast(String lastName) {
		loginMap.inpLastName.sendKeys(lastName);
	}
	
	public void setInpCep(String cep ) {
		loginMap.inpcep.sendKeys(cep);
	}
	
	
	
	
	
	
	public String getTxtLogado() {
		return loginMap.txtAreaLogada.getText();
	}
	
	public void ordenarMenorPrecoParaMaior() {
		WebElement element = loginMap.filtroOrdenacao;
		Select combo = new Select(element);
		combo.selectByIndex(2);
	}
	
	public boolean verificaOpacaoSelecionada() {
		return loginMap.filtroOrdenacao.isSelected();
	}
	
	public void addProdutoSauceLabsOnesie() {
		loginMap.prodSauceLabsOnesie.click();
	}
	
	public void addProdTestAllTheThingsTShirtRed() {
		loginMap.prodTestAllTheThingsTShirtRed.click();
	}
	
	public String getProdAdicionadoAoCarrinho() {
		return loginMap.cart.getText();
	}
	
	public void entrarNoCarrinho() {
		loginMap.cartFinalizarCompra.click();
	}
	
	public void clicarCheckout() {
		loginMap.checkout.click();
	}
	
	public void clicarContinue() {
		loginMap.btnContinue.click();
	}
	
	public void clicarFinish() {
		loginMap.btnFinish.click();
	}
	
	public String pedidoFinalidado() {
		return loginMap.txtPedidoFinalizado.getText();
	}
}
