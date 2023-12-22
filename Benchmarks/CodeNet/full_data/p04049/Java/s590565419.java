import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class Main {

	ArrayList<Integer>[] graph;
	int N,K;

	private class P implements Comparable<P>{
		int f,s;
		public P(int f,int s){
			this.f = f;
			this.s = s;
		}

		public int compareTo(P p){
			return this.s - p.s;
		}
	}

	public void solve(){
		N = nextInt();
		K = nextInt();

		graph = new ArrayList[N];
		for(int i = 0;i < N;i++){
			graph[i] = new ArrayList<Integer>();
		}

		for(int i = 0;i < N - 1;i++){
			int a = nextInt() - 1;
			int b = nextInt() - 1;

			graph[a].add(b);
			graph[b].add(a);
		}

		int ans = 0;

		for(int i = 0;i < N;i++){

			Queue<P> q = new LinkedList<P>();
			q.add(new P(i,0));
			boolean[] used = new boolean[N];
			int connected = 0;

			while(q.size() > 0){

				P p = q.poll();

				if(used[p.f])continue;
				if(p.s > K / 2)continue;
				used[p.f] = true;
				connected++;
				for(int n : graph[p.f]){
					q.add(new P(n,p.s + 1));
				}
			}
			ans = Math.max(ans, connected);
		}
		out.println(N - ans);
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