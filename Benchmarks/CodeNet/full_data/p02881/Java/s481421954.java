

import java.text.DecimalFormat;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        
        final long N = Long.parseLong(sc.next());
        long ans = 0;
        long min = 1000000000;
        long sqrt = (long)Math.sqrt(N);
        
        if (isPrimeNumber(N)) {
            ans = N - 1;
        } else if (sqrt * sqrt == N) {
            ans = sqrt * 2 - 2;
        } else {
            for (long i = 2; i <= sqrt; i++) {
                if (N % i == 0) {
                    long tmp = N / i + i;
                    min = Math.min(tmp, min);
                }
            }
            ans = min - 2;
        }
        
        out.println(ans);
        
        out.flush();
    }
    
    public static long gcd(long m, long n) {
        long rem;
        while ((rem = m % n) != 0) {
            m = n;
            n = rem;
        }
        return n;
    }
        
    public static long nPr(int n, int r) {
        return factorial(n) / factorial(n - r);
    }
    
    public static long factorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    
    public static long lucasNumber(int n, long[] memo) {
        memo[0] = 2;
        memo[1] = 1;
        if (memo[n] != 0) return memo[n];
        return memo[n] = lucasNumber(n - 1, memo) + lucasNumber(n - 2, memo);
    }
    
    public static boolean nextPermutation(int[] a) {
        for (int i = a.length - 1; 0 < i; i--) {
            if (a[i - 1] < a[i]) {
                int index = find(a[i - 1], a, i, a.length - 1);
                int temp = a[index];    a[index] = a[i - 1];   a[i - 1] = temp;
                Arrays.sort(a, i, a.length);
                return true;
            }
        }
        return false;
    }

    // destより大きい要素の中で最小のもののインデックスを二分探索で探す
    private static int find(int dest, int[] a, int s, int e) {
        if (s == e) {
            return s;
        }
        int m = (s + e + 1) / 2;
        return a[m] <= dest ? find(dest, a, s, m - 1) : find(dest, a, m, e);
    }

    
    static boolean isPrimeNumber(int targetNum) {
        boolean result = true;
        if (targetNum < 2) result = false;
        int sqrt = (int)Math.sqrt(targetNum);
        for (int i = 2; i <= sqrt; i++) {
            if (targetNum % i == 0) {
                result = false;
                break;
            }
        }
        return result;
    }
    
    static boolean isPrimeNumber(long targetNum) {
        boolean result = true;
        if (targetNum < 2) result = false;
        long sqrt = (long) Math.sqrt(targetNum);
        for (long i = 2; i <= sqrt; i++) {
            if (targetNum % i == 0) {
                result = false;
                break;
            }
        }
        return result;
    }

}