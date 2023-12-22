/*
 * Code Author: Akshay Miterani
 * DA-IICT
 */
import java.io.*;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.*;

public class Main {

	static double eps=(double)1e-6;
	static long mod=(long)1e9+7;
	static final long INF = Long.MAX_VALUE / 100;
	public static void main(String args[]) throws FileNotFoundException{
		InputReader in = new InputReader(System.in);
		OutputStream outputStream = System.out;
		PrintWriter out = new PrintWriter(outputStream);
		//----------------My Code------------------
		double xs=in.nextInt();
		double ys=in.nextInt();
		double xt=in.nextInt();
		double yt=in.nextInt();
		int n=in.nextInt();
		double p[][]=new double[n][3];
		for(int i=0;i<n;i++){
			p[i][0]=in.nextInt();
			p[i][1]=in.nextInt();
			p[i][2]=in.nextInt();
		}
		double dp[][]=new double[n][n];
		for(int i=0;i<n;i++){
			Arrays.fill(dp[i], INF);
		}
		for(int i=0;i<n;i++){
			dp[0][i]=Math.max(0, dist(xs, ys, p[i][0], p[i][1])-p[i][2]);
		}
		for(int i=1;i<n;i++){
			for(int j=0;j<n;j++){
				for(int k=0;k<n;k++){
					dp[i][j]=Math.min(dp[i][j], dp[i-1][k]+md(p[k], p[j]));
				}
			}
		}
		double ans=INF;
		for(int i=0;i<n;i++){
			ans=Math.min(ans, dp[n-1][i]+Math.max(0, dist(xt, yt, p[i][0], p[i][1])-p[i][2]));
		}
		out.printf("%.10f\n",ans);
		out.close();
		//----------------The End------------------

	}
	static double md(double p1[], double p2[]){
		return Math.max(0, dist(p1[0], p1[1], p2[0], p2[1])-p1[2]-p2[2]);
	}
	static double dist(double x1,double y1,double x2,double y2){
		return Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2, 2));
	}
	static boolean isPrime(long x){
		for(int i=2;i<=Math.sqrt(x)+1;i++){
			if(x%i==0 && i!=x)
				return false;
		}
		return true;
	}
	static long modulo(long a,long b,long c) {
		long x=1;
		long y=a;
		while(b > 0){
			if(b%2 == 1){
				x=(x*y)%c;
			}
			y = (y*y)%c; // squaring the base
			b /= 2;
		}
		return  x%c;
	}
	static long gcd(long x, long y)
	{
		if(x==0)
			return y;
		if(y==0)
			return x;
		long r=0, a, b;
		a = (x > y) ? x : y; // a is greater number
		b = (x < y) ? x : y; // b is smaller number
		r = b;
		while(a % b != 0)
		{
			r = a % b;
			a = b;
			b = r;
		}
		return r;
	}
	static class Pair implements Comparable<Pair>{
		int x;
		int y;

		Pair(int xx,int yy){
			x=xx;
			y=yy;
		}
		@Override
		public int compareTo(Pair o) {
			if(Long.compare(this.x, o.x)!=0)
				return Long.compare(this.x, o.x);
			else
				return Long.compare(this.y, o.y);
		}
	}
	public static void debug(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}
	static class InputReader {
		public BufferedReader reader;
		public StringTokenizer tokenizer;

		public InputReader(InputStream inputstream) {
			reader = new BufferedReader(new InputStreamReader(inputstream));
			tokenizer = null;
		}

		public String nextLine(){
			String fullLine=null;
			while (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					fullLine=reader.readLine();
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
				return fullLine;
			}
			return fullLine;
		}
		public String next() {
			while (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(reader.readLine());
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return tokenizer.nextToken();
		}
		public long nextLong() {
			return Long.parseLong(next());
		}
		public int nextInt() {
			return Integer.parseInt(next());
		}
	}
}     