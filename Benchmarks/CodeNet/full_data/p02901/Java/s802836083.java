import java.util.*;class Main{public static void main(String[] $){Scanner s=new Scanner(System.in);int INF=(int)1e9;int N=s.nextInt();int M=s.nextInt();
        int[] a = new int[M];
        int[] b = new int[M];
        int[][] c = new int[M][];
        for (int i = 0; i < M; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            c[i] = new int[b[i]];
            for (int j = 0; j < b[i]; j++) {
                c[i][j] = sc.nextInt() - 1;
            }
        }
        int[] dp = new int[1 << N];
        Arrays.fill(dp, INF);
        dp[0] = 0;
        for (int i = 0; i < M; i++) {
            int s = 0;
            for (int j = 0; j < b[i]; j++) {
                s |= 1 << c[i][j];
            }
            for (int k = 0; k < 1 << N; k++) {
                dp[k | s] = Math.min(dp[k | s], dp[k] + a[i]);
            }
        }
        System.out.println(dp[(1 << N) - 1] == INF ? -1 : dp[(1 << N) - 1]);
    }
}