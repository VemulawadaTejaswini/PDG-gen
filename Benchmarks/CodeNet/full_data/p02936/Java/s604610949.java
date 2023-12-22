

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;



public class Main {
	static final int INF = (int) (1e9 + 10);
	static final int MOD = (int) (1e9 + 7);
	static final int N = (int) (4e5 + 5);
	static ArrayList<Integer>[] graph;
	static int st[];
	static int en[];
	static int ma[];
	static boolean visited[];
	static int c = 1;

	public static void dfs(int v, int p) {
		visited[v] = true;
		ma[c] = v;
		st[v] = c;
		c++;
		for (int u : graph[v]) {
			if (u == p)
				continue;
			dfs(u, v);
		}
		en[v] = c;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		FastReader sc = new FastReader();
		PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// Scanner scn = new Scanner(System.in);
		//
		int n = sc.nextInt();
		int q = sc.nextInt();
		graph = new ArrayList[n + 1];
		for (int i = 1; i <= n; i++)
			graph[i] = new ArrayList<>();
		for (int i = 0; i < (n - 1); i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			graph[a].add(b);
			graph[b].add(a);
		}
		st = new int[n + 1];
		en = new int[n + 1];
		ma = new int[n + 2];
		visited = new boolean[n + 1];
		//System.out.println("fg");
		dfs(1, -1);
//		for (int i = 1; i <= n; i++) {
//			System.out.println(i + " " + st[i] + " " + en[i]);
//		}
		int arr[]=new int[n+2];
		while(q-->0)
		{
			int a=sc.nextInt();
			int b=sc.nextInt();
			arr[st[a]]+=b;
			arr[en[a]]-=b;
		}
		
		
		for(int i=1;i<=n;i++)
		{	arr[i]+=arr[i-1];
		System.out.print(arr[i]+" ");
		}
	}

	
	
	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}

}
