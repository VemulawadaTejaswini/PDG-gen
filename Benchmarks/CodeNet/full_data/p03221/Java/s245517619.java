import java.io.*;
import java.math.*;
import java.util.*;
public class Main { //USE LONGS TO AVOID OVERFLOW THEN CAST
 
	public static void main(String[] args) { 
		FastScanner input = new FastScanner();
		PrintWriter w = new PrintWriter(System.out);
		int N = input.nextInt();
		int M = input.nextInt();
		int[][] pref = new int[M][3]; //[prefecture,year,index]
		int[] cnts = new int[N+1]; //how many cities were assigned to prefecture i by year Y
		String[] ans = new String[M];
		for (int i = 0; i < M; i++) {
			int P = input.nextInt();
			int Y = input.nextInt();
			pref[i][0]=P;
			pref[i][1]=Y;
			pref[i][2]=i;
		}
		Arrays.sort(pref,(a,b)->Integer.compare(a[1], b[1])); //Sorting by time
		/*for (int i = 0; i < M; i++) {
			System.out.println(pref[i][0]+","+pref[i][1]+","+pref[i][2]);
		}*/
		for (int i = 0; i < M; i++) {
			int in = pref[i][2];
			int pr = pref[i][0];
			cnts[pr]++;
			int ci = cnts[pr];
			String curans = "";
			int PrefDigit = 0;
			int CityDigit = 0;
			while (pr>0) {
				pr/=10;
				PrefDigit++;
			}
			while (ci>0) {
				ci/=10;
				CityDigit++;
			}
			//System.out.println(cnts[pr]);
			int PZ = 6-PrefDigit; //Prefecture 0s and city 0s in ID number
			int CZ = 6-CityDigit;
			
			for (int j = 0; j < PZ; j++) {
				curans+="0";
			}
			curans+=Integer.toString(pref[i][0]);
			for (int j = 0; j < CZ; j++) {
				curans+="0";
			}
			curans+=Integer.toString(cnts[pref[i][0]]);
			ans[in]=curans; //Have to ultimately reorder ID in jumbled initial format 
			//(not chronological necessarily)
		}
		for (int i = 0; i < M; i++) {
			w.println(ans[i]);
			w.flush();
		}
	}
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