

import sun.rmi.runtime.Log;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {

    static Scanner sc = null;
    static PrintWriter pw = null;

    static {

        try {
            sc = new Scanner(System.in);
//            sc = new Scanner("6\n" +
//                    "3 5 1 6 2 4\n" +
//                    "9 1 9 9 1 9");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static final long MOD = 1_000_000_007;

    public static void main(String[] args) {

        int r1 = sc.nextInt() + 1;
        int c1 = sc.nextInt() + 1;

        int r2 = sc.nextInt() + 1;
        int c2 = sc.nextInt() + 1;

        System.out.println((f(r2, c2) - f(r2, c1 - 1) - f(r1 - 1, c2) + f(r1 - 1, c1 - 1) + 2 * MOD) % MOD);


    }

    private static long f(int r2, int c2) {
        long ans = 0;
        for (int s = 2; s <= r2 + 1; s++) {
            ans += fn(s, c2);
            ans %= MOD;
        }

//        System.out.println(ans);
        return ans;
    }


    static long [] fact = new long[2 * 1000_000 + 40];
    static {
        fact[0] = 1;
        for (int r =1 ; r < fact.length ; r++) {
            fact[r] = (fact[r - 1] * r) % MOD;
        }
    }



    private static long i(long a) {
        return pow(a, MOD - 2);
    }

    private static long pow(long a, long r) {
        if (r == 0) return 1;
        if (r == 1) return a;
        long x = pow(a, r / 2);
        x = x * x % MOD;
        if (r % 2 == 1) {
            x = x * a % MOD;
        }
        return x;
    }


    private static long fn(int a, int b) {
        long xx = fact[a + b - 2];
        xx = xx * i(fact[a - 1]) % MOD;
        xx = xx * i(fact[b - 1]) % MOD;
        return xx;
    }
}
