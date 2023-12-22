import java.util.*;
import java.io.*;

public class Main{
    static int answer(int[] A, int n, int k){
        int[] dp = new int[n];
        dp[n-1] = 0;
        dp[n-2] = Math.abs(A[n-1] - A[n-2]);
        for(int i=n-3;i>=0;i--){
            int min = dp[i+1]+Math.abs(A[i+1]-A[i]);
            for(int j=2;j<=k;j++){
                if(i+j < n){
                    min = Math.min(dp[i+j]+Math.abs(A[i+j]-A[i]),min);
                }
                else{
                    break;                
                }            
            } 
            dp[i] = min;
        }
        // for(Integer i:dp){
        //     System.out.print(i+" ");
        // }
        return dp[0];
    }
    public static void main(String[] args) throws IOException{ 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] A = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i = 0;i<n;i++){
                A[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(answer(A,n,k));
    }
}
