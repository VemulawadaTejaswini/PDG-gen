import java.io.*;
import java.util.*;

public class Main{
	static PrintWriter out;
	static StringBuilder sb;
	static int inf = (int) 1e9;
	static int mod = (int) 1e9 + 7;
	static int[] si;
	static ArrayList<Integer> primes;
	static HashSet<Integer> pr;
	static int n, k, m;
	static boolean[] in;
	static HashMap<Integer, Integer> factors;
	static HashSet<Integer> f;
	static long[] fac;
	static int[] l, r;
	static long[][] memo;
	static int[] a;
	static ArrayList<Integer>[] ad;
	static HashMap<Integer, Integer> hm;
	static pair[] ed;
	static ArrayList<Integer>[] np;
	static TreeMap<pair, Integer> tm;
	static int[] ans, h1, h2;
	static char[] h;
	static int[] po;

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		out = new PrintWriter(System.out);
	    int n=sc.nextInt();
	    int ans=0;
	    for(int i=1;i<n;i++) {
	    	int tm=i;
	    	int c=0;
	    	while(tm!=0) {
	    		tm/=10;
	    	c++;}
	    	if(c%2==1)
	    		ans++;
	    }
	    out.println(ans);
		out.flush();
	}
	static long dp(int i, int st) {
		// System.out.println(st+" th "+i);
		if (i == h.length) {
			// st*=inver(10);
			// st%=13;
			// System.out.println("HEY "+st);

			if (st % 13 == 5)
				return 1;
			return 0;
		}
		// System.out.println("hshsh "+(h.length-i)+" "+i);
		// st*=po[h.length-i];
		st %= 13;
		if (memo[i][st] != -1)
			return memo[i][st];
		long ans = 0;
		if (h[i] == '?') {
			for (int u = '0'; u <= '9'; u++) {
				// System.out.println("utuuu
				// "+((Integer.parseInt((u-'0')+""))*po[h.length-i-1]));
				ans = (ans + dp(i + 1, ((st + ((Integer.parseInt((u - '0') + "")) * po[h.length - i - 1])) % 13)))
						% mod;
			}
		} else {
			ans = dp(i + 1, ((st + ((Integer.parseInt((h[i] - '0') + "")) * po[h.length - i - 1])) % 13));
		}
		return memo[i][st] = ans;
	}

	static int c = 0;
	static boolean ff;
	static Queue<StringBuilder> sq;

	static void sol(int i) {
		// System.out.println(i+" i");
		if (i == 0) {
			if (ff) {
				sol(i + 1);
			}
		} else if (i == n) {
			sb = new StringBuilder();
			for (int l : ans)
				sb.append(l + "");
			c++;
			// System.out.println(c);
			sq.add(sb);
			if (c == k)
				ff = false;
		} else {
			for (int y = 0; y < np[i].size(); y++) {
				ans[np[i].get(y)] = 1;
				if (ff) {
					sol(i + 1);
					ans[np[i].get(y)] = 0;
				}
				if (!ff)
					return;
			}
		}
	}

	static class pair {
		int x;
		int y;
		int num;

		pair(int f, int t, int n) {
			x = f;
			y = t;
			num = n;
		}

		public String toString() {
			return x + " " + y + " " + num;
		}
	}

	public int[] merge(int[] d, int st, int e) {
		if (st > e)
			return null;
		if (e == st) {
			int[] ans = { d[e] };
			return ans;
		}
		int mid = (st + e) / 2;
		int[] ans = new int[e - st + 1];
		int[] ll = merge(d, st, mid);
		int[] rr = merge(d, mid + 1, e);
		if (ll == null)
			return rr;
		if (rr == null)
			return ll;
		int iver = 0;
		int idxl = 0;
		int idxr = 0;
		for (int i = st; i <= e; i++) {
			if (ll[idxl] < rr[idxr]) {

			}
		}
		return ans;
	}

	public static class pair1 implements Comparable<pair1> {
		int a;
		int idx;

		pair1(int a, int i) {
			this.a = a;
			idx = i;
		}

		public String toString() {
			return a + " " + idx;
		}

		@Override
		public int compareTo(pair1 o) {
			return o.a - a;
		}
	}

	public static class pair2 implements Comparable<pair2> {
		int a;
		int idx;

		pair2(int a, int i) {
			this.a = a;
			idx = i;
		}

		public String toString() {
			return a + " " + idx;
		}

		@Override
		public int compareTo(pair2 o) {
			// TODO Auto-generated method stub
			return idx - o.idx;
		}
	}

	static int inver(long x) {
		int a = (int) x;
		int e = (13 - 2);
		int res = 1;
		while (e > 0) {
			if ((e & 1) == 1) {
				// System.out.println(res*a);
				res = (int) ((1l * res * a) % 13);
			}
			a = (int) ((1l * a * a) % 13);
			e >>= 1;
		}
		// out.println(res+" "+x);
		return res % 13;
	}

	static int atMostSum(int arr[], int n, int k) {
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
			else if (sum != 0) {
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
				sTree[node] = gcd(sTree[node << 1], sTree[node << 1 | 1]);
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
			// propagate(node, b, mid, e);
			int q1 = query(node << 1, b, mid, i, j);
			int q2 = query(node << 1 | 1, mid + 1, e, i, j);
			return gcd(q1, q2);
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