package acessorios;

import acessorios.eletronicos.aparelhotelefonico.Celular;
import acessorios.eletronicos.navegador.Chrome;
import acessorios.eletronicos.reprodutormusical.Ipod;

public class ClassePrincipal {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
    
        Celular celular = new Celular();
        celular.ligar();
        celular.atender();
        celular.iniciarCorreioVoz();
    
        Ipod ipod = new Ipod();
        ipod.selecionarMusica();
        ipod.pausar();
        ipod.tocar();

        Chrome chrome = new Chrome();
        chrome.adicionarNovaAba();
        chrome.atualizarPagina();
        chrome.exibirPagina();
    
    }
}
