/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sum_of_positive_values;

/**
 *
 * @author ABDULQM
 */

import java.util.*;
import java.lang.*;
import java.io.*;
    
public class Sum_of_Positive_Values {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner in = new Scanner(System.in);
       int sum=0;
       int n;
       
       
       System.out.println ("Enter positive numbers to add");
       n = in.nextInt();
       sum = n;
       while(n >= 0) { 
           
       n = in.nextInt();
       sum+= n;
       
       System.out.println ("The sum of your values are equal to " + sum);
       
       }
       
    }
    
}
