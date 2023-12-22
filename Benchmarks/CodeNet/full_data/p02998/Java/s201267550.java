

import java.util.AbstractCollection;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;

public class Main {

	public static void main(String[] args) {
		new Main();
	}

	private class Point {
		int x, y;
		ArrayList<Point> edge = new ArrayList<Point>();
		Point(int x, int y) {
			this.x = x;
			this.y = y;
		}

		int getX() {
			return x;
		}

		int getY() {
			return y;
		}
	}

	public Main() {
		FastIO io = new FastIO();
		/*
		 * author: 31536000
		 * ABC131 F問題
		 * 考察メモ
		 * 1. (a, b)に対し(a, c)も(d, b)もあれば点が追加できる、これは簡単に探せる
		 * 2. (a, b)に対し(a, c)も(d, c)もあれば点が追加できる、これは……？
		 *
		 * 点がめっちゃ増えそうなヤバいケースを考える
		 * この時、縦x横yに対しxyまで増えるケースがあり、longの範囲になりそう
		 *
		 * 今、ある長方形に対しxかyが一致する点が有ると、その点は長方形の構成に巻き込まれる
		 * よって1の条件を満たすものからスタートし、xとyの個数をSetで求めればその積(-点の個数)だけ新しく点が増える
		 * 各頂点が高々1回しか調べないから勝ちです
		 * 後はグラフを考えるとよくて、隣接するx, yに対し辺を貼るとBFSで解ける
		 */
		int N = io.nextInt();
		Point[] p = new Point[N];
		for (int i : IntRange.open(N)) p[i] = new Point(io.nextInt(), io.nextInt());
		Arrays.sort(p, Comparator.comparing(Point::getX));
		for (int i : IntRange.open(0, N)) {
			if (p[i - 1].x == p[i].x) {
				p[i].edge.add(p[i - 1]);
				p[i - 1].edge.add(p[i]);
			}
		}
		Arrays.sort(p, Comparator.comparing(Point::getY));
		for (int i : IntRange.open(0, N)) {
			if (p[i - 1].y == p[i].y) {
				p[i].edge.add(p[i - 1]);
				p[i - 1].edge.add(p[i]);
			}
		}

		BreadthFirstSearch<Point> bfs = new BreadthFirstSearch<>();
		long ans = 0;
		for (Point i : p) {
			bfs.push(i);
			HashSet<Integer> x = new HashSet<>(), y = new HashSet<>();
			int tmp = 0;
			for (Point j : bfs) {
				x.add(j.x);
				y.add(j.y);
				for (Point k : j.edge) bfs.push(k);
				++ tmp;
			}
			ans += (long)x.size() * y.size() - tmp;
		}
		io.print(ans);

		io.flush();
	}

	public class BreadthFirstSearch<T> implements Iterable<T>, Iterator<T>{
		CircularArray<Deque<T>> queue;
		HashSet<T> hash;
		int size;

		public BreadthFirstSearch() {
			this(1);
		}

		public BreadthFirstSearch(int n) {
			queue = new CircularArray<Deque<T>>(n);
			for (int i = 0;i < n;++ i) queue.set(i, new ArrayDeque<T>());
			hash = new HashSet<T>();
			size = 0;
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
				Deque<T> que = queue.front();
				if (!hash.add(t)) return false;
				que.addFirst(t);
			} else { // queueとして使う
				Deque<T> que = queue.get(n - 1);
				if (!hash.add(t)) return false;
				que.addLast(t);
			}
			++ size;
			return true;
		}

		public boolean push(T t) {
			return push(1, t);
		}

		public boolean contains(T t) {
			return hash.contains(t);
		}

		public void clear() {
			for (Deque<T> i : queue) i.clear();
			hash.clear();
			size = 0;
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
			while (queue.front().isEmpty()) queue.rotateNext();
			-- size;
			return queue.front().pollFirst();
		}
	}

	public class CircularArray<T> extends AbstractCollection<T> implements Serializable{

		private static final long serialVersionUID = 4505120414119274426L;
		final Object[] array;
		int first = 0;
		public CircularArray(int size) {
			array = new Object[size];
		}

		public CircularArray(T[] array) {
			this.array = array;
		}

		private int getIndex(int index) {
			index -= first;
			if (index > array.length) index %= array.length;
			else if (index < 0) index = array.length - index % array.length;
			return index;
		}

		public void setFront(T value) {
			array[first] = value;
		}

		public void set(int index, T value) {
			array[getIndex(index)] = value;
		}

		public void setBack(T value) {
			array[first == 0 ? array.length - 1 : first - 1] = value;
		}

		public T get(int index) {
			@SuppressWarnings("unchecked")
			T ret = (T)array[getIndex(index)];
			return ret;
		}

		public T front() {
			@SuppressWarnings("unchecked")
			T ret = (T)array[first];
			return ret;
		}

		public T back() {
			@SuppressWarnings("unchecked")
			T ret = (T)(first == 0 ? array[array.length - 1] : array[first - 1]);
			return ret;
		}

		public void rotate(int rotate) {
			first = getIndex(rotate);
		}

		public void rotateNext() {
			if (++first >= array.length) first = 0;
		}

		public void rotatePrevious() {
			if (--first < 0) first = array.length - 1;
		}

		private class Iter implements Iterator<T> {
			private int index;
			private int count;
			Iter() {
				index = first;
				count = 0;
			}
			@Override
			public boolean hasNext() {
				return count < array.length;
			}

			@Override
			public T next() {
				@SuppressWarnings("unchecked")
				T ret = (T)array[index];
				if (++index >= array.length) index = 0;
				++ count;
				return ret;
			}
		}

		@Override
		public Iterator<T> iterator() {
			return new Iter();
		}

		@Override
		public int size() {
			return array.length;
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
			read = 0;
			try {
				length = in.read(buffer);
			} catch (IOException e) {
				e.printStackTrace();
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

		public char[][] nextChar(int height) {
			char[][] ret = new char[height][];
			for (int i = 0;i < ret.length;++ i) ret[i] = next().toCharArray();
			return ret;
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

		public boolean nextBoolean(String T) {
			return next().equals(T);
		}

		public boolean[] nextBoolean(char T) {
			char[] s = next().toCharArray();
			boolean[] ret = new boolean[s.length];
			for (int i = 0;i < ret.length;++ i) ret[i] = s[i] == T;
			return ret;
		}

		public boolean[][] nextBoolean(char T, int height) {
			boolean[][] ret = new boolean[height][];
			for (int i = 0;i < ret.length;++ i) {
				char[] s = next().toCharArray();
				ret[i] = new boolean[s.length];
				for (int j = 0;j < ret[i].length;++ j) ret[i][j] = s[j] == T;
			}
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

		public void print(Object[] object, char c) {
			out.print(object[0]);
			for (int i = 1;i < object.length;++ i) {
				out.print(c);
				out.print(object[i]);
			}
		}

		public void print(Object[] object, String str) {
			out.print(object[0]);
			for (int i = 1;i < object.length;++ i) {
				out.print(str);
				out.print(object[i]);
			}
		}

		public void print(Object[][] object, char c, char c2) {
			print(object[0], c);
			for (int i = 1;i < object.length;++ i) {
				out.print(c2);
				print(object[i], c);
			}
		}

		public void print(Object[][] object, String str, String str2) {
			print(object[0], str);
			for (int i = 1;i < object.length;++ i) {
				out.print(str2);
				print(object[i], str);
			}
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

		public void println(Object[] object, char c) {
			out.print(object[0]);
			for (int i = 1;i < object.length;++ i) {
				out.print(c);
				out.print(object[i]);
			}
			out.println();
		}

		public void println(Object[] object, String str) {
			out.print(object[0]);
			for (int i = 1;i < object.length;++ i) {
				out.print(str);
				out.print(object[i]);
			}
			out.println();
		}

		public void println(Object[][] object, char c, char c2) {
			print(object[0], c);
			for (int i = 1;i < object.length;++ i) {
				out.print(c2);
				print(object[i], c);
			}
			out.println();
		}

		public void println(Object[][] object, String str, String str2) {
			print(object[0], str);
			for (int i = 1;i < object.length;++ i) {
				out.print(str2);
				print(object[i], str);
			}
			out.println();
		}

		public void flush() {
			out.flush();
			err.flush();
		}
	}

	public enum BoundType {
		CLOSED, OPEN;
	}

	public static class Range<C> implements Serializable{

	private static final long serialVersionUID = 6582232757238309626L;
	protected C lower;
	protected C upper;
	protected BoundType lowerType;
	protected BoundType upperType;
	private Comparator<? super C> comparator;

	protected Range(C lower, BoundType lowerType, C upper, BoundType upperType) {
		this(lower, lowerType, upper, upperType, null);
	}

	protected Range(C lower, BoundType lowerType, C upper, BoundType upperType, Comparator<? super C> comparator) {
		this.lower = lower;
		this.upper = upper;
		this.lowerType = lowerType;
		this.upperType = upperType;
		this.comparator = comparator;
	}

	public static <C extends Comparable<? super C>> Range<C> range(C lower, BoundType lowerType, C upper, BoundType upperType) {
		if (lower != null && upper != null) {
			int comp = lower.compareTo(upper);
			if (comp > 0) throw new IllegalArgumentException();
			else if (comp == 0) {
				if (lowerType == BoundType.OPEN && upperType == BoundType.OPEN) throw new IllegalArgumentException();
				else if (lowerType == BoundType.OPEN || upperType == BoundType.OPEN)return new Range<C>(null, BoundType.CLOSED, null, BoundType.CLOSED);
			}
		}
		return new Range<C>(lower, lowerType, upper, upperType);
	}

	public static <C> Range<C> range(C lower, BoundType lowerType, C upper, BoundType upperType, Comparator<? super C> comparator) {
		if (lower != null && upper != null) {
			int comp = comparator.compare(lower, upper);
			if (comp > 0) throw new IllegalArgumentException();
			else if (comp == 0) {
				if (lowerType == BoundType.OPEN && upperType == BoundType.OPEN) throw new IllegalArgumentException();
				else if (lowerType == BoundType.OPEN || upperType == BoundType.OPEN)return new Range<C>(null, BoundType.CLOSED, null, BoundType.CLOSED, comparator);
			}
		}
		return new Range<C>(lower, lowerType, upper, upperType, comparator);
	}

	public static <C extends Comparable<? super C>> Range<C> all() {
		return range(null, BoundType.OPEN, null, BoundType.OPEN);
	}

	public static <C> Range<C> all(Comparator<? super C> comparator) {
		return range(null, BoundType.OPEN, null, BoundType.OPEN, comparator);
	}

	public static <C extends Comparable<? super C>> Range<C> atMost(C upper) {
		return range(null, BoundType.OPEN, upper, BoundType.CLOSED);
	}

	public static <C> Range<C> atMost(C upper, Comparator<? super C> comparator) {
		return range(null, BoundType.OPEN, upper, BoundType.CLOSED, comparator);
	}

	public static <C extends Comparable<? super C>> Range<C> lessThan(C upper) {
		return range(null, BoundType.OPEN, upper, BoundType.OPEN);
	}

	public static <C> Range<C> lessThan(C upper, Comparator<? super C> comparator) {
		return range(null, BoundType.OPEN, upper, BoundType.OPEN, comparator);
	}

	public static <C extends Comparable<? super C>> Range<C> downTo(C upper, BoundType boundType) {
		return range(null, BoundType.OPEN, upper, boundType);
	}

	public static <C> Range<C> downTo(C upper, BoundType boundType, Comparator<? super C> comparator) {
		return range(null, BoundType.OPEN, upper, boundType, comparator);
	}

	public static <C extends Comparable<? super C>> Range<C> atLeast(C lower) {
		return range(lower, BoundType.CLOSED, null, BoundType.OPEN);
	}

	public static <C> Range<C> atLeast(C lower, Comparator<? super C> comparator) {
		return range(lower, BoundType.CLOSED, null, BoundType.OPEN, comparator);
	}

	public static <C extends Comparable<? super C>> Range<C> greaterThan(C lower) {
		return range(lower, BoundType.OPEN, null, BoundType.OPEN);
	}

	public static <C> Range<C> greaterThan(C lower, Comparator<? super C> comparator) {
		return range(lower, BoundType.OPEN, null, BoundType.OPEN, comparator);
	}

	public static <C extends Comparable<? super C>> Range<C> upTo(C lower, BoundType boundType) {
		return range(lower, boundType, null, BoundType.OPEN);
	}

	public static <C> Range<C> upTo(C lower, BoundType boundType, Comparator<? super C> comparator) {
		return range(lower, boundType, null, BoundType.OPEN, comparator  );
	}

	public static <C extends Comparable<? super C>> Range<C> open(C lower, C upper) {
		return range(lower, BoundType.OPEN, upper, BoundType.OPEN);
	}

	public static <C> Range<C> open(C lower, C upper, Comparator<? super C> comparator) {
		return range(lower, BoundType.OPEN, upper, BoundType.OPEN, comparator);
	}

	public static <C extends Comparable<? super C>> Range<C> openClosed(C lower, C upper) {
		return range(lower, BoundType.OPEN, upper, BoundType.CLOSED);
	}

	public static <C> Range<C> openClosed(C lower, C upper, Comparator<? super C> comparator) {
		return range(lower, BoundType.OPEN, upper, BoundType.CLOSED, comparator);
	}

	public static <C extends Comparable<? super C>> Range<C> closedOpen(C lower, C upper) {
		return range(lower, BoundType.CLOSED, upper, BoundType.OPEN);
	}

	public static <C> Range<C> closedOpen(C lower, C upper, Comparator<? super C> comparator) {
		return range(lower, BoundType.CLOSED, upper, BoundType.OPEN, comparator);
	}

	public static <C extends Comparable<? super C>> Range<C> closed(C lower, C upper) {
		return range(lower, BoundType.CLOSED, upper, BoundType.CLOSED);
	}

	public static <C> Range<C> closed(C lower, C upper, Comparator<? super C> comparator) {
		return range(lower, BoundType.CLOSED, upper, BoundType.CLOSED, comparator);
	}

	public static <C extends Comparable<? super C>> Range<C> singleton(C value) {
		return range(value, BoundType.CLOSED, value, BoundType.CLOSED);
	}

	public static <C> Range<C> singleton(C value, Comparator<? super C> comparator) {
		return range(value, BoundType.CLOSED, value, BoundType.CLOSED, comparator);
	}

	public static <C extends Comparable<? super C>> Range<C> empty() {
		return range(null, BoundType.CLOSED, null, BoundType.CLOSED);
	}

	public static <C> Range<C> empty(Comparator<? super C> comparator) {
		return range(null, BoundType.CLOSED, null, BoundType.CLOSED, comparator);
	}

	public static <C extends Comparable<? super C>> Range<C> encloseAll(Iterable<C> values) {
		C lower = values.iterator().next();
		C upper = lower;
		for (C i : values) {
			if (lower.compareTo(i) > 0) lower = i;
			if (upper.compareTo(i) < 0) upper = i;
		}
		return range(lower, BoundType.CLOSED, upper, BoundType.CLOSED);
	}

	public static <C> Range<C> encloseAll(Iterable<C> values, Comparator<? super C> comparator) {
		C lower = values.iterator().next();
		C upper = lower;
		for (C i : values) {
			if (comparator.compare(lower, i) > 0) lower = i;
			if (comparator.compare(upper, i) < 0) upper = i;
		}
		return range(lower, BoundType.CLOSED, upper, BoundType.CLOSED, comparator);
	}

	protected int compareLower(C value) {
		return compareLower(value, BoundType.CLOSED);
	}

	protected int compareLower(C value, BoundType boundType) {
		return compareLower(lower, lowerType, value, boundType);
	}

	protected int compareLower(C lower, BoundType lowerType, C value) {
		return compareLower(lower, lowerType, value, BoundType.CLOSED);
	}

	protected int compareLower(C lower, BoundType lowerType, C value, BoundType boundType) {
		if (lower == null) return value == null ? 0 : -1;
		else if (value == null) return 1;
		int compare;
		if (comparator == null) {
			@SuppressWarnings("unchecked")
			Comparable<C> comp = (Comparable<C>)lower;
			compare = comp.compareTo(value);
		} else compare = comparator.compare(lower, value);
		if (compare == 0) {
			if (lowerType == BoundType.CLOSED) -- compare;
			if (boundType == BoundType.CLOSED) ++ compare;
		}
		return compare;
	}

	protected int compareUpper(C value) {
		return compareUpper(value, BoundType.CLOSED);
	}

	protected int compareUpper(C value, BoundType boundType) {
		return compareUpper(upper, upperType, value, boundType);
	}

	protected int compareUpper(C upper, BoundType upperType, C value) {
		return compareUpper(upper, upperType, value, BoundType.CLOSED);
	}

	protected int compareUpper(C upper, BoundType upperType, C value, BoundType boundType) {
		if (upper == null) return value == null ? 0 : 1;
		if (value == null) return -1;
		int compare;
		if (comparator == null) {
			@SuppressWarnings("unchecked")
			Comparable<C> comp = (Comparable<C>)upper;
			compare = comp.compareTo(value);
		} else compare = comparator.compare(upper, value);
		if (compare == 0) {
			if (upperType == BoundType.CLOSED) ++ compare;
			if (boundType == BoundType.CLOSED) -- compare;
		}
		return compare;
	}

	public boolean hasLowerBound() {
		return lower != null;
	}

	public C lowerEndpoint() {
		if (hasLowerBound()) return lower;
		throw new IllegalStateException();
	}

	public BoundType lowerBoundType() {
		if (hasLowerBound()) return lowerType;
		throw new IllegalStateException();
	}

	public boolean hasUpperBound() {
		return upper != null;
	}

	public C upperEndpoint() {
		if (hasUpperBound()) return upper;
		throw new IllegalStateException();
	}

	public BoundType upperBoundType() {
		if (hasUpperBound()) return upperType;
		throw new IllegalStateException();
	}

	/**
	 * この区間が空集合か判定します。
	 * @return 空集合ならばtrue
	 */
	public boolean isEmpty() {
		return lower == null && upper == null && lowerType == BoundType.CLOSED;
	}

	/**
	 * 与えられた引数が区間の左側に位置するか判定します。<br>
	 * 接する場合は区間の左側ではないと判定します。
	 * @param value 調べる引数
	 * @return 区間の左側に位置するならtrue
	 */
	public boolean isLess(C value) {
		return isLess(value, BoundType.CLOSED);
	}

	protected boolean isLess(C value, BoundType boundType) {
		return compareLower(value, boundType) > 0;
	}

	/**
	 * 与えられた引数が区間の右側に位置するか判定します。<br>
	 * 接する場合は区間の右側ではないと判定します。
	 * @param value 調べる引数
	 * @return 区間の右側に位置するならtrue
	 */
	public boolean isGreater(C value) {
		return isGreater(value, BoundType.CLOSED);
	}

	private boolean isGreater(C value, BoundType boundType) {
		return compareUpper(value, boundType) < 0;
	}

	/**
	 * 与えられた引数が区間内に位置するか判定します。<br>
	 * 接する場合も区間内に位置すると判定します。
	 * @param value 調べる引数
	 * @return 区間内に位置するならtrue
	 */
	public boolean contains(C value) {
		return !isLess(value) && !isGreater(value) && !isEmpty();
	}

	/**
	 * 与えられた引数すべてが区間内に位置するか判定します。<br>
	 * 接する場合も区間内に位置すると判定します。
	 * @param value 調べる要素
	 * @return 全ての要素が区間内に位置するならtrue
	 */
	public boolean containsAll(Iterable<? extends C> values) {
		for (C i : values) if (!contains(i)) return false;
		return true;
	}

	/**
	 * 与えられた区間がこの区間に内包されるか判定します。<br>
	 *
	 * @param other
	 * @return 与えられた区間がこの区間に内包されるならtrue
	 */
	public boolean encloses(Range<C> other) {
		return !isLess(other.lower, other.lowerType) && !isGreater(other.upper, other.upperType);
	}

	/**
	 * 与えられた区間がこの区間と公差するか判定します。<br>
	 * 接する場合は公差するものとします。
	 * @param value 調べる引数
	 * @return 区間が交差するならtrue
	 */
	public boolean isConnected(Range<C> other) {
		C lower, upper;
		BoundType lowerType, upperType;
		if (isLess(other.lower, other.lowerType)) {
			lower = other.lower;
			lowerType = other.lowerType;
		} else {
			lower = this.lower;
			lowerType = this.lowerType;
		}
		if (isGreater(other.upper, other.upperType)) {
			upper = other.upper;
			upperType = other.upperType;
		} else {
			upper = this.upper;
			upperType = this.upperType;
		}
		if (lower == null || upper == null) return true;
		int comp = compareLower(lower, lowerType, upper, upperType);
		return comp <= 0;
	}
	/**
	 * この区間との積集合を返します。
	 * @param connectedRange 積集合を求める区間
	 * @return 積集合
	 */
	public Range<C> intersection(Range<C> connectedRange) {
		if (!isConnected(connectedRange)) throw new IllegalArgumentException();
		C lower, upper;
		BoundType lowerType, upperType;
		if (isLess(connectedRange.lower, connectedRange.lowerType)) {
			lower = connectedRange.lower;
			lowerType = connectedRange.lowerType;
		} else {
			lower = this.lower;
			lowerType = this.lowerType;
		}
		if (isGreater(connectedRange.upper, connectedRange.upperType)) {
			upper = connectedRange.upper;
			upperType = connectedRange.upperType;
		} else {
			upper = this.upper;
			upperType = this.upperType;
		}
		if (comparator == null) {
			return new Range<C>(lower, lowerType, upper, upperType);
		}
		return range(lower, lowerType, upper, upperType, comparator);
	}

	/**
	 * この区間との和集合を返します。
	 * @param other 和集合を求める区間
	 * @return 和集合
	 */
	public Range<C> span(Range<C> other) {
		if (other.isEmpty()) return new Range<C>(lower, lowerType, upper, upperType);
		C lower, upper;
		BoundType lowerType, upperType;
		if (isLess(other.lower, other.lowerType)) {
			lower = this.lower;
			lowerType = this.lowerType;
		} else {
			lower = other.lower;
			lowerType = other.lowerType;
		}
		if (isGreater(other.upper, other.upperType)) {
			upper = this.upper;
			upperType = this.upperType;
		} else {
			upper = other.upper;
			upperType = other.upperType;
		}
		return new Range<C>(lower, lowerType, upper, upperType, comparator);
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) return true;
		if (object instanceof Range) {
			@SuppressWarnings("unchecked")
			Range<C> comp = (Range<C>) object;
			return compareLower(comp.lower, comp.lowerType) == 0 && compareUpper(comp.upper, comp.upperType) == 0 && lowerType == comp.lowerType && upperType == comp.upperType;
		}
		return false;
	}

	@Override
	public int hashCode() {
		if (lower == null && upper == null) return 0;
		else if (lower == null) return upper.hashCode();
		else if (upper == null) return lower.hashCode();
		return lower.hashCode() ^ upper.hashCode();
	}

	@Override
	public String toString() {
		if (isEmpty()) return "()";
		return (lowerType == BoundType.OPEN ? "(" : "[") + (lower == null ? "" : lower.toString()) + ".." + (upper == null ? "" : upper.toString()) + (upperType == BoundType.OPEN ? ")" : "]");
	}
}

	public interface IterableFunction<T> {
		public T next(T value);
	}

	public static class IterableRange<C> extends Range<C> implements Iterable<C>{

		private static final long serialVersionUID = -8258795284144976352L;
		protected IterableFunction<C> func;

		protected IterableRange(C lower, BoundType lowerType, C upper, BoundType upperType, IterableFunction<C> func) {
			super(lower, lowerType, upper, upperType);
			this.func = func;
		}

		public static <C extends Comparable<? super C>> IterableRange<C> range(C lower, BoundType lowerType, C upper, BoundType upperType, IterableFunction<C> func) {
			if (lower == null || upper == null) throw new IllegalArgumentException();
			int comp = lower.compareTo(upper);
			if (comp > 0) throw new IllegalArgumentException();
			else if (comp == 0 && (lowerType == BoundType.OPEN || upperType == BoundType.OPEN)) throw new IllegalArgumentException();
			return new IterableRange<C>(lower, lowerType, upper, upperType, func);
		}

		public static <C extends Comparable<? super C>> IterableRange<C> open(C lower, C upper, IterableFunction<C> func) {
			if (lower == null) throw new IllegalArgumentException();
			return range(func.next(lower), BoundType.CLOSED, upper, BoundType.OPEN, func);
		}

		public static <C extends Comparable<? super C>> IterableRange<C> openClosed(C lower, C upper, IterableFunction<C> func) {
			if (lower == null) throw new IllegalArgumentException();
			return range(func.next(lower), BoundType.CLOSED, upper, BoundType.CLOSED, func);
		}

		public static <C extends Comparable<? super C>> IterableRange<C> closedOpen(C lower, C upper, IterableFunction<C> func) {
			return range(lower, BoundType.CLOSED, upper, BoundType.OPEN, func);
		}

		public static <C extends Comparable<? super C>> IterableRange<C> closed(C lower, C upper, IterableFunction<C> func) {
			return range(lower, BoundType.CLOSED, upper, BoundType.CLOSED, func);
		}

		public static <C extends Comparable<? super C>> IterableRange<C> singleton(C value, IterableFunction<C> func) {
			return range(value, BoundType.CLOSED, value, BoundType.CLOSED, func);
		}
		private class Iter implements Iterator<C> {
			C now;
			Iter() {
				now = lower;
			}
			@Override
			public final boolean hasNext() {
				return !isGreater(now);
			}

			@Override
			public final C next() {
				C ret = now;
				now = func.next(now);
				return ret;
			}

			@Override
			public final void remove() {
				throw new UnsupportedOperationException();
			}
		}

		@Override
		public Iterator<C> iterator() {
			return new Iter();
		}

		public int getDistance() {
			C check = upper;
			int ret = 0;
			while (lower != check) {
				check = func.next(check);
				++ ret;
			}
			return ret;
		}
	}

	public static class IntRange extends IterableRange<Integer>{

		private static final long serialVersionUID = -2492737284164864881L;

		private final boolean useFastIter;

		private static class Next implements IterableFunction<Integer> {

			@Override
			public Integer next(Integer value) {
				return value + 1;
			}
		}

		protected IntRange(int lower, BoundType lowerType, int upper, BoundType upperType) {
			super(lower, lowerType, upper, upperType, new Next());
			useFastIter = true;
		}

		protected IntRange(int lower, BoundType lowerType, int upper, BoundType upperType, IterableFunction<Integer> func) {
			super(lower, lowerType, upper, upperType, func);
			useFastIter = false;
		}

		public static IntRange range(int lower, BoundType lowerType, int upper, BoundType upperType) {
			if (lower > upper) return new IntRange(0, BoundType.CLOSED, 0, BoundType.OPEN);
			if (lowerType == BoundType.OPEN) ++ lower;
			if (upperType == BoundType.OPEN) -- upper;
			return new IntRange(lower, BoundType.CLOSED, upper, BoundType.CLOSED);
		}

		public static IntRange range(int lower, BoundType lowerType, int upper, BoundType upperType, IterableFunction<Integer> func) {
			if (lower > upper) return new IntRange(0, BoundType.CLOSED, 0, BoundType.OPEN, func);
			if (lowerType == BoundType.OPEN) ++ lower;
			if (upperType == BoundType.OPEN) -- upper;
			return new IntRange(lower, BoundType.CLOSED, upper, BoundType.CLOSED, func);
		}

		public static IntRange open(int lower, int upper) {
			return range(lower, BoundType.OPEN, upper, BoundType.OPEN);
		}

		public static IntRange open(int lower, int upper, IterableFunction<Integer> func) {
			return range(lower, BoundType.OPEN, upper, BoundType.OPEN, func);
		}

		public static IntRange open(int upper) {
			return range(0, BoundType.CLOSED, upper, BoundType.OPEN);
		}

		public static IntRange open(int upper, IterableFunction<Integer> func) {
			return range(0, BoundType.CLOSED, upper, BoundType.OPEN, func);
		}

		public static IntRange openClosed(int lower, int upper) {
			return range(lower, BoundType.OPEN, upper, BoundType.CLOSED);
		}

		public static IntRange openClosed(int lower, int upper, IterableFunction<Integer> func) {
			return range(lower, BoundType.OPEN, upper, BoundType.CLOSED, func);
		}

		public static IntRange closedOpen(int lower, int upper) {
			return range(lower, BoundType.CLOSED, upper, BoundType.OPEN);
		}

		public static IntRange closedOpen(int lower, int upper, IterableFunction<Integer> func) {
			return range(lower, BoundType.CLOSED, upper, BoundType.OPEN, func);
		}

		public static IntRange closed(int lower, int upper) {
			return range(lower, BoundType.CLOSED, upper, BoundType.CLOSED);
		}

		public static IntRange closed(int lower, int upper, IterableFunction<Integer> func) {
			return range(lower, BoundType.CLOSED, upper, BoundType.CLOSED, func);
		}

		public static IntRange closed(int upper) {
			return range(0, BoundType.CLOSED, upper, BoundType.CLOSED);
		}

		public static IntRange closed(int upper, IterableFunction<Integer> func) {
			return range(0, BoundType.CLOSED, upper, BoundType.CLOSED, func);
		}

		public static IntRange singleton(int value) {
			return range(value, BoundType.CLOSED, value, BoundType.CLOSED);
		}

		public static IntRange singleton(int value, IterableFunction<Integer> func) {
			return range(value, BoundType.CLOSED, value, BoundType.CLOSED, func);
		}

		private class FastIter implements Iterator<Integer> {
			int now;
			public FastIter() {
				now = lower;
			}
			@Override
			public final boolean hasNext() {
				return now <= upper;
			}

			@Override
			public final Integer next() {
				return now++;
			}

			@Override
			public final void remove() {
				throw new UnsupportedOperationException();
			}
		}

		private class Iter implements Iterator<Integer> {
			int now;
			public Iter() {
				now = lower;
			}
			@Override
			public final boolean hasNext() {
				return now <= upper;
			}

			@Override
			public final Integer next() {
				int ret = now;
				now = func.next(now);
				return ret;
			}

			@Override
			public final void remove() {
				throw new UnsupportedOperationException();
			}
		}

		@Override
		public Iterator<Integer> iterator() {
			return useFastIter ? new FastIter() : new Iter();
		}

		@Override
		public int getDistance() {
			int ret = upper - lower;
			if (upperType == BoundType.CLOSED) ++ ret;
			return ret;
		}

		public int getClosedLower() {
			return lower;
		}

		public int getOpenLower() {
			return lower - 1;
		}

		public int getClosedUpper() {
			return upperType == BoundType.CLOSED ? upper : upper - 1;
		}

		public int getOpenUpper() {
			return upperType == BoundType.CLOSED ? upper + 1 : upper;
		}
	}
}
