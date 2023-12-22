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
			int n = scan.nextInt(), max = scan.nextInt()+1, day = 1;
			PriorityQueue<Pair> q = new PriorityQueue<>();
			long total = 0;
			for(int i = 0; i < n; i++) q.add(new Pair(scan.nextInt(), scan.nextInt()));
			while(!q.isEmpty()) {
				Pair get = q.poll();
				if(get.y + day > max) continue;
				total += get.z;
				day++;
			}
			out.println(total);
		}
		static class Pair implements Comparable<Pair>{
			int y;
			int z;
			public Pair(int a, int b) {
				y = a;
				z = b;
			}
			@Override
			public int compareTo(Pair o) {
				if(z == o.z) return Integer.compare(o.y, y);
				return Integer.compare(o.z, z);
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
