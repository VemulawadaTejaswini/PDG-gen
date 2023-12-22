import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
            int num = scn.nextInt();
            int arr[] = new int[num];
            for(int i = 0 ; i < num;i++){
                arr[i]= scn.nextInt();
            }
//        int num = 6;
//        int arr[] = {30, 10, 60, 10, 60, 50};

        int dp[] = new int[num];
        Arrays.fill(dp, (int) 2e9);
        System.out.println(minCostJump(arr, dp));


    }

    private static int minCostJump(int[] arr, int[] dp) {
        dp[0]=0;
        int n  = arr.length;
        for(int i=0;i<n;i++) {
            for (int j = 1; j <= 2; j++) {
                if (i + j < n)
                    dp[i + j] = Math.min(dp[i + j], (dp[i] + Math.abs(arr[i + j] - arr[i])));
            }
        } return dp[arr.length-1];
    }
}