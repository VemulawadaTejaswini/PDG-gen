import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		double[] p = new double[N];
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			p[i] = Double.parseDouble(st.nextToken());
		}
		
		double[][] dp = new double[N+1][N+1];
		dp[0][0] = 1;
		dp[1][1] = p[0];
		for(int tosses=1; tosses<=N; tosses++) {
			dp[tosses][0] = dp[tosses-1][0] * (1-p[tosses-1]);
			for(int heads=1; heads<=N; heads++) {
				dp[tosses][heads] = dp[tosses-1][heads-1]*p[tosses-1] + (1-p[tosses-1])*dp[tosses-1][heads]; 
			}
		}
		
		double ans = 0;
		for(int i=N/2+1; i<=N; i++) {
			ans += dp[N][i];
		}
		System.out.println(ans);
		
		
		
		
	}
}
