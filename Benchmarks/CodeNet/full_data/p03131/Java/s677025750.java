import java.io.*;
import java.math.*;
import java.util.*;
public class Main { 
 
	public static void main(String[] args) { 
		FastScanner I = new FastScanner(); //Input
		OutPut O = new OutPut(); //Output
		long K = I.nextLong();
		long A = I.nextLong();
		long B = I.nextLong();
		long ans = K+1; //Trivial case of all pockets
		long alt = 0; //Boost case work answer
		K-=(A-1); //Operations to reach a biscuits
		alt+=A;
		if (K>0&&B>A) { //If return is greater than sacrifice
			long left = K/2; //Number of swaps you can do till end (if K is odd, sacrificing is
			//futile as you lose cookies, but run out of turns to gain them back with profit
			alt+=left*(B-A);
			if (K%2==1) alt++; //Can use final move as pocket since only one move is left
		}
		ans=Math.max(ans, alt);
		O.pln(ans);
	}
	public static void build(long[] segtree, long[] a, int node,int L, int R) {
		if (L==R) segtree[node]=a[L];
		else{
			int mid = (L+R)/2;
			build(segtree,a,2*node,L,mid);
			build(segtree,a,2*node+1,mid+1,R);
			segtree[node]=Math.min(segtree[node*2],segtree[node*2+1]);
		}
	}
	public static long GetMin(long[] segtree,long[] a,int start, int end, int L, int R, int node) { //start = L of traversal of 
		//segment tree && end = R of traversal of segment tree
		if (L>end||R<start) return Long.MAX_VALUE; //If desired range is completely out of current node of
		//segment tree ---> THIS REQUIRES ALTERNATION FOR DIFFERENT RANGE QUERIES
		if (L<=start&&R>=end) return segtree[node]; //If range completely surrounds current node
		//of segment tree
		int mid = (start+end)/2;
		long left = GetMin(segtree,a,start,mid,L,R,node*2);
		long right = GetMin(segtree,a,mid+1,end,L,R,node*2+1); 
		return Math.min(left, right);
		//Partial case; If desired range doesn't encapsulate a node but [L,R] is certainly 
		//within [start,end]
	}
	public static void UPD(long[] segtree, long[] a,int in, long val,int start, int end, int node) {
		//if (in<start||in>end) return; //If updated index is out of 
		//range of current node of segment tree, just return original sum of sub-array
		if (start==end) segtree[node]=val; //If desired leaf of segment tree is hit 
		else {
			int mid = (start+end)/2;
			if (in>=start&&in<=mid) UPD(segtree,a,in,val,start,mid,2*node); 
			//If index resides in left child
			else UPD(segtree,a,in,val,mid+1,end,2*node+1);
			//If index resides in right child
			segtree[node] = Math.min(segtree[2*node],segtree[2*node+1]);
		}
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
	}
}
