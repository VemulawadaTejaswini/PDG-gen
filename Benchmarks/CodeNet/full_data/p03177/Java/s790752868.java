import java.util.*;
import java.io.*;
public class Main {
    public static int mod = 1000000007;
    public static long[][] multiply(long arr1[][] , long arr2[][]){
        long ans[][] = new long[arr1.length][arr2.length];

        for(int i = 0 ; i < arr1.length ; i++){
            for(int j = 0 ; j < arr2.length ; j++){
                for(int k = 0 ; k < arr1.length ; k++){
                    ans[i][j] = (ans[i][j] + arr1[i][k]*arr2[k][j]) % mod;
                }
            }
        }
        return ans;
    }
    public static long[][] power(long arr[][] , long k){
        if(k == 1){
            return arr;
        }
        long res[][] = power(arr , k/2);
        if(k%2 == 0){
            return (multiply(res , res));
        }else{
            return (multiply(arr , multiply(res , res)));
        }
    }
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        long k = s.nextLong();
        long arr[][] = new long[n][n];
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                arr[i][j] = s.nextLong();
            }
        }
        long dp[][] = power(arr , k);

        long ans = 0;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                ans = (ans + dp[i][j])%mod;
            }
        }
        System.out.println(ans);
    }
}