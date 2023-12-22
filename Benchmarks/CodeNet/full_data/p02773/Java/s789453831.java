import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		HashMap<String,Integer> x=new HashMap<>();
		int n=sc.nextInt();
		String[] z=new String[n];
		int max=1;
		for(int i=0;i<n;i++) {
			z[i]=sc.next();
		}
		Arrays.sort(z);
		for(int i=0;i<n;i++) {
			if(x.containsKey(z[i])) {
				x.put(z[i], x.get(z[i])+1);
				max=Math.max(max, x.get(z[i]));
			}
			else
				x.put(z[i], 1);
		}
		for(int i=0;i<n;i++) {
			if(x.get(z[i])==max) {
				pw.println(z[i]);
				x.put(z[i], -1);
			}
		}
		pw.close();
	}

	static class Scanner {
		StringTokenizer st;
		BufferedReader br;

		public Scanner(InputStream s) {
			br = new BufferedReader(new InputStreamReader(s));
		}

		public Scanner(String file) throws FileNotFoundException {
			br = new BufferedReader(new FileReader(file));
		}

		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}

		public String nextLine() throws IOException {
			return br.readLine();
		}

		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}

		public boolean ready() throws IOException {
			return br.ready();
		}
	}
}