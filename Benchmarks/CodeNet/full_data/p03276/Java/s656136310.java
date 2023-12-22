import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.TreeSet;
import java.util.Objects;
import java.util.List;
import java.util.AbstractCollection;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Collections;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		Scanner in = new Scanner(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		TaskD solver = new TaskD();
		solver.solve(1, in, out);
		out.close();
	}

	static class TaskD {
		public void solve(int testNumber, Scanner sc, PrintWriter out) {

			int n = sc.nextInt();
			Int[] a = new Int[n];
			for (int i = 0; i < n; i++) {
				a[i] = new Int(i, sc.nextInt());
			}
			List<Integer> list = new LinkedList<>();
			TreeSet<Int> set = new TreeSet<>();
			for (int l = 0; l < n; l++) {
				if (l % 2 == 0) {
					for (int r = l; r < n; r++) {
						set.add(a[r]);
						int size = set.size();
						int median = set.toArray(new Int[size])[size / 2].n;
						int tmp = Collections.binarySearch(list, median);
						list.add(tmp < 0 ? -tmp - 1 : tmp, median);
					}
					set.remove(a[l]);
				} else {
					for (int r = n - 1; r >= l; r--) {
						int size = set.size();
						int median = set.toArray(new Int[size])[size / 2].n;
						int tmp = Collections.binarySearch(list, median);
						list.add(tmp < 0 ? -tmp - 1 : tmp, median);
						set.remove(a[r]);
					}
				}
			}

			out.println(list.get(list.size() / 2));

		}

	}

	static class Int implements Comparable<Int> {
		int i;
		int n;

		Int(int i, int n) {
			this.i = i;
			this.n = n;
		}

		public int hashCode() {
			return Objects.hash(i, n);
		}

		public int compareTo(Int o) {
			int tmp = this.n - o.n;
			return tmp == 0 ? this.i - o.i : tmp;
		}

		public String toString() {
			return "i: " + i + ", n: " + n;
		}

	}

	static class Scanner {
		private final InputStream in;
		private final byte[] buffer;
		private int ptr;
		private int buflen;

		public Scanner(InputStream in) {
			this.in = in;
			this.buffer = new byte[1024];
			this.ptr = 0;
			this.buflen = 0;
		}

		private boolean hasNextByte() {
			if (ptr < buflen) return true;
			else {
				ptr = 0;
				try {
					buflen = in.read(buffer);
				} catch (IOException e) {
					e.printStackTrace();
				}
				if (buflen <= 0) return false;
			}
			return true;
		}

		private byte readByte() {
			if (hasNextByte()) return buffer[ptr++];
			return -1;
		}

		private boolean isPrintableChar(byte c) {
			return '!' <= c && c <= '~';
		}

		private void skipUnprintable() {
			while (hasNextByte() && !isPrintableChar(buffer[ptr])) {
				ptr++;
			}
		}

		public boolean hasNext() {
			skipUnprintable();
			return hasNextByte();
		}

		public int nextInt() {
			if (!hasNext()) throw new NoSuchElementException();
			int n = 0;
			boolean minus = false;
			byte b = readByte();
			if (b == '-') {
				minus = true;
				b = readByte();
			}
			if (b < '0' || '9' < b) throw new NumberFormatException();
			while (true) {
				if ('0' <= b && b <= '9') {
					n *= 10;
					n += b - '0';
				} else if (b == -1 || !isPrintableChar(b)) {
					return minus ? -n : n;
				} else {
					throw new NumberFormatException();
				}
				b = readByte();
			}
		}

	}
}

