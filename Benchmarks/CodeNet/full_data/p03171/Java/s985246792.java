import java.util.Scanner;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        long[][] dp = new long[n][n];
        int parity = n%2;
        long s = sum(arr,0,n-1,dp,parity,parity);

        System.out.println(s);
    }
    private static long sum(int[] arr, int i, int j, long[][] dp, int parity, int currParity){
        if(i>j) return 0;
        if(i==j){
            if(parity!=currParity)
                return -arr[i];
            else
                return arr[i];
        }
        if(dp[i][j]!=0) return  dp[i][j];
        if(currParity==parity)
            return dp[i][j] = Math.max(sum(arr,i+1,j,dp,parity,~currParity )+arr[i],sum(arr,i,j-1,dp,parity,~currParity )+arr[j]);
        return dp[i][j] = Math.min(sum(arr,i+1,j,dp,parity,~currParity )-arr[i],sum(arr,i,j-1,dp,parity,~currParity )-arr[j]);

    }
}
