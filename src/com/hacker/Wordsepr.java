package com.hacker;

import java.io.*;
import java.util.*;

public class Wordsepr {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        
        
        ArrayList<String> list = new ArrayList<>();
        StringBuilder strbuild = new StringBuilder();
        
        for (int i=0;i<s.length();i++){
            char val = s.charAt(i);
            if(Character.isLetter(val)){
                strbuild.append(val);
            } else {
                if(strbuild.length()> 0){
                    list.add(strbuild.toString());
                    strbuild.setLength(0);
                }
            }
        }
        
        if(strbuild.length()>0){
            list.add(strbuild.toString());
        }
        
        System.out.println(list.size());
        for(String n : list){
            System.out.println(n);
        }
        scan.close();
    }
}