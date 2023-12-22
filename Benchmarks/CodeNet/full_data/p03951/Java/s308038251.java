import java.util.*;

import static java.lang.System.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int N = ni();
        String s = ns();
        String t = ns();

        for (int i = 0; i < N; i++) {
            boolean ok = true;
            for (int j = 0; j < N - i; j++) {
                if (s.charAt(i + j) != t.charAt(j)) {
                    ok = false;
                    break;
                }
            }

            if (ok) {
                out.println(N + i);
                return;
            }
        }

        out.println(2 * N);
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