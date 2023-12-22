import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int W = Integer.parseInt(sc.next());
        int[] wi = new int[N];
        int[] vi = new int[N];
        int[][] wivi = new int[W+1][N];

        for (int i = 0; i < N; i++) {

            wi[i] = Integer.parseInt(sc.next());
            vi[i] = Integer.parseInt(sc.next());
        }
        sc.close();

        //dpとナップサックに関連付けをしたい
        long[] dp = new long[W + 1];

        dp[0] = 0;

        for (int i = 0; i <= W; i++) {

            long max = 0;

            for (int j = 0; j < N; j++) {

                wivi[i][j] = 0;

                if (wi[j] <= i) {

                    if(max < (dp[i - wi[j]] + vi[j]) && wivi[i - wi[j]][j] == 0) {

                        max = (dp[i - wi[j]] + vi[j]);

                        //wivi[i]を初期化
                        for (int k = 0; k < N; k++) {

                            wivi[i][k] = 0;
                        }

                        //重複させないようにする
                        wivi[i][j] = -1;
                    };
                }
            }

            dp[i] = max;
        }

        System.out.println(dp[W]);

    }

}