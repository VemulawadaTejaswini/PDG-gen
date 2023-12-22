import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
	static int N, K;
	static int[] P;
	static int[] pref, suf;
	
	public static void main(String[] args) throws IOException {
		MyScanner sc = new MyScanner();
		PrintWriter out = new PrintWriter(System.out);
		N = sc.nextInt();
		K = sc.nextInt();
		P = new int[N];
		for (int i = 0; i < N; i++) {
			P[i] = sc.nextInt();
		}
		
		int[] fromSorted = new int[N], toSorted = new int[N];
		Arrays.fill(toSorted, 1);
		Arrays.fill(fromSorted, 1);
		for (int i = 1; i < N; i++) {
			if (P[i - 1] < P[i]) {
				toSorted[i] = 1 + toSorted[i - 1];
			}
		}
		for (int i = N - 2; i >= 0; i--) {
			if (P[i] < P[i + 1]) {
				fromSorted[i] = 1 + fromSorted[i + 1];
			}
		}
		pref = new int[N - K + 1];
		suf = new int[N - K + 1];
		SegmentTree tree = new SegmentTree(P);
		for (int i = 0; i <= N - K; i++) {
			if (fromSorted[i] < K) {
				pref[i] = cantLeft(i, i + fromSorted[i] - 1, tree.getMin(i + fromSorted[i], i + K - 1));
				suf[i] = cantRight(i + K - toSorted[i + K - 1], i + K - 1, tree.getMax(i, i + K - toSorted[i + K - 1] - 1));
			} else {
				pref[i] = suf[i] = K;
			}
		}
//		System.err.println(Arrays.toString(pref));
//		System.err.println(Arrays.toString(suf));
		TreeSet<Integer> all = new TreeSet<>(cmp);
		for (int i = 0; i <= N - K; i++) {
			all.add(i);
		}
//		System.err.println(all);
		out.println(all.size());
		
		out.flush();
	}
	
	static Comparator<Integer> cmp = new Comparator<Integer>() {
		@Override
		public int compare(Integer o1, Integer o2) {
			boolean rev = false;
			int first = o1, second = o2;
			if (o1 > o2) {
				rev = true;
				first = o2;
				second = o1;
			}
			int ret = 0;
			if (first < second) {
				int dif = Math.min(second - first, K);
				if (pref[first] < dif) {
					ret = -1;
				} else if (suf[second] < dif) {
					ret = 1;
				}
			}
			return rev ? -ret : ret;
		}
	};
	
	static int cantLeft(int from, int to, int min) {
		return (-Arrays.binarySearch(P, from, to + 1, min) - 1) - from;
	}
	
	static int cantRight(int from, int to, int max) {
		return to + 1 - (-Arrays.binarySearch(P, from, to + 1, max) - 1);
	}
	
	static class SegmentTree {
		int[] left, right, maxi, mini, elems;
		
		public SegmentTree(int[] elems) {
			this.elems = elems;
			int N = elems.length;
			left = new int[4 * N];
			right = new int[4 * N];
			maxi = new int[4 * N];
			mini = new int[4 * N];
			fill(0, 0, N - 1);
		}
		
		private void fill(int index, int from, int to) {
			left[index] = from;
			right[index] = to;
			if (from < to) {
				int med = (from + to) / 2;
				fill(2 * index + 1, from, med);
				fill(2 * index + 2, med + 1, to);
				maxi[index] = Math.max(maxi[2 * index + 1], maxi[2 * index + 2]);
				mini[index] = Math.min(mini[2 * index + 1], mini[2 * index + 2]);
			} else {
				maxi[index] = mini[index] = elems[from];
			}
		}
		
		public int getMax(int from, int to) {
			return getMax(0, from, to);
		}
		
		private int getMax(int index, int from, int to) {
			if (from <= left[index] && right[index] <= to) return maxi[index];
			if (from > right[index] || to < left[index]) return Integer.MIN_VALUE;
			return Math.max(getMax(2 * index + 1, from, to), getMax(2 * index + 2, from, to));
		}
		
		public int getMin(int from, int to) {
			return getMin(0, from, to);
		}
		
		private int getMin(int index, int from, int to) {
			if (from <= left[index] && right[index] <= to) return mini[index];
			if (from > right[index] || to < left[index]) return Integer.MAX_VALUE;
			return Math.min(getMin(2 * index + 1, from, to), getMin(2 * index + 2, from, to));
		}
		
	}
	
	
	static class MyScanner {
		private BufferedReader br;
		private StringTokenizer tokenizer;
		
		public MyScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
		
		public String next() {
			while (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return tokenizer.nextToken();
		}
		
		public int nextInt() {
			return Integer.parseInt(next());
		}
		
		public long nextLong() {
			return Long.parseLong(next());
		}
	}
}
