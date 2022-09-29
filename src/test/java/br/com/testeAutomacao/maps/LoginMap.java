package br.com.testeAutomacao.maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginMap {
	@FindBy(id = "login-button")
	public WebElement btnLogin;
	@FindBy(id = "user-name")
	public WebElement inpUserName;
	@FindBy(id = "password")
	public WebElement inpPassword;
	@FindBy(css = ".title")
	public WebElement txtAreaLogada;
	@FindBy(css = ".product_sort_container")
	public WebElement filtroOrdenacao;
	@FindBy(id = "add-to-cart-sauce-labs-onesie")
	public WebElement prodSauceLabsOnesie;
	@FindBy(id = "add-to-cart-test.allthethings()-t-shirt-(red)")
	public WebElement prodTestAllTheThingsTShirtRed;
	@FindBy(css = ".shopping_cart_badge")
	public WebElement cart;
	@FindBy(css = ".shopping_cart_link")
	public WebElement cartFinalizarCompra;
	@FindBy(id = "checkout")
	public WebElement checkout;
	@FindBy(id = "first-name")
	public WebElement inpFirstName;
	@FindBy(id = "last-name")
	public WebElement inpLastName;
	@FindBy(id = "postal-code")
	public WebElement inpcep;
	@FindBy(id = "continue")
	public WebElement btnContinue;
	@FindBy(id = "finish")
	public WebElement btnFinish;
	@FindBy(css = ".complete-header")
	public WebElement txtPedidoFinalizado;
}
