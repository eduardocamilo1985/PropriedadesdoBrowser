package cenarios;

import org.junit.Test;

import pages.LoginPage;


public class Login {
	
	LoginPage logar = new LoginPage();
	
	@Test
	public void realizarLogin() throws InterruptedException {
		
		logar.acessar("http://paraSegurançaNaoVouColocarOEndereco");//Todas as atividades
		Thread.sleep(1000);
		logar.usuario("fulano");
		logar.senha("senha123");
		
	
	}
	
}
