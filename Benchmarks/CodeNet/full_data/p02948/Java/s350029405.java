import java.io.*;
import java.util.*;

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
			int n = scan.nextInt(), m = scan.nextInt();
			Job[] a = new Job[n];
			for(int i = 0; i < n; i++) a[i] = new Job(scan.nextInt(), scan.nextInt());
			Arrays.sort(a);
			int day = 1, max = m+1;
			long total = 0;
			for(int i = 0; i < n; i++) {
				if(day + a[i].day <= max) {
					day++;
					total += a[i].reward;
				}
			}
			out.println(total);
		}
		
		static class Job implements Comparable<Job> {
			int day;
			int reward;
			public Job(int a, int b) {
				day = a;
				reward = b;
			}
			@Override
			public int compareTo(Job o) {
				if(reward == o.reward) return Integer.compare(o.day, day);
				return Integer.compare(o.reward, reward);
			}
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
