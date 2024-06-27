package com.partials;

import java.awt.Color;
import java.awt.ScrollPane;

import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;

public class cScrollPane extends JScrollPane {

    public cScrollPane(java.awt.Component view, int x,int y,int width,int height) {
        super(view);

        setBounds(x, y, width, height);
        
        getViewport().setBackground(Color.white);
        
        setBorder(new LineBorder(Color.black,1));

    }
}
