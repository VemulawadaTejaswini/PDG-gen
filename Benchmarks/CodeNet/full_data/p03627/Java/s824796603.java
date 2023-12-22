import java.io.*;
import java.math.*;
import java.util.*;
public class Main { //CASH MONEY----> I been on the road making 
	//all these damn ACs on my own
 
	public static void main(String[] args) { 
		FastScanner I = new FastScanner(); //Input
		OutPut O = new OutPut(); //Output
		int N = I.nextInt();
		long s1 = 0;
		long s2 = 0;
		PriorityQueue<Long> len = new PriorityQueue<Long>(Collections.reverseOrder());
		for (int i = 0; i < N; i++) len.add(I.nextLong());
		long cmp = len.poll();
		int cnt = 1; //Occurrences of same number
		while (!len.isEmpty()) {
			if (s1>0&&s2>0) break;
			if (len.peek()==cmp) {
				cnt++;
				if (cnt==2) {
					if (s1==0) s1=cmp;
					else if (s2==0) s2=cmp;
				}
				cnt%=2;
				len.poll();
			}else {
				cnt=1;
				cmp = len.poll();
			}
		}
		O.pln(s1*s2);
	}
	public static void build(long[][] segtree, long[] a, int node,int L, int R) {
		if (L==R) {
			segtree[node][0]=a[L];
			segtree[node][1]=1; //Length 1 sub-array
		} 
		else{
			int mid = (L+R)/2;
			build(segtree,a,2*node,L,mid);
			build(segtree,a,2*node+1,mid+1,R);
			if (segtree[node*2][0]<segtree[node*2+1][0]) { //If left child is smaller
				segtree[node][0] = segtree[node*2][0];
				segtree[node][1] = segtree[node*2][1]; //Only one of the counters apply if
				//minimum values are different
			}else if (segtree[node*2][0]==segtree[node*2+1][0]) {
				segtree[node][0]=segtree[node*2][0];
				segtree[node][1] = segtree[node*2][1]+segtree[node*2+1][1]; //If minimum is
				//equal summing children counters is more accurate
			}else { //If right child is smaller
				segtree[node][0] = segtree[node*2+1][0];
				segtree[node][1] = segtree[node*2+1][1];
			}
		}
	}
	public static long[] GetMin(long[][] segtree,long[] a,int start, int end, int L, int R, int node) { //start = L of traversal of 
		//segment tree && end = R of traversal of segment tree
		if (L>end||R<start) {
			long[] ans = {Long.MAX_VALUE,0};
			return ans;
		} //If desired range is completely out of current node of
		//segment tree ---> THIS REQUIRES ALTERNATION FOR DIFFERENT RANGE QUERIES
		if (L<=start&&R>=end) {
			long[] ans = {segtree[node][0], segtree[node][1]};
			return ans; //If range completely surrounds current node
		} 
		//of segment tree
		int mid = (start+end)/2;
		long[] left = GetMin(segtree,a,start,mid,L,R,node*2);
		long[] right = GetMin(segtree,a,mid+1,end,L,R,node*2+1);
		long[] ret = new long[2]; //Ultimate pair to be returned
		if (left[0]<right[0]) {
			ret[0] = left[0];
			ret[1]=left[1]; //Just taking left node's child since it has more optimal answer 
		}else if (left[0]==right[0]) {
			ret[0] = left[0];
			ret[1] = left[1]+right[1]; //Same value, therefore add occurrences from both children
		}else {
			ret[0] = right[0];
			ret[1] = right[1];
		}
		return ret;
		//Partial case; If desired range doesn't encapsulate a node but [L,R] is certainly 
		//within [start,end]
	}
	public static void UPD(long[][] segtree, long[] a,int in, long val,int start, int end, int node) {
		//if (in<start||in>end) return; //If updated index is out of 
		//range of current node of segment tree, just return original sum of sub-array
		if (start==end) {
			segtree[node][0]=val; //If desired leaf of segment tree is hit
			segtree[node][1]=1;
		}
		else {
			int mid = (start+end)/2;
			if (in>=start&&in<=mid) UPD(segtree,a,in,val,start,mid,2*node); 
			//If index resides in left child
			else UPD(segtree,a,in,val,mid+1,end,2*node+1);
			//If index resides in right child
			//You only ever choose ONE child per level in updating process to enable log(N) 
			//updating speed
			if (segtree[node*2][0]<segtree[2*node+1][0]) { //Left child
				segtree[node][0] = segtree[node*2][0];
				segtree[node][1] = segtree[node*2][1];
			}else if (segtree[node*2][0]==segtree[2*node+1][0]) { //Both
				segtree[node][0]=segtree[node*2][0];
				segtree[node][1] = segtree[node*2][1]+segtree[node*2+1][1];
			}else { //Right child
				segtree[node][0] = segtree[node*2+1][0];
				segtree[node][1] = segtree[node*2+1][1];
			}
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
