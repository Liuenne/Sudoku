/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 *
 * @author Elton
 */
public class ClickHandler implements ActionListener {
    
    private final Sudoku game;
    
    public ClickHandler(Sudoku game) {
        this.game = game;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() instanceof Button) {
            Button b = (Button)ae.getSource();
            int in = game.getCurrent();
            b.setDis(in);
        }else { 
            NumPad num = (NumPad)ae.getSource();
            int i = num.getNumber();
            game.setCurrent(i);
            System.out.println(game.getCurrent());
        }
    }
}
