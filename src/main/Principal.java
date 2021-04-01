/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


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
        myFrame.setLayout(null);
       // myFrame.setResizable(false);
        
        JPanel panel=new JPanel();
        panel.setSize(500,500);
        panel.setBackground(new Color(150,25,170));
        panel.setLayout(null);
        
        JLabel label =new JLabel("hello there");
        label.setFont(new Font("Comic Sans MS",Font.BOLD,25));
        label.setForeground(Color.WHITE);
        label.setBounds(170,50,300,60);
        
        //ImageIcon image=new ImageIcon("like.png");
        
         //ImageIcon imagen =new ImageIcon("like.png");
       panel.add(label);
        
        
        myFrame.add(panel);
        
    }
    
}
