package acessorios.eletronicos.aparelhotelefonico;

public class Celular implements AparelhoTelefonico{

    @Override
    public void ligar() {
        System.out.println("Fazer ligação");
    }

    @Override
    public void atender() {
        System.out.println("Atender ligação");
    }

    @Override
    public void iniciarCorreioVoz() {
        // TODO Auto-generated method stub
        System.out.println("Iniciar Correio Voz");
    }
     
}
