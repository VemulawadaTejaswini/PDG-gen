
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.IntUnaryOperator;
import java.util.function.Predicate;

public class Main {

	public static void main(String args[]) {
		FastScanner cin = new FastScanner();
		PrintWriter cout = new PrintWriter(System.out);
		solve(cin, cout);
		cout.flush();
	}

	private static void solve(FastScanner cin, PrintWriter cout) {
		int n = cin.nextInt();
		int[][] xys = new int[n][];
		for (int i = 0; i < n; i++)
			xys[i] = new int[] { cin.nextInt(), cin.nextInt(), i };

		long ans = solve(n, xys);
		cout.println(ans);
	}

	private static long solve(int n, int[][] xys) {
		// editorialと他人の解答を参考

		ArrayList<int[]> edges = new ArrayList<>();

		ArrayList<int[]> ordered = new ArrayList<>();
		ordered.addAll(Arrays.asList(xys));
		for (int j = 0; j < 2; j++) {
			int tmp = j;
			Collections.sort(ordered, Comparator.comparingInt((xy) -> xy[tmp]));
			for (int i = 1; i < n; i++) {
				int fr = ordered.get(i - 1)[2];
				int to = ordered.get(i)[2];
				int[] frxy = xys[fr];
				int[] toxy = xys[to];
				int w = Math.abs(frxy[tmp] - toxy[tmp]);
				// int w = Math.min(Math.abs(frxy[0] - toxy[0]),
				// Math.abs(frxy[1] - toxy[1]));
				edges.add(new int[] { w, fr, to });
			}
		}

		// 最小全域木
		// https://ja.wikipedia.org/wiki/%E5%85%A8%E5%9F%9F%E6%9C%A8
		// クラスカル法
		// https://en.wikipedia.org/wiki/Kruskal%27s_algorithm
		long ans = 0;
		Collections.sort(edges, Comparator.comparingInt((e) -> e[0]));

		int[] rt = new int[n];
		Arrays.fill(rt, -1);
		IntUnaryOperator root = new IntUnaryOperator() {
			@Override
			public int applyAsInt(int operand) {
				if (rt[operand] < 0)
					return operand;
				return rt[operand] = this.applyAsInt(rt[operand]);
			}
		};
		Predicate<int[]> unite = new Predicate<int[]>() {
			@Override
			public boolean test(int[] t) {
				int a = root.applyAsInt(t[0]);
				int b = root.applyAsInt(t[1]);
				if (a == b)
					return false;
				if (rt[a] > rt[b]) {
					int tmp = a;
					a = b;
					b = tmp;
				}
				rt[a] += rt[b];
				rt[b] = a;
				return true;
			}
		};
		for (int[] e : edges) {
			int w = e[0];
			int fr = e[1];
			int to = e[2];
			if (!unite.test(new int[] { fr, to }))
				continue;
			ans += w;
			// System.out.println(fr + " " + to);
			// System.out.println(Arrays.toString(rt));
		}
		return ans;
	};

	static class FastScanner {
		private final InputStream in = System.in;
		private final byte[] buffer = new byte[1 << 12];
		private final long[] number = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		private int ptr = 0;
		private int buflen = 0;

		private boolean hasNextByte() {
			if (ptr < buflen)
				return true;
			ptr = 0;
			try {
				buflen = in.read(buffer);
			} catch (IOException e) {
				throw new IllegalStateException(e);
			}
			if (buflen <= 0)
				return false;
			return true;
		}

		private int readByte() {
			if (hasNextByte())
				return buffer[ptr++];
			else
				return -1;
		}

		boolean hasNext() {
			while (hasNextByte() && !isMeaningful(buffer[ptr]))
				ptr++;
			return hasNextByte();
		}

		String next() {
			if (!hasNext())
				throw new IllegalArgumentException();
			StringBuilder sb = new StringBuilder();
			int b = readByte();
			while (isMeaningful(b)) {
				sb.appendCodePoint(b);
				b = readByte();
			}
			return sb.toString();
		}

		long nextLong() {
			if (!hasNext())
				throw new IllegalArgumentException();
			long n = 0;
			int plus = 1;
			int b = readByte();
			if (b == '-') {
				plus = -1;
				b = readByte();
			}
			if ('0' > b || b > '9')
				throw new IllegalArgumentException();
			while (true) {
				if (!isMeaningful(b))
					return plus * n;
				n *= 10;
				n += number[b - '0'];
				b = readByte();
			}
		}

		private boolean isMeaningful(int b) {
			return 33 <= b && b <= 126;
			// if not ASCII
			// return b != -1 && !Character.isWhitespace(b);
		}

		int nextInt() {
			long nl = nextLong();
			int ni = (int) nl;
			if (ni != nl)
				throw new IllegalArgumentException();
			return ni;
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}
	}

}
