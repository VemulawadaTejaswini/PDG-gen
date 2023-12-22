import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] height = new int[n];
		int[] index = new int[n+1];
		int[] beauty = new int[n];

		String[] s = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			height[i] = Integer.parseInt(s[i]);
			index[height[i]] = i;
		}
		s = br.readLine().split(" ");
		for (int i = 0; i < n; i++)
			beauty[i] = Integer.parseInt(s[i]);
		
		long[] dp = new long[n];
		
		for (int i = 0 ; i < n;i++) {			
			long max = 0;
			for (int j = i; j >= 0; j--) {
				if (height[j] < height[i] && dp[j] > max)
					max = dp[j];
			}
			dp[i] = beauty[i] + max;
//			System.out.print(dp[i] + " ");
		}

//		System.out.println();
		System.out.println(dp[n-1]);
	}

}
