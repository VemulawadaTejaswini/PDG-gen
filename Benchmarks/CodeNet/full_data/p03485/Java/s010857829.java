// package app;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);

        // final String S = sc.next();
        // final int M = sc.nextInt();
        final double a = sc.nextDouble();
        final double b = sc.nextDouble();

        long result = Math.round( (a + b) / 2.0 );

        // System.out.println();
        System.out.println(result);

        // System.out.println(A <= X && A + B >= X ? "YES" : "NO");

    }
}