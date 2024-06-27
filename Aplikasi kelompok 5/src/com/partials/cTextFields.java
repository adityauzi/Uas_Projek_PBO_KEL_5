package com.partials;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class cTextFields extends JTextField {

    public cTextFields(int x,int y,int width,int height,int radius) {
        super();

        setBounds(x, y, width, height);
        setForeground(Color.BLACK);

        setFont(new Font("Poppins",Font.PLAIN, 20));
        setLayout(null);

        //setBorder(new cRoundedBorder(radius,Color.black));
        setBorder(new LineBorder(Color.BLACK,1));
    }

}
