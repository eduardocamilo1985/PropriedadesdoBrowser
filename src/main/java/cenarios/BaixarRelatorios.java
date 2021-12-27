package cenarios;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import estrutura.Utilidades;
import pages.MenuPage;
import pages.TodasAsDemandasPage;
import pages.TodasAtividades;


public class BaixarRelatorios {
	Login logar = new Login();
	MenuPage menu = new MenuPage(); 
	TodasAsDemandasPage demandas = new TodasAsDemandasPage();
	TodasAtividades atividade = new TodasAtividades();
	Utilidades util = new Utilidades();
	
	String caminho = System.getProperty("user.home");
			
	@Before
	public void realizaLogin() throws InterruptedException {
		logar.realizarLogin();
	}
	

	@Test
	public void baixaRelatorios() throws InterruptedException, IOException {
		
		atividade.exportarExcel();
		Thread.sleep(10000);
		util.renomearArquivo(caminho + "\\Excel\\Todas as atividades.xlsx");
			
		menu.consultar();
		menu.todasAsDemandas();	
		demandas.exportarExcel();
		
		Thread.sleep(10000);	
		util.renomearArquivo(caminho +"\\Excel\\Todas as demandas.xlsx");
		
		demandas.finalizarBrowser();
			
	}
	
	
	

}
