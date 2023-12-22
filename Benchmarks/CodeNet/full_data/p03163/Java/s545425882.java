import java.util.*;

public class Main {
    private static long solve(int N, int W, int[] w, int[] v) {
        return solveRec(N, W, 0, w, v, new boolean[N]);
    }

    private static long solveRec(int N, int W, long V, int[] w, int[] v, boolean[] used) {
        if (W <= 0) return V;

        long max = V;

        for (int i = 0; i < N; i++) {
            if (used[i]) continue;
            if (w[i] > W) continue;

            used[i] = true;
            long candidate = solveRec(N, W - w[i], V + v[i], w, v, used);
            used[i] = false;

            max = Math.max(max, candidate);
        }

        return max;
    }

    public static void main(String[] args) {
        int N, W;
        int[] w;
        int[] v;
        try (Scanner scanner = new Scanner(System.in)) {
            N = scanner.nextInt();
            W = scanner.nextInt();

            w = new int[N];
            v = new int[N];
            for (int i = 0; i < N; i++) {
                w[i] = scanner.nextInt();
                v[i] = scanner.nextInt();
            }
        }

        long result = solve(N, W, w, v);
        System.out.println(result);

        //test();
    }

    private static void test() {
        testCase(3, 8, new int[] {3, 4, 5}, new int[] {30, 50, 60}, 90);
        testCase(5, 5, new int[] { 1, 1, 1, 1, 1}, new int[] {1000000000,1000000000,1000000000,1000000000,1000000000}, 5000000000L);
        testCase(6, 15, new int[] {6,5,6,6,3,7}, new int[] {5,6,4,6,5,2}, 17);
        System.out.println("DONE");
    }

    private static void testCase(int N, int W, int[] w, int[] v, long expected) {
        long result = solve(N, W, w, v);
        if (result != expected) {
            System.out.println("FAILED N=" + N + " W=" + W + " w=" + Arrays.toString(w) + " v=" + Arrays.toString(v)
                    + ", was " + result + " expected " + expected);
        }
    }
}
