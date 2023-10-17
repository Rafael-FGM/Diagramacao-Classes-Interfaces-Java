package diagramacaoClasses.celular;

import diagramacaoClasses.navegador.NavegadorInternet;
import diagramacaoClasses.reprodutor.ReprodutorMusical;
import diagramacaoClasses.aparelhotel.AparelhoTelefonico;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    @Override
    public void tocar(){
        System.out.println("Tocar!");
    }
    @Override
    public void pausar(){
        System.out.println("Pausar!");
    }
    @Override
    public void parar(){
        System.out.println("Parar!");
    }
    @Override
    public void desligar(){
        System.out.println("Desligar!");
    }
    @Override
    public void ligar(){
        System.out.println("Ligar!");
    }
    @Override
    public void atender(){
        System.out.println("Atender!");
    }

    @Override
    public void abrirPagina(String url) {

    }

    @Override
    public void avancarPagina(){
        System.out.println("Avançar!");
    }
    @Override
    public void voltarPagina(){
        System.out.println("Voltar!");
    }


}
