import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		FastScanner sc = new FastScanner();
		int N = sc.nextInt(), h[] = sc.nextInt(N), a[] = sc.nextInt(N);
		LazySegmentTree<Long, Long> segment = new LazySegmentTree<Long, Long>(IntStream.range(0, N).mapToObj(i -> new Long(0)).toArray(Long[]::new), new Maximum<Long>(), new Maximum<Long>(), new Maximum<Long>());
		for (int i = 0;i < N;++ i) segment.update(a[i] + segment.get(0, h[i]), h[i] - 1);
		System.out.println(segment.get(0, N));
	}

	public class Maximum<T extends Comparable<T>> implements Monoid<T>, Commutative<T>, LazySegmentInterface<T, T>{

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

	public interface LazySegmentInterface<T, E> {
		public T function(T element, E reaction,  int N);
	}

	public class LazySegmentTree<T, E> {
		private Associative<T> semigroup;
		private Associative<E> lazygroup;
		private LazySegmentInterface<T, E> operate;
		private T dat[];
		private E lazy[];
		private int size;

		public LazySegmentTree(T[] dat, Associative<T> semigroup, Associative<E> lazygroup, LazySegmentInterface<T, E> operate) {
			this.semigroup = semigroup;
			this.lazygroup = lazygroup;
			this.operate = operate;
			build(dat);
		}

		@SuppressWarnings("unchecked")
		private void build(T dat[]) {
			size = dat.length;
			this.dat = (T[]) new Object[Math.max(2, Integer.highestOneBit(dat.length - 1) << 2)]; // 要素数を超える最小の2冪*2
			this.lazy = (E[]) new Object[this.dat.length]; // その遅延評価に使う関数
			System.arraycopy(dat, 0, this.dat, this.dat.length >> 1, dat.length); // 最下段を埋める
			for (int i = this.dat.length / 2 - 1;i > 0; -- i) this.dat[i] = operate(this.dat[i << 1], this.dat[i * 2 + 1]); // 最下段以外すべて、下から埋める
		}

		private void lazy(int n, int length) {
			lazy[n << 1] = lazygroup.operate(lazy[n], lazy[n << 1]);
			lazy[n * 2 + 1] = lazygroup.operate(lazy[n], lazy[n * 2 + 1]);
			dat[n] = operate.function(dat[n], lazy[n], length);
			lazy[n] = null;
		}

		private T operate(T left, T right) {
			if (right == null) return left; // 右がnullの可能性の方がはるかに高いので
			else if (left == null) return right;
			else return semigroup.operate(left, right);
		}

		private void lazyUpdate(E lazy, int index, int length) {
			this.lazy[index] = lazyoperate(this.lazy[index], lazy);
			dat[index] = operate.function(dat[index], this.lazy[index], length);
		}

		private E lazyoperate(E left, E right) {
			if (right == null) return left; // 右がnullの可能性の方がはるかに高いので
			else if (left == null) return right;
			else return lazygroup.operate(left, right);
		}

		public void update(E dat, int index) {
			update(dat, index, index + 1);
		}

		public void update(E dat, int left, int right) {
			if (left >= right || right > size) throw new IllegalArgumentException("[" + left + ", " + right + ") is undefined.");
			int mid = left ^ right, m = 1, l, r, length = this.dat.length >> 1;
			for (;(mid & length) == 0;m <<= 1, length >>= 1) {
				if ((left & length) != 0) {
					left &= ~length;
					right &= ~length;
					++ m;
				}
				lazy(m, length); // 境界を見つけるまで遅延評価
			}
			l = m;
			int lengthL = length;
			while(left != 0) { // 左側評価開始
				lazy(l, lengthL);
				lengthL >>= 1;
				l <<= 1;
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
				lengthR >>= 1;
				r <<= 1;
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
				this.dat[l] = operate(this.dat[l << 1], this.dat[l * 2 + 1]);
			}
			while(r > m + 1) {
				r >>= 1;
				lengthR <<= 1;
				lazy(r, lengthR);
				this.dat[r] = operate(this.dat[r << 1], this.dat[r * 2 + 1]);
			}
			while(m > 1) {
				m >>= 1;
				length <<= 1;
				lazy(m, length);
				this.dat[m] = operate(this.dat[m << 1], this.dat[m * 2 + 1]);
			}
		}

		public T get(int index) {
			return get(index, index + 1);
		}

		public T get(int left, int right) {
			if (left >= right || right > size) throw new IllegalArgumentException("[" + left + ", " + right + ") is undefined.");
			int mid = left ^ right, i = 1, j, length = this.dat.length >> 1;
			T ret = null;
			for (;(mid & length) == 0;i <<= 1, length >>= 1) { // 境界を見つけるまで遅延評価
				if ((left & length) != 0) {
					left &= ~length;
					right &= ~length;
					++ i;
				}
				lazy(i, length);
			}
			j = i + 1;
			int lengthL = length;
			while(left != 0) { // 左側評価開始
				lazy(i, lengthL);
				lengthL >>= 1;
				i <<= 1;
				if ((left & lengthL) == 0) { // 1個右は含まれる区間なので
					ret = operate(dat[i + 1], ret);
				} else {
					left &= ~lengthL;
					++ i;
				}
			}
			ret = operate(dat[i], ret);
			int lengthR = length;
			right &= ~lengthR;
			while(right != 0) { // 右側評価開始
				lazy(j, lengthR);
				lengthR >>= 1;
				j <<= 1;
				if ((right & lengthR) != 0) { // 1個左は含まれる区間なので
					right &= ~lengthR;
					ret = operate(ret, dat[j++]);
				}
			}
			return ret;
		}
	}



	public class FastScanner {
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
			if (hasNextByte()) return buffer[ptr++];
			else return -1;
		}

		private boolean isPrintableChar(int c) {
			return 33 <= c && c <= 126;
		}

		public boolean hasNext() {
			while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
			return hasNextByte();
		}

		public String next() {
			if (!hasNext()) throw new NoSuchElementException();
			StringBuilder sb = new StringBuilder();
			int b = readByte();
			while (isPrintableChar(b)) {
				sb.appendCodePoint(b);
				b = readByte();
			}
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
			if (b < '0' || '9' < b) throw new NumberFormatException();
			while (true) {
				if ('0' <= b && b <= '9') {
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
