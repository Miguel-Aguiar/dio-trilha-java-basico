import interfaces.AparelhoTelefonicoInterface;

public class AparelhoTelefonico implements AparelhoTelefonicoInterface{
    
    public void ligar(String numero){
        System.out.println("Aguardando resposta...");
    }

    public void atender(){
        System.out.println("Ligação em andamento!");
    }

    public void iniciarCorreioDeVoz(){
        System.out.println("Correio de voz iniciado");
    }
}
