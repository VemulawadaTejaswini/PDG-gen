import java.io.*;
import java.math.*;
import java.util.*;
public class Main { 
 
	public static void main(String[] args) { 
		FastScanner I = new FastScanner(); //Input
		OutPut O = new OutPut(); //Output
		int N = I.nextInt();
		int M = I.nextInt();
		int ans = M; //Assuming all edges to be valid
		long[][] shortest = new long[N+1][N+1];
		int[][] weights = new int[N+1][N+1]; //weights[i][j] = weight of edge between 
		//vertex i and j (bidirectional)
		ArrayList<int[]>[][] used = new ArrayList[N+1][N+1]; //Each matrix cell
		//stores edges used for shortest path between i and j to be achieved
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				used[i][j] = new ArrayList<int[]>();
			}
		}
		boolean[][] vis = new boolean[N+1][N+1]; //When checking off distinct edges,
		//I will use this as a marker to make sure a certain edge is a new edge that is within
		//the shortest path between two vertices
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				shortest[i][j]=Integer.MAX_VALUE;
			}
		}
		for (int i = 0; i < M; i++) {
			int a = I.nextInt();
			int b = I.nextInt();
			int w = I.nextInt();
			weights[a][b] = w;
			weights[b][a] = w;
		    shortest[a][b]=w; //Assuming one edge path is shortest in the beginning of algorithm
		    shortest[b][a]=w;
		    int[] pair = {a,b};
		    used[a][b].add(pair);
		    used[b][a].add(pair);
		}
		for (int i = 1; i <= N; i++) shortest[i][i]=0; //Distance from vertex i to itself is 0
		for (int bet = 1; bet<=N; bet++) {
			for (int start = 1; start<=N; start++) {
				for (int end = 1; end<=N; end++) {
					if (shortest[start][bet]+shortest[bet][end]<shortest[start][end]) {
						//Strictly less because = length still counts as A shortest both
						//therefore all edges would be valid
						used[start][end]=new ArrayList<int[]>();
						used[end][start]=new ArrayList<int[]>();
						for (int chk = 0; chk < used[start][bet].size(); chk++) {
							used[start][end].add(used[start][bet].get(chk));
							used[end][start].add(used[start][bet].get(chk));
						}
						for (int chk = 0; chk < used[bet][end].size(); chk++) {
							used[start][end].add(used[bet][end].get(chk));
							used[end][start].add(used[bet][end].get(chk));
						}
						shortest[start][end]=shortest[start][bet]+shortest[bet][end];
					}
				}
			}
		}
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				for (int chk = 0; chk<used[i][j].size(); i++) {
					int[] pair = used[i][j].get(chk);
					int a = pair[0];
					int b = pair[1];
					if (!vis[a][b]) {
						vis[a][b]=true;
						vis[b][a]=true;
						ans--; //A new edge that contributes
					}
				}
			}
		}
		O.pln(ans);
	}
	public static ArrayList<String> perms(int N,int limit){
		if (N==1) {
			ArrayList<String> ret = new ArrayList<String>();
			for (int i = 0; i < limit; i++) {
				 ret.add(Integer.toString(i));
			}
			return ret;
		}
		ArrayList<String> prev = perms(N-1,limit);
		ArrayList<String> ret = new ArrayList<String>();
		for (int i = 0; i < prev.size(); i++) {
			String cur = prev.get(i);
			boolean[] vis = new boolean[10];
			for (int j = 0; j < cur.length(); j++) {
				int dig = Integer.parseInt(cur.substring(j,j+1));
				vis[dig]=true;
			}
			if (!vis[1]) {
				for (int next = 0; next < limit; next++) {
					if (!vis[next]) {
						String add = cur;
						add+=Integer.toString(next);
						ret.add(add);
					}
				}
			}else ret.add(cur); //Just use previous end on 1 sequence	
		}
		return ret;
	}
	public static long ceil(long num, long den) {long ans = num/den; if (num%den!=0) 
	ans++; return ans;}
	public static long GCD(long a, long b) {
		if (a==0||b==0) return Math.max(a,b);
		return GCD(Math.min(a, b),Math.max(a, b)%Math.min(a, b));
	}
	public static long FastExp(long base, long exp, long mod) {
		long ans=1;
		while (exp>0) {
			if (exp%2==1) ans*=base;
			exp/=2;
			base*=base;
			base%=mod;
			ans%=mod;
		}
		return ans;
	}
	public static long ModInv(long num,long mod) {return FastExp(num,mod-2,mod);}
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
		int nextInt() {return Integer.parseInt(next());}
		long nextLong() {return Long.parseLong(next());};
	}
	static class OutPut{
		PrintWriter w = new PrintWriter(System.out);
		void pln(double x) {w.println(x);w.flush();}
		void pln(int x) {w.println(x);w.flush();}
		void pln(long x) {w.println(x);w.flush();}
		void pln(String x) {w.println(x);w.flush();}
		void pln(char x) {w.println(x);w.flush();}
		void pln(StringBuilder x) {w.println(x);w.flush();}
		void p(int x) {w.print(x);w.flush();}
		void p(long x) {w.print(x);w.flush();}
		void p(String x) {w.print(x);w.flush();}
		void p(char x) {w.print(x);w.flush();}
		void p(StringBuilder x) {w.print(x);w.flush();}
	}
}
