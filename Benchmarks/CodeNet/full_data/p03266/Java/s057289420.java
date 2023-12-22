import java.util.*;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        // a % K = b % K = c % K == 0 or A % K = b % K = c % K = (K / 2) のみ
        int[] cand = new int[2];
        for (int i = 1; i <= N; i++) {
            if (i % K == 0) {
                cand[0]++;
            }

            if (K % 2 == 0 && i % K == (K / 2)) {
                cand[1]++;
            }
        }

        long comb = 0;
        for(int i = 0; i < 2; i++) {
            comb += cand[i] * cand[i] * cand[i];
        }

        out.println(comb);
    }
}