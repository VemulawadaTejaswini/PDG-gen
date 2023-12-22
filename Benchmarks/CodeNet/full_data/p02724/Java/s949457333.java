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

        // String line = sc.next();
        int X = sc.nextInt();

        int _happiness1000 = X / 500;
        int _happiness5 = X % 500 / 5;

        System.out.println(_happiness1000 * 1000 + _happiness5 * 5); 
    }

}