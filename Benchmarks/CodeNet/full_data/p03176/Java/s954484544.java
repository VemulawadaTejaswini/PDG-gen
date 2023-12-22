import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	
	static int N;
	static long[] bit;
	
	static void update(int x, int v){
		while(x <= N) {
			bit[x] = Math.max(bit[x], v);
			x += x&-x;
		}
	}
	
	static long query(int i) {
		long ans = 0;
		while(i > 0) {
			ans = Math.max(ans, bit[i]);
			i -= i&-i;
		}
		return ans;
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		N = Integer.parseInt(br.readLine());
		int[] h = new int[N]; int[] a = new int[N];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			h[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		
		long[] dp = new long[N+1];
		bit = new long[N+1];
		
		dp[0] = a[0];
		for(int i=1; i<N; i++) {
			dp[i] = query(h[i]) + a[i];
			update(a[i], h[i]);
		}
		
		long ans = 0;
		for(int i=1; i<=N; i++) {
			ans = Math.max(ans, dp[i]);
		}
		System.out.println(ans);
		
	}
}
