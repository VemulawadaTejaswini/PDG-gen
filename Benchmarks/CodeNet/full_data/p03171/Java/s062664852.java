import java.util.*;

public class Main {
    private static long solve(int N, int[] a) {
        long[] score = new long[N+1];

        for (int e = 0; e < N; e++)
            for (int s = e; s >= 0; s--)
                score[s] = Math.max(a[s] - score[s+1], a[e] - score[s]);         

        return score[0];
    }

    public static long run(Scanner scanner) {
        int N = scanner.nextInt();
        int[] a = new int[N];
        for (int i=0; i < N; i++) a[i] = scanner.nextInt();

        return solve(N, a);
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println(run(scanner));
        }
        //Tests.run();
    }
}