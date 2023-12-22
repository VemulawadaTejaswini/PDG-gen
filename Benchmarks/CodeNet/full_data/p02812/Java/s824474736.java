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

        long N = sc.nextLong();
        String text = sc.next();

        int cnt = 0;
        for (int i = 0; i < N; i++) {
            if(text.indexOf("ABC", i) == i) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}