//package com.company;
import java.util.*;

public class Main {
    static final long mod = (long)(1E9 + 7);

    static long gcd(long a, long b) {
        while (b != 0) {
            long c = a % b;
            a = b;
            b = c;
        }
        return a;
    }

    static long lcm(long a, long b) {
        return a * b / gcd(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong(), res = 1;
        long[] a = new long[(int)n];
        for (long i = 0; i < n; i++) {
            a[(int)i] = sc.nextLong();
            res = lcm(res, a[(int)i]);
        }
        long sum = 0;
        for (long i = 0; i < n; i++) {
            long cur = res / a[(int)i];
            sum = (sum + cur) % mod;
        }
        System.out.println(sum);
    }
}
