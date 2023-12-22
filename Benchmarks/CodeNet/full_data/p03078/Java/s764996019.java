
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.PriorityQueue;

public class Main implements Runnable { // クラス名はMain1

	static int mod = 1000000000 + 7; //10^9+7
	int[] dx = { 1, 0, -1, 0 }, dy = { 0, 1, 0, -1 }; //4 directions

	public static void main(String[] args) {
		Thread.setDefaultUncaughtExceptionHandler((t, e) -> System.exit(1));
		new Thread(null, new Main(), "", 1024 * 1024 * 1024).start(); // 16MBスタックを確保して実行
	}

	public void run() {
		PrintWriter out = new PrintWriter(System.out);
		InputReader sc = new InputReader(System.in);

		try {
			/**
			 * Bit 全探索
				//Nは要素数 (bit全探索)
				//計算量はO(2^N) Nが0-20~25 (30は多分無理)くらいまでしか使えない
				Out: for (int bit = 0; bit < (1 << N); bit++) {
					System.out.println(Integer.toBinaryString(bit));
					In: for (int j = 0; j < N; j++) {
						System.out.println(1 & (bit >> j));
						//1が立ってれば対象。例えば101だったら1桁目と3桁目は選ばれている
						//「二進数iをjだけ右にビットシフトしたときの、iの1桁目と1とでビット論理積をとって、演算結果が1であるなら処理を実行する」
						if ((1 & bit >> j) == 1) {
						}
					}
				}
			 *
			 * 表示系
			 *   System.out.println();
			 *   System.out.println("i:" + i + " ,j:" + j);
			 *   System.out.println(Arrays.toString(A));
			 *
			 * Sort (Arrays)
			 *  Integer[] A = new Integer[N];
			 *    Desc : Arrays.sort(A , Collections.reverseOrder());
			 *    Asc  : Arrays.sort(A);
			 *
			 * 定義系
			 *   int[] s = new int[M];
			 *   ArrayDeque<Integer> deq= new ArrayDeque<>();//先頭と末尾への要素の追加・先頭と末尾の要素の取り出しと削除が定数時間
			 *   ArrayList<Integer> arr = new ArrayList<Integer>();//定数時間
			 *   HashMap<Integer,Integer> hm = new HashMap<>(); //定数時間
			 *
			 *   //要素の追加と、最小の要素の取り出しと削除が対数時間
			 *   PriorityQueue<Integer> pq = new PriorityQueue<>();//昇順
			 *   PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); //逆順。降順
			 *
			 *   TreeSet<Integer> ts = new TreeSet<>();//対数時間(重複はできない)
			 *
			 * 文字系
			 *   String S = sc.next().trim();
			 *   for (char i = 'a'; i <= 'z'; i++) {}
			 *   S.substring(1,2);//あいうえお → い
			 *   S.substring(0,1); // 1文字目をとりたいとき
			 *   文字列のSort
			 *    String sorted = S.chars().sorted().collect(StringBuilder::new,StringBuilder::appendCodePoint, StringBuilder::append) .toString();
			 */

			int X = sc.nextInt();
			int Y = sc.nextInt();
			int Z = sc.nextInt();
			long K = sc.nextLong();

			Long[] a = new Long[X];
			Long[] b = new Long[Y];
			Long[] c = new Long[Z];

			for (int i = 0; i < X; i++) {
				a[i] = sc.nextLong();
			}
			for (int i = 0; i < Y; i++) {
				b[i] = sc.nextLong();
			}
			for (int i = 0; i < Z; i++) {
				c[i] = sc.nextLong();
			}
			//out.println(Arrays.toString(A));

			Arrays.sort(a, Comparator.reverseOrder());
			Arrays.sort(b, Comparator.reverseOrder());
			Arrays.sort(c, Comparator.reverseOrder());

			PriorityQueue<Total> pq = new PriorityQueue<>(new TotalComp());//TotalのClassで降順にしている
			boolean[][][] used = new boolean[X][Y][Z];

			Total t1 = new Total();
			t1.total = a[0] + b[0] + c[0];
			t1.x = 0;
			t1.y = 0;
			t1.z = 0;
			pq.add(t1);

			int count = 1;
			while (pq.size() > 0 && count <= K) {
				Total t = pq.poll();
				out.println(t.total);

				if ((t.x + 1) < X && !used[t.x + 1][t.y][t.z]) {
					Total tx = new Total();
					used[t.x + 1][t.y][t.z] = true;
					tx.total = a[t.x + 1] + b[t.y] + c[t.z];
					tx.x = t.x + 1;
					tx.y = t.y;
					tx.z = t.z;
					pq.add(tx);
				}

				if ((t.y + 1) < Y && !used[t.x][t.y + 1][t.z]) {
					Total ty = new Total();
					used[t.x][t.y + 1][t.z] = true;
					ty.total = a[t.x] + b[t.y + 1] + c[t.z];
					ty.x = t.x;
					ty.y = t.y + 1;
					ty.z = t.z;
					pq.add(ty);
				}

				if ((t.z + 1) < Z && !used[t.x][t.y][t.z + 1]) {
					Total tz = new Total();
					used[t.x][t.y][t.z + 1] = true;
					tz.total = a[t.x] + b[t.y] + c[t.z + 1];
					tz.x = t.x;
					tz.y = t.y;
					tz.z = t.z + 1;
					pq.add(tz);
				}
				count++;
			}

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

	static class TotalComp implements Comparator<Total> {
		@Override
		public int compare(Total p1, Total p2) {
			return (-1) * p1.total.compareTo(p2.total);
		}
	}

	static class Total {

		public Long total;
		public int x;
		public int y;
		public int z;

		@Override
		public boolean equals(Object obj) {
			if (obj instanceof Total) {
				Total other = (Total) obj;
				//変数ageと変数nameが等しければtrueを返す。(同じ値を持っているとみなす)
				return other.x == this.x && other.y == this.y && other.z == this.z && other.total.equals(this.total);
			}
			return false;
		}

		@Override
		public int hashCode() {
			return Objects.hash(this.total, this.x, this.y, this.z);
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
