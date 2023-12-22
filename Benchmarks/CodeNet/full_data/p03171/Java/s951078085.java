
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
   static int check(int i,int j, int arr[], int dp[][]) {
        if(i>j) return 0;
        if(i==j) return arr[i];
        
        if (j == i + 1) return Math.max(arr[i],arr[j]);
        if(dp[i][j]!=-1) return dp[i][j];
       int k1 = 
       arr[i]+Math.min(check(i+2,j,arr,dp),check(i+1,j-1,arr,dp));
       int k2 = arr[j]+
       Math.min(
           check(i+1,j-1,arr,dp),check(i,j-2,arr,dp));
        dp[i][j] =  Math.max(k1,k2);          
        //System.out.println(k1+" "+k2);
        return dp[i][j];
    }
	public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		
		    int n = s.nextInt();
		   // int k =s.nextInt();
		    int turn =0;
		    int arr[] = new int[n];
		    int dp[][] = new int[n][n];
		    for (int brr[]:dp) {
		        Arrays.fill(brr,-1);
		    }
		    for (int i =0; i<n ;i++) {
		        arr[i] = s.nextInt();
		    }
		   
		  
 		    System.out.println(check(0,n-1,arr,dp));
			
	}
}