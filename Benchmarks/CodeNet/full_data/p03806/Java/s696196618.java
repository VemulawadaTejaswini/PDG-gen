import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;

public class Main {
	static final int INF = (int)1e9 + 7;
	int N,Ma,Mb;
	int[] A,B,C;

	public int gcd(int x,int y){
		return y == 0 ? 1 : gcd(y,x%y);
	}

	public void solve() {
		N = nextInt();
		Ma = nextInt();
		Mb = nextInt();

		A = new int[N];
		B = new int[N];
		C = new int[N];

		for(int i = 0;i < N;i++){
			A[i] = nextInt();
			B[i] = nextInt();
			C[i] = nextInt();
		}

		int[][][] dp = new int[N+1][1000+10][1000+10];
		for(int i = 0;i < N + 1;i++){
			for(int j = 0;j < 1000 + 10;j++){
				for(int k = 0;k < 1000 + 10;k++){
					dp[i][j][k] = INF;
				}
			}
		}

		dp[0][0][0] = 0;
		for(int i = 0;i < N;i++){
			for(int j = 0;j < 1000+1;j++){
				for(int k = 0;k < 1000+1;k++){
					dp[i+1][j][k] = Math.min(dp[i+1][j][k], dp[i][j][k]);
					int a = j + A[i];
					int b = k + B[i];
					if(a >= 1010 || b >= 1010)continue;
					dp[i+1][a][b] = Math.min(dp[i+1][a][b],dp[i][j][k]+C[i]);
				}
			}
		}

		int ans = INF;

		for(int i = 1;i * Math.max(Ma, Mb) <= 1000;i++){
			ans = Math.min(ans,dp[N][i*Ma][i*Mb]);
		}
		if(ans == INF){
			out.println(-1);
		}else{
			out.println(ans);
		}
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