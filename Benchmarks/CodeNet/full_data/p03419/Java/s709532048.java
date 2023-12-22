import java.util.*;

import static java.lang.System.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int N = ni();
        int M = ni();

        int cnt = 0;

        if (N == 1) {
            if (M == 1) {
                cnt = 1;
            } else {
                cnt = M - 2;
            }
        } else if (M == 1) {
            cnt = N - 2;
        } else {
            cnt = N * M - 2 * N - 2 * (M - 2);
        }

        out.println(cnt);
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