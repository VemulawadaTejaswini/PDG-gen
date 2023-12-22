/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader br=  new BufferedReader(new InputStreamReader(System.in));
		
		String[] in = br.readLine().split(" ");
		int n = Integer.parseInt(in[0]);
// 		int k = Integer.parseInt(in[1]);
		
// 		StringBuilder str = new StringBuilder();
		int[][] arr=  new int[n][3];
		for(int i=0;i<n;i++){
		    in = br.readLine().split(" ");
		    arr[i][0] = Integer.parseInt(in[0]);
		    arr[i][1] = Integer.parseInt(in[1]);
		    arr[i][2] = Integer.parseInt(in[2]);
		}
		int ans = Math.max(arr[0][0],Math.max(arr[0][1],arr[0][2]));
		for(int i=1;i<n;i++){
		    arr[i][0] += Math.max(arr[i-1][1],arr[i-1][2]);
		    arr[i][1] += Math.max(arr[i-1][0],arr[i-1][2]);
		    arr[i][2] += Math.max(arr[i-1][0],arr[i-1][1]); 
		    if(i==n-1){
		        ans = Math.max(arr[i][0],Math.max(arr[i][1],arr[i][2]));
		    }
		}
        System.out.println(ans);
	}
}
