import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Main {
	static PrintWriter out;
	static StringBuilder sb;
	static final double EPS = 1e-9;
	static long mod = 1000000007;
	static int inf = (int) 1e9 + 2;
	static long[] fac;
	static Long[] a;
	static int[] si;
	static ArrayList<Integer> primes;
	static ArrayList<Integer>[] ad;
	static ArrayList<qu>[] d;
	static edge[] ed;
	static int[] l, ch;
	static int[] occ, p;
	static Queue<Integer>[] can;
	static String s;
	static int[] memo;
	static int n, m, k;
	static int[] v;
	static int[] wi;
	static int []da;
	static long x;

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		out = new PrintWriter(System.out);
	    int n=sc.nextInt();
	    int d=sc.nextInt();
	    int a=sc.nextInt();
	    //TreeMap<Integer,Integer> tm=new TreeMap<>();
	    TreeMap<Integer,Integer> idc=new TreeMap<>();
	    int N=1;
	    while(N<n)
	    	N<<=1;
	    long []aa=new long [N];
	    int []xx=new int [n];
	    pair []ak=new pair[n];
	    for(int i=0;i<n;i++) {
	    	int x=sc.nextInt();
	    	int h=sc.nextInt();
	    	ak[i]=new pair(x, h);
	    	aa[i+1]=h;
	   //	tm.put(x, h);
	    	xx[i]=x;
	    }
	    Arrays.sort(ak);
	   // System.out.println(Arrays.toString(ak));
	    for(int i=0;i<n;i++) {
	    	     aa[i+1]=ak[i].number;
		 	   //	tm.put(x, h);
		 	    	xx[i]=(int)ak[i].to;
	    	idc.put(xx[i], i+1);
	    }
	    SegmentTree st=new SegmentTree(aa);
	    long ans=0;
	   // System.out.println(idc);
	    for(int i=1;i<=n;i++) {
	    	long val=st.query(i, i);
	    	if(val<=0)
	    		continue;
	    	int idx=i;
	    	if(idc.containsKey(xx[i-1]+2*d))
	    			idx=idc.get(xx[i-1]+2*d);
	    	else if(null!=idc.lowerKey(xx[i-1]+2*d))
	    	idx=idc.get(idc.lowerKey(xx[i-1]+2*d));
	        long x=val/a+(val%a==0?0:1);
	   //     System.out.println(val+" "+idx+" "+x+" "+(xx[i-1]+2*d)+" "+xx[i-1]);
	        st.update_range(i, idx, x*1l*a);
	    	ans+=x;
	    }
	    out.print(ans);
		out.flush();
	}
	public static class SegmentTree {		// 1-based DS, OOP
		
		int N; 			//the number of elements in the array as a power of 2 (i.e. after padding)
		long[] array, sTree, lazy;
		
		SegmentTree(long[] in)		
		{
			array = in; N = in.length - 1;
			sTree = new long[N<<1];		//no. of nodes = 2*N - 1, we add one to cross out index zero
			lazy = new long[N<<1];
			build(1,1,N);
		}
		
		void build(int node, int b, int e)	// O(n)
		{
			if(b == e)					
				sTree[node] = array[b];
			else						
			{
				int mid = b + e >> 1;
				build(node<<1,b,mid);
				build(node<<1|1,mid+1,e);
				sTree[node] = sTree[node<<1]+sTree[node<<1|1];
			}
		}
		
		
		void update_point(int index, int val)			// O(log n)
		{
			index += N - 1;				
			sTree[index] += val;			
			while(index>1)				
			{
				index >>= 1;
				sTree[index] = sTree[index<<1] + sTree[index<<1|1];		
			}
		}
		
		
		void update_range(int i, int j, long val)		// O(log n) 
		{
			update_range(1,1,N,i,j,val);
		}
		
		void update_range(int node, int b, int e, int i, int j, long val)
		{
			if(i > e || j < b)		
				return;
			if(b >= i && e <= j)		
			{
				sTree[node] -= (e-b+1)*val;			
				lazy[node] += val;				
			}							
			else		
			{
				int mid = b + e >> 1;
				propagate(node, b, mid, e);
				update_range(node<<1,b,mid,i,j,val);
				update_range(node<<1|1,mid+1,e,i,j,val);
				sTree[node] = sTree[node<<1] + sTree[node<<1|1];		
			}
			
		}
		void propagate(int node, int b, int mid, int e)		
		{
			lazy[node<<1] += lazy[node];
			lazy[node<<1|1] += lazy[node];
			sTree[node<<1] -= (mid-b+1)*lazy[node];		
			sTree[node<<1|1] -= (e-mid)*lazy[node];		
			lazy[node] = 0;
		}
		
		long query(int i, int j)
		{
			return query(1,1,N,i,j);
		}
		
		long query(int node, int b, int e, int i, int j)	// O(log n)
		{
			if(i>e || j <b)
				return 0;		
			if(b>= i && e <= j)
				return sTree[node];
			int mid = b + e >> 1;
			propagate(node, b, mid, e);
			long q1 = query(node<<1,b,mid,i,j);
			long q2 = query(node<<1|1,mid+1,e,i,j);
			return q1 + q2;	
					
		}
	}
	static class qu implements Comparable<qu> {
		int a;
		int b;

		qu(int y, int g) {
			a = y;
			b = g;
		}

		public String toString() {
			return a + " " + b;
		}

		public int compareTo(qu o) {
			if(a==o.a)
				return b-o.b;
			return a-o.a;
		}
	}

	static class seg implements Comparable<seg> {
		int a;
		int b;
		int l;
		int r;
		int bit;

		seg(int s, int e, int x, int y, int bi) {
			a = s;
			b = e;
			l = x;
			r = y;
			bit = bi;
		}

		public String toString() {
			return a + " " + b + " " + l + " " + r + " " + bit;
		}

		public int compareTo(seg o) {
			// if(a==o.a)
			return bit - o.bit;
			// return
		}
	}

	static class pair implements Comparable<pair>{
		long to;
		long number;

		pair(long t, long n) {
			number = n;
			to = t;
		}

		public String toString() {
			return to + " " + number;
		}

		@Override
		public int compareTo(pair o) {
		  if(o.to<to)
			  return 1;
			return -1;
		}
		
	}

	static long modPow(long a, int e)

	{
		long res = 1;
		while (e > 0) {
			if ((e & 1) == 1)
				res = (res * a) % mod;
			a = (a * a) % mod;
			e >>= 1;
		}
		return res;
	}

	static long inver(long x) {
		long a = x;
		long e = (mod - 2);
		long res = 1;
		while (e > 0) {
			if ((e & 1) == 1) {
				res = ((1l * res * a) % mod);
			}
			a = ((1l * a * a) % mod);
			e >>= 1;
		}
		return res % mod;
	}

	static class edge implements Comparable<edge> {
		int from;
		int to;
		int number;

		edge(int f, int t, int n) {
			from = f;
			to = t;
			number = n;
		}

		public String toString() {
			return from + " " + to + " " + number;
		}

		public int compareTo(edge f) {
			return f.number - number;
		}
	}

	static void seive(int N) {
		si = new int[N];
		primes = new ArrayList<>();
		si[1] = 1;
		for (int i = 2; i < N; i++) {
			if (si[i] == 0) {
				si[i] = i;
				primes.add(i);
			}
			for (int j = 0; j < primes.size() && primes.get(j) <= si[i] && (i * primes.get(j)) < N; j++)
				si[primes.get(j) * i] = primes.get(j);

		}
	}

	static long fac(int n) {
		if (n == 0)
			return fac[n] = 1;
		if (n == 1)
			return fac[n] = 1;
		long ans = 1;
		for (int i = 1; i <= n; i++)
			fac[i] = ans = (i % mod * ans % mod) % mod;
		return ans % mod;
	}

	static long gcd(long a, long b) {

		if (b == 0)
			return a;
		return gcd(b, a % b);
	}

	static class unionfind {
		int[] p;
		int[] size;
		int[] max;
		int num;

		unionfind(int n) {
			p = new int[n];
			size = new int[n];
			max = new int[n];
			for (int i = 0; i < n; i++) {
				p[i] = i;
				max[i] = i;
			}
			Arrays.fill(size, 1);
			num = n;
		}

		int findSet(int v) {
			if (v == p[v])
				return v;

			max[v] = Math.max(max[v], max[p[v]]);

			p[v] = findSet(p[v]);

			max[v] = Math.max(max[v], max[p[v]]);

			return p[v];
		}

		boolean sameSet(int a, int b) {
			a = findSet(a);
			b = findSet(b);
			if (a == b)
				return true;
			return false;
		}

		int max() {
			int max = 0;
			for (int i = 0; i < size.length; i++)
				if (size[i] > max)
					max = size[i];
			return max;
		}

		boolean combine(int a, int b) {
			a = findSet(a);
			b = findSet(b);
			if (a == b)
				return true;
			// System.out.println(num+" ppp");
			num--;
			if (size[a] > size[b]) {
				p[b] = a;
				max[a] = Math.max(max[a], max[b]);
				size[a] += size[b];

			} else {
				p[a] = b;
				max[b] = Math.max(max[a], max[b]);
				size[b] += size[a];
			}
			return false;
		}
	}

	static class Scanner {
		StringTokenizer st;
		BufferedReader br;

		public Scanner(InputStream system) {
			br = new BufferedReader(new InputStreamReader(system));
		}

		public Scanner(String file) throws Exception {
			br = new BufferedReader(new FileReader(file));
		}

		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		public String nextLine() throws IOException {
			return br.readLine();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}

		public char nextChar() throws IOException {
			return next().charAt(0);
		}

		public Long nextLong() throws IOException {
			return Long.parseLong(next());
		}

		public boolean ready() throws IOException {
			return br.ready();
		}

		public void waitForInput() throws InterruptedException {
			Thread.sleep(3000);
		}
	}
}