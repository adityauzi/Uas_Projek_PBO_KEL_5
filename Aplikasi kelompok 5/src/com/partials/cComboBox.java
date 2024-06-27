package com.partials;

import java.awt.Color;

import javax.swing.JComboBox;

public class cComboBox extends JComboBox {

    public cComboBox(int x,int y,int width,int height,int radius) {
        super();
        
        setLayout(null);

        // addItem(text);
        // setActionCommand(value);
        
        setBackground(Color.white);

        setBounds(x, y, width, height);
        
    }
    
}
