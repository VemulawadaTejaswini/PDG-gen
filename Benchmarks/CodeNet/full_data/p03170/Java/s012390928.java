import java.util.*;
import java.io.*;
import java.awt.Point;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) throws Exception {
		FastIO sc = new FastIO(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		
		N = sc.nextInt();
		int K = sc.nextInt();
		a = new int[N];
		for(int i = 0; i < N; i++) a[i] = sc.nextInt();
		
		if(dfs(K, 0)) pw.println("First");
		else pw.println("Second");
		pw.close();
		
	}
	
	static int N;
	static int[] a;
	
	static boolean visited[][] = new boolean[100001][2];
	static boolean canWin[][] = new boolean[100001][2];
	
	static boolean dfs(int rem, int turn) {
		if(visited[rem][turn]) return canWin[rem][turn];
		
		boolean winnable = false;
		for(int t : a) {
			if(t <= rem) if(!dfs(rem-t, 1-turn)) {
				winnable = true;
				break;
			}
		}
		
		visited[rem][turn] = true;
		return canWin[rem][turn] = winnable;
	}

	static class FastIO {

		//Is your Fast I/O being bad?

		InputStream dis;
		byte[] buffer = new byte[1 << 17];
		int pointer = 0;

		public FastIO(String fileName) throws Exception {
			dis = new FileInputStream(fileName);
		}

		public FastIO(InputStream is) throws Exception {
			dis = is;
		}

		int nextInt() throws Exception {
			int ret = 0;

			byte b;
			do {
				b = nextByte();
			} while (b <= ' ');
			boolean negative = false;
			if (b == '-') {
				negative = true;
				b = nextByte();
			}
			while (b >= '0' && b <= '9') {
				ret = 10 * ret + b - '0';
				b = nextByte();
			}

			return (negative) ? -ret : ret;
		}

		long nextLong() throws Exception {
			long ret = 0;

			byte b;
			do {
				b = nextByte();
			} while (b <= ' ');
			boolean negative = false;
			if (b == '-') {
				negative = true;
				b = nextByte();
			}
			while (b >= '0' && b <= '9') {
				ret = 10 * ret + b - '0';
				b = nextByte();
			}

			return (negative) ? -ret : ret;
		}

		byte nextByte() throws Exception {
			if (pointer == buffer.length) {
				dis.read(buffer, 0, buffer.length);
				pointer = 0;
			}
			return buffer[pointer++];
		}

		String next() throws Exception {
			StringBuffer ret = new StringBuffer();

			byte b;
			do {
				b = nextByte();
			} while (b <= ' ');
			while (b > ' ') {
				ret.appendCodePoint(b);
				b = nextByte();
			}

			return ret.toString();
		}

	}
}
