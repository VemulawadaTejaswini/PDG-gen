import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Scanner;

class Main {
    static final int MOD = 1000000007;
    static final int INF = 1 << 30;

    Main() {
        Scanner sc = new Scanner(System.in);
        long ans = 0;
        // BigDecimal a = BigDecimal.valueOf(sc.nextLong());
        // BigDecimal b = BigDecimal.valueOf(sc.nextLong());
        // BigDecimal c = BigDecimal.valueOf(sc.nextLong());
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // a.
        System.out.println(4*a*b<(c-a-b)*(c-a-b)  ?"Yes":"No");
    }

    public static void main(String[] args) {
        new Main();
    }
}
