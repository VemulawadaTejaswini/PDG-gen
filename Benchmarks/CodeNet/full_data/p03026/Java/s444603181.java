
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;

public class Main {

	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		FastIO io = new FastIO();
		/*
		 * 貪欲に近い形になることが予想される
		 * まず、一番大きい値は採用不可
		 * そうでないものを全て採用できるか考えてみる
		 * 適当な頂点から根付き有向木を構築してみる
		 * すると、どの頂点についても根から遠い方が採用されることが分かる
		 * これは先の条件を満たす、終了
		 * 次に、より大きな同じ頂点を2個採用できるか考える
		 * これは無理なので解けました
		 * 
		 */
		int N = io.nextInt();
		List<List<Integer>> tree = new ArrayList<>();
		for (int i = 0;i < N;++ i) tree.add(new ArrayList<>());
		for (int i = 1;i < N;++ i) {
			int l = io.nextInt() - 1, r = io.nextInt() - 1;
			tree.get(l).add(r);
			tree.get(r).add(l);
		}
		int[] c = io.nextInt(N), ans = new int[N];
		Arrays.sort(c);
		BreadthFirstSearch<Integer> bfs = new BreadthFirstSearch<>();
		bfs.push(0);
		int count = N;
		for (int i : bfs) {
			ans[i] = c[--count];
			for (int j : tree.get(i)) bfs.push(j);
		}
		int sum = 0;
		for (int i = 0;i < N - 1;++ i) sum += c[i];
		io.println(sum);
		for (int i : ans) io.print(i + " ");
		io.flush();
	}
	
	public class BreadthFirstSearch<T> implements Iterable<T>, Iterator<T>{
		List<Deque<T>> queue;
		HashSet<T> hash;
		int size;
		int read;

		public BreadthFirstSearch() {
			this(1);
		}

		public BreadthFirstSearch(int n) {
			queue = new ArrayList<Deque<T>>();
			for (int i = 0;i < n;++ i) queue.add(new ArrayDeque<T>());
			hash = new HashSet<T>();
			size = read = 0;
		}

		public BreadthFirstSearch(T t) {
			this(1, t);
		}

		public BreadthFirstSearch(int n, T t) {
			this(n);
			push(t);
		}

		public boolean push(int n, T t) {
			if (n < 0 || n > queue.size()) throw new IndexOutOfBoundsException();
			if (n == 0) { // stackとして使う
				Deque<T> que = queue.get(read);
				if (!hash.add(t)) return false;
				que.addFirst(t);
			} else { // queueとして使う
				Deque<T> que = queue.get(getPoint(read, n - 1));
				if (!hash.add(t)) return false;
				que.addLast(t);
			}
			++ size;
			return true;
		}

		public boolean push(T t) {
			return push(1, t);
		}

		private int getPoint(int n, int add) {
			int ret = n + add;
			return ret < queue.size() ? ret : queue.size() - ret;
		}

		public boolean contains(T t) {
			return hash.contains(t);
		}

		public void clear() {
			for (Deque<T> i : queue) i.clear();
			hash.clear();
			size = read = 0;
		}

		@Override
		public Iterator<T> iterator() {
			return this;
		}

		@Override
		public boolean hasNext() {
			return size > 0;
		}

		@Override
		public T next() {
			if (size <= 0) throw new NoSuchElementException();
			while (queue.get(read).isEmpty()) read = getPoint(read, 1);
			-- size;
			return queue.get(read).pollFirst();
		}
	}

	public class FastIO {
		private final InputStream in = System.in;
		private final byte[] buffer = new byte[1024];
		private int read = 0;
		private int length = 0;
		public final PrintWriter out = new PrintWriter(System.out, false);
		public final PrintWriter err = new PrintWriter(System.err, false);

		private boolean hasNextByte() {
			if (read < length) return true;
			else {
				try {
					read = 0;
					length = in.read(buffer);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return length > 0;
		}

		private int readByte() {
			return hasNextByte() ? buffer[read++] : -1;
		}

		private boolean isPrintableChar(int c) {
			return 33 <= c && c <= 126;
		}

		private boolean isNumber(int c) {
			return '0' <= c && c <= '9';
		}

		public boolean hasNext() {
			while (hasNextByte() && !isPrintableChar(buffer[read])) read++;
			return hasNextByte();
		}

		public char nextChar() {
			if (!hasNextByte())  throw new NoSuchElementException();
			return (char)readByte();
		}

		public String next() {
			if (!hasNext()) throw new NoSuchElementException();
			StringBuilder sb = new StringBuilder();
			int b;
			while (isPrintableChar(b = readByte())) sb.appendCodePoint(b);
			return sb.toString();
		}

		public long nextLong() {
			if (!hasNext()) throw new NoSuchElementException();
			long n = 0;
			boolean minus = false;
			int b = readByte();
			if (b == '-') {
				minus = true;
				b = readByte();
			}
			if (!isNumber(b)) throw new NumberFormatException();
			while (true) {
				if (isNumber(b)) {
					n *= 10;
					n += b - '0';
				} else if (b == -1 || !isPrintableChar(b)) return minus ? -n : n;
				else throw new NumberFormatException();
				b = readByte();
			}
		}

		public int nextInt() {
			long nl = nextLong();
			if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
			return (int) nl;
		}

		public double nextDouble() {
			return Double.parseDouble(next());
		}

		public int[] nextInt(int width) {
			int[] ret = new int[width];
			for (int i = 0;i < width;++ i) ret[i] = nextInt();
			return ret;
		}

		public long[] nextLong(int width) {
			long[] ret = new long[width];
			for (int i = 0;i < width;++ i) ret[i] = nextLong();
			return ret;
		}

		public int[][] nextInt(int width, int height) {
			int[][] ret = new int[height][width];
			for (int i = 0, j;i < height;++ i) for (j = 0;j < width;++ j) ret[i][j] = nextInt();
			return ret;
		}

		public long[][] nextLong(int width, int height) {
			long[][] ret = new long[height][width];
			for (int i = 0, j;i < height;++ i) for (j = 0;j < width;++ j) ret[j][i] = nextLong();
			return ret;
		}

		public boolean[] nextBoolean(char T) {
			char[] s = next().toCharArray();
			boolean[] ret = new boolean[s.length];
			for (int i = 0;i < ret.length;++ i) ret[i] = s[i] == T;
			return ret;
		}

		@Override
		protected void finalize() throws Throwable {
			try {
				super.finalize();
			} finally {
				in.close();
				out.close();
				err.close();
			}
		}

		public void print(boolean b) {
			out.print(b);
		}

		public void print(char c) {
			out.print(c);
		}

		public void print(char[] s) {
			out.print(s);
		}

		public void print(double d) {
			out.print(d);
		}

		public void print(float f) {
			out.print(f);
		}

		public void print(int i) {
			out.print(i);
		}

		public void print(long l) {
			out.print(l);
		}

		public void print(Object obj) {
			out.print(obj);
		}

		public void print(String s) {
			out.print(s);
		}

		public void printf(String format, Object... args) {
			out.printf(format, args);
		}

		public void printf(Locale l, String format, Object... args) {
			out.printf(l, format, args);
		}

		public void println() {
			out.println();
		}

		public void println(boolean b) {
			out.println(b);
		}

		public void println(char c) {
			out.println(c);
		}

		public void println(char[] s) {
			out.println(s);
		}

		public void println(double d) {
			out.println(d);
		}

		public void println(float f) {
			out.println(f);
		}

		public void println(int i) {
			out.println(i);
		}

		public void println(long l) {
			out.println(l);
		}

		public void println(Object obj) {
			out.println(obj);
		}

		public void println(String s) {
			out.println(s);
		}

		public void flush() {
			out.flush();
			err.flush();
		}
	}
}
