import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
	static class TaskSolver {
		int n;
		long x;
		long ans;
		long[] P;
		long[] BP;
		
		public void go(int pos, long rem) {
			if(rem < 1) return ;
			if(rem >= BP[pos]) {
				ans += P[pos];
				return ;
			}
			long mid = BP[pos] / 2 + 1;
			if(rem == mid) {
				ans += P[pos - 1] + 1;
			} else if(rem < mid) {
				go(pos - 1, rem - 1);
			} else {
				ans += P[pos - 1] + 1;
				go(pos - 1, rem - mid);
			}
		}
		
		public void solve(MyScanner in, MyWriter out) throws IOException {
			n = in.nextInt();
			x = in.nextLong();
			P = new long[n + 5];
			BP = new long[n + 5];
			P[0] = 1; BP[0] = 1;
			for(int i = 1; i <= n; i++) {
				P[i] = P[i - 1] * 2 + 1;
				BP[i] = 1 + BP[i - 1] + 1 + BP[i - 1] + 1;
			}
			ans = 0;
			go(n, x);
			out.println(ans);
		}
	}

	public static void main(String[] arg) {
		try {
			MyScanner in = new MyScanner();
			MyWriter out = new MyWriter();
			TaskSolver Solver = new TaskSolver();
			Solver.solve(in, out);
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	static class MyWriter extends PrintWriter {
		MyWriter() throws FileNotFoundException {
			super(System.out);
		}

		void printArrayInOneLine(int[] a) {
			print('[');
			for (int i = 0; i < a.length; i++) {
				print(a[i] + " ");
			}
			println(']');
		}
	}

	static class MyScanner {
		private BufferedReader br;
		private StringTokenizer st;

		public MyScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		public String next() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (Exception e) {
					return null;
				}
			}
			return st.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(next());
		}

		public long nextLong() {
			return Long.parseLong(next());
		}

		public double nextDouble() {
			return Double.parseDouble(next());
		}

		public String nextLine() {
			try {
				return br.readLine();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return null;
		}
	}
}