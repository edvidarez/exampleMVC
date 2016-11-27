package com.Edmundo.MVC;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Edmundo on 25/11/2016.
 */
public class Controller {
    private Model model;
    public View view;
    private ActionListener actionListener;

    public Controller(Model model, View view){
        this.model = model;
        this.view = view;

    }

    public void controlMinus(){
        actionListener = new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                linkBtnAndLabelMinus();
            }
        };
        view.getButtonMinus().addActionListener(actionListener);
    }
    public void controlPlus(){
        actionListener = new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                linkBtnAndLabelInc();
            }
        };
        view.getButtonPlus().addActionListener(actionListener);
    }

    public void linkBtnAndLabelInc(){
        model.incX();
        view.setText(Integer.toString(model.getX()));
    }
    public void linkBtnAndLabelMinus(){
        model.decX();
        view.setText(Integer.toString(model.getX()));
    }
}
