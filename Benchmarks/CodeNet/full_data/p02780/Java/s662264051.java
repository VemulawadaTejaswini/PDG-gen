import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int[] pi = new int[N];
            for (int i = 0; i < N; i++) {
                pi[i] = sc.nextInt();
            }

            Map<Integer, Double> memo = new HashMap<>();
            double result = 0;
            for (int i = 0; i <= N - K; i++) {
                double tmp = 0;
                for (int j = 0; j < K; j++) {
                    int p = pi[i + j];
                    Double test = memo.get(p);
                    if (test != null) {
                        tmp += test;
                        continue;
                    }

                    double data = calc(p, p);
                    tmp += data;
                    memo.put(p, data);
                }

                if (result < tmp) {
                    result = tmp;
                }

            }

            System.out.println(result);
        }
    }

    private static double calc(int n, int m) {
        if (n == 1) {
            return (double) n * 1 / m;
        }

        return (double) n * 1 / m + calc(n - 1, m);
    }
}