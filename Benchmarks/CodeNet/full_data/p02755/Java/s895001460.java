import java.io.*;
import java.math.*;
import java.util.*;
public class Main { 

	public static void main(String[] args) {   //This is literally segment tree without updates 
		FastScanner I = new FastScanner(); //Input
		OutPut O = new OutPut(); //Output
		int A = I.nextInt();
		int B = I.nextInt();
		int ans = -1;
		for (int chk = 1; chk<=10000; chk++) {
			double pr = (double)(chk);
			double a = pr*0.08;
			double b = pr*0.1;
			a=(int)(a);
			b=(int)(b);
			if (a==A&&b==B) {
				ans=chk;
				break;
			}
		}
		O.pln(ans);
	}
	public static int Check(int L, int R, int ltr, int[][] pref, String S) {
		if (L==R) {
			int cur = S.charAt(L-1)-'a';
			return cur==ltr?0:1;
		}
		int mid = (L+R)/2;
		int range = R-L+1;
		range/=2; //Only ever analyze one half of current [L,R] range
		int left = pref[mid][ltr]-pref[L-1][ltr]; //All letters in left half not desired letter need to
		//be switched
		left=range-left;
		left+=Check(mid+1,R,ltr+1,pref,S); //Checking right child
		
		int right = pref[R][ltr]-pref[mid][ltr]; 
		//Number of desired letters between mid+1 and R
		right=range-right; //Have to swap bads not goods
		right+=Check(L,mid,ltr+1,pref,S); //Checking left child recursion
		return Math.min(left,right);
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
