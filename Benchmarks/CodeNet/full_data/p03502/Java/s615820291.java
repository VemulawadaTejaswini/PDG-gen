import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	private static Object matchStatus = null;
	private static final int mod = (int) 1E9 + 7;
	private static final int ibufsize = (1 << 15), obufsize = (1 << 14);
	private static int iNextByte, iNextIndex, iReadByteCount, obufNextIndex;
	private static final byte ibuf[] = new byte[ibufsize], obuf[] = new byte[obufsize];
	private static InputStream input = System.in;
	private static OutputStream output = System.out;
	private static PrintStream err = System.err;

	private Main() throws Exception {
		if (ilocal) input = new FileInputStream(new File("").getAbsolutePath() + "/src/zzz/input.txt");
		if (olocal) output = new FileOutputStream(new File("").getAbsolutePath() + "/src/zzz/output.txt");
		nextByte();
		solve();
		input.close();
		flushOutBuf();
	}

	public static void main(String[] args) {
		try {
			new Main();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private boolean isDigit(int cp) {
		return '0' <= cp && cp <= '9';
	}

	private boolean isLowercase(int cp) {
		return 'a' <= cp && cp <= 'z';
	}

	private boolean isUppercase(int cp) {
		return 'A' <= cp && cp <= 'Z';
	}

	private boolean isAlphabet(int cp) {
		return ('a' <= cp && cp <= 'z') || ('A' <= cp && cp <= 'Z');
	}

	private boolean isAlphanumberic(char ch) {
		return (ch >= '0' && ch <= '9') || (ch >= 'a' && ch <= 'z') || (ch >= 'A' || ch <= 'Z');
	}

	private boolean isWhitespace(int cp) {
		return cp == ' ' || cp == '\n' || cp == '\r' || cp == '\t';
	}

	private boolean isWordSeparator(int cp) {
		return cp == ' ' || cp == '\n' || cp == '\t' || cp == '\r';
	}

	private boolean isLineSeparator(int cp) {
		return cp == '\n' || cp == '\r';
	}

	private boolean isInputMatched() {
		return matchStatus == null;
	}

	private Object setMatchStatus(Object value) {
		return (matchStatus = value);
	}

	private boolean isNegative() throws IOException {
		boolean minus = false;
		while (iNextByte == '+' || iNextByte == '-') {
			if (iNextByte == '-') minus = !minus;
			nextByte();
		}
		return minus;
	}

	private int nextByte() throws IOException {
		if (iNextIndex >= iReadByteCount) {
			iReadByteCount = input.read(ibuf, 0, ibufsize);
			if (iReadByteCount == -1) return (iNextByte = -1);
			iNextIndex = 0;
		}
		return (iNextByte = ibuf[iNextIndex++]);
	}

	private char nextChar() throws IOException {
		while (iNextByte == ' ' || iNextByte == '\n' || iNextByte == '\t' || iNextByte == '\r') nextByte();
		char res = (char) iNextByte;
		nextByte();
		return res;
	}

	private char[] nextChar(int n) throws IOException {
		char a[] = new char[n];
		for (int i = 0; i < n; ++i) a[i] = nextChar();
		return a;
	}

	private char[][] nextChar(int r, int c) throws IOException {
		char a[][] = new char[r][c];
		for (int i = 0; i < r; ++i) a[i] = nextChar(c);
		return a;
	}

	private int nextInt() throws IOException {
		while (isWhitespace(iNextByte)) nextByte();
		int res = 0;
		boolean minus = isNegative();
		if (!isDigit(iNextByte)) return (int) setMatchStatus(-1);
		do {res = (res << 1) + (res << 3) + iNextByte - '0';} while (isDigit(nextByte()));
		return minus ? -res : res;
	}

	private int[] nextInt(int n) throws IOException {
		int a[] = new int[n];
		for (int i = 0; i < n; ++i) a[i] = nextInt();
		return a;
	}

	private int[][] nextInt(int r, int c) throws IOException {
		int a[][] = new int[r][c];
		for (int i = 0; i < r; ++i) a[i] = nextInt(c);
		return a;
	}

	private long nextLong() throws IOException {
		while (isWhitespace(iNextByte)) nextByte();
		long res = 0;
		boolean minus = isNegative();
		if (!isDigit(iNextByte)) return (long) setMatchStatus(-1);
		do {res = (res << 1) + (res << 3) + iNextByte - '0';} while (isDigit(nextByte()));
		return minus ? -res : res;
	}

	private long[] nextLong(int n) throws IOException {
		long a[] = new long[n];
		for (int i = 0; i < n; ++i) a[i] = nextLong();
		return a;
	}

	private long[][] nextLong(int r, int c) throws IOException {
		long a[][] = new long[r][c];
		for (int i = 0; i < r; ++i) a[i] = nextLong(c);
		return a;
	}

	private double nextDouble() throws IOException {
		while (isWhitespace(iNextByte)) nextByte();
		boolean minus = isNegative();
		if (!isDigit(iNextByte)) return (double) setMatchStatus(-1.0);
		double decimal = 0, floating = 0, div = 1;
		do {decimal = 10 * decimal + (iNextByte - '0');} while (isDigit(nextByte()));
		if (iNextByte == '.') while (isDigit(nextByte())) floating += (iNextByte - '0') / (div *= 10);
		double res = decimal + floating;
		return minus ? -res : res;
	}

	private double[] nextDouble(int n) throws IOException {
		double a[] = new double[n];
		for (int i = 0; i < n; ++i) a[i] = nextDouble();
		return a;
	}

	private double[][] nextDouble(int r, int c) throws IOException {
		double a[][] = new double[r][c];
		for (int i = 0; i < r; ++i) a[i] = nextDouble(c);
		return a;
	}

	private String nextLine() throws IOException {
		while (isWhitespace(iNextByte)) nextByte();
		StringBuilder sb = new StringBuilder();
		while (iNextByte != -1 && !isLineSeparator(iNextByte)) {
			sb.append((char) iNextByte);
			nextByte();
		}
		return sb.toString();
	}

	private String nextString() throws IOException {
		while (isWordSeparator(iNextByte)) nextByte();
		StringBuilder sb = new StringBuilder();
		while (iNextByte != -1 && !isWordSeparator(iNextByte)) {
			sb.append((char) iNextByte);
			nextByte();
		}
		return sb.toString();
	}

	private String[] nextString(int n) throws IOException {
		String a[] = new String[n];
		for (int i = 0; i < n; ++i) a[i] = nextString();
		return a;
	}

	private String[][] nextString(int r, int c) throws IOException {
		String a[][] = new String[r][c];
		for (int i = 0; i < r; ++i) a[i] = nextString(c);
		return a;
	}

	private void flushOutBuf() {
		try {
			if (obufNextIndex <= 0) return;
			output.write(obuf, 0, obufNextIndex);
			output.flush();
			obufNextIndex = 0;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void print(String format, Object... args) {
		if (args != null) format = String.format(format, args);
		for (int i = 0, N = format.length(); i < N; ++i) {
			obuf[obufNextIndex++] = (byte) format.charAt(i);
			if (obufNextIndex >= obufsize) flushOutBuf();
		}
	}

	private <T> void print(T ob) {
		String s = ob + "";
		for (int i = 0, N = s.length(); i < N; ++i) {
			obuf[obufNextIndex++] = (byte) s.charAt(i);
			if (obufNextIndex >= obufsize) flushOutBuf();
		}
	}

	private <T> void println(T ob) {
		print(ob + "\n");
	}

	private void println(String format, Object... args) {
		print(format + "\n", args);
	}

	private void solve() throws Exception {
		int N = nextInt();
		char a[] = ("" + N).toCharArray();
		int sum = 0;
		for (char c: a) sum += (c-'0');
		println(N%sum == 0? "yes":"no");
	}

	private static final boolean ilocal = false, olocal = false;
}
