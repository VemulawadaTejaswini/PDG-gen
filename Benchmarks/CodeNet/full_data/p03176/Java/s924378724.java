import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Main {

	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		FastScanner sc = new FastScanner();
		int N = sc.nextInt(), h[] = sc.nextInt(N), a[] = sc.nextInt(N);
		LazySegmentTree<Long, Long> segment = new LazySegmentTree<Long, Long>(N, 0L, new Maximum<Long>(), new Maximum<Long>(), new Maximum<Long>());
		for (int i = 0;i < N;++ i) segment.update(a[i] + segment.get(0, h[i]), h[i] - 1);
		System.out.println(segment.get(0, N));
	}

	public interface Inverse<T> {
		public T inverse(T element);
	}

	public interface Group<T> extends Monoid<T>, Inverse<T>{

	}

	public interface Abelian<T> extends Group<T>, Commutative<T> {

	}

	public class Maximum<T extends Comparable<T>> implements Monoid<T>, Commutative<T>, RangeOperate<T, T>{

		@Override
		public T operate(T left, T right) {
			if (left == null) return right;
			else if (right == null) return left;
			return left.compareTo(right) > 0 ? left : right;
		}

		@Override
		public T unit() {
			return null;
		}

		@Override
		public T function(T element, T reaction, int N) {
			return operate(element, reaction);
		}

	}

	public interface Commutative<T> {
	}

	public interface Monoid<T> extends Associative<T>, Unit<T> {
	}

	public interface Unit<T> {
		public T unit();
	}

	public interface Associative<T> {
		public T operate(T left, T right);
	}

	public interface RangeOperate<T, E> {
		public T function(T element, E reaction,  int N);
	}

	public class LazySegmentTree<T, E> {
		private Associative<T> semigroup;
		private Associative<E> lazygroup;
		private RangeOperate<T, E> operate;
		private T dat[];
		private E lazy[];
		private int size;

		public LazySegmentTree(int N, T dat, Associative<T> semigroup, Associative<E> lazygroup, RangeOperate<T, E> operate) {
			this.semigroup = semigroup;
			this.lazygroup = lazygroup;
			this.operate = operate;
			@SuppressWarnings("unchecked")
			T[] data = (T[]) new Object[N];
			Arrays.fill(data, dat);
			build(data);
		}

		public LazySegmentTree(T[] dat, Associative<T> semigroup, Associative<E> lazygroup, RangeOperate<T, E> operate) {
			this.semigroup = semigroup;
			this.lazygroup = lazygroup;
			this.operate = operate;
			build(dat);
		}

		@SuppressWarnings("unchecked")
		private void build(T dat[]) {
			size = dat.length;
			this.dat = (T[]) new Object[Math.max(2, Integer.highestOneBit(dat.length - 1) << 2)]; // 要素数を超える最小の2冪*2
			this.lazy = (E[]) new Object[this.dat.length << 1]; // その遅延評価に使う関数
			System.arraycopy(dat, 0, this.dat, this.dat.length >> 1, dat.length); // 最下段を埋める
			for (int i = this.dat.length / 2 - 1;i > 0; -- i) this.dat[i] = operate(this.dat[i << 1], this.dat[i * 2 + 1]); // 最下段以外すべて、下から埋める
		}

		private void lazy(int index, int length) {
			dat[index] = function(index, length);
			lazy[index << 1] = lazyoperate(lazy[index], lazy[index << 1]);
			lazy[index * 2 + 1] = lazyoperate(lazy[index], lazy[index * 2 + 1]);
			lazy[index] = null;
		}

		private void merge(int index, int length) {
			dat[index] = operate(function(index << 1, length >> 1), function(index * 2 + 1, length >> 1));
		}

		private T getLazy(int index, int length) {
			lazy(index, length);
			return dat[index];
		}

		private T operate(T left, T right) {
			if (right == null) return left; // 右がnullの可能性の方がはるかに高いので
			else if (left == null) return right;
			else return semigroup.operate(left, right);
		}

		private void lazyUpdate(E lazy, int index, int length) {
			this.lazy[index] = lazyoperate(this.lazy[index], lazy);
			lazy(index, length);
		}

		private E lazyoperate(E left, E right) {
			if (right == null) return left; // 右がnullの可能性の方がはるかに高いので
			else if (left == null) return right;
			else return lazygroup.operate(left, right);
		}

		private T function(int index, int length) {
			if (lazy[index] != null) return operate.function(dat[index], lazy[index], length);
			return dat[index];
		}

		/**
		 * indexで指定した値に対して更新操作を行います。
		 * @param dat 更新するデータ
		 * @param index 更新する場所
		 */
		public void update(E dat, int index) {
			update(dat, index, index + 1);
		}

		/**
		 * 区間[left, right)に対して更新操作を行います。
		 * @param dat 更新するデータ
		 * @param left 更新する区間の左閉区間
		 * @param right 更新する区間の右開区間
		 */
		public void update(E dat, int left, int right) {
			if (left >= right || right > size) throw new IllegalArgumentException("[" + left + ", " + right + ") is undefined.");
			int mid = left ^ right, m = 1, l, r, length = this.dat.length >> 1;
			while ((mid & length) == 0) { // 共通区間
				if ((left & length) != 0) { // 右側だったので1個移動
					left &= ~length;
					right &= ~length;
					++ m;
				}
				lazy(m, length); // 境界を見つけるまで遅延評価
				m <<= 1;
				length >>= 1;
			} // この時点で左と右は違う区間を指す
			l = m;
			int lengthL = length;
			while(left != 0) { // 左側評価開始
				lazy(l, lengthL);
				l <<= 1;
				lengthL >>= 1;
				if ((left & lengthL) == 0) { // 1個右は含まれる区間なので
					lazyUpdate(dat, l + 1, lengthL);
				} else {
					left &= ~lengthL;
					++ l;
				}
			}
			lazyUpdate(dat, l, lengthL);
			r = m + 1;
			int lengthR = length;
			right &= ~lengthR;
			while(right != 0) { // 右側評価開始
				lazy(r, lengthR);
				r <<= 1;
				lengthR >>= 1;
				if ((right & lengthR) != 0) { // 1個左は含まれる区間なので
					right &= ~lengthR;
					lazyUpdate(dat, r, lengthR);
					++ r;
				}
			}
			// これで全ての遅延評価が終わったので、次は戻していく操作
			while(l > m) {
				l >>= 1;
				lengthL <<= 1;
				merge(l, lengthL);
			}
			++ m;
			while(r > m) {
				r >>= 1;
				lengthR <<= 1;
				merge(r, lengthR);
			}
			-- m;
			while(m > 1) {
				m >>= 1;
				length <<= 1;
				merge(m, length);
			}
		}

		public T get(int index) {
			return get(index, index + 1);
		}

		public T get(int left, int right) {
			if (left >= right || right > size) throw new IllegalArgumentException("[" + left + ", " + right + ") is undefined.");
			int mid = left ^ right, m = 1, l, r, length = this.dat.length >> 1;
			T ret = null;
			while ((mid & length) == 0) { // 共通区間
				if ((left & length) != 0) { // 右側だったので1個移動
					left &= ~length;
					right &= ~length;
					++ m;
				}
				lazy(m, length); // 境界を見つけるまで遅延評価
				m <<= 1;
				length >>= 1;
			} // この時点で左と右は違う区間を指す
			l = m;
			int lengthL = length;
			while(left != 0) { // 左側評価開始
				lazy(l, lengthL);
				l <<= 1;
				lengthL >>= 1;
				if ((left & lengthL) == 0) { // 1個右は含まれる区間なので
					ret = operate(getLazy(l + 1, lengthL), ret);
				} else {
					left &= ~lengthL;
					++ l;
				}
			}
			ret = operate(getLazy(l, lengthL), ret);
			r = m + 1;
			int lengthR = length;
			right &= ~lengthR;
			while(right != 0) { // 右側評価開始
				lazy(r, lengthR);
				r <<= 1;
				lengthR >>= 1;
				if ((right & lengthR) != 0) { // 1個左は含まれる区間なので
					right &= ~lengthR;
					ret = operate(ret, getLazy(r++, lengthR));
				}
			}
			// これで全ての遅延評価が終わったので、次は戻していく操作
			while(l > m) {
				l >>= 1;
				lengthL <<= 1;
				merge(l, lengthL);
			}
			++ m;
			while(r > m) {
				r >>= 1;
				lengthR <<= 1;
				merge(r, lengthR);
			}
			-- m;
			while(m > 1) {
				m >>= 1;
				length <<= 1;
				merge(m, length);
			}
			return ret;
		}
	}

	public class FastScanner {
		private final InputStream in = System.in;
		private final byte[] buffer = new byte[1024];
		private int read = 0;
		private int length = 0;

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
			for (int i = 0, j;i < height;++ i) for (j = 0;j < width;++ j) ret[j][i] = nextInt();
			return ret;
		}

		public long[][] nextLong(int width, int height) {
			long[][] ret = new long[height][width];
			for (int i = 0, j;i < height;++ i) for (j = 0;j < width;++ j) ret[j][i] = nextLong();
			return ret;
		}
	}

}
