import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.Comparator;
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
	static ArrayList<Integer>[] gph,rpgh;
	static HashMap<Integer,Long>[] gph2;
	static int[] visited,deg;
	 
	
	
	
	public static void main(String[] args) throws IOException {
		
		Reader.init(System.in);
		PrintWriter out=new PrintWriter(System.out);
		StringBuffer output=new StringBuffer("");
		int h=Reader.nextInt(),w=Reader.nextInt();
		char[][] grid=new char[h][w];
		for(int i=0;i<h;i++) grid[i]=Reader.next().toCharArray();
		long mod=(long)1e9+7;
		long[][] ans=new long[h][w];
		ans[0][0]=1;
		for(int i=1;i<h;i++) {
			if(grid[i][0]=='.')
			ans[i][0]=ans[i-1][0];
		}
		for(int j=1;j<w;j++) {
			if(grid[0][j]=='.')
			ans[0][j]=ans[0][j-1];
		}
		for(int i=1;i<h;i++) {
			for(int j=1;j<w;j++) {
				if(grid[i][j]=='.')
				ans[i][j]=ans[i-1][j]+ans[i][j-1];
				ans[i][j]%=mod;
			}
		}
		output.append(ans[h-1][w-1]);
		out.write(output.toString());
		out.flush();
		
	}
}
class NoD{
	int a,b;
	String s;
	
	NoD(int aa,int bb){
		a=aa;b=bb;
		s=a+" "+b;
		
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
class NoD2{
	int a,b;
	long val;
	NoD2(int aa,int bb, long c){
		a=aa;b=bb;val=c;
	}
}
class DisJoint{
	 int[] parent,rank;
	 DisJoint(int n){
		 parent=new int[n+1];
		 rank=new int[n+1];
		 for(int i=1;i<=n;i++) {
			 rank[i]=0;
			 parent[i]=i;
		 }
	 }
	void union(int a, int b) {
		int p1=find(a);
		int p2=find(b);
		if(p1!=p2) {
			if(rank[p1]>=rank[p2]) {
				parent[p2]=p1;
				if(rank[p1]==rank[p2]) rank[p1]++;
			}
			else {
				parent[p1]=p2;
			}
		}
	}
	
	int find(int a) {
		if(a!=parent[a]) {
			parent[a]=find(parent[a]);
		}
		return parent[a];
	}
}

//class Seg{
//	ArrayList<Integer> arr;
//	int[] segtree;
//	Seg(ArrayList<Integer> a){
//		arr=a;
//		int n=arr.size();
//		segtree=new int[4*n+1];
//	}
//	
//	void build(int index, int l, int r) {
//		if(l==r) {
//			segtree[index]=q5.occurance[arr.get(l)];
//		}
//		else {
//			int middle=(l+r)/2;
//			build(2*index+1,l,middle);
//			build(2*index+2,middle+1,r);
//			segtree[index]=Math.min(segtree[2*index+1], segtree[2*index+2]);
//		}
//	}
//	
//	int query(int index, int l, int r, int ql, int qr) {
//		if(ql<=l && r<=qr) {
//			return segtree[index];
//		}
//		else if(qr<l || ql>r) {
//			return Integer.MAX_VALUE;
//		}
//		else {
//			int middle=(l+r)/2;
//			int left=query(2*index+1,l,middle,ql,qr);
//			int right=query(2*index+2,middle+1,r,ql,qr);
//			return Math.min(left, right);
//		}
//	}
//}
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

