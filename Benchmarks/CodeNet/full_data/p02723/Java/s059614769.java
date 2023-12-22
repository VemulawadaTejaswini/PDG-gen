package com.company;

import java.util.Scanner;

public class Main {

    public static Scanner scan  = new Scanner(System.in);
    static final int size = 6;
    public static void main(String[] args) {
        String S = scan.nextLine();
        if (S.length() <= size) {
            if (S.charAt(2) == S.charAt(3) && S.charAt(4) == S.charAt(5)) {
                System.out.println("Yes");
            } else System.out.println("No");
        }
    }

}