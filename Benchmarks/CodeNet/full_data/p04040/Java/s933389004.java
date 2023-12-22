

import java.util.Scanner;

public class Main {


    // the value to fetch m among n
    public static long findCombine(int n, int m, long [] factorial) {
        long result =  factorial[n] / factorial[m] / factorial[n - m];
        return result;
    }

    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        int h = scanner.nextInt();
        int w = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int maxN = 100005;
        long Module = 1000000007;

        long [] factorial = new long[maxN];
        factorial[0] = 1;
        factorial[1] = 1;
        for (int i = 2; i < maxN; ++i) {
            factorial[i] = ((factorial[i - 1] % Module) * (i % Module)) % Module;
        }
        long result = 0;

        for (int j = b + 1; j <= w; ++j) {
            result +=
                    (findCombine(h - a - 1 + j - 1, j - 1, factorial) % Module)
            * (findCombine(a - 1 + w - 1 - (j - 1), a - 1, factorial) % Module);
            result %= Module;

        }
        System.out.println(result);

    }
}
