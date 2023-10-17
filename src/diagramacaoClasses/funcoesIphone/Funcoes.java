package diagramacaoClasses.funcoesIphone;


import diagramacaoClasses.celular.Iphone;
import diagramacaoClasses.navegador.NavegadorInternet;
import diagramacaoClasses.reprodutor.ReprodutorMusical;
import diagramacaoClasses.aparelhotel.AparelhoTelefonico;

public class Funcoes {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.tocar();
        iphone.pausar();
        iphone.atender();
        iphone.desligar();
        iphone.ligar();
        iphone.abrirPagina("https://www.google.com");
        iphone.avancarPagina();
        iphone.voltarPagina();
    }
}
