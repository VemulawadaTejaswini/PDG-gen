import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int L = sc.nextInt();
        int T = sc.nextInt();
        int[] XS = new int[N];
        int[] DS = new int[N];

        for (int i = 0; i < N; i++) {
            XS[i] = sc.nextInt();
            DS[i] = sc.nextInt();
        }

        int count = 0;
        int[] nxs = new int[N];
        for (int i = 0; i < N; i++) {
            if (DS[i] == 1) {
                nxs[i] = (XS[i] + T) % L;
            } else {
                int tmp = (XS[i] - T) % L;
                if (tmp >= 0) {
                    nxs[i] = tmp;
                } else {
                    nxs[i] = tmp + L;
                }
            }

            if (i == 0 || DS[i] == DS[0]) {
                continue;
            }

            int initDiff;
            if (DS[0] == 1) {
                initDiff = XS[i] - XS[0];
            } else {
                initDiff = L - (XS[i] - XS[0]);
            }

            for (int remain = T; remain > 0; remain -= L) {
                if (initDiff / 2 <= remain) {
                    count += 1;
                }
            }
        }

        Arrays.sort(nxs);

        if (DS[0] == 1) {
            count %= N;
        } else {
            count = -count;
            count %= N;
            if (count < 0) {
                count += N;
            }
        }

        for (int i = 0; i < N; i++) {
            System.out.println(nxs[(i + count) % N]);
        }
    }
}
