import java.util.*;
import java.io.*;

public class Main {
	//よく使う定数
	static final int mod = (int) 1e9 + 7;
	static final int DX[] = { -1, 0, 1, 0 }, DY[] = { 0, -1, 0, 1 };

	public static void main(String[] args) {
		FastScanner fs = new FastScanner(System.in);
		int N = fs.nextInt(), K = fs.nextInt();
		int A[] = fs.nextIntArray(N);
		
		long sum = 0;
		Set<Long> candidates = new HashSet<>();
		for(int i=0;i<N;i++) sum += A[i];
		for(long i=1;i*i<=sum;i++) {
			if(sum%i==0) {
				candidates.add(i);
				candidates.add(sum/i);
			}
		}
		
		long ans = 1;
		//各候補値について、何回で全てをXの倍数にできるか
		for(long x :candidates) {
			long t[] = new long[N];
			for(int i=0;i<N;i++)t[i] = A[i]%x;
			Arrays.sort(t);
			long subSum = 0;
			for(int i=0;i<N;i++)subSum += t[i];
			long r = subSum/x; //右からいくつをxにするか。（左からは0にする）
			long res = 0;
			for(int i=0;i<r;i++) {
				res += (x - t[N-1-i]);
			}
			if(res <= K) ans = Math.max(ans, x);
		}
		System.out.println(ans);
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