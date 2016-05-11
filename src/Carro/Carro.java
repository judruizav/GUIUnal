/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Carro;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;

/**
 *
 * @author Estudiante
 */
public class Carro extends JPanel implements ActionListener, KeyListener{
    
    private Timer timer;
    private int c1x=50; 
    private int c1y=125;
    private int c3x=55; 
    private int c3y=125; 
    private int c4x=155; 
    private int c4y=125; 
    private int c2x=150; 
    private int c2y=125; 
    private int rx=5; 
    private int ry=75;
    private int t1x=50;
    private int t2x=100;
    private int t3x=150;
    private int t4x=200;
     private int t1y=75;
    private int t2y=50;
    private int t3y=50;
    private int t4y=75;
    
    private int [] puntosx={50,100,100,50};
    
    public Carro(){
        this.timer= new Timer(50, this);
        this.setFocusable(true);
        this.timer.start();
        addKeyListener(this);
        
    }
    
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.red);
        g.fillOval(c1x, c1y, 50, 50);
        g.fillOval(c2x, c2y, 50, 50);
        g.setColor(Color.blue);
        g.fillRect(rx, ry, 250, 50);
        g.setColor(Color.blue);
        int [] puntosX= {t1x,t2x,t3x,t4x};
        int [] puntosY= {t1y, t2y, t3y,t4y};
        Polygon p= new Polygon(puntosX, puntosY, 4);
        g.setColor(Color.blue);
        g.fillPolygon(p);
        g.setColor(Color.black);
        g.drawLine(0, 175, 1000, 175);
        g.drawOval(c3x, c3y, 40, 40);
        g.drawOval(c4x, c4y, 40, 40);
        g.drawRect(rx, (ry-25), 250, 120);
    }
    

    @Override
    public void actionPerformed(ActionEvent e){
       
    }

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch(e.getKeyCode()){
            case KeyEvent.VK_D: 
        this.c1x+=5;
        this.c2x+=5;
        this.rx+=5;
        this.t1x+=5;
        this.t2x+=5;
        this.t3x+=5;
        this.t4x+=5;
        this.c3x+=5;
        this.c4x+=5;
        repaint();
        break;
        case KeyEvent.VK_A:
        this.c1x-=5;
        this.c2x-=5;
        this.rx-=5;
        this.t1x-=5;
        this.t2x-=5;
        this.t3x-=5;
        this.t4x-=5;
        this.c3x-=5;
        this.c4x-=5;
        repaint();    
        break;
        case KeyEvent.VK_SPACE:
        this.c1y-=5;
        this.c2y-=5;
        this.ry-=5;
        this.t1y-=5;
        this.t2y-=5;
        this.t3y-=5;
        this.t4y-=5;
        this.c3y-=5;
        this.c4y-=5;
           
        break;        
        
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        switch(e.getKeyCode()){
            case KeyEvent.VK_SPACE:
                this.c1y+=5;
        this.c2y+=5;
        this.ry+=5;
        this.t1y+=5;
        this.t2y+=5;
        this.t3y+=5;
        this.t4y+=5;
        this.c3y+=5;
        this.c4y+=5;
           
        break;    
        }
    }
    
}
