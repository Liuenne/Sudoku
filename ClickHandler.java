/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author Elton
 */
public class ClickHandler implements MouseListener {
    
    private Sudoku game;
    
    public ClickHandler(Sudoku game) {
        this.game = game;
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        Button b = (Button)me.getSource();
        
    }

    @Override
    public void mousePressed(MouseEvent me) {
        
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        
    }

    @Override
    public void mouseExited(MouseEvent me) {
        
    }
    
}
