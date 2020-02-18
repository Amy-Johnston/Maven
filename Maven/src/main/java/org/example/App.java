package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
        int i = 0;
        int num = 0;
        int counter;
        
        System.out.println("The prime numbers from 0 to 100 are: ");
        for (i = 0;  1 <= 100; i++) {
            counter = 0;
            for (num = 2;  num < i; num++) {
                if((i % num) == 0){
                    counter++;
                    break;
                }            
            }
            if(counter == 0){
                System.out.println(i);
            }
        }
        System.out.printlin( "I edited, cloned and modified your app Yusrah" );
    }
}
