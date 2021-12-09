/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictac;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author elton.chen
 */
public class ClickHandler implements MouseListener {
    //MouseListener is an interface which provides structure but all methods
    //are abstract/empty
    
    private TicTac game;
    
    public ClickHandler(TicTac game) {
        this.game = game;
        
    }

    @Override
    public void mouseClicked(MouseEvent me) {
      Button b = (Button)me.getSource();
      game.move(b);
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
