import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.StringTokenizer;
 
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
		static char[] a;
		public void solve(int testNumber, FastReader scan, PrintWriter out) {
			int n = scan.nextInt(), k = scan.nextInt();
			a = scan.next().toCharArray();
			int t = 0;
			char curr = a[0];
			ArrayList<Character> b = new ArrayList<>();
			b.add(curr);
			for(int i = 0; i < a.length; i++) {
				if(a[i] == 'L' && i > 0 && a[i-1] == 'L') t++;
				if(a[i] == 'R' && i < a.length-1 && a[i+1] == 'R') t++;
				if(a[i] != curr) {
					b.add(a[i]);
					curr = a[i];
				}
			}
			int count = Math.min(k, b.size()/2);
			t += count*2;
			if(b.size()%2 == 0 && count == b.size()/2) t--;
			out.println(t);
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