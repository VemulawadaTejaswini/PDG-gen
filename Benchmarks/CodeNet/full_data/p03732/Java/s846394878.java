import java.util.Scanner;

public class Main {

    static int w[];
    static int v[];
    static int W;
    static int N;
    static int dp[][];

    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        W = scanner.nextInt();
        w = new int[N];
        v = new int[N];
        for (int i = 0;i < N;++i){
            w[i] = scanner.nextInt();
            v[i] = scanner.nextInt();
        }
        dp = new int[N][W + 1];
        for (int i = 0;i < N;++i){
            for (int j = 0;j < W + 1;++j){
                dp[i][j] = -1;
            }
        }
        dodp(0,0,0);
        System.out.println(dp[N - 1][W]);
    }

    public static void dodp(int nowPos,int nowWeight,int nowValue){
        if(nowPos >= N)return;
        int newWeight = nowWeight + w[nowPos];
        int newValue = nowValue + v[nowPos];
        if(newWeight <= W && dp[nowPos][newWeight] < newValue) {
            dp[nowPos][newWeight] = newValue;
            for (int i = newWeight + 1; i <= W; ++i) {
                if (dp[nowPos][i] > newValue) break;
                dp[nowPos][i] = newValue;
            }
            dodp(nowPos + 1, newWeight, newValue);
        }
        if(nowWeight <= W && dp[nowPos][nowWeight] < nowValue){
            dp[nowPos][nowWeight] = nowValue;
            for (int i = nowWeight + 1; i <= W; ++i) {
                if (dp[nowPos][i] > nowValue) break;
                dp[nowPos][i] = nowValue;
            }
            dodp(nowPos + 1,nowWeight,nowValue);
        }
    }

}

