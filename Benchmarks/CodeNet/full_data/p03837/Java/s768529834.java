import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Main {
	static final int INF = (int)1e9 + 7;
	int N,M;
	ArrayList<Integer>[] G;
	boolean[][] usedEdge;
	int[][] cost;

	@SuppressWarnings("unchecked")
	public void solve() {
		N = nextInt();
		M = nextInt();

		G = new ArrayList[N];
		for(int i = 0;i < N;i++){
			G[i] = new ArrayList<Integer>();
		}

		usedEdge = new boolean[N][N];
		cost = new int[N][N];


		for(int i = 0;i < M;i++){
			int a = nextInt()-1;
			int b = nextInt()-1;
			int c = nextInt();

			G[a].add(b);
			G[b].add(a);
			cost[a][b] = c;
			cost[b][a] = c;
		}

		for(int i = 0;i < N;i++){
			int[] d = new int[N];
			int[] prev = new int[N];
			boolean[] used = new boolean[N];
			Arrays.fill(prev, -1);
			Arrays.fill(d, INF);
			d[i] = 0;

			while(true){
				int v = -1;
				for(int u = 0;u < N;u++){
					if(!used[u] && (v == -1 || d[u] < d[v]))v = u;
				}

				if(v == -1)break;
				used[v] = true;

				for(int u : G[v]){
					if(d[u] > d[v] + cost[v][u]){
						d[u] = d[v] + cost[v][u];
						prev[u] = v;
					}
				}
			}

			for(int j = 0;j < N;j++){
				if(i == j)continue;
				usedEdge[j][prev[j]] = true;
				usedEdge[prev[j]][j] = true;
			}
		}

		int ans = 0;
		boolean[][] used = new boolean[N][N];
		for(int i = 0;i < N;i++){
			for(int j : G[i]){
				if(used[i][j] || used[j][i])continue;
				if(!usedEdge[i][j] && !usedEdge[j][i]){
					used[i][j] = used[j][i] = true;
					ans++;
				}
			}
		}

		out.println(ans);
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