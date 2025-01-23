package com.hacker;

import java.util.Scanner;

public class Anagram {

    static boolean isAnagram(String a, String b) {
        a=a.toLowerCase();
        b=b.toLowerCase();
        
        int val1 = a.length();
        int val2 = b.length();
        
        if(val1!=val2){
            return false;
        }
        
        int[] char1 = new int[26];
        int[] char2 = new int[26];
        
        for(int i=0;i<a.length();i++){
            char1[a.charAt(i) - 'a']++;
            char2[b.charAt(i) - 'a']++;
        }
        
     for(int i=0;i<26;i++){
        if(char1[i] != char2[i]){
            return false;
        }
     }
     return true;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
