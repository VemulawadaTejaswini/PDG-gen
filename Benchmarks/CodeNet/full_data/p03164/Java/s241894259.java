import java.util.*;

public class Main {
    private static long solve(int N, int W, int[] w, int[] v) {
        Map<Integer, Long> maxValue = new HashMap<>();
        Map<Integer, Long> candidates = new HashMap<>();

        long max = 0;
        maxValue.put(0, 0L);

        for (int k = 0; k < N; k++) {
            candidates.clear();

            for (Map.Entry<Integer, Long> entry: maxValue.entrySet()) {
                int newWeight = entry.getKey() + w[k];
                if (newWeight > W) continue;;

                long newValue = entry.getValue() + v[k];
                long currentValue = maxValue.getOrDefault(newWeight, 0L);

                if (newValue > currentValue && newValue > candidates.getOrDefault(newWeight, 0L)) {
                    candidates.put(newWeight, newValue);
                    max = Math.max(max, newValue);
                }
            }

            for (Map.Entry<Integer, Long> entry: candidates.entrySet())
                maxValue.put(entry.getKey(), entry.getValue());
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
        testCase(1, 1000000000, new int[] { 1000000000 }, new int[] { 10 }, 10);
        testCase(5, 5, new int[] { 1, 1, 1, 1, 1}, new int[] {1000000000,1000000000,1000000000,1000000000,1000000000}, 5000000000L);
        testCase(6, 15, new int[] {6,5,6,6,3,7}, new int[] {5,6,4,6,5,2}, 17);

        timingTest(100);

        System.out.println("DONE");
    }

    private static void timingTest(int size) {
        int maxWeight = 1000000000;
        int[] w = new int[size];
        int[] v = new int[size];
        for (int i=0; i < size; i++) {
            w[i] = Math.min(i*i, maxWeight);
            v[i] = i;
        }

        long start = System.currentTimeMillis();
        solve(size, Math.min(100*size*size, maxWeight), w, v);
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