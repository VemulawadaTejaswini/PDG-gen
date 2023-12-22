import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.AbstractMap.SimpleEntry;

class Main {

    static final long MOD = 1000000000 + 7;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int Blue = K;
        int Red = N - K;
        for (int i = 1; i <= K; i++) {
            long blueCov = combination(Blue - 1, i - 1) % MOD;
            int moveableRed = Red - (i - 1);
            // System.out.println(moveableRed);//ok
            long redCov = combination(moveableRed + i, i) % MOD;
            long ans = blueCov * redCov;
            ans %= MOD;
            // System.out.println(blueCov+" "+redCov+" "+ans);
            System.out.println(ans);
        }
    }

    // private static long permutation(long num1, long num2) {
    // if (num2 == 1) {
    // return num1;
    // }
    // return num1 * permutation(num1 - 1, num2 - 1);
    // }

    // private static long combination(long num1, long num2) {
    // if (num2 == 0) {
    // return 1;
    // }
    // return (num1 - num2 + 1) * combination(num1, num2 - 1) / num2;
    // }

    // static long combination(long n, long r){
    // long num = 1;
    // for(long i = 1; i <= r; i++){
    // num = num * (n - i + 1) / i;
    // num %= MOD;
    // }
    // return num;
    // }

    static long[] fac = new long[5100], finv = new long[5100], inv = new long[5100];

    static long combination(int n, int k){        
        fac[0] = fac[1] = 1;
        finv[0] = finv[1] = 1;
        inv[1] = 1;
        for (int i = 2; i < 5100; i++){
            fac[i] = fac[i - 1] * i % MOD;
            inv[i] = MOD - inv[(int)MOD%i] * (MOD / i) % MOD;
            finv[i] = finv[i - 1] * inv[i] % MOD;
        }

        if (n < k) return 0;
        if (n < 0 || k < 0) return 0;
        return fac[n] * (finv[k] * finv[n - k] % MOD) % MOD;
    }

}