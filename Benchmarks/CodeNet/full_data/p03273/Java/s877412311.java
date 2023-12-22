
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
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

	static int[] f = new int[1000001];
	static long ans = 0;

	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int h = sc.nextInt(), w = sc.nextInt();
		String[] a = new String[h];
		for (int i = 0; i < h; i++)
			a[i] = sc.next();
		boolean[] row = new boolean[h], col = new boolean[w];
		Arrays.fill(row, false);
		Arrays.fill(row, false);
		for (int i = 0; i < h; i++)
			for (int j = 0; j < w; j++)
				if (a[i].charAt(j) == '#') {
					row[i]=true;
					col[j]=true;
				}
		for(int i=0;i<h;i++){
			if(row[i]){
				for(int j=0;j<w;j++){
					if(col[j]){
						System.out.print(a[i].charAt(j));
					}
				}
				System.out.println();
			}
		}
	}

}
