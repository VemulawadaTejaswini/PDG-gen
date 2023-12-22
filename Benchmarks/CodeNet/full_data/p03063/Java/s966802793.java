import java.util.*;

import static java.lang.System.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int N = ni();
        String S = ns();

        int[] white = new int[N + 1];
        int[] black = new int[N + 1];
        for (int i = 1; i <= S.length(); i++) {
            black[i] = black[i-1];
            white[i] = white[i-1];

            if (S.charAt(i - 1) == '#') {
                black[i]++;
            } else {
                white[i]++;
            }
        }

        int cnt = 1000000;
        for(int i = 0; i <= N; i++){
            int tmpCnt = black[i] + (white[N] - white[i]);
            cnt = Math.min(tmpCnt, cnt);
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