package com.Edmundo.MVC;

import javax.swing.*;

/**
 * Created by Edmundo on 25/11/2016.
 */
public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Model model = new Model(0);
                View view = new View("0");
                Controller controller = new Controller(model,view);
                controller.controlMinus();
                controller.controlPlus();
            }
        });
    }
}
