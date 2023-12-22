import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Task task = new Task();
		task.solve();
	}

	public static class Task {
		static final long MOD = (long) 1e9 + 7;
		List<List<Integer>> adjList;
		int[] counter;
		long[] res;

		public void solve() {
			Scan sc = new Scan();
			int n = (int) sc.scanLong();
			int q = (int) sc.scanLong();
			counter = new int[n];
			res = new long[n];
			adjList = new ArrayList<List<Integer>>(n);
			for (int i = 0; i < n; ++i)
				adjList.add(new ArrayList<Integer>());

			for (int i = 0; i < n - 1; ++i) {
				int a = (int) sc.scanLong() - 1;
				int b = (int) sc.scanLong() - 1;
				adjList.get(a).add(b);
				adjList.get(b).add(a);
			}

			while (q-- > 0) {
				int id = (int) sc.scanLong() - 1;
				int val = (int) sc.scanLong();
				counter[id] += val;
			}

			dfs(0, -1, 0);
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < n; ++i)
				sb.append(res[i]).append(" ");
			System.out.println(sb);
		}

		public void dfs(int s, int p, long soFar) {
			soFar += counter[s];
			res[s] = soFar;
			for (int nbr : adjList.get(s)) {
				if (nbr == p)
					continue;
				dfs(nbr, s, soFar);
			}
		}
	}

	public static class Scan {
		private byte[] buf = new byte[1024];
		private int index;
		private InputStream in;
		private int total;

		public Scan() {
			in = System.in;
		}

		public int scan() {
			if (total < 0)
				throw new InputMismatchException();
			if (index >= total) {
				index = 0;
				try {
					total = in.read(buf);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
				if (total <= 0)
					return -1;
			}
			return buf[index++];
		}

		public long scanLong() {
			long integer = 0;
			int n = scan();
			while (isWhiteSpace(n))
				n = scan();
			int neg = 1;
			if (n == '-') {
				neg = -1;
				n = scan();
			}
			while (!isWhiteSpace(n)) {
				if (n >= '0' && n <= '9') {
					integer *= 10;
					integer += n - '0';
					n = scan();
				} else
					throw new InputMismatchException();
			}
			return neg * integer;
		}

		public double scanDouble() throws IOException {
			double doub = 0;
			int n = scan();
			while (isWhiteSpace(n))
				n = scan();
			int neg = 1;
			if (n == '-') {
				neg = -1;
				n = scan();
			}
			while (!isWhiteSpace(n) && n != '.') {
				if (n >= '0' && n <= '9') {
					doub *= 10;
					doub += n - '0';
					n = scan();
				} else
					throw new InputMismatchException();
			}
			if (n == '.') {
				n = scan();
				double temp = 1;
				while (!isWhiteSpace(n)) {
					if (n >= '0' && n <= '9') {
						temp /= 10;
						doub += (n - '0') * temp;
						n = scan();
					} else
						throw new InputMismatchException();
				}
			}
			return doub * neg;
		}

		public String scanString() {
			StringBuilder sb = new StringBuilder();
			int n = scan();
			while (isWhiteSpace(n))
				n = scan();
			while (!isWhiteSpace(n)) {
				sb.append((char) n);
				n = scan();
			}
			return sb.toString();
		}

		public char scanChar() {
			int n = scan();
			while (isWhiteSpace(n))
				n = scan();
			return (char) n;
		}

		private boolean isWhiteSpace(int n) {
			if (n == ' ' || n == '\n' || n == '\r' || n == '\t' || n == -1)
				return true;
			return false;
		}
	}
}
