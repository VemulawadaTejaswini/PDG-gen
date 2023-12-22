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
        int loop = T / L;
        int dist = T % L;

        int[] nxs = new int[N];
        for (int i = 0; i < N; i++) {
            if (DS[i] == 1) {
                nxs[i] = (XS[i] + T) % L;
            } else {
                int tmp = XS[i] - T;
                if (tmp >= 0) {
                    nxs[i] = tmp;
                } else {
                    nxs[i] = tmp + L;
                }
            }

            if (i == 0 || DS[i] == DS[0]) {
                continue;
            }

            count += loop;
            int initDiff;
            if (DS[0] == 1) {
                initDiff = XS[i] - XS[0];
            } else {
                initDiff = (XS[0] + L) - XS[i];
            }

            if (initDiff / 2 < dist) {
                count += 1;
            }
        }

        Arrays.sort(nxs);
        for (int i = 0; i < N; i++) {
            if (DS[0] == 1) {
                System.out.println(nxs[(i + count) % N]);
            } else {
                int tmp = ((L - (count % N)) + i) % N;
                System.out.println(nxs[tmp]);
            }
        }
    }
}
