package com.hacker;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
       Calendar fetch = Calendar.getInstance();
       
       fetch.set(day,month-1,year);
       int dayoftheweek = fetch.get(Calendar.DAY_OF_WEEK);
       switch(dayoftheweek) {
       case Calendar.SUNDAY: return "Sunday";
       case Calendar.MONDAY: return "Monday";
       case Calendar.TUESDAY: return "Tuesday";
       case Calendar.WEDNESDAY: return "Wednesday";
       case Calendar.THURSDAY: return "Thurday";
       case Calendar.FRIDAY: return "Friday";
       case Calendar.SATURDAY: return "Saturday";
       default : return "";
       }
    }

}

public class Dateday {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);
        
     

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
