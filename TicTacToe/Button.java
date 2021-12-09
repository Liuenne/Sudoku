/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictac;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;

/**
 *
 * @author elton.chen
 */
public class Button extends JButton{
    //Inheiritance: Button IS A JButton
    private int owner;
    //Owner = class field
    private boolean claimed;
    
    public Button() {
        this.setPreferredSize(new Dimension(200,200));
        this.setBackground(Color.white);
        claimed = false;
    }
    public void claim (int player) {
        owner = player; //Owner becomes the current player
        claimed = true;
        if (player == TicTac.X) { //className.constant to access from outside
            this.setText("X");
        }else {
            this.setText("O");
        }
    }
    
    public boolean isClaimed () {
        return claimed;
    }
    
}
