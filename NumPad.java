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
public class NumPad extends JButton {
    public int num;
    
    
    public NumPad (int num) {
        this.setPreferredSize(new Dimension(100,100));
        this.setBackground(Color.white);
        this.num = num;
        this.setText(String.valueOf(num));
    }
    
    public int getNumber() {
        return num;
    }
}
