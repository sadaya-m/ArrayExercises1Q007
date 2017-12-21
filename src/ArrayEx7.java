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
//  Input:		confirmation from user
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
        double sum = 0;        //sum of all random numbers
        double avg = 0;            //average of all random numbers
        
        int smallest = Integer.MAX_VALUE;       //max value integer
        int largest = Integer.MIN_VALUE;        //min value integer

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
        
        int n = Integer.parseInt(JOptionPane.showInputDialog("Do you want to load a set of numbers?"));
        while(n != 0){
            for(int i = 0; i < MAXLIST; i++){
                rnd = random.nextInt(10)+1;    //process a random variable
                list[i] = rnd;              //declare the values in the array
                System.out.println(list[i]);
            }
            System.out.println("\n");
            n = Integer.parseInt(JOptionPane.showInputDialog("Do you want to load another set of numbers?"));
        }
        
        for(int i = 0; i < MAXLIST; i++){
            sum += list[i];
        }//end for loop sum
        
        for(int i = 0; i < MAXLIST; i++){
            avg = sum/MAXLIST;
        }//end for loop average
        
        for(int i = 0; i < MAXLIST; i++) {
            if(smallest > list[i]) {
            smallest = list[i];
            }//end if
        }//end for loop smallest
        
        for(int i = 0; i < MAXLIST; i++) {
            if(list[i] > largest) {
            largest = list[i];
            }//end if
        }//end for loop largest

    // ***** output *****

        for(int i = 0; i < MAXLIST; i++){ 
            System.out.println(list[i]);
        }//end for loop printing array
         
        System.out.println("\nSum: " + sum);       //print the sum of the array
        System.out.println("Average: " + avg);       //print the sum of the array
        System.out.println("Smallest Value: " + smallest);      //print smallest number in array
        System.out.println("Largest Value: " + largest);        //print largest number in array
    // ***** closing message *****

        System.out.println("end of processing");

	}  // end main	
}  // end class