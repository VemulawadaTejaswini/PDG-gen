import java.util.Scanner;

public class DP1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }

        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1]= Math.abs(arr[1]-arr[0]);

        for(int i=2;i<n;i++){

            int x = Math.abs(arr[i]-arr[i-2]);
            int y = Math.abs(arr[i]-arr[i-1]);

            dp[i] = Math.min((dp[i-2]+x),(dp[i-1]+y));


        }


        System.out.println(dp[n-1]);
    }
}
