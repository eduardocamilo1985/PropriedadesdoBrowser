package pages;

import org.openqa.selenium.By;

import estrutura.Basic;

public class TodasAsDemandasPage extends Basic{
	
	
	public String numero(int x) {
		return obterTexto(By.xpath("//table//tr["+x+"]//td[1]"));
	}
	public String ano(int x) {
		return obterTexto(By.xpath("//table//tr["+x+"]//td[2]"));
	}
	public String dataCriacao(int x) {
		return obterTexto(By.xpath("//table//tr["+x+"]//td[3]"));
	}
	public String tipo(int x) {
		return obterTexto(By.xpath("//table//tr["+x+"]//td[6]"));
	}
	public String assunto(int x) {
		return obterTexto(By.xpath("//table//tr["+x+"]//td[7]"));
	}
	public String status(int x) {
		return obterTexto(By.xpath("//table//tr["+x+"]//td[9]"));
	}
	public String numeroAno(int x) {
		return obterTexto(By.xpath("//table//tr["+x+"]//td[12]"));
	}
	public String equipe(int x) {
		return obterTexto(By.xpath("//table//tr["+x+"]//td[13]"));
	}
	public String executores(int x) {
		return obterTexto(By.xpath("//table//tr["+x+"]//td[14]"));
	}
	public String itemConfiguracao(int x) {
		return obterTexto(By.xpath("//table//tr["+x+"]//td[15]"));
	}
	public void exportarExcel() throws InterruptedException {
		espera(By.id("VD-81KHFE8ANZVexportarXLSX"));
		clicar(By.id("VD-81KHFE8ANZVexportarXLSX"));
		clicar(By.xpath("//div[@class='bootbox modal fade show']//button[2]"));
	
	}
	
	public void finalizarBrowser() {
		finalizar();
	}

}
