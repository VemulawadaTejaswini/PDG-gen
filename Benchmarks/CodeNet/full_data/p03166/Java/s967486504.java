import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

// 1 2 3 2 3 3
// 3 3 3 1 2 2

public class Main {
	static int vert=100005;
static boolean visited[];
static int dp[];
static ArrayList<Integer>[] adj;
public static void visit(int src) {
	visited[src]=true;
	dp[src]=0;
	for(int i=0;i<adj[src].size();i++) {
		if(!visited[adj[src].get(i)]) {
			visit(adj[src].get(i));
		}
		dp[src]=Math.max(dp[src], 1+dp[adj[src].get(i)]);
	}
	
}

	public static void main (String[] args) {
		visited=new boolean[vert];
		dp=new int[vert];
		adj=new ArrayList[vert];
		
	FastScanner sc=new FastScanner();
	int n=sc.nextInt(),m=sc.nextInt();

	for(int i=1;i<=n;i++) adj[i]=new ArrayList<Integer>();
	
	for(int i=0;i<m;i++) {
		int x=sc.nextInt(),y=sc.nextInt();
		//System.out.println(x+" "+y);
		adj[x].add(y);
	}

	int ans=0;
	for(int i=1;i<=n;i++) {
		if(!visited[i]) {
			visit(i);
		}
	}
	for(int i=1;i<=n;i++)
	ans=Math.max(dp[i], ans);
	
	System.out.println(ans);
	
		    	
		    }

	static class FastScanner {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");
		String next() {
			while (!st.hasMoreTokens())
				try {
					st=new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}
		
		int nextInt() {
			return Integer.parseInt(next());
		}
		int[] readArray(int n) {
			int[] a=new int[n];
			for (int i=0; i<n; i++) a[i]=nextInt();
			return a;
		}
		long nextLong() {
			return Long.parseLong(next());
		}
}

		    
		}