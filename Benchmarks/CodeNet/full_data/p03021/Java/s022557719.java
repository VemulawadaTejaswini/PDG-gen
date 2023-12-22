
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;

public class Main {

	public static void main(String[] args) {
		new Main();
	}

	public class Data {
		int piece;
		long distance;
		long operate;

		Data(boolean hasPiece, int piece, long distance, long operate) {
			this.piece = piece + (hasPiece ? 1 : 0);
			this.distance = distance;
			this.operate = operate;
		}

		void next() {
			distance += piece;
		}
	}

	public class Vertex {
		List<Integer> edge;
		boolean hasPiece;
		int index;

		Vertex(boolean piece, int index) {
			hasPiece = piece;
			edge = new ArrayList<Integer>();
			this.index = index;
		}

		long search(Vertex[] tree) { // ここを根として調べていく
			long maxDistance = 0, sumDistance = 0, operate = 0;
			int piece = 0;
			for (int i : edge) {
				Data tmp = tree[i].dfs(tree, index);
				maxDistance = Math.max(maxDistance, tmp.distance);
				sumDistance += tmp.distance;
				piece += tmp.piece;
				operate += tmp.operate;
			}
			long addOperate = Math.min(sumDistance - maxDistance, sumDistance / 2); // 端数切捨て(無理なので)
			Data data = new Data(hasPiece, piece, sumDistance - addOperate * 2, operate + addOperate);
			//System.out.println(index + ":" + data.operate + "," + data.distance);
			if (data.distance == 0) return data.operate; // 無事に全てのコマが同じ位置
			return Long.MAX_VALUE; // なんか無理だったっぽい
		}

		Data dfs(Vertex[] tree, int root) {
			long maxDistance = 0, sumDistance = 0, operate = 0;
			int piece = 0;
			for (int i : edge) {
				if (i == root) continue; // いやまぁうん、戻ってどうする
				Data tmp = tree[i].dfs(tree, index); // 先に全ての子を調べる
				maxDistance = Math.max(maxDistance, tmp.distance);
				sumDistance += tmp.distance;
				piece += tmp.piece;
				operate += tmp.operate;
			}
			long addOperate = Math.min(sumDistance - maxDistance, sumDistance / 2); // 操作回数(相殺回数？)の限界
			Data data = new Data(hasPiece, piece, sumDistance - addOperate * 2, operate + addOperate); // この時点での理想値
			data.next(); // 親に戻すとき、全コマの距離が1伸びる～
			return data;
		}
	}

	public Main() {
		FastIO io = new FastIO();
		/*
		 * author: 31536000
		 * 考察メモ
		 * まず、ある頂点に集めると決め打つ
		 * すると、葉から順にそこに寄せ集める動きになる
		 * ただし、途中の枝で2つ以上から集まった時はそれぞれで相殺してもらう
		 * それが一番効率が良いのでね
		 * すると、各頂点についてO(N)よりO(N^2)で解けた
		 * わーい
		 *
		 * 個数を求めてるのにACが34/46なの、割と合ってる説
		 * あとTLEしてないので、何か見落としに気付けばACできそう
		 */
		int N = io.nextInt();
		String S = io.next();
		Vertex[] tree = new Vertex[N];
		for (int i = 0;i < N;++ i) tree[i] = new Vertex(S.charAt(i) == '1', i);
		for (int i = 1;i < N;++ i) {
			int a = io.nextInt() - 1, b = io.nextInt() - 1;
			tree[a].edge.add(b);
			tree[b].edge.add(a);
		}
		long operate = Long.MAX_VALUE;
		for (int i = 0;i < N;++ i) { // この頂点に集めると決め打ち
			operate = Math.min(operate, tree[i].search(tree));
		}
		if (operate == Long.MAX_VALUE) { // こうなりゃ最終手段、操作成立確認
			System.exit(1);
		}
		io.print((operate + 1 & Long.MAX_VALUE) - 1);

		io.flush();
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
