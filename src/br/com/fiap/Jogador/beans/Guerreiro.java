package br.com.fiap.Jogador.beans;

public class Guerreiro extends Jogador implements Visualizavel {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public int getXp() {
        return super.getXp() * 2;
    }
}
