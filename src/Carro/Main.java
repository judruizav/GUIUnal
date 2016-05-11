/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Carro;

import javax.swing.*;

/**
 *
 * @author Estudiante
 */
public class Main {
     public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400,400);
        frame.setVisible(true);
        frame.add(new Carro());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
