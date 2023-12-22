package main;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String l1Input = s.nextLine();
        String l2Input = s.nextLine();
        String[] l1 = l1Input.split(" ");
        String[] l2 = l2Input.split(" 11 ");
        
        if (i(l2[0]) == i(l1[0])) {
            System.out.println(0);
        } else {
            if (i(l2[1]) == 1) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }

    private static Integer i(String s) {
        return Integer.valueOf(s);
    }
}
