package com.Edmundo.MVC;

/**
 * Created by Edmundo on 25/11/2016.
 */
public class Model {

    private int x;

    public Model(){
        x = 0;
    }

    public Model(int x){
        this.x = x;
    }

    public void incX(){
        x++;
    }
    public void decX(){
        System.out.println("dec");
        x--;
    }

    public int getX(){
        return x;
    }
}
