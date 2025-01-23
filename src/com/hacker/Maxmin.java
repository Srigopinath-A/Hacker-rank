package com.hacker;

import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Maxmin {

    public static void main(String[] args) {
       Scanner a  = new Scanner(System.in);
       
       int t =a.nextInt();
       a.nextLine();
       
       for(int i=0 ; i<t ;i++){
        String numstr = a.nextLine();
        
        try{
            BigInteger number = new BigInteger(numstr);
            Checkit(number);
        }catch(NumberFormatException e){
            System.out.println(numstr+"Can't be fitted anywhere");
        }
        
       }
       
    }
    
    public static void Checkit(BigInteger number){
        Boolean fits = false;
        
        if(number.compareTo(BigInteger.valueOf(Byte.MIN_VALUE)) >= 0 && number.compareTo(BigInteger.valueOf(Byte.MAX_VALUE)) <= 0){
            System.out.println(number+ " can be fitted in:");
            System.out.println("* byte");
            fits = true;
        }
        
        if(number.compareTo(BigInteger.valueOf(Short.MIN_VALUE)) >= 0 && number.compareTo(BigInteger.valueOf(Short.MAX_VALUE)) <= 0){
            if(!fits) System.out.println(number+ " can be fitted in:");
            System.out.println("* short");
            fits = true;
        }
        
        if(number.compareTo(BigInteger.valueOf(Integer.MIN_VALUE)) >= 0 && number.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) <= 0){
            if(!fits)System.out.println(number+ " can be fitted in:");
            System.out.println("* int");
            fits = true;
        }
        
        if(number.compareTo(BigInteger.valueOf(Long.MIN_VALUE)) >= 0 && number.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) <= 0){
            if(!fits)System.out.println(number+ " can be fitted in:");
            System.out.println("* long");
            fits = true;
        }
        
        if(!fits){
            System.out.println(number+" can't be fitted anywhere.");
        }
    }
    
    
}