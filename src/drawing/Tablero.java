/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawing;

import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import javax.swing.JPanel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
/**
 *
 * @author Estudiante
 */
public class Tablero extends JPanel implements ActionListener, KeyListener{
    private Timer timer;
    private Carro personajePrincipal;
    
    public Tablero(){
      this.setFocusable(true);
      this.addKeyListener(this);
      this.personajePrincipal= new Carro(100,200);
      this.timer = new Timer(20,this);
      this.timer.start();
    }
        @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
      this.personajePrincipal.paintComponent(g);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
      this.personajePrincipal.actionPerformed(e);
      repaint();
    }
    
    @Override
    public void keyPressed(KeyEvent e) {
        this.personajePrincipal.keyPressed(e);
        repaint();
    }
    @Override
    public void keyReleased(KeyEvent e) {
      this.personajePrincipal.keyReleased(e);
    }
    
    @Override
    public void keyTyped(KeyEvent e) {
      this.personajePrincipal.keyTyped(e);
        
    }
    
}
