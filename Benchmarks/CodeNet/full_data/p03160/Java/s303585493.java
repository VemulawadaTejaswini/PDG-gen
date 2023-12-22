import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{   
    static int h[];
    static int dp[];
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int sz = scan.nextInt();
		h = new int[sz];
		dp = new int[sz];
		for(int i = 0; i < sz; i++) h[i] = scan.nextInt();
		dp[0] = 0;
		dp[1] = Math.abs(h[1] - h[0]);
		for(int i = 2; i < sz; i++){
		   // int min = Integer.MAX_VALUE;
		    dp[i] = Math.min(dp[i - 1] + Math.abs(h[i] - h[i - 1]), dp[i - 2] + Math.abs(h[i] - h[i - 2]));
		 //   dp[i] = min;
		}
		System.out.println(dp[sz - 1]);
	}
}
