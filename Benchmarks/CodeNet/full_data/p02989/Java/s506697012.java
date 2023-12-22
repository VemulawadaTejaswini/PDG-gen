import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class F {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner();
		PrintWriter out = new PrintWriter(System.out);
		int n = sc.nextInt();
		int [] occ = new int[(int)1e5+1];
		for (int i = 0; i < n; ++i) {
			++occ[sc.nextInt()];
		}
		int cnt = 0, i = 0;
		while(i < occ.length) {
			if(cnt + occ[i] > n/2)
				break;
			cnt += occ[i++];
		}
		// i contains (n/2+1)th element
		--occ[i];
		int k = 0;
		while(i >= 0 && occ[i--] == 0) ++k;
		out.println(k);
		out.flush();
		out.close();
	}

	static class Scanner {
		BufferedReader br;
		StringTokenizer st;

		public Scanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens()) {
				st = new StringTokenizer(br.readLine());
			}
			return st.nextToken();
		}

		public int nextInt() throws NumberFormatException, IOException {
			return Integer.parseInt(next());
		}
	}
}
