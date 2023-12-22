import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            long MOD = 1000000007;

            int r1 = sc.nextInt();
            int c1 = sc.nextInt();
            int r2 = sc.nextInt();
            int c2 = sc.nextInt();

            long[] C = new long[1000000 + 1];

            long ans = 0;

            Arrays.fill(C, 1);
            for (int i = 1; i <= r2; i++) {
                long[] C2 = new long[1000000 + 1];

                long x = 1;
                for (int j = 1; j <= c2; j++) {
                    x = (x + C[j]) % MOD;
                    C2[j] = x;
                }

                if (i >= r1) {
                    for (int j = c1; j <= c2; j++) {
                        ans = (ans + C2[j]) % MOD;
                    }
                }

                C = C2;
            }

            System.out.println(ans);
        }
    }

}
