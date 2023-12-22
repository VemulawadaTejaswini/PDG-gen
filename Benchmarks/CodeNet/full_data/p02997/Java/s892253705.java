import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		FastScanner fs = new FastScanner(System.in);
		int N = fs.nextInt(), K = fs.nextInt();
		
		int initial_edge = N-1; 
		int dec = (N-1)*(N-2)/2 - K;
		if(dec < 0) {
			System.out.println(-1);
			return;
		}
		int M = initial_edge + dec;
		//まず頂点1を中心とする放射状のグラフを作る
		StringBuilder sb = new StringBuilder();
		sb.append(M + "\n");
		for(int i=2;i<=N;i++) {
			int u = 1 ,v = i;
			sb.append(u + " " + v + "\n");
		}
		for(int i=2;i<=N;i++) {
			for(int j=i+1;j<=N;j++) {
				if(dec == 0)break;
				dec --;
				sb.append(i + " " + j + "\n");
			}
		}
		System.out.println(sb.toString());
	}
}

//高速なScanner
class FastScanner {
	private BufferedReader reader = null;
	private StringTokenizer tokenizer = null;

	public FastScanner(InputStream in) {
		reader = new BufferedReader(new InputStreamReader(in));
		tokenizer = null;
	}

	public String next() {
		if (tokenizer == null || !tokenizer.hasMoreTokens()) {
			try {
				tokenizer = new StringTokenizer(reader.readLine());
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return tokenizer.nextToken();
	}

	public String nextLine() {
		if (tokenizer == null || !tokenizer.hasMoreTokens()) {
			try {
				return reader.readLine();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return tokenizer.nextToken("\n");
	}

	public long nextLong() {
		return Long.parseLong(next());
	}

	public int nextInt() {
		return Integer.parseInt(next());
	}

	public double nextDouble() {
		return Double.parseDouble(next());
	}

	public int[] nextIntArray(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = nextInt();
		return a;
	}

	public long[] nextLongArray(int n) {
		long[] a = new long[n];
		for (int i = 0; i < n; i++)
			a[i] = nextLong();
		return a;
	}
}