import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

	public static class FastReader {
		BufferedReader br;
		StringTokenizer root;
		
 
		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
 
		String next() {
			while (root == null || !root.hasMoreTokens()) {
				try {
					root = new StringTokenizer(br.readLine());
				} catch (Exception addd) {
					addd.printStackTrace();
				}
			}
			return root.nextToken();
		}
 
		int nextInt() {
			return Integer.parseInt(next());
		}
 
		double nextDouble() {
			return Double.parseDouble(next());
		}
 
		long nextLong() {
			return Long.parseLong(next());
		}
 
		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (Exception addd) {
				addd.printStackTrace();
			}
			return str;
		}
	}
	
	public static PrintWriter out = new PrintWriter (new BufferedOutputStream(System.out));
	
	public static FastReader sc = new FastReader();
 
	static int mod = (int) (1e9+7),MAX=(int) (2e5+100);
    static List<Integer>[] edges;
    static Long[][] dp;
    
	public static void main(String[] args) {
	
	    int n = sc.nextInt();
	    long[] a = new long[MAX];
	    SegmentTree st = new SegmentTree(a,a.length);
	    long ans = 0;
	    int[] h = new int[n];
	    for(int i=0;i<n;++i) 
	    	h[i] = sc.nextInt();
	    for(int i=0;i<n;++i) {
	    	int b = sc.nextInt();
	    	long max = st.query(a,0,h[i]-1);
	    	ans = Math.max(ans, max+b);
	    	st.update(a, h[i]-1, max+b);
	    }
	    out.print(ans);
		out.close();
   }
	public static class SegmentTree 
	{ 
		long seg[];  

		SegmentTree(long[] a, int n) { 
			seg = new long[4*n];
			buildTree(a,0,n-1,1);
		} 
		
		public void buildTree(long[] a, int start, int end, int i) {
			if(start == end) {
				seg[i] = a[start];
				return;
			}
			int mid = start +(end-start)/2;
			buildTree(a,start,mid,2*i);
			buildTree(a,mid+1,end,2*i+1);
			//seg[i] = seg[2*i] + seg[2*i+1];
			seg[i] = Math.max(seg[2*i] , seg[2*i+1]);
			
		}

		public long query(long[] a, int l,int r) {
			return query(0,a.length-1,1,l,r);
		}
		
		public long query(long m, long mid2, int i, int l, int r) {
			// OUTSIDE
			if(m>r || mid2<l)
				return 0;
			//INSIDE
			if(m>=l && mid2<=r)
				return seg[i];
			// PARTIAL
			long mid = m+(mid2-m)/2;
			long ansl = query(m,mid,2*i,l,r);
			long ansr = query(mid+1,mid2,2*i+1,l,r);
			
			return Math.max(ansl,ansr);
			
		}

		public void update(long[] a,int idx,long ans) {
			updateTree(a,0,a.length-1,1,idx,ans);
		}
		public void updateTree(long[] a,int start, int end, int i, int idx, long ans) {
			if(start == end) {
				a[idx] = ans;
				seg[i] = ans;
				return;
			}
			
			int mid = start+(end-start)/2;
			if(idx>mid)
				updateTree(a,mid+1,end,2*i+1,idx,ans);
			else updateTree(a,start,mid,2*i,idx,ans);
			
			//seg[i] = seg[2*i+1] + seg[2*i];
			seg[i] = Math.max(seg[2*i], seg[2*i+1]);
			
		}

	}



    }

