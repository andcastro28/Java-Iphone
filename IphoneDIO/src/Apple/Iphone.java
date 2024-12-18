package Apple;

import appMusica.Musica;
import appNavegador.Safari;
import appPhone.Telefone;

public class Iphone
{
	
	public static void main(String[] args)
	{
		Musica appMusic = new Musica();
		Safari appBrowser = new Safari();
		Telefone appPhone = new Telefone();
		
		appMusic.selecionarMusica("madonna");
		appMusic.tocar();
		appMusic.pausar();
		
		appBrowser.adicionarNovaAba();
		appBrowser.atualizarPagina();
		appBrowser.exibirPagina("google.com");
		
		
		appPhone.atender();
		appPhone.iniciarCorreioVoz();
		appPhone.ligar("999-898989");
	}

}
