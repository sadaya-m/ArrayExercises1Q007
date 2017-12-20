// **********************************************************************
//  Programmer:         Ma Pauline Sadaya
//  Class:		CS30S
//
//  Assignment:         ArrayEx7
//
//  Description:	load an array with random numbers and print the numbers 
//                      and their sum
//
//
//  Input:		describe any input from keyboard or file
//
//  Output:		an array of random numbers, sum of the array
// ***********************************************************************

import javax.swing.*;
import java.text.DecimalFormat;
import java.util.Random;

public class ArrayEx7
{  // begin class
    public static void main(String args[])
    {  // begin main
    // ***** declaration of constants *****
        
        final int MAXLIST = 10;     //max array size

    // ***** declaration of variables *****
        
        int list[] = new int[MAXLIST];  //set max array size
        
        int rnd;            //random number variable
        int sum = 0;        //sum of all random numbers

    // ***** create objects *****

        Random random = new Random();       //random variable generator

    // ***** create input stream *****

        //ConsoleReader console = new ConsoleReader(System.in);

    // ***** Print Banner *****

        System.out.println("**********************************");
        System.out.println("NAME:        Ma. Pauline Sadaya");
        System.out.println("Class:       CS30S");
        System.out.println("Assignment:  ArrayEx7");
        System.out.println("**********************************");

    // ***** get input *****

        // all input is gathered in this section
        // remember to put ConsoleReader.class into the
        // same folder.

    // ***** processing *****

        for(int i = 0; i < MAXLIST; i++){
            rnd = random.nextInt(10)+1;    //process a random variable
            list[i] = rnd;                  //store in an array
        }//end for loop random variable processing
        
        for(int i = 0; i < MAXLIST; i++){
            sum += list[i];
        }//end for loop sum

    // ***** output *****

         for(int i = 0; i < MAXLIST; i++){ 
            System.out.println(list[i]);
        }//end for loop printing array
         
         System.out.println("\nSum: " + sum);       //print the sum of the array
        
    // ***** closing message *****

        System.out.println("end of processing");

	}  // end main	
}  // end class