package jodoDaNovinha;

import java.util.ArrayList;

public class Player {
    ArrayList<Point> jogadas;
    char symbol;

    public Player(char symbol) {
        this.jogadas = new ArrayList();
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }
    
    public void addJogada(Board tab,Point pos){
        tab.matrix[pos.getLinha()][pos.getColuna()]=symbol;
        jogadas.add(pos);
        tab.draw();
    }

    public ArrayList<Point> getJogadas() {
        return jogadas;
    }
    
    
}
