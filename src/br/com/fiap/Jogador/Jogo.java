package br.com.fiap.Jogador;

import br.com.fiap.Jogador.beans.BolaDeFogo;
import br.com.fiap.Jogador.beans.Dragao;
import br.com.fiap.Jogador.beans.Mago;

public class Jogo {

    public static void main(String[] args) {
        var fase = new Fase();
        fase.carregar(new Mago("Mago"));
        fase.carregar(new Dragao(10, 10));
        fase.carregar(new BolaDeFogo(20, 20));
    }
}
