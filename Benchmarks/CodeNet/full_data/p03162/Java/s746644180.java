import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            c[i] = sc.nextInt();
        }
        //long start = System.nanoTime();
        System.out.println(solve(n, a,b,c));
        //long end = System.nanoTime();
        //System.err.println("execution time: " + ((end-start)/1_000_000) + "ms");
    }
    private static int solve(int n, int[] a, int[] b, int[] c) {
        int[][] dp = new int[n][3];
        dp[0][0] = a[0];
        dp[0][1] = b[0];
        dp[0][2] = c[0];
        for (int i = 1; i < n; i++) {
            for (int j = 0; j <3; j++) {
                for (int k = 0; k < 3; k++) {
                    if(k != j) {
                        dp[i][j] = Math.max(dp[i][j], dp[i-1][k] + compute(j,a,b,c)[i]);
                    }
                }
            }
        }
        return Math.max(dp[n-1][0], Math.max(dp[n-1][1], dp[n-1][2]));
    }
    private static int[] compute(int choice, int[] a, int[] b, int[] c) {
        switch (choice) {
            case 0: return a;
            case 1: return b;
            case 2: return c;
            default: return a;
        }
    }
}
