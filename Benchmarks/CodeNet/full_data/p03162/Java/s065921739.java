import java.util.Scanner;

public class Main {
    public static boolean debug = true;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] input = new int[n][3];
        for(int i=0;i<n;i++){
            input[i][0] = sc.nextInt();
            input[i][1] = sc.nextInt();
            input[i][2] = sc.nextInt();
        }

        int[][] dp = new int[n][3];
        //Arrays.fill(dp, Integer.MAX_VALUE);

        for(int i=0;i<n;i++){
            if(i==0){
                dp[i][0] = input[i][0];
                dp[i][1] = input[i][1];
                dp[i][2] = input[i][2];
            }else{
                //System.out.println("for:" + dp[i-1][0] + "/" + dp[i-1][1] + "/" + dp[i-1][2]);

                dp[i][0] = Math.max(dp[i-1][1],dp[i-1][2])+input[i][0];
                dp[i][1] = Math.max(dp[i-1][0],dp[i-1][2])+input[i][1];
                dp[i][2] = Math.max(dp[i-1][0],dp[i-1][1])+input[i][2];
            }
        }
        //System.out.println(dp[n-1][0] + "/" + dp[n-1][1] + "/" + dp[n-1][2]);
        int ans = Math.max(Math.max(dp[n-1][0],dp[n-1][1]),dp[n-1][2]);
        System.out.println(ans);



    }
}