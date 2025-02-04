
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) throws IOException {
		new Main().solve();
	}

	private void solve() throws IOException {
		try {
			//			solveA();
			//			solveB();
			solveC();
			//			 solveD();
			//			 solveE();
			//			 solveF();
		} finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.flush();
				out.close();
			}
		}

	}

	private void solveA() {
		int[] wk = IntStream.range(0, 3).map(i -> nextInt()).toArray();

		Arrays.sort(wk);

		out.println(wk[0] + wk[1]);
	}

	private void solveB() {
		String s = next();
		//後ろ1文字削除
		String wkS = s.substring(0, s.length() - 1);

		/*
		 * 半分にしてしまい、そこから同じ文字列が出現するかを調査
		 */
		for (int i = wkS.length() / 2; i > 0; i--) {
			//比較用文字列（前半分）
			String tmp = wkS.substring(0, i);
			//比較用文字列（後ろ半分。tmpと同じ文字列が、tmpの直後に出現するかの確認）
			String tmp2 = wkS.substring(i, i * 2);
			if (tmp.equals(tmp2)) {
				//0-iの文字列を二つ並べるので*2
				out.println(i * 2);
				return;
			}
		}

	}

	private void solveC() {
		int numN = nextInt();
		int[] wk = IntStream.range(0, numN).map(i -> nextInt()).toArray();

		List<Integer> resList = new ArrayList<Integer>();
		int cnt = 1;
		/*
		 * Ai番目が奇数なら先頭に追加、偶数なら最後に追加
		 *
		 */
		for (int i = 0; i < wk.length; i++) {
			if (cnt % 2 == 1) {
				resList.add(0, wk[i]);
			} else {
				resList.add(wk[i]);
			}
			cnt++;
		}

		StringBuilder builder = new StringBuilder();
		for (Integer integer : resList) {
			builder.append(integer);
			builder.append(" ");
		}
		/*
		 * 奇数の場合はひっくりかえす
		 * 前後の空白文字列をtrim()で削除
		 */
		if (cnt % 2 == 1) {
			out.println(builder.reverse().toString().trim());
		} else {
			out.println(builder.toString().trim());
		}
	}

	private void solveC2() {

		int numN = nextInt();
		int[] wk = IntStream.range(0, numN).map(i -> nextInt()).toArray();

		List<Integer> resList = new ArrayList<Integer>();
		for (int i : wk) {
			resList = getList(i, resList);
		}

		StringBuilder builder = new StringBuilder();
		for (Integer integer : resList) {
			builder.append(integer);
			builder.append(" ");
		}
		out.println(builder.toString());
	}

	private List<Integer> getList(int tmp, List<Integer> wkList) {
		wkList.add(tmp);
		List<Integer> resList = new ArrayList<Integer>();
		for (int i = wkList.size() - 1; i >= 0; i--) {
			resList.add(wkList.get(i));
		}
		return resList;
	}

	private void solveD() {
		int numN = nextInt();

		out.println("");
	}

	private void solveE() {
		int numN = nextInt();

		out.println("");
	}

	private void solveF() {
		int numN = nextInt();

		out.println("");
	}

	private final PrintWriter out = new PrintWriter(System.out);
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

	private static boolean isPrintableChar(int c) {
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

	public int nextInt() {
		return Integer.parseInt(next());
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