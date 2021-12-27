package pages;

import org.openqa.selenium.By;

import estrutura.Basic;

public class TodasAtividades extends Basic{
	
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
		return obterTexto(By.xpath("//table//tr["+x+"]//td[4]"));
		
	}
	public String descricao(int x) {
		return obterTexto(By.xpath("//table//tr["+x+"]//td[5]"));
		
	}
	public String executor(int x) {
		return obterTexto(By.xpath("//table//tr["+x+"]//td[6]"));
	}
	public String status(int x) {
		return obterTexto(By.xpath("//table//tr["+x+"]//td[7]"));
	}
	public String demanda(int x) {
		return obterTexto(By.xpath("//table//tr["+x+"]//td[8]"));
	}
	public String assunto(int x) {
		return obterTexto(By.xpath("//table//tr["+x+"]//td[9]"));
	}
	public String esquipe(int x) {
		return obterTexto(By.xpath("//table//tr["+x+"]//td[10]"));
	}
	public String seqDemanda(int x) {
		return obterTexto(By.xpath("//table//tr["+x+"]//td[12]"));
	}
	public void mudaPagina() {
		clicar(By.xpath("//li[4]//a[@class='page-link']"));
	}
	
	public void exportarExcel() throws InterruptedException {
		//Thread.sleep(10000);
		espera(By.id("VD-5LAOOBZ18ORexportarXLSX"));
		clicar(By.id("VD-5LAOOBZ18ORexportarXLSX"));
		clicar(By.xpath("//div[@class='bootbox modal fade show']//button[2]"));
		Thread.sleep(5000);
		clicar(By.xpath("//div[@class='bootbox modal fade show']//button[1]"));
	}
	
	
	}
