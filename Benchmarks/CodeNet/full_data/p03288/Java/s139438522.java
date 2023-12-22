import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;

class Solution {

    static Scanner in = new Scanner(System.in);

    static int min(int... a) {
        int min = a[0];
        for (int x : a) {
            if (x < min) min = x;
        }
        return min;
    }

    static int max(int... a) {
        int max = a[0];
        for (int x : a) {
            if (x > max) max = x;
        }
        return max;
    }

    static int gcd(int a, int b) {
        int r;
        while (b != 0) {
            r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    static int[] calcZ(String s) {
        int n = s.length();
        int[] z = new int[(int) n];
        int l = 0, r = 0;
        for (int i = 1; i < n; i++) {
            if (r >= i) z[i] = min(z[i - l], r - i + 1);
            while (z[i] + i < n && s.charAt(z[i]) == s.charAt(z[i] + i)) z[i]++;
            if (i + z[i] - 1 > r) {
                l = i;
                r = i + z[i] - 1;
            }
        }
        return z;
    }

    static int in() {
        return in.nextInt();
    }

    static long inL(){
        return in.nextLong();
    }

    static void println(Object obj) {
        System.out.println(obj);
    }

    static void println() {
        System.out.println();
    }

    static void print(Object obj) {
        System.out.print(obj);
    }

    static int abs(int a) {
        return Math.abs(a);
    }

    static void printf(String s, Object... args) {
        System.out.printf(s, args);
    }

    static void solve() {
        int r = in();
        String ans;
        if (r < 1200) ans = "ABC";
        else if (r < 2800) ans = "ARC";
        else ans = "AGC";
        System.out.println(ans);
    }

    public static void main(String... args) {
        int t = 1;
        //t = in.nextInt();


        while (t-- > 0) {
            solve();
        }
    }
}