/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

/**
 *
 * @author Elton
 */
public class Sudoku extends JFrame {
    
    public Sudoku() {
        super("Sudoku");
    }
    
    private int[][] Grid() {
        int [][] theGrid = {{9,5,7,6,1,3,2,8,4},
            {4,8,3,2,5,7,1,9,6},
            {6,1,2,8,4,9,5,3,7},
            {1,7,8,3,6,4,9,5,2},
            {5,2,4,9,7,1,3,6,8},
            {3,6,9,5,2,8,7,4,1},
            {8,4,5,7,9,2,6,1,3},
            {2,9,1,4,3,6,8,7,5},
            {7,3,6,1,8,5,4,2,9}};
        
        boolean[][]check =
            {{false,false,false,false,false,false,true,false,false},
            {false,true,false,false,false,true,false,true,false},
            {true,false,true,false,false,false,true,false,false},
            {false,true,false,false,true,false,false,false,false},
            {false,false,false,true,false,true,false,false,false},
            {false,false,false,false,true,false,false,true,false},
            {false,false,true,false,false,false,true,false,true},
            {false,true,false,true,false,false,false,true,false},
            {false,false,true,false,false,false,false,false,false},};
        int [][] Print = new int[9][9];
        
        for (int i = 0; i < 9; i++){
            for (int j = 0; j < 9; j++) {
                if (check[i][j] == true) {
                    Print[i][j] = theGrid[1][j];   
                }else{
                    Print[i][j] = -1;
                }
            }
        }
        
        return Print;
    }
    
    public void createGUI() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        JPanel buttonPanel = new JPanel();
        GridLayout layout = new GridLayout(3,3);
        Border backline = BorderFactory.createLineBorder(Color.BLACK);
        buttonPanel.setLayout(layout);
        ClickHandler clik = new ClickHandler(this);
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3 ; i++) {
                JPanel smallerPanel = new JPanel();
                smallerPanel.setLayout(layout);
                smallerPanel.setBorder(backline);
                for (int x = 0; x < 3; x++) {
                    for (int y = 0; y < 3; y++) {
                        
                        Button b = new Button();
                        smallerPanel.add(b);
                    }
                }
                buttonPanel.add(smallerPanel);
            }
        }
        this.add(buttonPanel);
        this.pack();
        
    }
    
        

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sudoku game = new Sudoku();
        game.createGUI();
        
    }
    
    
}