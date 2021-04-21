package com.gibrilla;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class io {
    public static void main(String[] args) throws IOException {

        InputStreamReader isr =  new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int number = 0;

        String input = "";
        System.out.println("Name?");
        input = br.readLine();
        System.out.println("Hi " + input);
        input = br.readLine();
        number = Integer.parseInt(input);
        System.out.println((number + 10));

    }
}
