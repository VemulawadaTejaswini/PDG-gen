import java.util.*;

import static java.lang.System.*;

public class Main {
    public static final long mod = 1_000_000_007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        long[] primeNums = new long[N + 1];
        for (int i = 1; i <= N; i++) {
            int num = i;
            for (int j = 2; j <= N; j++) {
                while (num % j == 0) {
                    primeNums[j]++;
                    primeNums[j] %= mod;
                    num /= j;
                }
            }
        }

        long cnt = 1;
        for (int i = 1; i < primeNums.length; i++) {
            cnt = (cnt * (primeNums[i] + 1)) % mod;
        }

        out.println(cnt);
    }
}