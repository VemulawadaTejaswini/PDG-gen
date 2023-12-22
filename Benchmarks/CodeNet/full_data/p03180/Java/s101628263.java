import java.util.*;
import java.io.*;
import java.awt.Point;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) throws Exception {
		FastIO sc = new FastIO(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		
		int N = sc.nextInt();
		long[][] gain = new long[N][N];
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				gain[i][j] = sc.nextInt();
			}
		}
		
		long[] cost = new long[1<<N];
		
		for(int mask = 0; mask < 1 << N; mask++) {
			ArrayList<Integer> bits = new ArrayList<Integer>();
			for(int j = 0; j < N; j++) {
				if(((1 << j) & mask) > 0) bits.add(j);
			}
			long tot = 0;
			for(int i = 0; i < bits.size(); i++) {
				for(int j = i+1; j < bits.size(); j++) {
					cost[mask] += gain[bits.get(i)][bits.get(j)];
				}
			}
		}
		
		long[] dp = new long[1 << N];
		for(int big = 0; big < 1 << N; big++) {
			long add = 0;
			for(int i = big; i > 0; i = (i-1) & big){
				add = Math.max(add, cost[i]+dp[big-i]);
			}
			dp[big] = add;
		}
		
		pw.println(dp[(1<<N)-1]);
		pw.close();
		
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
