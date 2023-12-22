
import java.util.*;
import java.io.*;

public class Main {
	 static int[] w, v;
	static int n, s;
	static int [][]mydpArr ;
	public static int dp(int indx, int remw) {
		if (remw<0)
			return -(int) 1e9;
	
	if (indx == n)
		return 0;
	if(mydpArr[indx][remw]!=-1)
		return mydpArr[indx][remw];
	int take = v[indx] + dp(indx+1,remw-w[indx]);
	int leave = dp(indx+1,remw);
	return mydpArr[indx][remw] = Math.max(take, leave);	
	}
	public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        n = sc.nextInt();
        s = sc.nextInt();
        w =new int[n];
        v =new int[n];
        mydpArr =new int[n+1][s+1];
        for(int i=0;i<n;i++) {
        	w[i]=sc.nextInt();
        	v[i]=sc.nextInt();
        }
        for(int[] x :mydpArr) {
        	Arrays.fill(x,-1);
        }
        pw.print(dp(0,s));
        pw.close();
        }
	  static class Scanner {
	         BufferedReader br;
	         StringTokenizer st;
	 
	         public Scanner(InputStream s) {
	             br = new BufferedReader(new InputStreamReader(s));
	         }
	 
	         public String next() throws IOException {
	             while (st == null || !st.hasMoreTokens())
	                 st = new StringTokenizer(br.readLine());
	             return st.nextToken();
	         }
	 
	         public int nextInt() throws IOException {
	             return Integer.parseInt(next());
	         }
	 
	         public long nextLong() throws IOException {
	             return Long.parseLong(next());
	         }
	 
	         public double nextDouble() throws IOException {
	             return Double.parseDouble(next());
	         }
	 
	         public int[] nextIntArr(int n) throws IOException {
	             int[] arr = new int[n];
	             for (int i = 0; i < n; i++) {
	                 arr[i] = Integer.parseInt(next());
	             }
	             return arr;
	         }
	 
	     }
}