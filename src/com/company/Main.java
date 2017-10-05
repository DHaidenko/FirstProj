package com.company;

import sun.security.util.Password;

import java.util.Scanner;

//
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*nameCheck(in);
        //1. Приветствовать любого пользователя при вводе его имени через командную строку.
        nameCheck();
        //2. Отобразить в окне консоли аргументы командной строки в обратном порядке.
        TextPursing(in);
        //3. Вывести заданное количество случайных чисел с переходом и без перехода на новую строку.
        RandomMass(in);
        //4. Ввести пароль из командной строки и сравнить его со строкой-образцом.
        pass(in);
        //6. Ввести с консоли n целых чисел. На консоль вывести: */
        System.out.println("Ввести количество чисел которое Вы будете вводить");
        int n = in.nextInt();
        int[] entered = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Ввести число из массива №" + i);
            entered[i] = in.nextInt();
        }
        maxmin(entered);

    }

    private static void maxmin(int[] entered) {
        int biggest = entered[entered.length - 1];
        int minimal = entered[entered.length - 1];
        for (int i = 0; i < entered.length; i++) {
            if (entered[i] > biggest) {
                biggest = entered[i];
            } else if (entered[i] < minimal) {
                minimal = entered[i];
            }
        }
        System.out.println("Min: " + minimal);
        System.out.println("Max: " + biggest);
    }


    private static void pass(Scanner in) {
        System.out.println("Ввести пароль из командной строки and press 'Enter' button");
        String pwd = in.nextLine();
        String savedPwd = "sdasd";
        if (pwd.equals(savedPwd)) {
            System.out.println("You have loged in successfully");
        } else {
            System.out.println("Wrong password");
        }
    }

    private static void RandomMass(Scanner in) {
        System.out.println("Please, enter number");
        int numb = in.nextInt();
        int[] nums = new int[numb];
        for (int i = 0; i < numb; i++) {
            nums[i] = ((int) (Math.random() * numb));
            System.out.println(nums[i]);
        }
    }

    private static void nameCheck(Scanner in) {
        System.out.println("Please enter you Name and press 'Enter' button");
        String name = in.next();
        System.out.println("Great name, " + name);
    }

    private static void TextPursing(Scanner in) {
        String text = in.nextLine();
        String[] word = text.split(" ");
        for (int i = word.length - 1; i >= 0; i--) {
            System.out.println("args[" + i + "] : " + word[i]);
        }
    }

}