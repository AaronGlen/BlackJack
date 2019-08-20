package com.qa;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    private App app;

    @Before
    public void initialise(){
         app = new App();

    }
    @Test
    public void mainTest(){
        app = new App();
        String[] input = new String[]{"number1"};
        app.main(input);
    }
    @Test
    public void blackJackTest(){
        assertEquals("21 wins",21,app.blackJack(21,4));
        assertEquals("no one wins",0,app.blackJack(23,45));
        assertEquals("draw at 21",21,app.blackJack(21,21));
        assertEquals("draw at 12",12,app.blackJack(12,12));
        assertEquals("21 wins",4,app.blackJack(2,4));
        assertEquals("21 wins",4,app.blackJack(22,4));


    }

}
