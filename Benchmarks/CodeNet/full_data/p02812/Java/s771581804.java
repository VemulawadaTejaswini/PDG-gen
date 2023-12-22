package com.kesarling.atCoder;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        String string = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < string.length()-2; i++) {
            if (string.toUpperCase().charAt(i) == 'A' && string.toUpperCase().charAt(i+1) == 'B' && string.toUpperCase().charAt(i+2) == 'C') {
                count++;
            }
        }
        System.out.println(count);
    }
}
