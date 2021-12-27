package pages;

import org.openqa.selenium.By;

import estrutura.Basic;

public class LoginPage extends Basic{
	
	public void acessarPagina(String url) throws InterruptedException {
	acessar(url);
	
	}
	
	public void usuario(String usuario) {
		espera(By.id("username"));
		escrever(By.id("username"),usuario);
	}
	
	public void senha(String senha) {
		escrever(By.id("password"), senha);
		teclaEnter(By.id("password"));
	}
	
	public void btnEntrar() {
		clicar(By.xpath("//button"));
	}
	

}
