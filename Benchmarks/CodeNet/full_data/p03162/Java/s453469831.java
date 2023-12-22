
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] arr = new int[N+1000][3];
        int[][] memo = new int[N+1000][3];

        for (int i = 0; i < N; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
            arr[i][2] = sc.nextInt();
            memo[i][0]=-1;
            memo[i][1]=-1;
            memo[i][2]=-1;
        }
//        int[][] dp = new int[N+1000][3];
//        for (int i = 0; i <dp.length ; i++) {
//            dp[i] = Integer.MAX_VALUE;
//        }

//        dp[1][0] = arr[0][0];
//        dp[1][1] = arr[0][1];
//        dp[1][2] = arr[0][2];
//
//        for (int i = 1; i <= N-1 ; i++) {
//            //A
//            dp[i+1][0]=Math.max(dp[i][1],dp[i][2]) + arr[i][0];
//            dp[i+1][1]=Math.max(dp[i][0],dp[i][2]) + arr[i][1];
//            dp[i+1][2]=Math.max(dp[i][0],dp[i][1]) + arr[i][2];
//        }
//
//        System.out.println(Math.max(Math.max(dp[N][0],dp[N][1]),dp[N][2]));

        System.out.println(recur(arr,memo,N));

    }

    static public int recur(int[][] arr,int[][] memo,int N){
        return Math.max(
                    Math.max(
                        recur(arr,memo,N, 0),
                        recur(arr,memo,N, 1)),
                    recur(arr,memo,N, 2)
                );
    }

    static public int recur(int[][] arr,int[][] memo, int idx, int type){
        if(memo[idx][type]!=-1) return memo[idx][type];
        if(idx ==0){
            return arr[0][type];
        }

        int  max = 0;
        for (int i = 0; i < 3; i++) {
            if(i!=type){
                max = Math.max(max,recur(arr,memo,idx-1, i));
            }
        }
        max += arr[idx][type];

        memo[idx][type] =max;
        return max;
    }


}