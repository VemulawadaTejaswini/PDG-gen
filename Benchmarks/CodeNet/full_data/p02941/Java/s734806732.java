import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
	
	static int N;
	static int[] A, B;
	static MaxSegmentTree tree;
	
	public static void main(String[] args) throws IOException {
		MyScanner sc = new MyScanner();
		PrintWriter out = new PrintWriter(System.out);
		N = sc.nextInt();
		A = new int[N];
		B = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		for (int i = 0; i < N; i++) {
			B[i] = sc.nextInt();
		}
		tree = new MaxSegmentTree(B.clone());
		out.println(steps(1, 0, true));
		
		out.flush();
	}
	
	static int getMax(int from, int to, boolean circular) {
		if (circular) {
			int tmp1 = from <= N ? tree.getMaxPos(from, N - 1) : -1;
			int tmp2 = 0 <= to ? tree.getMaxPos(0, to) : -1;
			return tmp1 != -1 && (tmp2 == -1 || B[tmp1] >=  B[tmp2]) ? tmp1 : tmp2;
		}
		return tree.getMaxPos(from, to);
	}
	
	static int steps(int from, int to, boolean circular) {
		int size = circular ? N - from + to + 1: to - from + 1;
		if (size <= 0) return 0;
		int max = getMax(from, to, circular);
		if (A[max] == B[max]) {
			if (circular && from == to + 1) {
				return steps(max + 1, max - 1, true);
			}
			int tmp = steps(from, max-1, from <= max ? false : circular);
			if (tmp == -1) return -1;
			int ret = tmp;
			tmp = steps(max + 1, to, max <= to ? false : circular);
			if (tmp == -1) return 1;
			return ret + tmp;
		} else if (A[max] > B[max]) {
			return -1;
		}
		int next = (max + 1) % N;
		int prev = (max + N - 1) % N;
		int other = B[next] + B[prev];
		int dif = B[max] - A[max];
		int ops = dif / other;
		B[max] -= ops * other;
		tree.set(max, B[max]);
		if (B[max] >= B[next] && B[max] >= B[prev]) {
			if (B[max] != A[max]) return -1;
		}
		int tmp = steps(from, to, circular);
		if (tmp == -1) return -1;
		return tmp + ops;
	}
	
	static class MaxSegmentTree {
		int[] left, right, val, elems, maxPos;
		
		public MaxSegmentTree(int[] elems) {
			this.elems = elems;
			int N = elems.length;
			left = new int[4 * N];
			right = new int[4 * N];
			val = new int[4 * N];
			maxPos = new int[4 * N];
			fill(0, 0, N -1);
		}
		
		private void fill(int index, int from, int to) {
			left[index] = from;
			right[index] = to;
			if (from < to) {
				int med = (from + to) / 2;
				fill(2 * index + 1, from, med);
				fill(2 * index + 2, med + 1, to);
				val[index] = Math.max(val[2*index + 1], val[2*index + 2]);
				if (val[index] == val[2*index + 1]) maxPos[index] = maxPos[2* index + 1];
				else maxPos[index] = maxPos[2 * index + 2];
			} else {
				val[index] = elems[from];
				maxPos[index] = from;
			}
		}
		
		public void set(int pos, int value) {
			set(0, pos, value);
		}
		
		private void set(int index, int pos, int value) {
			if (pos < left[index] || right[index] < pos) return;
			if (left[index] ==  right[index]) {
				val[index] = value;
				return;
			}
			set(2 * index + 1, pos, value);
			set(2 * index + 2, pos, value);
			val[index] = Math.max(val[2*index + 1], val[2*index + 2]);
			if (val[index] == val[2*index + 1]) maxPos[index] = maxPos[2* index + 1];
			else maxPos[index] = maxPos[2 * index + 2];
		}
		
		public int getMax(int from, int to) {
			return elems[getMaxPos(0, from, to)];
		}
		
		public int getMaxPos(int from, int to) {
			return getMaxPos(0, from, to);
		}
		
		private int getMaxPos(int index, int from, int to) {
			if (from <= left[index] && right[index] <= to) return maxPos[index];
			if (from > right[index] || to < left[index]) return -1;
			int lPos = getMaxPos(2 * index + 1, from, to);
			int rPos = getMaxPos(2 * index + 2, from, to);
			if (lPos != -1 && (rPos == -1 || elems[lPos] > elems[rPos])) return lPos;
			return rPos;
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
