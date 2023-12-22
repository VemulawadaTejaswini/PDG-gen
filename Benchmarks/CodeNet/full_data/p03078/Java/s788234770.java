import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.TreeSet;

public class Main {

	private static final class Elem {
		final long sum;
		final int ai;
		final int bi;
		final int ci;
		Elem(long sum, int ai, int bi, int ci) {
			this.sum = sum;
			this.ai = ai;
			this.bi = bi;
			this.ci = ci;
		}
		@Override
		public int hashCode() {
			return Objects.hash(ai, bi, ci, sum);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (!(obj instanceof Elem))
				return false;
			Elem other = (Elem) obj;
			return ai == other.ai && bi == other.bi && ci == other.ci
					&& sum == other.sum;
		}
		static final Comparator<Elem> COMPARATOR;
		static {
			Comparator<Elem> c = Comparator.comparingLong(elem -> elem.sum);
			COMPARATOR = c.thenComparingInt(elem -> elem.ai)
					.thenComparingInt(elem -> elem.bi)
					.thenComparingInt(elem -> elem.ci);
		}
	}

	private interface Maker {
		Elem make(int ai, int bi, int ci);
	}

	static void exec(MyScanner in, PrintWriter out) {
		int X = in.nextInt();
		int Y = in.nextInt();
		int Z = in.nextInt();
		int K = in.nextInt();
		long[] A = new long[X];
		long[] B = new long[Y];
		long[] C = new long[Z];
		Arrays.setAll(A, i -> in.nextLong());
		Arrays.setAll(B, i -> in.nextLong());
		Arrays.setAll(C, i -> in.nextLong());
		Arrays.sort(A);
		Arrays.sort(B);
		Arrays.sort(C);
		NavigableSet<Elem> set = new TreeSet<>(Elem.COMPARATOR);
		Maker m = (ai, bi, ci) -> {
			long sum = A[ai] + B[bi] + C[ci];
			return new Elem(sum, ai, bi, ci);
		};
		set.add(m.make(A.length - 1, B.length - 1, C.length - 1));
		for (int i = 0; i < K; i += 1) {
			Elem e = set.pollLast();
			if (e == null)
				break;
			out.println(e.sum);
			if (e.ai - 1 >= 0)
				set.add(m.make(e.ai - 1, e.bi, e.ci));
			if (e.bi - 1 >= 0)
				set.add(m.make(e.ai, e.bi - 1, e.ci));
			if (e.ci - 1 >= 0)
				set.add(m.make(e.ai, e.bi, e.ci - 1));
		}
	}

	public static void main(String[] args) {
		PrintWriter w = new PrintWriter(System.out);
		exec(new MyScanner(System.in), w);
		w.flush();
	}

	static class MyScanner {
		static final int BUFFER_SIZE = 1024;
		private final InputStream in;
		private final byte[] buffer = new byte[BUFFER_SIZE];
		private int point;
		private int readLength;
		MyScanner(InputStream in) {
			this.in = in;
		}
		private int readByte() {
			if (point < readLength) {
				int result = buffer[point];
				point += 1;
				return result;
			}
			try {
				readLength = in.read(buffer);
			} catch (IOException e) {
				e.printStackTrace();
			}
			if (readLength == -1) {
				return -1;
			}
			point = 1;
			return buffer[0];
		}
		static boolean isPrintableCharExceptSpace(int c) {
			return 33 <= c && c <= 126;
		}
		String next() {
			StringBuilder b = new StringBuilder();
			int c = readByte();
			while (!(c == -1 || isPrintableCharExceptSpace(c))) {
				c = readByte();
			}
			if (c == -1) {
				throw new NoSuchElementException();
			}
			do {
				b.appendCodePoint(c);
				c = readByte();
			} while (c != -1 && isPrintableCharExceptSpace(c));
			return b.toString();
		}
		long nextLong() {
			int c = readByte();
			while (!(c == -1 || isPrintableCharExceptSpace(c))) {
				c = readByte();
			}
			if (c == -1) {
				throw new NoSuchElementException();
			}
			boolean minus = false;
			if (c == '-') {
				minus = true;
				c = readByte();
			}
			long result = 0L;
			do {
				if (!('0' <= c && c <= '9')) {
					throw new InputMismatchException();
				}
				result = result * 10L + (c - '0');
				c = readByte();
			} while (c != -1 && isPrintableCharExceptSpace(c));
			return minus ? -result : result;
		}
		int nextInt() {
			long n = nextLong();
			if (Integer.MIN_VALUE <= n && n <= Integer.MAX_VALUE) {
				return (int) n;
			}
			throw new InputMismatchException();
		}
		double nextDouble() {
			return Double.parseDouble(next());
		}
	}

}
