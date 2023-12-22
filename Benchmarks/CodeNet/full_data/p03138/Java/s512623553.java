import java.util.*;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long K = sc.nextLong();

        long[] A = new long[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextLong();
        }

        int[] oneBitNums = new int[40];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 39; j++) {
                if ((A[i] >> j & 1) == 1) {
                    oneBitNums[j]++;
                }
            }
        }

        // 2^40 = 1_099_511_627_776
        // 2^39 =   549_755_813_888
        int[] xBits = new int[40];
        for (int i = 39; i >= 0; i--) {
            if (oneBitNums[i] <= N / 2) {
                xBits[i] = 1;
            }
        }

        long X = 0;
        for (int i = 39; i >= 0; i--) {
            if(xBits[i] == 1) {
                long num = (long) Math.pow(2.0, i);
                // K以下を保証する
                if (X + num <= K) {
                    X += num;
                }
            }
        }

        long ans = 0;
        for (int i = 0; i < N; i++) {
            ans += X ^ A[i];
        }

        out.println(ans);
    }
}