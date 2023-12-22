import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);

		int N = sc.nextInt();
		int C = sc.nextInt();
		List<Set<Pair>> l = new ArrayList<>();
		for (int i = 0; i < C; i++) {
			l.add(new HashSet<>());
		}
		for (int i = 0; i < N; i++) {
			int s = sc.nextInt() * 2;
			int t = sc.nextInt() * 2;
			int c = sc.nextInt() - 1;
			l.get(c).add(new Pair(s, t));
		}
		List<List<Pair>> ll = new ArrayList<>();
		for (Set<Pair> set : l) {
			if (set.size() == 0) continue;
			List<Pair> al = new ArrayList<>();
			List<Pair> ps = new ArrayList<Pair>(set);
			int ss = ps.get(0).s;
			for (int i = 1; i < ps.size(); i++) {
				if (ps.get(i - 1).t != ps.get(i).s) {
					al.add(new Pair(ss, ps.get(i - 1).t));
					ss = ps.get(i).s;
				}
			}
			al.add(new Pair(ss, ps.get(ps.size() - 1).t));
			ll.add(al);
		}

		int[] table = new int[364364];
		for (List<Pair> ps : ll) {
			for (Pair p : ps) {
				table[p.s - 1]++;
				table[p.t]--;
			}
		}
		for (int i = 1; i < table.length; i++) {
			table[i] += table[i - 1];
		}
		int max = 0;
		for (int i = 0; i < table.length; i++) {
			max = Math.max(max, table[i]);
		}

		out.println(max);
		out.flush();
	}

	static class Pair implements Comparable<Pair> {
		int s, t;

		Pair(int s, int t) {
			this.s = s;
			this.t = t;
		}

		@Override
		public int compareTo(Pair p) {
			return this.s - p.s;
		}
	}

}

class FastScanner {
	private final InputStream in = System.in;
	private final byte[] buffer = new byte[1024];
	private int ptr = 0;
	private int buflen = 0;

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

	public String next() {
		if (!hasNext()) throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		byte b = readByte();
		while (isPrintableChar(b)) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
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

	public int[] nextIntArray(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = nextInt();
		}
		return a;
	}

	public long nextLong() {
		if (!hasNext()) throw new NoSuchElementException();
		long n = 0;
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

	public long[] nextLongArray(int n) {
		long[] a = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = nextInt();
		}
		return a;
	}
}