package appMusica;

public class Musica implements ReprodutorMusical
{
    public void tocar()
    {
        System.out.println("Apertou play, Tocando Musica");
    }
    public void pausar()
    {
        System.out.println("Apertou pause, Pausando Musica");
    }
    public void selecionarMusica(String nomemusica)
    {
        System.out.println("Selecionou musica:"+nomemusica);
    } 
}
