

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main{

	
	static long solve(int x, int y, int z, int[] g, int[] s, int[] b) {
		
		int n = x + y + z;
		
		Integer[] arr = new Integer[n];

		for (int i = 0; i < n; i++)
			arr[i] = i;

		Arrays.sort(arr, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				int d = -(s[o2] - g[o2]) + (s[o1] - g[o1]);
				if(d == 0)
					return (b[o2] - s[o2]) - (b[o1] - s[o1]);
				return d;
			}
		});



		PriorityQueue<Integer> qG = new PriorityQueue<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				int d = -(b[o2] - g[o2]) + (b[o1] - g[o1]);
				if(d == 0)
					return (b[o2] - s[o2]) - (b[o1] - s[o1]);
				return -(b[o2] - g[o2]) + (b[o1] - g[o1]) ;
			}
		});



		for (int i = 0; i < x + z; i++)
			qG.add(arr[i]);

		long ans = 0;

		for (int i = 0; i < x; i++) {
			int v = qG.remove();
			ans += g[v];
		}

		PriorityQueue<Integer> qS = new PriorityQueue<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return -(b[o2] - s[o2]) + (b[o1] - s[o1]) ;
			}
		});

		for (int i = x + z; i < n; i++) 
			qS.add(arr[i]);
		

		while(!qG.isEmpty())
			qS.add(qG.remove());

		for (int i = 0; i < y; i++) {
			int v = qS.remove();
			ans += s[v];
		}
		


		while(!qS.isEmpty()) {
			int v = qS.remove();
			ans += b[v];
		}
		
		return ans;
	}


	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();

		int n = x + y + z;

		int[] g = new int[n];
		int[] s = new int[n];
		int[] b = new int[n];

		for (int i = 0; i < n; i++) {
			g[i] = sc.nextInt();
			s[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}

		
		long ans = 0;
		
		ans = Math.max(ans, solve(x, y, z, g, s, b));
		ans = Math.max(ans, solve(y, x, z, s, g, b));
		ans = Math.max(ans, solve(x, z, y, g, b, s));
		ans = Math.max(ans, solve(y, z, x, s, b, g));
		ans = Math.max(ans, solve(z, y, x, b, s, g));
		ans = Math.max(ans, solve(z, x, y, b, g, s));

		out.println(ans);

		out.flush();
	}


	static class Scanner {
		StringTokenizer st;
		BufferedReader br;

		public Scanner(InputStream s) {
			br = new BufferedReader(new InputStreamReader(s));
		}

		public String next() throws IOException {
			while(st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		public String nextLine() throws IOException {
			return br.readLine();
		}

		public int nextInt() throws NumberFormatException, IOException {
			return Integer.parseInt(next());
		}

		public long nextLong() throws NumberFormatException, IOException {
			return Long.parseLong(next());
		}
	}	

}