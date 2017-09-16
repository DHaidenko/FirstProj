package com.company;

import java.util.Scanner;
//
public class Main {
    public static void main(String[] args) {
        System.out.println("Please enter you Name and press 'Enter' button");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        // write your code here
        System.out.println(name + ", is this your name?");
        Scanner no = new Scanner(System.in);
        Boolean Answer = no.nextBoolean();
        System.out.println("Answer = " + Answer);
    }
}
