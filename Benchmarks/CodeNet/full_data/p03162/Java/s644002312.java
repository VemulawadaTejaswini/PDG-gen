// package cp;
import java.io.*;
import java.math.*;
import java.util.*;
public class Main {
	long gcd(long a,long b) {if(b==0)return a;else return gcd(b,a%b);}
	void swap(long a,long b) {long temp=a;a=b;b=temp;}
	StringBuilder sb=new StringBuilder();
	BigInteger RES=new BigInteger("0");
	//(Initialize as string) - (a.add(b)) - (array initialized with null and not 0)
	Integer[] ARR=new Integer[5];
	//Integer sort-TLE-Initialize object elements i.e a[0].
	void divisor(long n,int start) {
		int cnt=0;for(int i=start;i<=Math.sqrt(n);i++) {
		if(n%i==0) {if(i==n/i)cnt++;else cnt+=2;}}}
	static long[][] dp;
	public static void main(String[] args) throws IOException {	
		PrintWriter out = new PrintWriter(System.out);
		Readers.init(System.in);
		//Cf_three obj=new Cf_three();
		int n=Readers.nextInt();
		long[][] a=new long[n][3];
		dp=new long[n][3];long maxx=0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 3; j++) {
				a[i][j]=Readers.nextLong();
				if(i==0)dp[i][j]=a[i][j];
				else dp[i][j]=a[i][j]+Math.max(dp[i-1][(j+1)%3], dp[i-1][(j+2)%3]);
				maxx=Math.max(maxx, dp[i][j]);
			}
		}
		System.out.println(maxx);
//		System.out.println(Math.max(dp[n-1][0], Math.max(dp[n-1][1], dp[n-1][2])));
		out.flush();
	}
}
class Readers {
 
    static BufferedReader reader;
 
    static StringTokenizer tokenizer;
 
 
 
    /** call this method to initialize reader for InputStream */
 
    static void init(InputStream input) {
 
        reader = new BufferedReader(
 
                     new InputStreamReader(input) );
 
        tokenizer = new StringTokenizer("");
 
    }
 
 
 
    /** get next word */
 
    static String next() throws IOException {
 
        while ( ! tokenizer.hasMoreTokens() ) {
 
            //TODO add check for eof if necessary
 
            tokenizer = new StringTokenizer(
 
                   reader.readLine() );
 
        }
 
        return tokenizer.nextToken();
 
    }
 
 
 
    static int nextInt() throws IOException {
 
        return Integer.parseInt( next() );
 
    }
 
	
 
    static double nextDouble() throws IOException {
 
        return Double.parseDouble( next() );
 
    }
    
    
    static long nextLong() throws IOException{
    	
		return Long.parseLong(next());
	}
 
}