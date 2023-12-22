
import java.util.*;
import java.io.*;

public class Main {
	static int mod = (int) 1e9 + 7;

	public static void main(String[] args) {
		FastScanner fs = new FastScanner(System.in);
		int N = fs.nextInt(), Q = fs.nextInt();
		int stop[][] = new int[N][3];
		for(int i=0;i<N;i++) {
			int s = fs.nextInt(), t = fs.nextInt(), x = fs.nextInt();
			stop[i][0] = s;
			stop[i][1] = t; //通行止は[s,t)と解釈して良い。
			stop[i][2] = x;			
		}
		int D[] = new int[Q];
		for(int i=0;i<Q;i++)D[i] = fs.nextInt();
		
		TreeMap<Integer, Integer> tm = new TreeMap<>();
		
		for(int i=0;i<Q;i++) {
			tm.put(D[i], i); //keyに出発時刻、valueには解答番号
		}
		
		//通行止めになる座標が小さいものから処理するために、stopをxで昇順ソート
		Arrays.sort(stop, (s1,s2)->s1[2]-s2[2]);
		
		int ans[] = new int[Q];
		Arrays.fill(ans, -1);
		for(int i=0;i<N;i++) {
			int s = stop[i][0], t= stop[i][1], x=stop[i][2];
			int os = s - x, ot = t - 1 - x;
			while(tm.ceilingKey(os)!=null) {
				int under = tm.ceilingKey(os);
				if (under <= ot) {
					int qnum = tm.get(under);
					ans[qnum]=x;
					tm.remove(under);
				}else {
					break;
				}
			}
		}
		StringBuilder sb = new StringBuilder();
		for(int a:ans) {
			sb.append(a + "\n");
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
