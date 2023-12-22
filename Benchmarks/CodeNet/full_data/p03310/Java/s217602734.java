import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        long[] Ac = new long[N];
        A[0] = sc.nextInt();
        Ac[0] = A[0];
        for (int i = 1; i < N; i++) {
            A[i] = sc.nextInt();
            Ac[i] = Ac[i - 1] + A[i];
        }
        long half = Long.MAX_VALUE;
        int c1r = 0;
        int c3r = 2;
        for (int c2 = 1; c2 < N - 2; c2++) {
            long half1 = Long.MAX_VALUE;
            for (int c1 = c1r; c1 < c2; c1++) {
                long a = Math.abs(Ac[c1] - (Ac[c2] - Ac[c1]));
                if (half1 >= a) {
                    half1 = a;
                    c1r = c1;
                } else {
                    break;
                }
            }
            long half2 = Long.MAX_VALUE;
            for (int c3 = c2 + 1 < c3r ? c3r : c2 + 1; c3 < N - 1; c3++) {
                long b = Math.abs((Ac[c3] - Ac[c2]) - (Ac[N - 1] - Ac[c3]));
                if (half2 >= b) {
                    half2 = b;
                    c3r = c3;
                } else {
                    break;
                }
            }
            long max = Math.max(Math.max(Ac[c1r], Ac[c2] - Ac[c1r]), Math.max(Ac[c3r]-Ac[c2], Ac[N - 1] - Ac[c3r]));
            long min = Math.min(Math.min(Ac[c1r], Ac[c2] - Ac[c1r]), Math.min(Ac[c3r]-Ac[c2], Ac[N - 1] - Ac[c3r]));
            half = half < max - min ? half : max - min;
        }
        System.out.println(half);
    }
}