package appNavegador;

public class Safari implements NavegadorInternet
{
    public void exibirPagina(String url)
    {
        System.out.println("Exibir pagina:"+url);
    }
    public void adicionarNovaAba()
    {
        System.out.println("Abrindo Nova Aba no navegador");
    }
    public void atualizarPagina()
    {
        System.out.println("Atualizando pagina.....");
    } 
}