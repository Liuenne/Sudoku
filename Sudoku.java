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
    private int current;
    
    public Sudoku() {
        super("Sudoku: EC");
    }
    

        static int [][] grid = {{9,5,7,6,1,3,2,8,4},
            {4,8,3,2,5,7,1,9,6},
            {6,1,2,8,4,9,5,3,7},
            {1,7,8,3,6,4,9,5,2},
            {5,2,4,9,7,1,3,6,8},
            {3,6,9,5,2,8,7,4,1},
            {8,4,5,7,9,2,6,1,3},
            {2,9,1,4,3,6,8,7,5},
            {7,3,6,1,8,5,4,2,9}};
        
        static boolean[][]check =
            {{false,false,false,false,false,false,true,false,false},
            {false,true,false,false,false,true,false,true,false},
            {true,false,true,false,false,false,true,false,false},
            {false,true,false,false,true,false,false,false,false},
            {false,false,false,true,false,true,false,false,false},
            {false,false,false,false,true,false,false,true,false},
            {false,false,true,false,false,false,true,false,true},
            {false,true,false,true,false,false,false,true,false},
            {false,false,true,false,false,false,false,false,false},};

    /**
     * Method to create the Sudoku grid which is a 3x3 gird inlaid with more 3x3
     * grids. Makes use of the Button, NumPad and ClickHandler classes to create 
     * an interactive board.
     */
    public void createGUI() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        JPanel Panel = new JPanel();//main grid to put numpad and sudoku board
        JPanel buttonPanel = new JPanel();//larger 3x3 grid
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
                        int row = j * 3 + x;
                        int col = i * 3 + y;
                        Button b = new Button(grid[row][col], check[row][col]);
                        smallerPanel.add(b);
                        b.addActionListener(clik);
                    }
                }
                buttonPanel.add(smallerPanel);
            }
        }
        Panel.add(buttonPanel);
        
        
        //Numberpad for setting inputs
        JPanel NumPanel = new JPanel();
        NumPanel.setLayout(layout);
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3; i++) {
                NumPad num = new NumPad(i+j*3+1);
                NumPanel.add(num);
            }
        }
        
        Panel.add(NumPanel);
        this.add(Panel);
        this.pack();
    }
    
    public boolean won () {
        for (int[] row : grid) {
            for (int c = 0; c < grid.length; c++) {
                if (Button.held != row[c]) {
                    return false;
                }
            }
        }
        return true;
    }
    
    /**
     * method used by other classes to return the player's desired input
     * @return current desired input by player
     */
    public int getCurrent() {
        return current;
    }
    
   /**
    * set the player's desired input through the NumPad
    * @param i input desired by the player
    */
    public void setCurrent(int i) {
        current = i;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sudoku game = new Sudoku();
        game.createGUI();
    }
}
