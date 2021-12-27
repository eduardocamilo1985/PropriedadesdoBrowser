package estrutura;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class Utilidades {
	static String caminho = System.getProperty("user.home");
	public static String temp = caminho +"\\Excel\\Temp\\";

	
	public void renomearArquivo(String novoNome) throws IOException {
		
		 File file = new File(temp);
		 File[] arquivo = file.listFiles();
		 String nome = arquivo[0].getName();
		 String arquivoFinal=arquivo[0].getAbsolutePath();
		 
		 File renomear = new File(arquivoFinal);
		 new File(novoNome).delete();
		 renomear.renameTo(new File(novoNome));
		
		 System.out.println("O nome do arquivo é " +nome);	
			 	    
	} 
	public void abrirArquivo(String arquivo) throws IOException {
		
		File file = new File(arquivo); 
		Desktop desktop = java.awt.Desktop.getDesktop(); 
		desktop.open(new File(arquivo));
		
	
		
	}

}


