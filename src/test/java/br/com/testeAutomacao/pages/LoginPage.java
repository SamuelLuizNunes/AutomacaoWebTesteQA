package br.com.testeAutomacao.pages;

import org.openqa.selenium.support.PageFactory;

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
}
