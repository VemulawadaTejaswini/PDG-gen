// package app;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);

        // final String S = sc.next();
        // final int M = sc.nextInt();
        final int A = sc.nextInt();
        final int B = sc.nextInt();
        final int C = sc.nextInt();
        final int D = sc.nextInt();

        String msg = "Blanced";

        if (A + B > C + D) {
            msg = "Left";
        } else if (A + B < C + D){
            msg = "Right";
        }

        // System.out.println();
        System.out.println(msg);

        // System.out.println(A <= X && A + B >= X ? "YES" : "NO");

    }
}