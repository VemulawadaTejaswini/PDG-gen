import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    static int N, W;
    static int[][] item;
    static long[][] dp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Reader sc = Reader();
        N = sc.nextInt();
        W = sc.nextInt();
        PrintWriter pw = new PrintWriter(System.out);

        item = new int[N+1][2];

        for(int i=1; i<=N; ++i) {
            item[i][0] = sc.nextInt();
            item[i][1] = sc.nextInt();
        }

        pw.println(Knapsack_1(N, W, item));
        pw.close();
    }

    public static void d0(long[][] dp) {
        System.out.print("    ");

        for(int j=0; j<dp[0].length; ++j){
            System.out.printf("%3d ", j);
        }
        System.out.println();

        for(int i=0; i<dp.length; ++i){
            System.out.printf("%3d|", i);
            for(int j=0; j<dp[0].length; ++j){
                System.out.printf("%3d ", dp[i][j]);
            }
            System.out.println();
        }
    }

    public static int myMax(int a, int b) {
        if(a>b)
            return a;

        return b;
    }

    public static long Knapsack_1(int N, int W, int[][] item) {
        dp = new long[N+1][W+1];

        for(int i=1; i<=N; ++i) {
            for(int w=1; w<=W; ++w) {
                if(item[i][0] <= w) {
                    dp[i][w] = Math.max(dp[i-1][w], dp[i-1][w-item[i][0]] + item[i][1]);
//                    dp[i][w] = myMax(dp[i-1][w], dp[i-1][w-item[i][0]] + item[i][1]);
                }
                else {
                    dp[i][w] = dp[i-1][w];
                }
            }
        }

//        d0(dp);

        return dp[N][W];
    }
}
