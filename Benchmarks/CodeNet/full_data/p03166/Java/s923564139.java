import java.io.*;
import java.math.*;
import java.util.*;
public class Main { 

	public static void main(String[] args) { //O(N) space and O(M) time for dp question
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int M = input.nextInt();
		long[] dp = new long[N+1];
		long ans = 0;
		for (int i = 0; i < M; i++) {
			int A = input.nextInt();
			int B = input.nextInt();
			dp[B]=dp[A]+1;
			ans=Math.max(ans, dp[B]);
		}
		System.out.println(ans);
	}	
}