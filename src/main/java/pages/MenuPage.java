package pages;

import org.openqa.selenium.By;

import estrutura.Basic;

public class MenuPage extends Basic {
	
	public void consultar() {
		espera(By.linkText("CONSULTAS"));
		clicar(By.linkText("CONSULTAS"));
	}
	public void todasAsDemandas() {
		espera(By.xpath("//li[@id='IA-OSYYU9PCWRR']//p[contains(text(),'Todas as demandas')]"));
		clicar(By.xpath("//li[@id='IA-OSYYU9PCWRR']//p[contains(text(),'Todas as demandas')]"));
	}
	

}
