package com.hhg.jerry;

import java.util.Random;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        Random random = new Random(20);
        for(int i=0;i<100;i++)
            System.out.println(random.nextInt(1000));
    }
}
