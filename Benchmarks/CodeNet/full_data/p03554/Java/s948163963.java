import java.util.*;
import java.io.*;

public class Main {
	
	void solve() {
		int n=  in.nextInt();
		int[] zeros = new int[n + 1];
		int[] ones = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			int x = in.nextInt();
			zeros[i] = zeros[i - 1];
			ones[i] = ones[i - 1];
			if (x == 0) {
				zeros[i]++;
			} else {
				ones[i]++;
			}
		}
		
		int q = in.nextInt();
		List<Query>[] left = new List[n + 1], right = new List[n + 1];
		for (int i = 0; i <= n; i++) {
			left[i] = new ArrayList<>();
			right[i] = new ArrayList<>();
		}
		Query[] qs = new Query[q];
		for (int i = 0; i < q; i++) {
			qs[i] = new Query(in.nextInt(), in.nextInt(), i);
			left[qs[i].l].add(qs[i]);
			right[qs[i].r].add(qs[i]);
		}
		
		int[] ans = new int[q];
		SegmentTree2D treeZ = new SegmentTree2D(n + 1, right);
		SegmentTree treeO = new SegmentTree(n + 1);
		
		int result = ones[n];
		for (int r = 1; r <= n; r++) {
			
			for (Query query : right[r]) {
				ans[query.i] = zeros[query.r] - zeros[query.l - 1] + ones[query.l - 1];
				
				ans[query.i] = Math.min(ans[query.i], treeZ.get(query.l, query.r, query.l) + zeros[query.r]);
				
				ans[query.i] = Math.min(ans[query.i], treeO.get(0, query.l) + zeros[query.r] - zeros[query.l - 1] + ones[query.l - 1]);
				
				result = Math.min(result, ans[query.i] + ones[n] - ones[query.r]);
			}
			
			for (Query query : right[r]) {
				treeZ.set(query.r, query.l, ans[query.i] - zeros[query.r]);
				treeO.set(query.r, ans[query.i] - ones[query.r]);
			}
		}
		out.println(result);
	}
	
	int INF = Integer.MAX_VALUE / 3;
	
	class BIT {
		int[] min;
		public BIT(int n) {
			min = new int[n];
			Arrays.fill(min, INF);
		}
		
		void add(int pos, int val) {
			while (pos < min.length) {
				min[pos] = Math.min(min[pos], val);
				pos |= pos + 1;
			}
		}
		
		int get(int pos) {
			int res = INF;
			while (pos >= 0) {
				res = Math.min(res, min[pos]);
				pos = (pos & (pos + 1)) - 1;
			}
			return res;
		}
	}
	
	class SegmentTree2D {
		List<Integer>[] lists;
		BIT[] bits;
		int size;
		
		public SegmentTree2D(int n, List<Query>[] right) {
			lists = new List[4 * n];
			bits = new BIT[4 * n];
			size = n;
			build(0, size, 0, right);
		}
		
		private void build(int l, int r, int i, List<Query>[] right) {
			int m = (l + r) / 2;
			if (l + 1 != r) {
				build(l, m, 2 * i + 1, right);
				build(m, r, 2 * i + 2, right);
			}
			
			Set<Integer> rights=  new TreeSet<>();
			for (int j = l; j < r; j++) {
				for (Query q : right[j]) {
					rights.add(q.l);
				}
			}
			lists[i] = new ArrayList<Integer>(rights);
			bits[i] = new BIT(lists[i].size());
		}

		void set(int pos, int posL, int val) {
			set(0, size, pos, posL, val, 0);
		}
		
		void set(int l, int r, int pos, int posL, int val, int i) {
			bits[i].add(Collections.binarySearch(lists[i], posL), val);
			if (l + 1 == r) {
				return;
			}
			int m = (l + r) >>> 1;
			if (pos < m) {
				set(l, m, pos, posL, val, 2 * i + 1);
			} else {
				set(m, r, pos, posL, val, 2 * i + 2);
			}
		}
		
		int get(int left, int right, int maxL) {
			return get(0, size, left, right, maxL, 0);
		}
		
		int get(int l, int r, int left, int right, int maxL, int i) {
			if (left <= l && r <= right) {
				int pos = Collections.binarySearch(lists[i], maxL);
				if (pos < 0) {
					pos = -pos - 2;
				} else {
					pos--;
				}
				return bits[i].get(pos);
			} else if (right <= l || r <= left) {
				return INF;
			} else {
				int m = (l + r) >>> 1;
				return Math.min(get(l, m, left, right, maxL, 2 * i + 1), get(m, r, left, right, maxL, 2 * i + 2));
			}
		}
	}
	
	class SegmentTree {
		int[] min;
		int size;
		public SegmentTree(int n) {
			min = new int[4 * n];
			size = n;
			Arrays.fill(min, INF);
		}
		
		void set(int pos, int val) {
			set(0, size, pos, val, 0);
		}
		
		void set(int l, int r, int pos, int val, int i) {
			if (l + 1 == r) {
				min[i] = Math.min(min[i], val);
				return;
			}
			int m = (l + r) >>> 1;
			if (pos < m) {
				set(l, m, pos, val, 2 * i + 1);
			} else {
				set(m, r, pos, val, 2 * i + 2);
			}
			min[i] = Math.min(min[2 * i + 1], min[2 * i + 2]);
		}
		
		int get(int left, int right) {
			return get(0, size, left, right, 0);
		}
		
		int get(int l, int r, int left, int right, int i) {
			if (left <= l && r <= right) {
				return min[i];
			} else if (right <= l || r <= left) {
				return INF;
			} else {
				int m = (l + r) >>> 1;
				return Math.min(get(l, m, left, right, 2 * i + 1), get(m, r, left, right, 2 * i + 2));
			}
		}
	}
	
	class Query {
		int l, r, i;

		public Query(int l, int r, int i) {
			super();
			this.l = l;
			this.r = r;
			this.i = i;
		}

		@Override
		public String toString() {
			return "Query [l=" + l + ", r=" + r + ", i=" + i + "]";
		}
		
		
	}

	FastScanner in;
	PrintWriter out;

	void run() {
		in = new FastScanner();
		out = new PrintWriter(System.out);
		solve();
		out.close();
	}

	class FastScanner {
		BufferedReader br;
		StringTokenizer st;

		public FastScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		public FastScanner(String s) {
			try {
				br = new BufferedReader(new FileReader(s));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		public String nextToken() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
				}
			}
			return st.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(nextToken());
		}

		public long nextLong() {
			return Long.parseLong(nextToken());
		}

		public double nextDouble() {
			return Double.parseDouble(nextToken());
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
