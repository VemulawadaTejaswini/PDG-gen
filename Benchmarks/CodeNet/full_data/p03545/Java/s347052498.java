// package app;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.StringJoiner;
import java.util.stream.Stream;

public class Main {

    public static void main(final String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[4];
        boolean [] ops = new boolean[3];
        for (int i = 0; i < 4; i++) {
            a[i] = System.in.read() - '0';
        }

        String[] op = new String[]{"+", "-"};

        String expression = "";
        for (int i = 0; i < Math.pow(2, 3); i++) {
            int sum = a[0];

            ops[0] = (i & 1) == 1;
            ops[1] = ((i >> 1) & 1) == 1;
            ops[2] = ((i >> 2) & 1) == 1;

            for (int j = 0; j < 3; j++) {
                sum = calc(sum, ops[j], a[j + 1]);
            }

            if (sum == 7){
                expression = Objects.toString(a[0]);
                for (int j = 0; j < ops.length; j++) {
                    expression += op[ops[j] ? 0 : 1] + Objects.toString(a[j + 1]);
                }
                expression += "=7";
                break;
            }
        }

        System.out.println(expression);
    }

    static int calc(int num1, boolean op, int num2){
        return op ? num1 + num2 : num1 - num2;
    }

}