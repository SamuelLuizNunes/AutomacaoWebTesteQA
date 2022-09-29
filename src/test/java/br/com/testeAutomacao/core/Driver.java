package br.com.testeAutomacao.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import br.com.testeAutomacao.enums.Browser;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver {
	private static WebDriver driver;

	public Driver(Browser navegador) {

		switch (navegador) {
		case CHROME:
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case IE:
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			break;
		case FIREFOX:
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case EDGE:
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;

		}

	}
	
	public static WebDriver getDriver() {
		return driver;
	}
}
