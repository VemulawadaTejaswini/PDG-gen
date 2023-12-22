import java.util.*;

public class Main {
    private static long solve(int N, int K, int[] a) {
        int[] ways = new int[K+1];
        int[] diff = new int[K+1];
        ways[0] = 1;

        for (int ai: a) {
            Arrays.fill(diff, 0);

            for (int val = 1; val <= ai; val++)
                for (int i = 0; i <= K-val; i++)
                    diff[i + val] = (diff[i + val] + ways[i]) % 1000000009;

            for (int i = 0; i <= K; i++)
                ways[i] = (ways[i] + diff[i]) % 1000000009;
        }

        return ways[K];
    }

    public static long run(Scanner scanner) {
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int[] a = new int[N];
        for (int i=0; i < N; i++) a[i] = scanner.nextInt();

        return solve(N, K, a);
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println(run(scanner));
        }
        //Tests.run();
    }
}
