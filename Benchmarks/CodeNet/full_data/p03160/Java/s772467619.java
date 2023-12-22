import java.util.*;
import java.io.*;

public class Main{
    static int answer(int[] A, int n){
        int[] dp = new int[n];
        dp[n-1] = 0;
        dp[n-2] = Math.abs(A[n-1] - A[n-2]);
        for(int i=n-3;i>=0;i--){
            dp[i] = Math.min(dp[i+2]+Math.abs(A[i+2]-A[i]),dp[i+1]+Math.abs(A[i+1]-A[i]) );
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
        int[] A = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i = 0;i<n;i++){
                A[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(answer(A,n));
    }
}
