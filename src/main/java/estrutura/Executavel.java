package estrutura;

import cenarios.BaixarRelatorios;
import cenarios.Login;

public class Executavel {
	
	public static void main(String[] args) throws Exception{
		Login login = new Login();
		BaixarRelatorios baixar = new BaixarRelatorios();
		
		login.realizarLogin();
		baixar.baixaRelatorios();
		
	
	}
		

}
