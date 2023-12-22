import java.io.*;
import java.util.*;

public class Main{
	public static InputReader scn = new InputReader();
	public static PrintWriter out = new PrintWriter(System.out);

	public static ArrayList<Integer>[] gr;
	public static boolean[] vis;
	public static HashSet<Integer> ind, val;
	
	public static void main(String[] args) throws Exception {
//		System.out.println("GO");
		
		int n = scn.nextInt(), m = scn.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = scn.nextInt() - 1;
		}
		
		gr = new ArrayList[n];
		Arrays.setAll(gr, i -> new ArrayList<>());
		
		while(m-- > 0) {
			int u = scn.nextInt() - 1, v = scn.nextInt() - 1;
			gr[u].add(v);
			gr[v].add(u);
		}
		
		int k = 0;
		vis = new boolean[n];
		for(int i = 0; i < n; i++) {
			if(!vis[i]) {
				ind = new HashSet<>();
				val = new HashSet<>();
				dfs(arr, i);
				for(int x : ind) {
					if(val.contains(x)) {
						k++;
					}
				}
			}
		}
		
		out.println(k);
		out.flush();
	}
	
	public static void dfs(int[] arr, int u) {
		if(vis[u]) {
			return;
		}
		vis[u] = true;
		ind.add(u);
		val.add(arr[u]);
		
		for(int v : gr[u]) {
			dfs(arr, v);
		}
	}

	public static class InputReader {
		InputStream is;

		public InputReader() {
			is = System.in;
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

		char[] next(int n) {
			char[] buf = new char[n];
			int b = skip(), p = 0;
			while (p < n && !(isSpaceChar(b))) {
				buf[p++] = (char) b;
				b = readByte();
			}
			return n == p ? buf : Arrays.copyOf(buf, p);
		}

		char[][] nextMatrix(int n, int m) {
			char[][] map = new char[n][];
			for (int i = 0; i < n; i++)
				map[i] = next(m);
			return map;
		}

		int[] nextArray(int n) {
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = nextInt();
			return a;
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
	}
}
