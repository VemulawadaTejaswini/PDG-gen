
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;

public class Main {

	public static void main(String[] args) throws IOException {
		new Main().solve();
	}

	private void solve() throws IOException {
		try {
			//			solveA();
			solveB();
			// solveC();
			// solveD();
			// solveE();
			// solveF();
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
		int alice = nextInt();
		int bob = nextInt();

		if (alice == bob) {
			out.println("Draw");
		} else if (alice == 1) {
			out.println("Alice");
		} else if (bob == 1) {
			out.println("Bob");
		} else if (alice != bob) {
			out.println(alice > bob ? "Alice" : "Bob");
		}

		out.println("");
	}

	private boolean chkB(String[] wkA, int currentA, String[] wkB, int currentB, int aPos) {
		boolean res = false;

		if (wkA.length - currentA < wkB.length) {
			return false;
		}
		if (wkA[currentA].length() - aPos < wkB[0].length()) {
			return false;
		}
		//まず、Aの位置を決める
		//そのために、BのcurrentB列目がAのcurrentA列目どこに出現するのか確認
		//Aの横軸の値を取得-Aの横軸は複数取得できる可能性がある。
		//BのcurrentB列目がAのcurrentA列目どこに出現するのか確認
		boolean aPosWk = wkA[currentA].startsWith(wkB[currentB], aPos);
		boolean bPos = true;
		if (aPosWk) {
			//Aの横軸出現したらcurrentA+1の列の横軸から、B列のcurrentB+1が出現するのか確認

			for (int i = 1; currentB + i < wkB.length; i++) {
				bPos = wkA[currentA + i].startsWith(wkB[currentB + i], aPos);
				if (!bPos) {
					break;
				}
			}
			//このaPosでは一致しない場合、aPosを+1して再探索
			if (!bPos) {
				//B列のcurrentB+1が出現しなかったら、もう一度、Aの横軸を検索
				res = chkB(wkA, currentA, wkB, currentB, aPos + 1);
			} else {
				res = bPos;
			}

		} else {
			//Aの横軸が出現しなかったら、aPos+1列目を検索

			int len = wkA[currentA].indexOf(wkB[currentB], aPos);
			if (len >= 0) {
				res = chkB(wkA, currentA, wkB, 0, len);
			}
		}

		if (!res) {
			//Aの横軸が出現しなかったら、currentA+1列目を検索
			res = chkB(wkA, currentA + 1, wkB, 0, 0);
		}
		return res;
	}

	private void solveB() {
		int numN = nextInt();
		int numM = nextInt();
		String[] wkA = new String[numN];
		String[] wkB = new String[numM];

		for (int i = 0; i < wkA.length; i++) {
			wkA[i] = next();
		}
		for (int i = 0; i < wkB.length; i++) {
			wkB[i] = next();
		}

		boolean res = chkB(wkA, 0, wkB, 0, 0);
		out.println(res ? "Yes" : "No");
	}

	private void solveC() {
		int numN = nextInt();

		out.println("");
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