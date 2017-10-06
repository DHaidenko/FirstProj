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
        textPursing(in);
        //3. Вывести заданное количество случайных чисел с переходом и без перехода на новую строку.
        randomMass(in);
        //4. Ввести пароль из командной строки и сравнить его со строкой-образцом.
        pass(in);

                        if (a>9){
                    int firstdigit= a;
                }

        //6. Ввести с консоли n целых чисел. На консоль вывести: */
        int[] entered = getInts(in);
        /*6.1. Четные и нечетные числа.
        oddOrEven(entered);
        //6.2. Наибольшее и наименьшее число.
        maxmin(entered);
        //6.3. Числа, которые делятся на 3 или на 9.
        threeAndNine(entered);
        //6.4. Числа, которые делятся на 5 и на 7.
        fiveAndSeven(entered);
        //6.5. Все трехзначные числа, в десятичной записи которых нет одинаковых цифр.
        separate3digits(entered);  */
        //6.6. «Счастливые» числа.
        lucky(entered);

    }

    private static void lucky(int[] entered) {
        for (int i = 0; i < entered.length; i++) {
            int enLength = Integer.toString(entered[i]).length();
            if (enLength == 6) {
                int digit1 = entered[i] / 100_000;
                int digit2 = (entered[i] - (digit1 * 100_000)) / 10_000;
                int digit3 = (entered[i] - (digit1 * 100_000) - (digit2 * 10_000)) / 1000;
                System.out.println("digit3 = " + digit3);
                int digit4 = (entered[i] - (digit1 * 100_000) - (digit2 * 10_000)- (digit3 * 1000)) / 100;
                System.out.println("digit4 = " + digit4);
                int digit5 = (entered[i] - (digit1 * 100_000) - (digit2 * 10_000)- (digit3 * 1000) - (digit4 * 100))/10;
                System.out.println("digit5 = " + digit5);
                int digit6 = entered[i] % 10;
                System.out.println("digit6 = " + digit6);
                int lucky1 = digit1+digit2+digit3;
                int lucky2 = digit4+digit4+digit6;
                if (lucky1==lucky2){
                    System.out.println("lucky number = " + entered[i]);
                }
            }
        }
    }

    private static void separate3digits(int[] entered) {
        for (int i = 0; i < entered.length; i++) {
            int enLength = Integer.toString(entered[i]).length();
            if (enLength == 3) {
                int firstDigit = entered[i] / 100;
                int secondDigit = (entered[i] - (firstDigit * 100)) / 10;
                int thirdDigit = entered[i] % 10;
                if ((secondDigit != firstDigit) && (firstDigit != thirdDigit) && (secondDigit != thirdDigit)) {
                    System.out.println("entered[i] = " + entered[i]);
                }
            }
        }
    }

    private static void fiveAndSeven(int[] entered) {
        for (int i = 0; i < entered.length; i++) {
            if (entered[i] % 5 == 0) System.out.println("entered[" + i + "] can be divided on 5 -->" + entered[i]);
            else if (entered[i] % 7 == 0) System.out.println("entered[" + i + "] can be divided on 7 -->" + entered[i]);
        }
    }

    private static void threeAndNine(int[] entered) {
        for (int i = 0; i < entered.length; i++) {
            if (entered[i] % 9 == 0) System.out.println("entered[" + i + "] can be divided on 9 -->" + entered[i]);
            else if (entered[i] % 3 == 0) System.out.println("entered[" + i + "] can be divided on 3 -->" + entered[i]);
        }
    }

    private static void oddOrEven(int[] entered) {
        for (int i = 0; i < entered.length; i++) {
            if (entered[i] % 2 == 0) System.out.println("entered[" + i + "] is even number -->" + entered[i]);
            else if (entered[i] % 2 == 1) System.out.println("entered[" + i + "] is odd number -->" + entered[i]);
        }
    }

    private static int[] getInts(Scanner in) {
        System.out.println("Ввести количество чисел которое Вы будете вводить");
        int n = in.nextInt();
        int[] entered = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Ввести число из массива №" + i + 1);
            entered[i] = in.nextInt();
        }
        return entered;
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

    private static void randomMass(Scanner in) {
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

    private static void textPursing(Scanner in) {
        String text = in.nextLine();
        String[] word = text.split(" ");
        for (int i = word.length - 1; i >= 0; i--) {
            System.out.println("args[" + i + "] : " + word[i]);
        }
    }

}