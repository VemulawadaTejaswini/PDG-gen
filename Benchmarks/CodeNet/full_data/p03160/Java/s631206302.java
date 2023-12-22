import java.util.*;
import java.io.*;
public class Main {
 
 public static int frog(int arr[], int i, int prev,int[] dp){
     if(i >= arr.length)
           return 0;
     if(i == arr.length-1)
         return Math.abs(arr[prev]- arr[i]);
   if(dp[i] > -1)
     return dp[i];
     int a = 0; int b = 0;
     if(prev == -1){
        return Math.min(0+frog(arr,i+1,0,dp),0+frog(arr,i+2,0,dp));
     }
    
     else{
            // System.out.println(arr[prev]+ " - " + arr[i] );
             a =   Math.abs(arr[prev] - arr[i]) + frog(arr,i+1,i,dp);
             b =   Math.abs(arr[prev] - arr[i]) + frog(arr,i+2,i,dp);
     
     }
  
 return dp[i] = Math.min(a,b);
  
 }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n+1];
        StringTokenizer str  = new StringTokenizer(br.readLine()," ");
        int i = 0;
        while(str.hasMoreTokens()){
            arr[i] = Integer.parseInt(str.nextToken());
            i++;
        }
        
           int[] dp = new int[arr.length];
           Arrays.fill(dp,-1);
            System.out.println(frog(arr,0,-1,dp));
        
        
    }
    
}
