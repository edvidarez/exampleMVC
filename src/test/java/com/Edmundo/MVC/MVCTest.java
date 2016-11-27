package com.Edmundo.MVC;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Edmundo on 26/11/2016.
 */
public class MVCTest {
    Model M;
    View V;
    Controller C;
    int initialNumber = 0;
    @Before
    public void setUp()
    {
        M = new Model(initialNumber);
        V = new View(""+initialNumber);
        C = new Controller(M,V);
    }
    @Test
    public void minusTest(){
        C.controlMinus();
        C.linkBtnAndLabelMinus();
        assertEquals(initialNumber-1,M.getX());
    }
    @Test
    public void plusTest(){
        C.controlPlus();
        C.linkBtnAndLabelInc();
        assertEquals(initialNumber+1,M.getX());
    }

}
