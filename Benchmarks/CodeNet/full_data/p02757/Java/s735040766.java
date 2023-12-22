import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int p = scan.nextInt();
		char[] s = scan.nextLine().toCharArray();
		int[][] dp = new int[n][p];
		
		long count = 0;
		dp[0][transpile(s[0]) % p] = 1;
		count += dp[0][0];
		
		for(int i = 1;i < n;i ++) {
			int num = transpile(s[i]);
			for
		}
	}
	
	public static int transpile(char c) {
		return c - '0';
	}
}