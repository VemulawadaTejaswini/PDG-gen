import java.util.*;

public class Main {

    private static int N;
    private static int MA;
    private static int MB;
    private static Drag[] D;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        MA = sc.nextInt();
        MB = sc.nextInt();
        D = new Drag[N];
        for (int i = 0; i < N; i++) {
            D[i] = new Drag(sc.nextInt(), sc.nextInt(), sc.nextInt());
        }
        System.out.println(solve());
    }

    private static final int INF = 1_000_000;

    static int solve() {
        int[][][] dp = new int[N+1][N*10+1][N*10+1];
        for (int i = 0; i < N+1; i++) {
            for (int j = 0; j < N*10+1; j++) {
                Arrays.fill(dp[i][j], INF);
            }
        }
        dp[0][0][0] = 0;

        for (int i = 1; i <= N; i++) {
            Drag d = D[i-1];

            for (int a = 0; a <= N*10; a++) {
                for (int b = 0; b <= N*10; b++) {
                    int prev = dp[i-1][a][b];
                        // 追加購入
                    if( a + d.a <= N*10 && b + d.b <= N*10 ) {
                        dp[i][a+d.a][b+d.b] = Math.min(dp[i-1][a+d.a][b+d.b], prev + d.cost);
                    }

                    // 買わない
                    dp[i][a][b] = Math.min(prev, dp[i][a][b]);
                }
            }
        }

        // MA:MBになる場所で一番コストの少ない箇所を探す
        int n = 1;
        int cost = INF;
        while(true) {
            int a = n * MA;
            int b = n * MB;
            if( a > N*10 || b > N*10 ) break;

            if( Math.min(dp[N][a][b], cost) != 0 ) {
                cost = Math.min(dp[N][a][b], cost);
            }
            n++;
        }

        if( cost == INF ) return -1;
        else return cost;
    }

    private static class Drag {
        private final int a;
        private final int b;
        private final int cost;

        public Drag(int a, int b, int cost) {
            this.a = a;
            this.b = b;
            this.cost = cost;
        }
    }
}
