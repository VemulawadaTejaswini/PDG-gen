import java.io.*;
import java.math.*;
import java.util.*;
public class Main { //CASH MONEY
 
	public static void main(String[] args) { //Ball out dawg
		FastScanner I = new FastScanner(); //Input
		OutPut O = new OutPut(); //Output
		int N = I.nextInt();
		long H = I.nextLong();
		long[][] dmg = new long[N][2];
		int leave = -1;
		long maxWield = 0;
		long ans = 0;
		PriorityQueue<Long> thr = new PriorityQueue<Long>(Collections.reverseOrder());
		for (int i = 0; i < N; i++) {
			dmg[i][0] = I.nextLong();
			dmg[i][1] = I.nextLong();
			if (dmg[i][0]>maxWield) {
				maxWield=dmg[i][0];
				leave=i;
			}
		}
		for (int i = 0; i < N; i++) {
			if (i!=leave) thr.add(dmg[i][1]);
		}
		while (!thr.isEmpty()) {
			long cur = thr.poll();
			if (cur>=maxWield) {
				H-=cur;
				ans++;
			}
			else break;
			if (H<=0) break;
		}
		if (H>0) {
			if (maxWield>=dmg[leave][1])ans+=ceil(H,maxWield);
			else {
				H-=dmg[leave][1]; //Can use last move as a throw on 
				//monster if it does more damage
				ans++;
				H=Math.max(H, 0);
				ans+=ceil(H,maxWield); //Rest of the health must be used through wield, 
				//otherwise no swords
			}
		}
		O.pln(ans);
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