import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) {
		OriginScanner os = new OriginScanner();
		
		try (PrintWriter pw = new PrintWriter(System.out)) {
			long a = os.nextLong();
			long b = os.nextLong();
			long k = os.nextLong();
			
			long ak = Math.min(a, k);
			a -= ak;
			k -= ak;
			b -= k;
			long bk = Math.max(b, 0);
			pw.println(a + " " + bk);
		}
	}

	static class OriginScanner {
		StringTokenizer token;
		BufferedReader br;
		
		public OriginScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
		
		String nextLine() {
			String str = null;
			try {
				str = br.readLine();
			}
			catch (IOException e) {
				System.out.println(e);
			}
			return str;
		}
		
		String next() {
			while (token == null || !token.hasMoreElements()) { 
				token = new StringTokenizer(nextLine());
			}
			return token.nextToken();
		}
		
		int nextInt() {
			return Integer.parseInt(next());
		}
		
		long nextLong() {
			return Long.parseLong(next());
		}
	}
}