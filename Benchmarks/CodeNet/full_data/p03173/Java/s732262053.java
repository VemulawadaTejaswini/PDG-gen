import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		long[] psa = new long[N+1];
		psa[0] = 0;
		for(int i=1; i<=N; i++) {
			psa[i] = Integer.parseInt(st.nextToken()) + psa[i-1];
		}

		long[][] dp = new long[N][N];
		for(int i=N-1; i>=0; i--) {
			for(int j=i+1; j<N; j++) {
				dp[i][j] = Long.MAX_VALUE;
				for(int k=i; k<j; k++) {
					dp[i][j] = Math.min(dp[i][j], dp[i][k]+dp[k+1][j]+psa[j+1]-psa[i]);
				}
				//dp[i][j] += ;
			}
		}
		System.out.println(dp[0][N-1]);
	}
}
