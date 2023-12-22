import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        long[] count = new long[n + 1];

        for (int i = 2; i <= n; i++) {
            int x = i;
            for (long j = 2; j <= Math.sqrt(x); j++) {
                if (x % j == 0) { // 最小の因数を求める
                    while (x % j == 0) {
                        x /= j; // 最小の因数で割った数を代入する
                        count[(int)j]++;
                    }
                }
            }
            if (x > 1) {
               count[x]++;
            }
        }

        long ans = 1;

        for (long v: count
             ) {
            v++;
            ans *= v;
            ans %= 1000000007;
        }

        System.out.println(ans);
    }
}