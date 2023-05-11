package br.com.fiap.Jogador.beans;

public class Mago extends Jogador implements Visualizavel {
    private int x;
    private int y;
    private int mp;

    public Mago() {
        super();
        this.mp = 100;
    }

    public Mago(String nome) {
        super(nome);
        this.mp = 100;
    }

    public void ataqueMagico(Jogador jogador) {
        if (this.mp >= 10) {
            jogador.receberDano(this.getMp());
            this.mp -= 10;
        }
        if (jogador.getHp() <= 0) {
            this.ganharExperiencia(jogador.getXp());
            this.mp = 100;
        }
    }

    public void trocarVidaPorMana(int hp) {
        if (this.getHp() > hp) {
            this.receberDano(hp);
            this.mp += hp;
        }   
    }

    public int getMp() {
        return mp;
    }

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

}