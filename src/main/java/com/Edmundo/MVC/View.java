package com.Edmundo.MVC;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Edmundo on 25/11/2016.
 */
public class View {
    private JFrame frame;
    private JLabel label;
    private JButton buttonMinus;
    private JButton buttonPlus;


    public View(String text){
        frame = new JFrame("Vista");
        frame.getContentPane().setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200,200);
        frame.setVisible(true);

        label = new JLabel(text,SwingConstants.CENTER);
        label.setAlignmentX(Component.CENTER_ALIGNMENT);
        frame.getContentPane().add(label, BorderLayout.CENTER);

        buttonMinus = new JButton("-");
        frame.getContentPane().add(buttonMinus, BorderLayout.SOUTH);
        buttonPlus = new JButton("+");
        frame.getContentPane().add(buttonPlus, BorderLayout.NORTH);
    }

    public JButton getButtonMinus(){
        return buttonMinus;
    }
    public JButton getButtonPlus(){
        return buttonPlus;
    }

    public void setText(String text){
        label.setText(text);
    }
}
