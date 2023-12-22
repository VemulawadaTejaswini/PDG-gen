import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        sc.close();

        //この問題で考えられる貨幣
        int[] coin = {1,6,9,36,81,216,729,1296,6561,7776,46656,59049};

        int[] dp = new int[100000+1];

        dp[0] = 0;

        for (int i = 1; i <= N; i ++) {

            int min = Integer.MAX_VALUE;

            for (int j = 0; j < coin.length; j++ ) {

                if (i >= coin[j]) {
                	//全貨幣の中から最適な支払いパターンを検索する
                    min = Math.min(min, Math.min(dp[i-1] + 1, dp[i-coin[j]] +1));
                }
            }

            dp[i] = min;
        }

        System.out.println(dp[N]);
    }

}
