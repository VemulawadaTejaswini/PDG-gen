import java.util.*;

import static java.lang.System.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int N = ni();
        long x = nl();
        long[] a = nlarr(N);

        int[] magicCnt = new int[N];
        long[] baseCost = new long[N];
        long pre = a[0];
        // repeat twice to check if N - 1 to 0 works.
        for (int i = 1; i < 2 * N - 1; i++) {
            int ii = i < N ? i : i - N;
            int ipre = i - 1 < N ? i - 1 : i - 1 - N;

            if (a[ii] > pre + x * (magicCnt[ipre] + 1)) {
                magicCnt[ii] = magicCnt[ipre] + 1;
            } else {
                pre = a[ii];
            }
            baseCost[ii] = pre;
        }

        int maxMagicCnt = 0;
        long time = 0;
        for (int i = 0; i < N; i++) {
            if (magicCnt[i] != 0) {
                maxMagicCnt = Math.max(maxMagicCnt, magicCnt[i]);
            }
            time += baseCost[i];
        }

        out.println(time + maxMagicCnt * x);
    }

    static int ni() {
        return sc.nextInt();
    }

    static long nl() {
        return sc.nextLong();
    }

    static String ns() {
        return sc.next();
    }

    static int[] niarr(int N) {
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        return a;
    }

    static long[] nlarr(int N) {
        long[] a = new long[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextLong();
        }
        return a;
    }
}