import java.io.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;

public class Main {
	static PrintWriter out;
	static StringBuilder sb;
	static int inf = (int) 1e9;
	static long mod = (long) 1e9 + 7;
	static int[] si;
	static ArrayList<Integer> primes;
	static HashSet<Integer> pr;
	static int n;
	static boolean[] in;
	static HashMap<Integer, Integer> factors;
	static HashSet<Integer> f;
    static long []fac;
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		out = new PrintWriter(System.out);
		fac=new long [2005];
		fac[0]=1;
		for(int i=1;i<2005;i++)
			fac[i]=(i*fac[i-1])%mod;
		long sum=0;
		long ans=0;
		int n=sc.nextInt();
		int k=sc.nextInt();
		int r=n-k;
		for(int i=1;i<=k;i++) {
			long formula=((fac[r+i]%mod*inver(fac[i])%mod*inver(fac[r])%mod)+mod)%mod;
			formula=(formula-sum);
  if(formula<=0) {
	  out.println(0);
	  continue;}
			//		if(i==3)
		//		System.out.print(formula+" "+sum);
			long mult=((fac[k-1]%mod*inver(fac[i-1])%mod*inver(fac[k-i])%mod)+mod)%mod;
			//if(i==3)
				//System.out.println("  "+mult);
			ans=(formula*mult+mod)%mod;
			out.println(ans);
			sum=(sum+ans+mod)%mod;
		}
		out.flush();
	}
	static long inver(long x) {
		int a = (int) x;
		long e = (mod - 2);
		long res = 1;
		while (e > 0) {
			if ((e & 1) == 1) {
				// System.out.println(res*a);
				res = (int) ((1l * res * a) % mod);
			}
			a = (int) ((1l * a * a) % mod);
			e >>= 1;
		}
		// out.println(res+" "+x);
		return res % mod;
	}
	static int atMostSum(int arr[], int n, int k) 
	{ 
	    int sum = 0; 
	    int cnt = 0, maxcnt = 0; 
	  
	    for (int i = 0; i < n; i++) { 
	          
	        // If adding current element doesn't 
	        // cross limit add it to current window 
	        if ((sum + arr[i]) <= k) { 
	            sum += arr[i];  
	            cnt++; 
	        }  
	  
	        // Else, remove first element of current 
	        // window and add the current element 
	        else if(sum!=0) 
	        { 
	            sum = sum - arr[i - cnt] + arr[i]; 
	        } 
	  
	        // keep track of max length. 
	        maxcnt = Math.max(cnt, maxcnt);  
	    } 
	    return maxcnt; 
	}
	public static int[] longestSubarray(int[] inp) {
		// array containing prefix sums up to a certain index i
		int[] p = new int[inp.length];
		p[0] = inp[0];
		for (int i = 1; i < inp.length; i++) {
			p[i] = p[i - 1] + inp[i];
		}

		// array Q from the description below
		int[] q = new int[inp.length];
		q[inp.length - 1] = p[inp.length - 1];
		for (int i = inp.length - 2; i >= 0; i--) {
			q[i] = Math.max(q[i + 1], p[i]);
		}
		int a = 0;
		int b = 0;
		int maxLen = 0;
		int curr;
		int[] res = new int[] { -1, -1 };
		while (b < inp.length) {
			curr = a > 0 ? q[b] - p[a - 1] : q[b];
			if (curr >= 0) {
				if (b - a > maxLen) {
					maxLen = b - a;
					res = new int[] { a, b };
				}
				b++;
			} else {
				a++;
			}
		}
		return res;
	}

	static void factor(int n) {
		if (si[n] == n) {
			f.add(n);
			return;
		}
		f.add(si[n]);
		factor(n / si[n]);
	}

	static void seive() {
		si = new int[1000001];
		primes = new ArrayList<>();
		int N = 1000001;
		pr = new HashSet<>();
		si[1] = 1;
		for (int i = 2; i < N; i++) {
			if (si[i] == 0) {
				si[i] = i;
				primes.add(i);
				pr.add(i);
			}
			for (int j = 0; j < primes.size() && primes.get(j) <= si[i] && (i * primes.get(j)) < N; j++)
				si[primes.get(j) * i] = primes.get(j);

		}
	}

	static public class SegmentTree { // 1-based DS, OOP

		int N; // the number of elements in the array as a power of 2 (i.e. after padding)
		int[] array, sTree, lazy;

		SegmentTree(int[] in) {
			array = in;
			N = in.length - 1;
			sTree = new int[N << 1]; // no. of nodes = 2*N - 1, we add one to cross out index zero
			lazy = new int[N << 1];
			build(1, 1, N);
		}
         public String toString() {
        	 return Arrays.toString(sTree);
         }
		void build(int node, int b, int e) // O(n)
		{
			if (b == e)
				sTree[node] = array[b];
			else {
				int mid = b + e >> 1;
				build(node << 1, b, mid);
				build(node << 1 | 1, mid + 1, e);
				sTree[node] = gcd(sTree[node << 1] , sTree[node << 1 | 1]);
			}
		}

		void update_point(int index, int val) // O(log n)
		{
			index += N - 1;
			sTree[index] += val;
			while (index > 1) {
				index >>= 1;
				sTree[index] = sTree[index << 1] + sTree[index << 1 | 1];
			}
		}

		void update_range(int i, int j, int val) // O(log n)
		{
			update_range(1, 1, N, i, j, val);
		}

		void update_range(int node, int b, int e, int i, int j, int val) {
			if (i > e || j < b)
				return;
			if (b >= i && e <= j) {
				sTree[node] += (e - b + 1) * val;
				lazy[node] += val;
			} else {
				int mid = b + e >> 1;
				propagate(node, b, mid, e);
				update_range(node << 1, b, mid, i, j, val);
				update_range(node << 1 | 1, mid + 1, e, i, j, val);
				sTree[node] = sTree[node << 1] + sTree[node << 1 | 1];
			}

		}

		void propagate(int node, int b, int mid, int e) {
			lazy[node << 1] += lazy[node];
			lazy[node << 1 | 1] += lazy[node];
			sTree[node << 1] += (mid - b + 1) * lazy[node];
			sTree[node << 1 | 1] += (e - mid) * lazy[node];
			lazy[node] = 0;
		}

		int query(int i, int j) {
			return query(1, 1, N, i, j);
		}

		int query(int node, int b, int e, int i, int j) // O(log n)
		{
			if (i > e || j < b)
				return 0;
			if (b >= i && e <= j)
				return sTree[node];
			int mid = b + e >> 1;
			//propagate(node, b, mid, e);
			int q1 = query(node << 1, b, mid, i, j);
			int q2 = query(node << 1 | 1, mid + 1, e, i, j);
			return gcd(q1 , q2);
		}
	}

	static class pair2 implements Comparable<pair2> {
		int x;
		int idx;

		pair2(int x, int d) {
			this.x = x;
			// this.y = y;
			idx = d;
		}

		public String toString() {
			return x + " " + idx;
		}

		@Override
		public int compareTo(pair2 o) {
			if (o.x == x)
				return idx - o.idx;
			return o.x - x;
		}
	}

	static class pair implements Comparable<pair> {
		int x;
		int y;

		pair(int x, int y) {
			this.x = x;
			this.y = y;
		}

		public String toString() {
			return x + " " + y;
		}

		@Override
		public int compareTo(pair o) {
			if (o.x == x)
				return o.y - y;
			return x - o.x;
		}
	}

	static int gcd(int a, int b) {

		if (b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}

	static class unionfind {
		int[] p;
		int[] size;

		unionfind(int n) {
			p = new int[n];
			size = new int[n];

			for (int i = 0; i < n; i++) {
				p[i] = i;
			}
			Arrays.fill(size, 1);
		}

		int findSet(int v) {
			if (v == p[v])
				return v;
			return p[v] = findSet(p[v]);
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

		void combine(int a, int b) {
			a = findSet(a);
			b = findSet(b);
			if (a == b)
				return;
			if (size[a] > size[b]) {
				p[b] = a;
				size[a] += size[b];

			} else {
				p[a] = b;
				size[b] += size[a];
			}
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