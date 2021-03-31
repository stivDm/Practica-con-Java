/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

/**
 *
 * @author estiv
 */
public class Principal {
    public static void main(String args[]){
        
        JFrame myFrame=new JFrame();
        myFrame.setDefaultCloseOperation(myFrame.EXIT_ON_CLOSE);
        myFrame.setSize(500,500);
        myFrame.setVisible(true);
        myFrame.setLocationRelativeTo(null);
        myFrame.setResizable(false);
        
        JPanel panel=new JPanel();
        panel.setBackground(new Color(150,25,170));
        
        
        myFrame.add(panel);
        
    }
    
}
