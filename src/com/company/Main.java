package com.company;

import java.util.Scanner;

//
public class Main {
    public static void main(String[] args) {
        /*1. Приветствовать любого пользователя при вводе его имени через командную строку.
        nameCheck();*/
        //2. Отобразить в окне консоли аргументы командной строки в обратном порядке.
        TextPursing();
        Scanner numx = new Scanner(System.in);
        int[] nums = new int[5];
        for (int i = 0; i < numx.nextInt(); i++) {
            switch (nums[i] = (int) Math.random()) {
            }
            System.out.println(nums[i]);
        }
    }

    private static void nameCheck() {
        System.out.println("Please enter you Name and press 'Enter' button");
        Scanner in = new Scanner(System.in);
        System.out.println("Great name, " + in.next());
    }

    private static void TextPursing() {
        Scanner x = new Scanner(System.in);
        String text = x.nextLine();
        String[] word = text.split(" ");
        for (int i = word.length - 1; i >= 0; i--) {
            System.out.println("args[" + i + "] : " + word[i]);
        }
    }

}