import java.io.*;
import java.math.*;
import java.util.*;
public class Main {
 
	public static void main(String[] args) { 
		Scanner input = new Scanner(System.in);
		PrintWriter w = new PrintWriter(System.out);
		long N = input.nextLong();
		long M = input.nextLong();
		String S = input.next();
		String T = input.next(); //Skip first char of both given strings 
		boolean bad=false;
		if (S.charAt(0)!=T.charAt(0)) bad=true;
		long ans = N*M;
		ans/=GCD(N,M); //Indirect LCM calculation
		int checkN = (int)(ans/N);
		int checkM = (int)(ans/M);
		for (int check = 1; check < N; check++) {
			if ((checkN*check)%checkM==0) {
				int val = checkN*check/checkM;
				if (val<M&&T.charAt(val)!=S.charAt(check)) {
					bad=true;
					break;
				}
			}
		}
		w.println(bad?-1:ans);
		w.flush();
	}
	public static long GCD(long a, long b) {
		if (a==0||b==0) return Math.max(a,b);
		return GCD(Math.min(a, b),Math.max(a, b)%Math.min(a, b));
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