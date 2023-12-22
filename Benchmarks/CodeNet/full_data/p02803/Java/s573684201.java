

import java.io.*;
import java.math.BigInteger;
import java.util.*;
import java.util.Stack;


public class Main{
	public static class FastReader {
		BufferedReader br;
		StringTokenizer root;
		
 
		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
 
		String next() {
			while (root == null || !root.hasMoreTokens()) {
				try {
					root = new StringTokenizer(br.readLine());
				} catch (Exception r) {
					r.printStackTrace();
				}
			}
			return root.nextToken();
		}
 
		int nextInt() {
			return Integer.parseInt(next());
		}
 
		double nextDouble() {
			return Double.parseDouble(next());
		}
 
		long nextLong() {
			return Long.parseLong(next());
		}
 
		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (Exception r) {
				r.printStackTrace();
			}
			return str;
		}
	}
	
	public static PrintWriter out = new PrintWriter (new BufferedOutputStream(System.out));
	static int mod = (int) (1e9+7);
	static long cf = 998244353;
    static final long MAX = (long) 1e15;
    public static List<Integer>[] edges;
    public static int[][] parent;
    public static int col = 32;
    public static int[] Bit;
    public static long[] dp;
    
	public static void main(String[] args) {
	
	
	FastReader sc = new FastReader();
	
	int n = sc.nextInt();
	int m = sc.nextInt();
	char[][] tab = new char[n][m];
	for(int i=0;i<n;++i) 
		tab[i] = sc.next().toCharArray();
	int ans = 0;
	for(int i=0;i<n;++i) {
		for(int j=0;j<m;++j) {
			if(tab[i][j] != '#')
			ans = Math.max(ans, bfs(i,j,n,m,tab));
		}
	}
	out.print(ans);
	
	out.close();
	}

	static int[] dx = {0,-1,0,1};
	static int[] dy = {-1,0,1,0};
	
	private static int bfs(int i, int j, int n, int m, char[][] tab)  {
		boolean[][] vis = new boolean[n][m];
		Queue<Node> q = new LinkedList<>();
		int ans = 0;
		q.add(new Node(i,j,0));
		vis[i][j] = true;
		while(q.size() > 0) {
			Node node = q.poll();
			for(int k=0;k<4;++k) {
				int x = node.x+dx[k];
				int y = node.y+dy[k];
				if(x<0 || y<0 || x>=n || y>=m || tab[x][y] == '#' || vis[x][y]) continue;
				vis[x][y] = true;
				q.add(new Node(x,y,node.d+1));
				
			}
			//out.println(node.x+" "+node.y+" , "+node.d);
			ans = Math.max(ans,node.d);
		}
		return ans;
	}
	static class Node{
		int x;
		int y;
		int d;
		Node(int x,int y,int d){
			this.x =x;
			this.y = y;
			this.d = d;
		}
	}
	
}