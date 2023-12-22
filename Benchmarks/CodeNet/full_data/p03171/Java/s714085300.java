import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main{
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		
		int[] a = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		
		long[][] dp = new long[N+1][N+1];
		
		for(int i=N-1; i>=0; i--) {
			for(int j=i; j<N; j++) {
				if(i==j) {
					dp[i][j] = a[i];
				}else {
					dp[i][j] = Math.max(a[i] - dp[i+1][j], a[j] - dp[i][j-1]);
				}
			}
		}
		System.out.println(dp[0][N-1]);
		
	}
}
