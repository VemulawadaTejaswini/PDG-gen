import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Random;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
	
	public static void main(String[] args) {
		FastReader scan = new FastReader();
		PrintWriter out = new PrintWriter(System.out);
		Task solver = new Task();
		solver.solve(1, scan, out);
		out.close();
	}
	
	static class Task {
		public void solve(int testNumber, FastReader scan, PrintWriter out) {
			int n = scan.nextInt();
			long[][] a = new long[n][2];
			double best = 0;
			for(int i = 0; i < n; i++) {
				a[i][0] = scan.nextLong();
				a[i][1] = scan.nextLong();
			}
			double x = 0, y = 0;
			for(int i = 0; i < n; i++) {
				if(a[i][0] >= 0 || a[i][1] >= 0) {
					double xx = x+a[i][0], yy = y+a[i][1];
					double curr = calc(x, y), next = calc(xx, yy);
					if(next > curr) {
						x = xx;
						y = yy;
					}
				}
			}
			best = Math.max(best, calc(x, y));
			x = 0;
			y = 0;
			for(int i = 0; i < n; i++) {
				if(a[i][0] <= 0 || a[i][1] >= 0) {
					double xx = x+a[i][0], yy = y+a[i][1];
					double curr = calc(x, y), next = calc(xx, yy);
					if(next > curr) {
						x = xx;
						y = yy;
					}
				}
			}
			best = Math.max(best, calc(x, y));
			x = 0;
			y = 0;
			for(int i = 0; i < n; i++) {
				if(a[i][0] <= 0 || a[i][1] <= 0) {
					double xx = x+a[i][0], yy = y+a[i][1];
					double curr = calc(x, y), next = calc(xx, yy);
					if(next > curr) {
						x = xx;
						y = yy;
					}
				}
			}
			best = Math.max(best, calc(x, y));
			x = 0;
			y = 0;
			for(int i = 0; i < n; i++) {
				if(a[i][0] >= 0 || a[i][1] <= 0) {
					double xx = x+a[i][0], yy = y+a[i][1];
					double curr = calc(x, y), next = calc(xx, yy);
					if(next > curr) {
						x = xx;
						y = yy;
					}
				}
			}
			best = Math.max(best, calc(x, y));
			out.println(best);
		}
	}
	
	static double calc(double a, double b) {
		double aa = a*a;
		double bb = b*b;
		return Math.sqrt(aa+bb);
	}
	
	static void shuffle(int[] a) {
		Random get = new Random();
		for(int i = 0; i < a.length; i++) {
			int r = get.nextInt(a.length);
			int temp = a[i];
			a[i] = a[r];
			a[r] = temp;
		}
	}
	
	static void shuffle(long[] a) {
		Random get = new Random();
		for(int i = 0; i < a.length; i++) {
			int r = get.nextInt(a.length);
			long temp = a[i];
			a[i] = a[r];
			a[r] = temp;
		}
	}
	

	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
		public FastReader(String s) throws FileNotFoundException {
			br = new BufferedReader(new FileReader(new File(s)));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}

}
