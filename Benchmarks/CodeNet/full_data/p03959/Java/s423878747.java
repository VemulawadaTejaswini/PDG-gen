import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.NoSuchElementException;

public class Main {
	final int MOD = (int)1e9 + 7;
	int N;
	int[] T,A,M;
	long[] dp;

	public int lower(int[] B){
		int n = B.length;
		int max = 0;
		for(int i = 0;i < n;i++){
			max = Math.max(B[i],max);
		}
		for(int i = 0; i < n;i++){
			if(max == B[i]){
				return i;
			}
		}
		return -1;
	}

	public int upper(int[] B){
		int n = B.length;
		int max = 0;
		for(int i = n - 1;i >= 0;i--){
			max = Math.max(B[i],max);
		}
		for(int i = n - 1; i >= 0;i--){
			if(max == B[i]){
				return i;
			}
		}
		return -1;
	}

	public void solve() {
		N = nextInt();
		A = new int[N];
		T = new int[N];
		M = new int[N];
		dp = new long[N + 1];
		for(int i = 0;i < N;i++){
			T[i] = nextInt();
		}
		for(int i = 0;i < N;i++){
			A[i] = nextInt();
		}

		for(int i = 0;i < N;i++){
			M[i] = Math.min(T[i],A[i]);
		}
		int lower = lower(T);
		int upper = upper(A);

		if(T[lower] != A[upper] || lower > upper){
			out.println(0);
			return;
		}
		boolean[] unique = new boolean[N];
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i = 0;i < N;i++){
			if(!set.contains(T[i])){
				unique[i] = true;
			}
			set.add(T[i]);
		}
		set.clear();
		for(int i = N - 1;i >= 0;i--){
			if(!set.contains(A[i])){
				unique[i] = true;
			}
			set.add(A[i]);
		}
		dp[0] = 1;

		for(int i = 0;i < N;i++){
			if(unique[i]){
				dp[i + 1] = dp[i] % MOD;
			}else{
				dp[i + 1] = dp[i] % MOD * M[i] % MOD;
			}
			dp[i + 1] %= MOD;
		}

		out.println(dp[N]);
	}

	public static void main(String[] args) {
		out.flush();
		new Main().solve();
		out.close();
	}

	/* Input */
	private static final InputStream in = System.in;
	private static final PrintWriter out = new PrintWriter(System.out);
	private final byte[] buffer = new byte[2048];
	private int p = 0;
	private int buflen = 0;

	private boolean hasNextByte() {
		if (p < buflen)
			return true;
		p = 0;
		try {
			buflen = in.read(buffer);
		} catch (IOException e) {
			e.printStackTrace();
		}
		if (buflen <= 0)
			return false;
		return true;
	}

	public boolean hasNext() {
		while (hasNextByte() && !isPrint(buffer[p])) {
			p++;
		}
		return hasNextByte();
	}

	private boolean isPrint(int ch) {
		if (ch >= '!' && ch <= '~')
			return true;
		return false;
	}

	private int nextByte() {
		if (!hasNextByte())
			return -1;
		return buffer[p++];
	}

	public String next() {
		if (!hasNext())
			throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		int b = -1;
		while (isPrint((b = nextByte()))) {
			sb.appendCodePoint(b);
		}
		return sb.toString();
	}

	public int nextInt() {
		return Integer.parseInt(next());
	}

	public long nextLong() {
		return Long.parseLong(next());
	}

	public double nextDouble() {
		return Double.parseDouble(next());
	}
}