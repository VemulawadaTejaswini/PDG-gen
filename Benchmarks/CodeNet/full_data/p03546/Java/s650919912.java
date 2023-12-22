import java.io.*;
import java.math.*;
import java.util.*;
public class Main { 
 
	public static void main(String[] args) { 
		FastScanner I = new FastScanner(); //Input
		OutPut O = new OutPut(); //Output
		/*double s = System.nanoTime();
		ArrayList<String> seq = perms(9,10,5); 
		double e = System.nanoTime();
		e-=s;
		O.pln(e/(double)(1e9));
		O.pln(seq.size());*/
		//for (int i = 0; i < seq.size(); i++) O.pln(seq.get(i));
		int R = I.nextInt();
		int C = I.nextInt();
		int[][] conv = new int[10][10];
		int[] dp = new int[10]; //int = less data parsing --> Faster run time
		Arrays.fill(dp, Integer.MAX_VALUE);
		long ans = 0;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				conv[i][j] = I.nextInt();
			}
		} //Second element because dp[1] = 0 (null case)																																		
		//CODE dp --> UPD: Just brute force 10! ways (starting number of each permutation
		//be start station, and location of 1 in permutation would be end
		//Then use cost grid to simply optimize cost for each starting station
		//Since constraints are small, this works in time
		ArrayList<String> seq = perms(10,10);
		//Take cheapest out of stations to brute force
		for (int i = 0; i < seq.size(); i++) {
			String cur = seq.get(i);
			int start = Integer.parseInt(cur.substring(0,1));
			int cost = 0;
			int curnum = start;
			//if (start==4) O.pln(cur);
			for (int j = 1; j < cur.length(); j++) {
				int next = Integer.parseInt(cur.substring(j,j+1));
				cost+=conv[curnum][next];
				curnum=next; //Shifting digits
			}
			dp[start]=Math.min(dp[start],cost);
		}
		//for (int i = 0; i < 10; i++) O.p(dp[i]+" ");
		for (int r = 0; r < R; r++) {
			for (int c = 0; c < C; c++) {
				int x = I.nextInt();
				if (x!=-1) ans+=dp[x];
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
