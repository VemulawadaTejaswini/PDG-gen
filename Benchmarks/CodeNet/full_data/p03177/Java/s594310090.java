import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.TreeSet;


public class Main {
	static long mod;
	static int s1,s2;
	
	static long[][] mul(long[][] a1,long[][] a2, int n){
		long[][] a3=new long[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				for(int k=0;k<n;k++) {
					a3[i][j]+=a1[i][k]*a2[k][j];
					a3[i][j]%=mod;
				}
			}
		}
		return a3;
	}
	
	static long[][] expo(long[][] arr, long k,int n){
		long[][] ret=new long[n][n];
		for(int i=0;i<n;i++) ret[i][i]=1;
		if(k==0) return ret;
		if(k==1) return arr;
		ret=expo(arr,k/2,n);
		ret=mul(ret,ret,n);
		if(k%2==1) {
			ret=mul(ret,arr,n);
		}
		
		return ret;
	}
	
	public static void main(String[] args) throws IOException {
		
		Reader.init(System.in);
		PrintWriter out=new PrintWriter(System.out);
		StringBuffer output=new StringBuffer("");
		int n=Reader.nextInt();
		long k=Reader.nextLong();
		long[][] arr=new long[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) arr[i][j]=Reader.nextLong();
		}
		mod=(long)1e9+7;
		arr=q5.expo(arr, k, n);
		long ans=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				ans+=arr[i][j];
				ans%=mod;
			}
		}
		out.println(ans);
		out.flush();
	}
}



class NoD{
	int a;int b, c;
	String s;

	NoD(int aa,int bb, int cc){
		a=aa;b=bb;c=cc;
	}
	@Override
	public boolean equals(Object o) {
		if(o!=null && o.getClass()==getClass()) {
			NoD c= (NoD) o;
			return c.a==a && c.b==b;
		}
		return false;
	}
	@Override
	public int hashCode() {
		return s.hashCode();
	}
}




class Reader {
    static BufferedReader reader;
    static StringTokenizer tokenizer;
    /** call this method to initialize reader for InputStream */
    static void init(InputStream input) {
        reader = new BufferedReader(
                     new InputStreamReader(input) );
        tokenizer = new StringTokenizer("");
    }
    /** get next word */
    static String nextLine() throws IOException{
    	return reader.readLine();
    }
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
    static long nextLong() throws IOException {
        return Long.parseLong( next() );
    }
    static double nextDouble() throws IOException {
        return Double.parseDouble( next() );
    }
}