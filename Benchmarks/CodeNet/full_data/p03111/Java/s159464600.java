import java.util.*;

public class Main {

    static int INF = (int) 1e8;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int[] L = new int[N];
        for (int n = 0; n < N; n += 1) {
            L[n] = sc.nextInt();
        }

        System.out.println(dfs(0, 0, 0, 0, N, A, B, C, L));
    }

    private static int dfs(int n, int a, int b, int c, int N, int A, int B, int C, int[] L) {
        if (n == N) {
            if (a == 0 || b == 0 || c == 0) {
                return INF;
            } else {
                return Math.abs(a - A) + Math.abs(b - B) + Math.abs(c - C) - 30;
            }
        }

        int dfsNull = dfs(n + 1, a, b, c, N, A, B, C, L);
        int dfsA = dfs(n + 1, a + L[n], b, c, N, A, B, C, L) + 10;
        int dfsB = dfs(n + 1, a, b + L[n], c, N, A, B, C, L) + 10;
        int dfsC = dfs(n + 1, a, b, c + L[n], N, A, B, C, L) + 10;

        int[] maxArray = new int[]{dfsNull, dfsA, dfsB, dfsC};
        return Arrays.stream(maxArray).min().getAsInt();
    }

}
