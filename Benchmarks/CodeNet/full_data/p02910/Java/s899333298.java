// package app;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

    public static void main(final String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        // long N = sc.nextLong();
        // long K = sc.nextLong();

        String S = sc.next();

        boolean niceTap = true;
        for (int i = 0; i < S.length(); i++) {
            char tap = S.charAt(i);
            if (i % 2 == 1) {
                if (tap == 'R') niceTap = false;
            } else {
                if (tap == 'L') niceTap = false;
            }
        }

        System.out.println(niceTap ? "Yes" : "No");
    }
}