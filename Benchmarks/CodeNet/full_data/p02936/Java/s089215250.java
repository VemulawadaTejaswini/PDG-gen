import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

public class Main {

	static class Node {
		Node p;
		Set<Node> cs;
		int val;
		final int i;

		Node(int i, int max) {
			this.i = i;
			cs = new HashSet<>(i);
		}

		void addVal(int val) {
			this.val +=val;
			for(Node c:cs) {
				c.addVal(val);
			}
		}
	}

	public static void main(String[] args) {
		int n = (int) sc.nextLong();
		int q = (int)sc.nextLong();

		List<Node> nodes = new ArrayList<>(n);
		for (int i = 0; i < n; i++) {
			nodes.add(new Node(i, n));
		}

		for (int i = 0, max = n - 1; i < max; i++) {
			int n0 = (int) sc.nextLong();
			int n1 = (int) sc.nextLong();
			Node node0 = nodes.get(n0-1);
			Node node1 = nodes.get(n1-1);
			node0.cs.add(node1);
			node1.p = node0;
		}

		for( int i = 0; i < q; i++) {
			int ni = (int)sc.nextLong();
			int v = (int)sc.nextLong();
			Node node = nodes.get(ni-1);
			node.addVal(v);
		}
		
		boolean first = true;
		for(Node node:nodes) {
			if(!first) {
				pw.print(" ");
			}
			pw.print(node.val);
			first = false;
		}
		pw.flush();
	}

	double create(double x, double y) {
		return (x + y) / 2d;
	}

	static final FastScanner sc = new FastScanner();
	static final PrintWriter pw = new PrintWriter(System.out);

	static class FastScanner {
		private final InputStream in = System.in;
		private final byte[] buffer = new byte[1024];
		private int ptr = 0;
		private int buflen = 0;

		private boolean hasNextByte() {
			if (ptr < buflen) {
				return true;
			} else {
				ptr = 0;
				try {
					buflen = in.read(buffer);
				} catch (IOException e) {
					e.printStackTrace();
				}
				if (buflen <= 0) {
					return false;
				}
			}
			return true;
		}

		private int readByte() {
			if (hasNextByte())
				return buffer[ptr++];
			else
				return -1;
		}

		static boolean isPrintableChar(int c) {
			return 33 <= c && c <= 126;
		}

		private void skipUnprintable() {
			while (hasNextByte() && !isPrintableChar(buffer[ptr]))
				ptr++;
		}

		public boolean hasNext() {
			skipUnprintable();
			return hasNextByte();
		}

		public String next() {
			if (!hasNext())
				throw new NoSuchElementException();
			StringBuilder sb = new StringBuilder();
			int b = readByte();
			while (isPrintableChar(b)) {
				sb.appendCodePoint(b);
				b = readByte();
			}
			return sb.toString();
		}

		public long nextLong() {
			if (!hasNext())
				throw new NoSuchElementException();
			long n = 0;
			boolean minus = false;
			int b = readByte();
			if (b == '-') {
				minus = true;
				b = readByte();
			}
			if (b < '0' || '9' < b) {
				throw new NumberFormatException();
			}
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
