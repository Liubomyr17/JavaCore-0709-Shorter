package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/*

0709 Shorter

1. Create a list of strings.
2. Read 5 lines from the keyboard and add to the list.
3. Using a loop, find the shortest line in the list.
4. Display the found line on the screen.
5. If there are several such lines, print each one on a new line.

Requirements:
1. Declare a variable like list of strings and immediately initialize ee.
2. The program should read 5 lines from the keyboard and write them to the list.
3. The program should display the shortest line on the screen.
4. If there are several lines with a length equal to the minimum, then you need to display each of them on a new line.

 */

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> strings = new ArrayList<>();

        for (int i=0; i<5; i++) {
            strings.add(reader.readLine());
        }

        int maxLength=0;
        for(String string : strings) {
            if(string.length()>maxLength) {
                maxLength = string.length();
            }
        }

        for (String string : strings) {
            if (string.length()==maxLength) {
                System.out.println(string);
            }
        }
    }
}








