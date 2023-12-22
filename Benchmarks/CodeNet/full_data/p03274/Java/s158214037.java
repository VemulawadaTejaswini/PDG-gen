    import java.io.*;
    import java.util.*;
     
    public class Main {
    	FastReader scn;
    	PrintWriter out;
    	String INPUT = "";
     
    	void solve() {
    		int n = scn.nextInt(), k = scn.nextInt();
    		int[] arr = scn.nextIntArray(n);
    		if (Arrays.binarySearch(arr, 0) >= 0) {
    			k--;
    			if (k == 0) {
    				out.println(0);
    				return;
    			}
    		}
     
    		int[] ps = new int[n], ng = new int[n];
    		int x = 0, y = 0;
    		try {
    			for (int i = 0; i < n; i++) {
    				if (arr[i] > 0) {
    					ps[x++] = arr[i];
    				} else if (arr[i] < 0) {
    					ng[y++] = -arr[i];
    				}
    			}
    			ps = Arrays.copyOf(ps, x);
    			ng = Arrays.copyOf(ng, y);
    			Arrays.sort(ps);
    			Arrays.sort(ng);
    			if (x == 0) {
    				out.println(ng[k - 1]);
    				return;
    			}
    			if (y == 0) {
    				out.println(ps[k - 1]);
    				return;
    			}
    		} catch (ArrayIndexOutOfBoundsException e) {
    			System.out.println(-1);
    			return;
    		}
     
    		long ans = Long.MAX_VALUE;
    		for (int i = 0, j = 1; i < x; i++, j++) {
    			if (j == k) {
    				ans = Math.min(ans, ps[i]);
break;
    			} else if (k - j <= y) {
    				ans = Math.min(ans, 2 * ps[i] + ng[k - j - 1]);
    			}
    		}
    		for (int i = 0, j = 1; i < y; i++, j++) {
    			if (j == k) {
    				ans = Math.min(ans, ng[i]);break;
    			} else if (k - j <= x) {
    				ans = Math.min(ans, 2 * ng[i] + ps[k - j - 1]);
    			}
    		}
     
    		out.println(ans);
    	}
     
    	void run() throws Exception {
    		long time = System.currentTimeMillis();
    		boolean oj = true;
    		out = new PrintWriter(System.out);
    		scn = new FastReader(oj);
    		solve();
    		out.flush();
    		if (!oj) {
    			System.out.println(Arrays.deepToString(new Object[] { System.currentTimeMillis() - time + " ms" }));
    		}
    	}
     
    	public static void main(String[] args) throws Exception {
    		new Main().run();
    	}
     
    	class FastReader {
    		InputStream is;
     
    		public FastReader(boolean onlineJudge) {
    			is = onlineJudge ? System.in : new ByteArrayInputStream(INPUT.getBytes());
    		}
     
    		byte[] inbuf = new byte[1024];
    		public int lenbuf = 0, ptrbuf = 0;
     
    		int readByte() {
    			if (lenbuf == -1)
    				throw new InputMismatchException();
    			if (ptrbuf >= lenbuf) {
    				ptrbuf = 0;
    				try {
    					lenbuf = is.read(inbuf);
    				} catch (IOException e) {
    					throw new InputMismatchException();
    				}
    				if (lenbuf <= 0)
    					return -1;
    			}
    			return inbuf[ptrbuf++];
    		}
     
    		boolean isSpaceChar(int c) {
    			return !(c >= 33 && c <= 126);
    		}
     
    		int skip() {
    			int b;
    			while ((b = readByte()) != -1 && isSpaceChar(b))
    				;
    			return b;
    		}
     
    		double nextDouble() {
    			return Double.parseDouble(next());
    		}
     
    		char nextChar() {
    			return (char) skip();
    		}
     
    		String next() {
    			int b = skip();
    			StringBuilder sb = new StringBuilder();
    			while (!(isSpaceChar(b))) { // when nextLine, (isSpaceChar(b) && b != ' ')
    				sb.appendCodePoint(b);
    				b = readByte();
    			}
    			return sb.toString();
    		}
     
    		String nextLine() {
    			int b = skip();
    			StringBuilder sb = new StringBuilder();
    			while ((!isSpaceChar(b) || b == ' ')) { // when nextLine, (isSpaceChar(b) && b != ' ')
    				sb.appendCodePoint(b);
    				b = readByte();
    			}
    			return sb.toString();
    		}
     
    		char[] next(int n) {
    			char[] buf = new char[n];
    			int b = skip(), p = 0;
    			while (p < n && !(isSpaceChar(b))) {
    				buf[p++] = (char) b;
    				b = readByte();
    			}
    			return n == p ? buf : Arrays.copyOf(buf, p);
    		}
     
    		int nextInt() {
    			int num = 0, b;
    			boolean minus = false;
    			while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'))
    				;
    			if (b == '-') {
    				minus = true;
    				b = readByte();
    			}
     
    			while (true) {
    				if (b >= '0' && b <= '9') {
    					num = num * 10 + (b - '0');
    				} else {
    					return minus ? -num : num;
    				}
    				b = readByte();
    			}
    		}
     
    		long nextLong() {
    			long num = 0;
    			int b;
    			boolean minus = false;
    			while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'))
    				;
    			if (b == '-') {
    				minus = true;
    				b = readByte();
    			}
     
    			while (true) {
    				if (b >= '0' && b <= '9') {
    					num = num * 10 + (b - '0');
    				} else {
    					return minus ? -num : num;
    				}
    				b = readByte();
    			}
    		}
     
    		char[][] nextMatrix(int n, int m) {
    			char[][] map = new char[n][];
    			for (int i = 0; i < n; i++)
    				map[i] = next(m);
    			return map;
    		}
     
    		int[] nextIntArray(int n) {
    			int[] a = new int[n];
    			for (int i = 0; i < n; i++)
    				a[i] = nextInt();
    			return a;
    		}
     
    		long[] nextLongArray(int n) {
    			long[] a = new long[n];
    			for (int i = 0; i < n; i++)
    				a[i] = nextLong();
    			return a;
    		}
     
    		int[][] next2DInt(int n, int m) {
    			int[][] arr = new int[n][];
    			for (int i = 0; i < n; i++) {
    				arr[i] = nextIntArray(m);
    			}
    			return arr;
    		}
     
    		long[][] next2DLong(int n, int m) {
    			long[][] arr = new long[n][];
    			for (int i = 0; i < n; i++) {
    				arr[i] = nextLongArray(m);
    			}
    			return arr;
    		}
     
    		int[] shuffle(int[] arr) {
    			Random r = new Random();
    			for (int i = 1, j; i < arr.length; i++) {
    				j = r.nextInt(i);
    				arr[i] = arr[i] ^ arr[j];
    				arr[j] = arr[i] ^ arr[j];
    				arr[i] = arr[i] ^ arr[j];
    			}
    			return arr;
    		}
    	}
    }