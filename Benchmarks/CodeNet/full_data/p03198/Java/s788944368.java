import java.util.*;

class C {
    public static void main(String... args) {
        final Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        final long[] A = new long[N];
        for (int i = 0; i < N; i++)
            A[i] = sc.nextInt();
        final int[] dcc = new int[N + 1];
        dcc[1] = 1;
        for (int i = 1; i < N; i++) {
            int cnt = 0;
            for (long l = A[i - 1]; l < A[i]; l <<= 2)
                cnt += 2;
            dcc[i + 1] = dcc[i] + i * cnt + 1;
        }
        final int[] acc = new int[N + 1];
        for (int i = N - 1; i > 0; i--) {
            int cnt = 0;
            for (long l = A[i]; A[i - 1] > l; l <<= 2)
                cnt += 2;
            acc[i - 1] = acc[i] + (N - i) * cnt;
        }
//        System.err.println(Arrays.toString(dcc));
//        System.err.println(Arrays.toString(acc));
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i <= N; i++)
            ans = Math.min(ans, dcc[i] + acc[i]);
        System.out.println(ans);
    }
}
public class Main {
    public static void main(String...args) {
        C.main();
    }
}
