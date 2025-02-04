
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static FastReader input = new FastReader();
	static PrintWriter out = new PrintWriter(System.out);
	static String s, t;
	
	static int[][] memo;
	static boolean[][] visited;
	static char [] sol ; 
	public static int LCS(int i, int j) {
		if (i < 0 || j < 0)
			return 0;


		if (visited[i][j])
			return memo[i][j];

		if (s.charAt(i) == t.charAt(j)) {
			sol[i] = s.charAt(i);
			return memo[i][j] = 1 + LCS(i - 1, j - 1);
		}
		
		visited[i][j] = true;
		return memo[i][j] =  Math.max(LCS(i - 1, j), LCS(i, j - 1));

	}

	public static void main(String[] args) throws NumberFormatException, IOException {

		s = input.next();
		t = input.next();

		memo = new int[s.length()][t.length()];
		visited = new boolean [s.length()] [t.length()] ;
		sol = new char [s.length()];
	
		LCS(s.length()-1,t.length()-1 );
	
		for (int i = 0 ; i < sol.length ; i++) {
			out.print(sol[i]!=0? sol[i]:"");
		}
		out.flush();
	
	}

	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() throws IOException {
			while (st == null || !st.hasMoreElements()) {
				st = new StringTokenizer(br.readLine());
			}
			return st.nextToken();
		}

		int nextInt() throws NumberFormatException, IOException {
			return Integer.parseInt(next());
		}

		long nextLong() throws NumberFormatException, IOException {
			return Long.parseLong(next());
		}

		double nextDouble() throws NumberFormatException, IOException {
			return Double.parseDouble(next());
		}

		String nextLine() throws IOException {
			String str = "";
			str = br.readLine();
			return str;
		}
	}
}
