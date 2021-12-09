/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictac;

import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author elton.chen
 */
public class TicTac extends JFrame {
    // Inheritance: TicTacToe IS A JFrame
    static int X = 0; //class variable
    static int O = 1; 
    int currentPlayer; //instance variable
    
    public TicTac() {
        super("TicTacToe"); // sends a title to JFrame constructor
        //Assign starting values to instance variables
        currentPlayer = X;
        
    }
    
    private void createGUI() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        JPanel buttonPanel = new JPanel();
        GridLayout layout = new GridLayout(3,3);
        buttonPanel.setLayout(layout);
        ClickHandler clik = new ClickHandler(this);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Button b = new Button();
                b.addMouseListener(clik);
                buttonPanel.add(b);
            }
        }
        this.add(buttonPanel);
        this.pack();
        
    }
    
    public void move(Button b) {
        if (!b.isClaimed()) {
            b.claim(currentPlayer);
            currentPlayer = (currentPlayer == X) ? O : X;
            //one line if else set value only for binary values{1,2}{true,false}
            //if/? = true /set currentPlayer to O /else set currentPlayer to X
            
        }
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TicTac game = new TicTac();
        game.createGUI();
        
    }
    
}
