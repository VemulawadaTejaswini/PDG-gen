import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Arrays;

public class Main {
	private static final int MOD = (int) 1E9 + 7, BUF_SIZE = (1 << 13);
	private static final byte IN_BUF[] = new byte[BUF_SIZE], OUT_BUF[] = new byte[BUF_SIZE];

	private static InputStream sInput = System.in;
	private static int sInNextByte, sInNextIndex, sInReadByteCount;

	private static OutputStream sOutput = System.out;
	private static int sOutNextIndex;

	private static PrintStream sErr = System.err;

	private Main() throws Exception {
		if (isLocal) sInput = new FileInputStream(new File("").getAbsolutePath() + "/src/zzz_input");
		if (isLocal) sOutput = new FileOutputStream(new File("").getAbsolutePath() + "/src/zzz_output");
		readByte();
		solve();
		sInput.close();
		flushOutBuf();
	}

	public static void main(String[] args) {
		try {
			new Main();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private int readByte() throws IOException {
		if (sInNextIndex >= sInReadByteCount) {
			sInReadByteCount = sInput.read(IN_BUF, 0, BUF_SIZE);
			if (sInReadByteCount == -1) return (sInNextByte = -1);
			sInNextIndex = 0;
		}
		return (sInNextByte = IN_BUF[sInNextIndex++]);
	}

	private char nc() throws IOException {
		while (sInNextByte <= ' ') readByte();
		char res = (char) sInNextByte;
		readByte();
		return res;
	}

	private int ni() throws IOException {
		int res = 0;
		while (sInNextByte <= ' ') readByte();
		boolean minus = (sInNextByte == '-');
		if (minus) readByte();
		if (sInNextByte < '0' || sInNextByte > '9') throw new RuntimeException();
		do {res = (res << 1) + (res << 3) + sInNextByte - '0';} while (readByte() >= '0' && sInNextByte <= '9');
		return minus ? -res : res;
	}

	private long nl() throws IOException {
		long res = 0;
		while (sInNextByte <= ' ') readByte();
		boolean minus = (sInNextByte == '-');
		if (minus) readByte();
		if (sInNextByte < '0' || sInNextByte > '9') throw new RuntimeException();
		do {res = (res << 1) + (res << 3) + sInNextByte - '0';} while (readByte() >= '0' && sInNextByte <= '9');
		return minus ? -res : res;
	}

	private double nd() throws IOException {
		double pre = 0.0, suf = 0.0, div = 1.0;
		while (sInNextByte <= ' ') readByte();
		boolean minus = (sInNextByte == '-');
		if (minus) readByte();
		if (sInNextByte < '0' || sInNextByte > '9') throw new RuntimeException();
		do {pre = 10 * pre + (sInNextByte - '0');} while (readByte() >= '0' && sInNextByte <= '9');
		if (sInNextByte == '.') while (readByte() >= '0' && sInNextByte <= '9') suf += (sInNextByte - '0') / (div *= 10);
		return minus ? -(pre + suf) : (pre + suf);
	}

	private String ns() throws IOException {
		while (sInNextByte <= ' ') readByte();
		StringBuilder sb = new StringBuilder();
		while (sInNextByte > ' ') {
			sb.append((char) sInNextByte);
			readByte();
		}
		return sb.toString();
	}

	private char[] nc(int n) throws IOException {
		char a[] = new char[n];
		for (int i = 0; i < n; ++i) a[i] = nc();
		return a;
	}

	private char[][] nc(int r, int c) throws IOException {
		char a[][] = new char[r][c];
		for (int i = 0; i < r; ++i) a[i] = nc(c);
		return a;
	}

	private int[] ni(int n) throws IOException {
		int a[] = new int[n];
		for (int i = 0; i < n; ++i) a[i] = ni();
		return a;
	}

	private int[][] ni(int r, int c) throws IOException {
		int a[][] = new int[r][c];
		for (int i = 0; i < r; ++i) a[i] = ni(c);
		return a;
	}

	private long[] nl(int n) throws IOException {
		long a[] = new long[n];
		for (int i = 0; i < n; ++i) a[i] = nl();
		return a;
	}

	private long[][] nl(int r, int c) throws IOException {
		long a[][] = new long[r][c];
		for (int i = 0; i < r; ++i) a[i] = nl(c);
		return a;
	}

	private double[] nd(int n) throws IOException {
		double a[] = new double[n];
		for (int i = 0; i < n; ++i) a[i] = nd();
		return a;
	}

	private double[][] nd(int r, int c) throws IOException {
		double a[][] = new double[r][c];
		for (int i = 0; i < r; ++i) a[i] = nd(c);
		return a;
	}

	private String[] ns(int n) throws IOException {
		String a[] = new String[n];
		for (int i = 0; i < n; ++i) a[i] = ns();
		return a;
	}

	private String[][] ns(int r, int c) throws IOException {
		String a[][] = new String[r][c];
		for (int i = 0; i < r; ++i) a[i] = ns(c);
		return a;
	}

	private void flushOutBuf() {
		try {
			if (sOutNextIndex <= 0) return;
			sOutput.write(OUT_BUF, 0, sOutNextIndex);
			sOutput.flush();
			sOutNextIndex = 0;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private <T> void print(T ob) {
		String s = ob + "";
		for (int i = 0, N = s.length(); i < N; ++i) {
			OUT_BUF[sOutNextIndex++] = (byte) s.charAt(i);
			if (sOutNextIndex >= BUF_SIZE) flushOutBuf();
		}
	}

	private <T> void println(T ob) {
		print(ob + "\n");
	}

	private <T> void debug(T obj) {
		sErr.print(obj);
	}

	private <T> void debugln(T obj) {
		sErr.println(obj);
	}

	private static final boolean isLocal = false;

	private void solve() throws Exception {
		int a = ni(), b = ni(), c = ni(), K = ni();
		int max = Math.max(a, Math.max(b, c));
		int remain = a + b + c - max;
		println((1 << K) * max + remain);
	}
}
