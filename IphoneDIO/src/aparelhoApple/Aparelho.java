package aparelhoApple;

import appMusica.ReprodutorMusical;
import appNavegador.NavegadorInternet;
import appPhone.AparelhoTelefonico;

public class Aparelho implements ReprodutorMusical,NavegadorInternet,AparelhoTelefonico
{
     public void tocar()
    {
        System.out.println("Aparelho:Apertou play, Tocando Musica");
    }
    public void pausar()
    {
        System.out.println("Aparelho:Apertou pause, Pausando Musica");
    }
    public void selecionarMusica(String nomemusica)
    {
        System.out.println("Aparelho:Selecionou musica:"+nomemusica);
    } 

    public void ligar(String numero)
    {
        System.out.println("Aparelho:Ligando para o numero:"+numero);
    }
    public void atender()
    {
        System.out.println("Aparelho:Atendendo ligacao");
    }
    public void iniciarCorreioVoz()
    {
        System.out.println("Aparelho:iniciando Correio de Voz...");
    } 

    public void exibirPagina(String url)
    {
        System.out.println("Aparelho:Exibir pagina:"+url);
    }
    public void adicionarNovaAba()
    {
        System.out.println("Aparelho:Abrindo Nova Aba no navegador");
    }
    public void atualizarPagina()
    {
        System.out.println("Aparelho:Atualizando pagina.....");
    } 

}
