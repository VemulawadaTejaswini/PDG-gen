import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.ConnectException;
import java.rmi.dgc.Lease;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

import static java.util.Comparator.*;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
		main.out.close();
	}

	// ======================================================================
	public void solve() {
		int X = ni();
		int Y = ni();
		if((X * 2 - Y) % 3 != 0) {
			out.println(0);
			return;
		}
		int a = (X * 2 - Y) / 3;
		int b = X - a * 2;
//		out.println( a + " " + b);
		out.println(calcComb((a+b), a));
	}
	// a の p 乗を求めるアルゴリズム				
	// p = 30 の時、p の変化は　30 -> 15 -> 14 -> 7 -> 6 -> 3 -> 2 -> 1 -> 0				
	// と、半分半分になっていくので、計算量は O(log p) となる				
	int mod = (int) (1e9) + 7;

	long modpow(long a, int p) {
		if (p == 0)
			return 1;
		if (p % 2 == 0) {
			int halfP = p / 2; // 偶数なら		
			long half = modpow(a, halfP); // 乗数を半分にする		
			return half * half % mod; // 計算結果を２回かける　→　乗数を戻す		
		} else {
			return a * modpow(a, p - 1) % mod; // 乗数から１を引いた結果に a を掛ける		
		}
	}

	// 組み合わせの数を計算する(a個の中からb個を選ぶ）				
	//(10*9*8)/(3*2*1);				
	//10*9*8 -> ansMul				
	//3*2*1 -> ansDiv				
	long calcComb(int a, int b) {
		if (b > a - b)
			return calcComb(a, a - b);
		long ansMul = 1;
		long ansDiv = 1;
		for (int i = 0; i < b; i++) {
			ansMul *= (a - i);
			ansDiv *= (i + 1);
			ansMul %= mod;
			ansDiv %= mod;
		}
		//ansMul / ansDivをやりたい			
		//ansDivの逆元を使って求めよう！			
		// MOD p において、p が素数の場合、a の逆元は　a ^ (p-2) となる			
		// Fermat の小定理 a^(p-1) = 1(MOD p) --> a * a^(p - 2) = 1(MOD p)　より			
		long ans = ansMul * modpow(ansDiv, mod - 2) % mod;

		return ans;
	}
	
	// ------------------------------------------
	// ライブラリ
	// ------------------------------------------
	// Print
	private PrintWriter out = new PrintWriter(System.out);

	// Scanner
	private FastScanner scan = new FastScanner();

	int ni() {
		return scan.nextInt();
	}

	int[] ni(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = ni();
		}
		return a;
	}

	int[][] ni(int y, int x) {
		int[][] a = new int[y][x];
		for (int i = 0; i < y; i++) {
			for (int j = 0; j < x; j++) {
				a[i][j] = ni();
			}
		}
		return a;
	}

	long nl() {
		return scan.nextLong();
	}

	long[] nl(int n) {
		long[] a = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = nl();
		}
		return a;
	}

	long[][] nl(int y, int x) {
		long[][] a = new long[y][x];
		for (int i = 0; i < y; i++) {
			for (int j = 0; j < x; j++) {
				a[i][j] = nl();
			}
		}
		return a;
	}

	String ns() {
		return scan.next();
	}

	String[] ns(int n) {
		String[] a = new String[n];
		for (int i = 0; i < n; i++) {
			a[i] = ns();
		}
		return a;
	}

	String[][] ns(int y, int x) {
		String[][] a = new String[y][x];
		for (int i = 0; i < y; i++) {
			for (int j = 0; j < x; j++) {
				a[i][j] = ns();
			}
		}
		return a;
	}
}

class FastScanner {
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

	public boolean hasNext() {
		while (hasNextByte() && !isPrintableChar(buffer[ptr]))
			ptr++;
		return hasNextByte();
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

	public int nextInt() {
		long nl = nextLong();
		if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
			throw new NumberFormatException();
		return (int) nl;
	}

	public double nextDouble() {
		return Double.parseDouble(next());
	}
}
