/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.csc229lab03;

import java.text.ParseException;
import java.time.*;
import java.util.Scanner;



/**
 *
 * @author soblab
 */
public class NewClass {
    //lineaer search
   static int  linear_search (int nmLst[], int n, int x){
         int i = 0, location;
         while ( i<=n && x != nmLst[i])
        i= i + 1;
        if (i <= n ) location = i;
        else location = 0;
        
      return -1;
   }
   
    
   
   
   void bubbleSort(int[] a, int size ) {
        int outer, inner, temp;
        for (outer = size-1; outer > 0; outer--) { // counting down
        for (inner = 0; inner < outer; inner++) { // bubbling up
        if (a[inner] > a[inner + 1]) { // if out of order...
            temp = a[inner]; // ...then swap
            a[inner] = a[inner + 1];
            a[inner + 1] = temp;
                }
                    }
                        }
                      }
        
    public static void main(String[] args) throws ParseException{
        Instant start = Instant.now();
        
        
        
        
        Instant finish = Instant.now();
     long timeElapsed = Duration.between(start, finish).toMillis();
       System.out.println("time" + timeElapsed);
       
    }
    
}
