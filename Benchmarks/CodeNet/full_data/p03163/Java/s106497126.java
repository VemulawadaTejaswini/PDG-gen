import java.util.*;

public class Main {
    private static long solve(int N, int W, int[] w, int[] v) {
        return solveRec(N, W, w, v, new HashMap[N+1]);
    }

    private static long solveRec(int k, int maxWeight, int[] w, int[] v, HashMap<Integer, Long>[] cache) {
        if (maxWeight < 0) return Long.MIN_VALUE;
        if (k == 0) return 0;

        if (cache[k] == null) cache[k] = new HashMap<Integer, Long>();
        if (cache[k].containsKey(maxWeight)) return cache[k].get(maxWeight);

        long without = solveRec(k-1, maxWeight, w, v, cache);
        long with = v[k-1] + solveRec(k-1, maxWeight - w[k-1], w, v, cache);
        long result = Math.max(with, without);

        cache[k].put(maxWeight, result);
        return result;
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

        int[] w = new int[100];
        int[] v = new int[100];
        for (int i=0; i < 100; i++) {
            w[i] = 1;
            v[i] = 1;
        }

        long start = System.currentTimeMillis();
        testCase(100, 100, w, v, 100);
        long elapsed = System.currentTimeMillis() - start;
        System.out.println("large test case: " + elapsed);

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
