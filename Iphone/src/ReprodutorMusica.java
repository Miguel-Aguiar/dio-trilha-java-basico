import interfaces.ReprodutorMusicaInterface;

public class ReprodutorMusica implements ReprodutorMusicaInterface{
    public void tocar(){
        System.out.println("Tocando a musica");
    }

    public void pausar(){
        System.out.println("Musica pausada");
    }

    public void selecionarMusica(String musica){
        System.out.println("Musica selecionada");
    }
}
