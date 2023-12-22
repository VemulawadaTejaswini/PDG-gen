import java.util.*;
import java.io.*;

public class Main {
	
	static int n;
	static ArrayList<Integer>[] adjList;
	static int[] counter, value;
	static boolean[] vis;
	
	public static void dfs(int u, int c) {
		vis[u] = true;
		c += counter[u];
		value[u] = c;
		
		for(int v : adjList[u])
			if(!vis[v])
				dfs(v, c);
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		int q = Integer.parseInt(st.nextToken());
		
		adjList = new ArrayList[n];
		for(int i = 0; i < n; i++)
			adjList[i] = new ArrayList<Integer>();
		
		for(int i = 0; i < n - 1; i++) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken()) - 1, v = Integer.parseInt(st.nextToken()) - 1;
			adjList[u].add(v);
			adjList[v].add(u);
		}
		
		counter = new int[n];
		for(int i = 0; i < q; i++) {
			st = new StringTokenizer(br.readLine());
			counter[Integer.parseInt(st.nextToken()) - 1] += Integer.parseInt(st.nextToken());
		}
		
		value = new int[n];
		vis = new boolean[n];
		dfs(0, 0);
		
		for(int i = 0; i < n; i++)
			pw.print(value[i] + (i == n - 1 ? "\n" : " "));
		
		pw.flush();
		pw.close();
	}
}
