import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;


public class Main {
	static int[][] memo;;
	static int n;
	static int w;
	static int[] val;
	static int[] we;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		String[] str = br.readLine().split(" ");
		 n = Integer.parseInt(str[0]);
		 w = Integer.parseInt(str[1]);
		memo = new int[n][w+1];
		for (int i = 0; i < n; i++) {
			Arrays.fill(memo[i],-1);
		}
		
		val = new int[n];
		we = new int[n];
		for (int i = 0; i < n; i++) {
			str = br.readLine().split(" ");
			val[i] = Integer.parseInt(str[1]);
			we[i] = Integer.parseInt(str[0]);
		}
		out.println(dp(0, w));	
		out.flush();
	}
	public static int dp(int v,int w) {
		if(v == n)
			return 0;
		if(memo[v][w] != -1) {
			return memo[v][w];
		}
		int take = 0;
		int leave = dp(v+1, w);
		if(w-we[v] >= 0)
			take = dp(v+1, w-we[v])+val[v];
		return memo[v][w]= Math.max(take, leave);
	}

}

