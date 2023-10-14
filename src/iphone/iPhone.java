package iphone;

import interfaces.ReprodutorMusical;
import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

	// Implementações dos métodos de ReprodutorMusical
    public void tocar() {
        System.out.println("Tocando música...");
    }
    
    public void pausar() {
        System.out.println("Música pausada.");
    }
    
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música: " + musica);
    }

    // Implementações dos métodos de AparelhoTelefonico
    public void ligar() {
        System.out.println("Ligando...");
    }

    public void atender() {
        System.out.println("Atendendo chamada...");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    // Implementações dos métodos de NavegadorInternet
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba...");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }
    
}



