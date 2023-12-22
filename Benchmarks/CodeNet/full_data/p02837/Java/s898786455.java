import java.io.*;
import java.math.*;
import java.util.*;
public class Main {  

	public static void main(String[] args) {   
		FastScanner I = new FastScanner(); //Input
		OutPut O = new OutPut(); //Output
		int N = I.nextInt();
		int ans = 0;
		ArrayList<int[]>[] opinions = new ArrayList[N+1]; //opinions[i] stores elements
		//[a,b], a being person in question and b being whether he's good or bad
		for (int i = 1; i <= N; i++) opinions[i]=new ArrayList<int[]>(); 
		for (int i = 1; i <= N; i++) {
			int num = I.nextInt();
			for (int j = 0; j < num; j++) {
				int x = I.nextInt();
				int verd = I.nextInt();
				int[] add = {x,verd};
				opinions[i].add(add);
			}
		}
		for (int mask = 0; mask < (1<<N); mask++) {
			int[] goodbad = new int[N];
			int goods = 0;
			for (int chk = 0; chk < N; chk++) {
				goodbad[chk]=(mask>>chk)%2; //Consistent ordering with left to right doesn't 
				//matter due to symmetry of binary strings constructed
				if (goodbad[chk]==1) goods++;
			}
			boolean valid = true;
			//check below for contradictions
			for (int i = 0; i < N; i++) {
				if (goodbad[i]==1) {
					for (int j = 0; j < opinions[i+1].size(); j++) {
						int person = opinions[i+1].get(j)[0];
						int cur = opinions[i+1].get(j)[1];
						if (cur!=goodbad[person-1]) valid=false; //bits are generated in 0 based
						//indexing
					}
				} //Rest can be adjusted accordingly since their opinions are 
				//not validated
			}
			if (valid) ans=Math.max(ans,goods);
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
	public static int pop(long x) { //Returns number of bits within a number
		int cnt = 0;
		while (x>0) {
			if (x%2==1) cnt++;
			x/=2;
		}
		return cnt;
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
		void pln(BigInteger x) {w.println(x);w.flush();}
		void p(int x) {w.print(x);w.flush();}
		void p(long x) {w.print(x);w.flush();}
		void p(String x) {w.print(x);w.flush();}
		void p(char x) {w.print(x);w.flush();}
		void p(StringBuilder x) {w.print(x);w.flush();}
		void p(BigInteger x) {w.print(x);w.flush();}
		void p(double x) {w.print(x);w.flush();}
	}
}
