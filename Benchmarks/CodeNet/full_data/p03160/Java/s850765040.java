import java.util.*;
import java.io.*;
import java.lang.*;

public class AFrog1{

    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer stk = new StringTokenizer("");

    public static void main(String args[]){
        try{
            int N = Integer.parseInt(bf.readLine());
            stk = new StringTokenizer(bf.readLine());
            int arr[] = new int[N];
            for(int i=0;i<N;i++){
                arr[i] = Integer.parseInt(stk.nextToken());
            }

            System.out.println(solver(arr,N));
            bf.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static int solver(int[] arr,int N){
        if(N <= 1)
            return 0;
            
        int dp[]  = new int[N];
        dp[0] = 0;

        for(int i=1;i<N;i++){
            dp[i] = Math.min(dp[i-1] + Math.abs(arr[i] - arr[i-1]) , (i-2 >= 0) ? (dp[i-2] + Math.abs(arr[i] - arr[i-2])) : Integer.MAX_VALUE );
        }
        return dp[N-1];
    }
}