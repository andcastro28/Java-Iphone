package appPhone;

public class Telefone implements AparelhoTelefonico
{
    public void ligar(String numero)
    {
        System.out.println("Ligando para o numero:"+numero);
    }
    public void atender()
    {
        System.out.println("Atendendo ligacao");
    }
    public void iniciarCorreioVoz()
    {
        System.out.println("iniciando Correio de Voz...");
    } 
}
