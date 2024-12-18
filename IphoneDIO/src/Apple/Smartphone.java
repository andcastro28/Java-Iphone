package Apple;

import aparelhoApple.Aparelho;
import appMusica.ReprodutorMusical;
import appNavegador.NavegadorInternet;
import appPhone.AparelhoTelefonico;

public class Smartphone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Aparelho smart = new Aparelho();
        
        AparelhoTelefonico at = smart;
        ReprodutorMusical rm = smart;
        NavegadorInternet ni = smart;
	
	    at.atender();
	    at.iniciarCorreioVoz();
	    at.ligar("999-898989");
	    
	    rm.selecionarMusica("madona");
	    rm.tocar();
	    rm.pausar();
	    
	    ni.exibirPagina("google.com");
        ni.adicionarNovaAba();
        ni.atualizarPagina();
		
		
	}

}
