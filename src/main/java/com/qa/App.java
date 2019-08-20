package com.qa;

/**
 * Hello world!
 *
 */
public class App 
{
    public int result = 0;
    public static void main( String[] args )
    {


    }
    public int blackJack(int number1,int number2 )
    {


        if (number1 > 21 & number2 > 21) {
            result = 0;
        }
        else if (number1 > number2){
            result = number1;

        }
        else if (number2 > number1) {
            result = number2;
        }
        else if (number1 == number2) {
            result = number1;

        }
        return (result);
    }

}
