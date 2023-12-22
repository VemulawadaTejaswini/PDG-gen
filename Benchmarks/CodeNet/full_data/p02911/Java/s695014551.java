import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

class Main {
	
    public static void main(String[] args) {
		OriginScanner os = new OriginScanner();
		PrintWriter pw = new PrintWriter(System.out);
		
		int n = os.nextInt();
		int k = os.nextInt();
		int q = os.nextInt();
		
		int[] points = IntStream.rangeClosed(1, n).map(i -> k).toArray();
		for (int i = 0; i < q; i++) {
			int ans = os.nextInt() - 1;
			for (int p = 0; p < points.length; p++) {
				if (p != ans) points[p] -= 1;
			}
		}
		IntStream.of(points).forEach(i ->{
			if (i < 1) pw.println("No");
			else pw.println("Yes");
		});
		pw.close();
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