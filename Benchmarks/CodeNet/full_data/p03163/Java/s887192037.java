
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.TreeMap;


public class Main {
	static long[][] memo;

	public static long dp2(int[] weights, long[] values, int i, int N, int W, int curW) {
		if(i>=N || curW>W)
			return 0;
		long take;
		long leave;
		if(memo[curW][i]!=-1)
			return memo[curW][i];
		else {
			take = values[i]+dp2(weights,values,i+1,N,W,curW+weights[i]);
			leave = dp2(weights,values,i+1,N,W,curW);
		}
		if(weights[i]+curW>W)
			take = -1;
		return memo[curW][i] = (take>leave)?take:leave;
		
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int W = Integer.parseInt(st.nextToken());
		int w;
		long v;
		memo = new long[W+1][N];
		for (long[] i : memo) {
			Arrays.fill(i, -1);
		}
		int[] weights = new int[N];
		long[] values = new long[N];

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			w = Integer.parseInt(st.nextToken());
			v = Long.parseLong(st.nextToken());
			weights[i] = w;
			values[i] = v;
		}
//		System.out.println(dp(weights, values, 0, N, W).getValue());
		System.out.println(dp2(weights, values, 0, N, W,0));
	}

}
