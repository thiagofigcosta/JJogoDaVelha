package jodoDaNovinha;

public class Human extends Player {

    public Human(char symbol) {
        super(symbol);
    }
    
    public void play(Board tab,Point pos){
        this.addJogada(tab, pos);
    }
}
