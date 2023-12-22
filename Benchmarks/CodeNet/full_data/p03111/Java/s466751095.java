import java.util.*;

public class Main {

    private static final int INF = (int) 1e8;
    private static int N;
    private static int A;
    private static int B;
    private static int C;
    private static int[] L;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        L = new int[N];
        for (int n = 0; n < N; n += 1) {
            L[n] = sc.nextInt();
        }

        System.out.println(dfs(0, 0, 0, 0));
    }

    private static int dfs(int n, int a, int b, int c) {
        if (n == N) {
            if (a == 0 || b == 0 || c == 0) {
                return INF;
            } else {
                return Math.abs(a - A) + Math.abs(b - B) + Math.abs(c - C) - 30;
            }
        }

        int dfsNull = dfs(n + 1, a, b, c);
        int dfsA = dfs(n + 1, a + L[n], b, c) + 10;
        int dfsB = dfs(n + 1, a, b + L[n], c) + 10;
        int dfsC = dfs(n + 1, a, b, c + L[n]) + 10;

        int[] maxArray = new int[]{dfsNull, dfsA, dfsB, dfsC};
        return Arrays.stream(maxArray).min().getAsInt();
    }

}
