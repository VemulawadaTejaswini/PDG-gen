import java.io.*;
import java.math.*;
import java.util.*;
public class Main {  //Choose functions TLE since factorial takes linear time and
	//space (1e9) is too big

	public static void main(String[] args) {   
		FastScanner I = new FastScanner(); //Input
		OutPut O = new OutPut(); //Output
		long mod = (long)(1e9)+7;
		long N = I.nextLong();
		long A = I.nextLong();
		long B = I.nextLong();
		long ans = FastExp(2,N,mod);
		ans--; //Empty set isn't a valid possibility
		if (ans<0) ans+=mod;
		
		//Subtracting A
		long factA = 1;
		long waysA = 1;
		for (long i = 2; i <= A; i++) {
			factA*=i;
			factA%=mod;
		}
		long divFactA = FastExp(factA,mod-2,mod); //Modular inverse (need to divide result by 
		//factorial of A) --> So multiply by inverse
		for (long i = N; i>N-A; i--) {
			waysA*=i;
			waysA%=mod;
		}
		waysA*=divFactA;
		waysA%=mod;
		ans-=waysA;
		ans%=mod;
		if (ans<0) ans+=mod;
		
		//Subtracting B
		long factB = 1;
		long waysB = 1;
		for (long i = 2; i <= B; i++) {
			factB*=i;
			factB%=mod;
		}
		long divFactB = FastExp(factB,mod-2,mod); //Modular inverse (need to divide result by 
		//factorial of A) --> So multiply by inverse
		for (long i = N; i>N-B; i--) {
			waysB*=i;
			waysB%=mod;
		}
		waysB*=divFactB;
		waysB%=mod;
		ans-=waysB;
		ans%=mod;
		if (ans<0) ans+=mod;
		
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
