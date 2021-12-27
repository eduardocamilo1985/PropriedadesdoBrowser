package estrutura;
import static estrutura.DriverFactory.getDriver;
import static estrutura.DriverFactory.killDriver;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Basic {
	
	public void acessar(String url) {
		getDriver().get(url);
	}
	
	public void finalizar() {
		killDriver();
		
	}
	
	public void escrever(By by, String texto) {
		getDriver().findElement(by).sendKeys(texto);		
	}
	
	public void clicar(By by) {
		getDriver().findElement(by).click();
	}
	
	public void teclaEnter(By by) {
		getDriver().findElement(by).sendKeys(Keys.ENTER);
		
	}
	
	public String obterTexto(By by) {
		return getDriver().findElement(by).getText();
		
	}
	
	public void espera(By by) {
		
		 WebDriverWait espera = new WebDriverWait(getDriver(),30);
	        espera.until(ExpectedConditions.elementToBeClickable(by));
	}
	
	public void alterarJanela() {
		
		String janelaPrincipal = getDriver().getWindowHandle();
		System.out.println(janelaPrincipal);
		Set<String> janelas = getDriver().getWindowHandles();	
		System.out.println(janelas);
			for (String identificador : janelas) {
			     if( !identificador.equals(janelaPrincipal) ) 
			    	 getDriver().switchTo().window(identificador);

	}

	}
}
