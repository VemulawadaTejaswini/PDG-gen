import java.util.*;
 
public class Main {
    private static String solve(int N, int K, int[] a) {
        int result = solve(K, N, a, new int[K+1]);
        return result == +1 ? "First": "Second";
    }
 
    private static int solve(int k, int N, int[] a, int[] memo) {
        if (memo[k] != 0) return memo[k];
 
        int result = -1;
        for (int i = 0; i < N; i++) {
            if (a[i] > k) continue;
 
            int alt = solve(k - a[i], N, a, memo);
            if (alt == -1) {
                result = +1;
                break;
            }
        }
        memo[k] = result;
        return result;
    }
 
    public static String run(Scanner scanner) {
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