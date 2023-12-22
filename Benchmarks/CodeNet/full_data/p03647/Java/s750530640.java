import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Main {

	int N,M;
	ArrayList<Integer>[] graph;

	@SuppressWarnings("unchecked")
	public void solve() {
		N = nextInt();
		M = nextInt();

		graph = new ArrayList[N];
		for(int i = 0;i < N;i++){
			graph[i] = new ArrayList<Integer>();
		}

		for(int i = 0;i < M;i++){
			int a = nextInt()-1;
			int b = nextInt()-1;

			graph[a].add(b);
			graph[b].add(a);
		}

		boolean flag = false;

		ArrayDeque<Long> q = new ArrayDeque<Long>();
		int[] dis = new int[N];
		Arrays.fill(dis, Integer.MAX_VALUE);

		q.add(0L);
		dis[0] = 0;

		while(q.size() > 0){

			long d = q.poll();
			int v = (int)(d / 1000000);
			int c = (int)(d % 1000000);

			if(c == 2 && v == N-1){
				flag = true;
				break;
			}

			if(c >= 3)continue;

			if(dis[v] < c)continue;
			dis[v] = c;

			for(int next : graph[v]){
				if(dis[next] > dis[v] + 1){
					q.add(next * 1000000L + (dis[v] + 1));
				}
			}
		}

		out.println(flag ? "POSSIBLE" : "IMPOSSIBLE");
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