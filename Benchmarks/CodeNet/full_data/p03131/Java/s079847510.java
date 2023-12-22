import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner();
		PrintWriter out = new PrintWriter(System.out);
		int k = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt();
		long ans = 1L;
		if(k >= a-1){
			k -= a-1;
			ans += a-1;
		}
		if(b > a+1 && k > 0){
			ans += 1l*(b-a)*(k/2);
			k %= 2;
		}
		ans += k;
		out.println(ans);
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
