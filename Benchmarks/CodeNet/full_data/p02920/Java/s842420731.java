import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.StringTokenizer;
import java.util.TreeMap;
 
public class Main {
	
	public static void main(String[] args) {
		FastReader scan = new FastReader();
		PrintWriter out = new PrintWriter(System.out);
		Task solver = new Task();
		int t = 1;
		while(t-->0) solver.solve(1, scan, out);
		out.close();
	}
	
	static class Task {
		public void solve(int testNumber, FastReader scan, PrintWriter out) {
			int n = 1 << scan.nextInt();
			int max = 0;
			TreeMap<Integer, Integer> t = new TreeMap<>();
			PriorityQueue<Integer> q = new PriorityQueue<>();
			for(int i = 0; i < n; i++) {
				int a = scan.nextInt();
				max = Math.max(max, a);
				add(t, a);
			}
			remove(t, max);
			q.add(max);
			while(q.size() != n) {
				ArrayList<Integer> res = new ArrayList<>();
				for(int i : q) {
					Integer g = t.lowerKey(i);
					if(g == null) {
						out.println("No");
						return;
					}
					remove(t, g);
					res.add(g);
				}
				for(int i : res) q.add(i);
			}
			out.println("Yes");
		}
		
		static void remove(TreeMap<Integer, Integer> t, int x) {
			int g = t.get(x);
			if(g == 1) t.remove(x);
			else t.put(x, g-1);
		}
		
		static void add(TreeMap<Integer, Integer> t, int x) {
			t.put(x, t.getOrDefault(x, 0)+1);
		}
		
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