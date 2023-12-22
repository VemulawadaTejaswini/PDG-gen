
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class Main implements Runnable { // クラス名はMain1

	PrintWriter out = new PrintWriter(System.out);
	InputReader sc = new InputReader(System.in);

	public static void main(String[] args) {
		Thread.setDefaultUncaughtExceptionHandler((t, e) -> System.exit(1));
		new Thread(null, new Main(), "", 1024 * 1024 * 1024).start(); // 16MBスタックを確保して実行
	}

	public void run() {

		try {
			int N = sc.nextInt();
			int K = sc.nextInt();
			Sushi[] s = new Sushi[N];
			for (int i = 0; i < N; i++) {
				//A[i] = sc.nextInt();
				Sushi sushi = new Sushi();
				sushi.t = sc.nextInt();
				sushi.d = sc.nextInt();
				sushi.count = 1;
				s[i] = sushi;
			}

			Arrays.sort(s, new Comparator<Sushi>() {
				@Override
				public int compare(Sushi o1, Sushi o2) {
					if (o1.t == o2.t) {
						return o2.d - o1.d;
					} else {
						return o1.t - o2.t;
					}
				}
			});

			for (int i = 1; i < N; i++) {
				if (s[i].t == s[i - 1].t) {
					s[i].count = s[i - 1].count + 1;
				}
			}

			/*
			for (int i = 0; i < N; i++) {
				out.println("t:" + s[i].t + " ,d:" + s[i].d + " ,cnt:" + s[i].count);
			}
			*/

			Arrays.sort(s, new Comparator<Sushi>() {
				@Override
				public int compare(Sushi o1, Sushi o2) {
					if (o1.d == o2.d) {
						return o1.count - o2.count;
					} else {
						return o2.d - o1.d;
					}
				}
			});

			/*
			out.println("----");
			for (int i = 0; i < N; i++) {
				out.println("t:" + s[i].t + " ,d:" + s[i].d + " ,cnt:" + s[i].count);
			}*/

			PriorityQueue<Sushi> pq = new PriorityQueue<>();
			TreeSet<Integer> ts = new TreeSet<>();
			long kiso = 0;
			long type = 0;
			for (int i = 0; i < K; i++) {
				pq.offer(s[i]);
				kiso += (long) s[i].d;
				ts.add(s[i].t);
			}
			type = (long) ts.size() * (long) ts.size();

			long ans = kiso + type;

			for (int i = K; i < N; i++) {
				if (!ts.contains(s[i].t)) {
					if (pq.peek().count > 1) {
						Sushi es = pq.poll();
						long nextkiso = (long) kiso - (long) es.d + (long) s[i].d;
						kiso = nextkiso;
						ts.add(s[i].t);
						type = (long) ts.size() * (long) ts.size();
						pq.add(s[i]);
						ans = Math.max(ans, kiso + type);
					}
				}
			}

			out.println(ans);
			//Flushしてからcloseするのが無難
			out.flush();
			out.close();

		} catch (ArithmeticException ae) {
			ae.printStackTrace();
			throw new RuntimeException();
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}

	}

	class Sushi implements Comparable<Sushi> {

		public int t;
		public int d;
		public int count;

		@Override
		public int compareTo(Sushi o) {
			if (this.count >= 2) {
				return this.d - o.d;
			} else {
				return o.count - this.count;
			}
		}

	}

	// 高速なScanner
	static class InputReader {
		private InputStream in;
		private byte[] buffer = new byte[1024];
		private int curbuf;
		private int lenbuf;

		public InputReader(InputStream in) {
			this.in = in;
			this.curbuf = this.lenbuf = 0;
		}

		public boolean hasNextByte() {
			if (curbuf >= lenbuf) {
				curbuf = 0;
				try {
					lenbuf = in.read(buffer);
				} catch (IOException e) {
					throw new InputMismatchException();
				}
				if (lenbuf <= 0)
					return false;
			}
			return true;
		}

		private int readByte() {
			if (hasNextByte())
				return buffer[curbuf++];
			else
				return -1;
		}

		private boolean isSpaceChar(int c) {
			return !(c >= 33 && c <= 126);
		}

		private void skip() {
			while (hasNextByte() && isSpaceChar(buffer[curbuf]))
				curbuf++;
		}

		public boolean hasNext() {
			skip();
			return hasNextByte();
		}

		public String next() {
			if (!hasNext())
				throw new NoSuchElementException();
			StringBuilder sb = new StringBuilder();
			int b = readByte();
			while (!isSpaceChar(b)) {
				sb.appendCodePoint(b);
				b = readByte();
			}
			return sb.toString();
		}

		public int nextInt() {
			if (!hasNext())
				throw new NoSuchElementException();
			int c = readByte();
			while (isSpaceChar(c))
				c = readByte();
			boolean minus = false;
			if (c == '-') {
				minus = true;
				c = readByte();
			}
			int res = 0;
			do {
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res = res * 10 + c - '0';
				c = readByte();
			} while (!isSpaceChar(c));
			return (minus) ? -res : res;
		}

		public long nextLong() {
			if (!hasNext())
				throw new NoSuchElementException();
			int c = readByte();
			while (isSpaceChar(c))
				c = readByte();
			boolean minus = false;
			if (c == '-') {
				minus = true;
				c = readByte();
			}
			long res = 0;
			do {
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res = res * 10 + c - '0';
				c = readByte();
			} while (!isSpaceChar(c));
			return (minus) ? -res : res;
		}

		public double nextDouble() {
			return Double.parseDouble(next());
		}

		public int[] nextIntArray(int n) {
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = nextInt();
			return a;
		}

		public long[] nextLongArray(int n) {
			long[] a = new long[n];
			for (int i = 0; i < n; i++)
				a[i] = nextLong();
			return a;
		}

		public char[][] nextCharMap(int n, int m) {
			char[][] map = new char[n][m];
			for (int i = 0; i < n; i++)
				map[i] = next().toCharArray();
			return map;
		}
	}
}
