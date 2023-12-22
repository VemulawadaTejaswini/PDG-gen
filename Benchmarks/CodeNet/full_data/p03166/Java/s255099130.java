import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	static int n, k;
	static int[][] arr;
	static int[] memo;
	static boolean f = false;
	static boolean t = false;
	static int OO = (int) 1e18;
	static ArrayList<Integer>[] adjList;
	static boolean[] vis;

	static int dp(int u) {

		if (memo[u] != -1)
			return memo[u];
		int ans = 0;

		for (int nxt : adjList[u])
			ans = Math.max(dp(nxt) + 1, ans);
		return memo[u] = ans;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);

		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		adjList = new ArrayList[n];
		for (int i = 0; i < n; i++)
			adjList[i] = new ArrayList<Integer>();

		while (k-- > 0) {
			st = new StringTokenizer(br.readLine());
			adjList[Integer.parseInt(st.nextToken()) - 1].add(Integer.parseInt(st.nextToken()) - 1);

		}

		memo = new int[n + 1];
		Arrays.fill(memo, -1);
		int max = -1;
		for (int i = 0; i < n; i++)
			max = Math.max(max, dp(i));
		pw.println(max);

		pw.close();
	}
}
