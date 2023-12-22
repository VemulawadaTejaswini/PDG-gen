// package app;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);

        final String S = sc.next();
        int cnt = 0;
        for (int i = 0; i < S.length(); i++) {
            if(S.charAt(i) == 'o') cnt++;
        }


        System.out.println(700 + cnt * 100);

    }
}