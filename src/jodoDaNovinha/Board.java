package jodoDaNovinha;

import GUI.Form0;
import java.util.Arrays;

public class Board {
    char[][] matrix;
    Form0 form;

    public Board(Form0 form) {
        matrix=new char[3][3];
        this.form=form;
        clear();
    }
    
    public void clear(){
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
                matrix[i][j]='-';
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
                form.getButtons()[i][j].setEnabled(true);
    }
    
    public void draw(){
      for(int i=0;i<3;i++)
            for(int j=0;j<3;j++){
                form.getButtons()[i][j].setText(String.valueOf(matrix[i][j]));
                if(matrix[i][j]!='-')
                    form.getButtons()[i][j].setEnabled(false);
            }
    }
    
    public boolean checkLines(char Char){
        return (matrix[0][0]==Char&&matrix[0][1]==Char&&matrix[0][2]==Char)||
                (matrix[1][0]==Char&&matrix[1][1]==Char&&matrix[1][2]==Char)||
                (matrix[2][0]==Char&&matrix[2][1]==Char&&matrix[2][2]==Char);
    }
    
    public boolean checkCols(char Char){
        return (matrix[0][0]==Char&&matrix[1][0]==Char&&matrix[2][0]==Char)||
                (matrix[0][1]==Char&&matrix[1][1]==Char&&matrix[2][1]==Char)||
                (matrix[0][2]==Char&&matrix[1][2]==Char&&matrix[2][2]==Char);
    }
    
    public boolean checkDiags(char Char){
        return (matrix[0][0]==Char&&matrix[1][1]==Char&&matrix[2][2]==Char)||
                (matrix[0][2]==Char&&matrix[1][1]==Char&&matrix[2][0]==Char);
    }
    
    public void mark(Point pos, char Char){
        matrix[pos.getLinha()][pos.getColuna()]=Char;
    }

    public char[][] getMatrix() {
        return matrix;
    }

    @Override
    public String toString() {
        return "Tabuleiro{" + "matrix=" + Arrays.toString(matrix) + '}';
    }
}
