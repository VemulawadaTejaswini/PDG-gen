import java.util.*;
import java.lang.*;
import java.io.*;


public class Main
{   
    static int h[];
    static int dp[];
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scan = new Scanner(System.in);
		int sz = scan.nextInt();
		int k = scan.nextInt();
		h = new int[sz];
		dp = new int[sz];
		for(int i = 0; i < sz; i++) h[i] = scan.nextInt();
		dp[0] = 0;
		dp[1] = Math.abs(h[1] - h[0]);
		for(int i = 2; i < sz; i++){
		    int min = Integer.MAX_VALUE;
		    for(int j = 1; i - j >= 0 && j <= k; j++)
		    min = Math.min(dp[i - j] + Math.abs(h[i] - h[i - j]), min);
		    dp[i] = min;
		}
		System.out.println(dp[sz - 1]);
	}
}