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
    public void main1(){
         app = new App();

    }


    public void blackJackTest(){
        assertEquals("21 wins",21,app.blackJack(21,4));

    }

}
