import java.util.*;

class Main{
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)arr[i] = scan.nextInt();
        scan.close();
        int[] dp = new int[n+1];
        Arrays.fill(dp,1000000005);
        dp[0] = 0;
        for(int i= 0;i<n;i++){
            int n1 = i+1;
            int n2 = i+2;
            if(n1 < n){
                dp[n1] = Math.min(dp[n1],dp[i] + Math.abs(arr[i] - arr[n1]));
            }
            if(n2 < n){
                dp[n2] = Math.min(dp[n2],dp[i] + Math.abs(arr[i] - arr[n2]));
            }
        }
        System.out.println(dp[n-1]);
        }
}
