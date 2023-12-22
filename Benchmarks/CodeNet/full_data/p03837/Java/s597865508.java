import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int M = Integer.parseInt(sc.next());
        int[] ai = new int[M];
        int[] bi = new int[M];
        int[] ci = new int[M];
        for (int i = 0; i < M; i++) {

            ai[i] = Integer.parseInt(sc.next());
            bi[i] = Integer.parseInt(sc.next());
            ci[i] = Integer.parseInt(sc.next());

        }
        sc.close();

        int max = 100000;

        //最大の距離は1000*99なのでintで足りるはず
        int[][] memo      = new int[N][N];//最短距離を記録するメモ

        //3重のfor文を用いて2点間の最小の値を探していくダイクストラ法
        for (int i = 0; i < N; i++) {

            for (int j = 0; j < N; j++) {

                if (i == j) {

                    memo[i][j] = 0;
                } else {

                    memo[i][j] = max;
                }
            }
        }
        //既知の経路を代入
        for (int i = 0; i < M; i++) {

            memo[ai[i]-1][bi[i]-1] = ci[i];
            memo[bi[i]-1][ai[i]-1] = ci[i];
        }

        //頂点1,2,・・N-1と頂点1+1,1+2,・・N,・2+1,2+2・・・N,・・・を結ぶ全パターンをメモ
        
        for (int n = 0; n < N; n++) {
        
            for (int i = 0; i < N; i++) {

                for (int j = 0; j < N; j++) {

                    for (int k = 0; k < N; k++) {

                        if (memo[i][j] > memo[i][k] + memo[j][k]) {

                            memo[i][j] = memo[i][k] + memo[j][k];
                            memo[j][i] = memo[i][k] + memo[j][k];
                        }

                    }
                }
            }
        }
        

        //使われなかった経路の本数
        int ans = 0;

        for (int i = 0; i < M; i++) {

            if (ci[i] > memo[ai[i]-1][bi[i]-1]) {

                ans++;
            }
        }

        System.out.println(ans);

    }
}