

import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long k = scanner.nextLong();
        long [] a = new long[n];
        long max = 0;
        for (int i = 0; i < n; ++i) {
            a[i] = scanner.nextLong();
            max = Math.max(max, a[i]);
        }
        if (max == 0) {
            System.out.println(k * n);
            return;
        }
        int length = 0;
        while (max > 0) {
            ++length;
            max /= 2;
        }
        int[][] num = new int[n][length];
        for (int i = 0; i < n; ++i) {
            long copy = a[i];
            int b = 0;
            while (copy > 0) {
                num[i][b] = (int)(copy % 2);
                copy /= 2;
                ++b;
            }
        }
        long result = 0;

        for (int b = length - 1; b >= 0; --b) {
            int num0 = 0;
            int num1 = 0;
            for (int i = 0; i < n; ++i) {
                if (num[i][b] == 0) {
                    ++num0;
                } else {
                    ++num1;
                }
            }
    //        System.out.println("b: " + b + " num0: " + num0 + " num1: " + num1);
            if (num1 < num0) {
                long currentAdd = (long)Math.pow(2, b);
                if (result + currentAdd <= k) {
                    result += currentAdd;
                }
            }
        }
     //   System.out.println("result: " + result);
        long f = 0;
        for (int i = 0; i < n; ++i) {
            long xorRes = xor(result, a[i]);
            f += xorRes;
        }
        System.out.println(f);

    }

    public static long xor(long a, long b) {
        long res = 0;
        int p = 0;
        while (a > 0 || b > 0) {
            if (a % 2 != b % 2) {
                res += (long) Math.pow(2, p);
            }
            a /= 2;
            b /= 2;
            ++p;
        }
        return res;
    }

}
