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

        final int L = A + B;
        final int R = C + D;

        String msg = "Balanced";
        if(L < R) {
            msg = "Right";
        } else if (L > R){
            msg = "Left";
        }

        // System.out.println();
        System.out.println(msg);

        // System.out.println(A <= X && A + B >= X ? "YES" : "NO");

    }
}