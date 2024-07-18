import interfaces.NavegadorInternetInterface;

public class NavegadorInternet implements NavegadorInternetInterface{
    public void exibirPagina(String url){
        System.out.println("Página exibida");
    }

    public void adicionarNovaAba(){
        System.out.println("Uma nova aba foi criada");
    }

    public void atualizarPagina(){
        System.out.println("Página atualizada");
    }
}
