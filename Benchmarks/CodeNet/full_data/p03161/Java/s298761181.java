import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k =s.nextInt();
        int arr[] = new int[n];
        for(int i= 0;i<n;i++){
            arr[i] = s.nextInt();
        }
        int dp[] = new int[n];
        dp[0] = 0;
        for(int i= 1;i<n;i++){
            int min = 1000000007;
            for(int j = i-1;j>=0 && j>=(i-k);j--){
                min = Math.min(Math.abs(arr[i] - arr[j])+dp[j],min);
            }
            dp[i] = min;
        }
        System.out.println(dp[n-1]);
    }
}
