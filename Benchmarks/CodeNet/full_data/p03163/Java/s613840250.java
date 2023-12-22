import java.util.*;

public class Main {
    private static int MAX_WEIGHT = 100000;

    private static long solve(int N, int W, int[] w, int[] v) {
        long[] maxValue = new long[MAX_WEIGHT + 1];
        long[] candidateMaxValue = new long[MAX_WEIGHT + 1];

        for (int k = 0; k < N; k++) {
            Arrays.fill(candidateMaxValue, 0);
            candidateMaxValue[w[k]] = v[k];
            for (int weight = 1; weight <= MAX_WEIGHT; weight++) {
                if (maxValue[weight] == 0) continue;

                if (weight + w[k] <= MAX_WEIGHT) {
                    candidateMaxValue[weight + w[k]] = maxValue[weight] + v[k];
                }
            }
            for (int weight = 1; weight <= MAX_WEIGHT; weight++) {
                maxValue[weight] = Math.max(maxValue[weight], candidateMaxValue[weight]);
            }
        }

        long result = 0;
        for (int weight = 1; weight <= W; weight++) {
            result = Math.max(result, maxValue[weight]);
        }

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

        timingTest(100);

        System.out.println("DONE");
    }

    private static void timingTest(int size) {
        int[] w = new int[size];
        int[] v = new int[size];
        for (int i=0; i < size; i++) {
            w[i] = Math.min(i*i, MAX_WEIGHT);
            v[i] = i;
        }

        long start = System.currentTimeMillis();
        solve(size, Math.min(100*size*size, MAX_WEIGHT), w, v);
        long elapsed = System.currentTimeMillis() - start;
        System.out.println("timing size=" + size + " elapsed=" + elapsed);
    }

    private static void testCase(int N, int W, int[] w, int[] v, long expected) {
        long result = solve(N, W, w, v);
        if (result != expected) {
            System.out.println("FAILED N=" + N + " W=" + W + " w=" + Arrays.toString(w) + " v=" + Arrays.toString(v)
                    + ", was " + result + " expected " + expected);
        }
    }
}
