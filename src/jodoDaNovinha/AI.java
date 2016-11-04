/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jodoDaNovinha;

import java.util.Random;

/**
 *
 * @author nanotech
 */
public class AI extends Player{

    public AI(char symbol) {
        super(symbol);
    }
    
    public void play(Board tab){
        Point random=new Point(0,0);
        Random gen=new Random();
        do{
            random.setLinha(gen.nextInt(3));
            random.setColuna(gen.nextInt(3));
        }while(tab.getMatrix()[random.getLinha()][random.getColuna()]!='-');
        this.addJogada(tab, random);
    }
    
}
