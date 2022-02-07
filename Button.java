/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;

/**
 *
 * @author Elton
 */
public class Button extends JButton {
    public boolean initial;
    public boolean showing;
    public static int held = 0;
    
    public Button(int val, boolean dis) {
        this.setPreferredSize(new Dimension(75,75));
        this.setBackground(Color.white);
        if (dis) {
            this.setText(String.valueOf(val));
        }
        this.initial = dis;
        
        
    }
    public void setDis (int current) {
        if (!initial) {
        this.setText(String.valueOf(current));
        Button.held = current;
        this.showing = true;
        }
        this.showing = false;
    }
}
