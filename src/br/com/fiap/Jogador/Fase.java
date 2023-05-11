package br.com.fiap.Jogador;

import br.com.fiap.Jogador.beans.Visualizavel;

public class Fase {
    public void carregar(Visualizavel objeto) {
        System.out.println("Carregando objeto na posição:\nX:" + objeto.getX() + "\nY:" + objeto.getY());
    }
}
