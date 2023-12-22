import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Main {
	int H,W;
	char[][] c;
	int[] high;
	long[][][][] memo;
	public long dfs(int x,int y,int z,int n){
		if(n == H * W){
			return 0;
		}

		if(memo[x][y][z][n] != -1){
			return memo[x][y][z][n];
		}

		long ret = Long.MAX_VALUE;

		for(int i = 0;i < W;i++){
			if(high[i] == 0)continue;
			int cost = 0;
			for(int j = 0;j < H;j++){
				if(i - 1 >= 0){
					if(c[j][i] != '.' && c[j][i] == c[j][i - 1]){
						cost++;
					}
				}

				if(i + 1 < W){
					if(c[j][i] != '.' && c[j][i] == c[j][i + 1]){
						cost++;
					}
				}
			}
			char tmp = c[0][i];
			for(int j = 1;j < H;j++){
				c[j - 1][i] = c[j][i];
			}
			c[H - 1][i] = '.';
			high[i]--;

			if(i == 0){
				ret = Math.min(ret,dfs(x - 1,y,z,n + 1) + cost);
			}else if(i == 1){
				ret = Math.min(ret,dfs(x,y - 1,z,n + 1) + cost);
			}else{
				ret = Math.min(ret,dfs(x,y,z - 1,n + 1) + cost);
			}

			high[i]++;
			for(int j = H - 1;j >= 1;j--){
				c[j][i] = c[j - 1][i];
			}
			c[0][i] = tmp;
		}
		return memo[x][y][z][n] = ret;
	}

	public void solve() {
		H = nextInt();
		W = nextInt();
		if(W != 3)return;
		high = new int[W];
		Arrays.fill(high,H);
		c = new char[H][];
		memo = new long[H + 1][H + 1][H + 1][H * W];
		for(int i = 0;i < H + 1;i++){
			for(int j = 0;j < H + 1;j++){
				for(int k = 0;k < H + 1;k++){
					for(int l = 0;l < H * W;l++){
						memo[i][j][k][l] = -1;
					}
				}
			}
		}
		for(int i = 0;i < H;i++){
			c[i] = next().toCharArray();
		}

		out.println(dfs(H,H,H,0));
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