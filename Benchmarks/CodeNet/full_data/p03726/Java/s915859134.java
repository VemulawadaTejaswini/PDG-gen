import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Main {

	int N;
	ArrayList<Integer>[] graph;
	boolean[] used;

	@SuppressWarnings("unchecked")
	public void solve(){
		N = nextInt();
		graph = new ArrayList[N];
		for(int i = 0;i < N;i++){
			graph[i] = new ArrayList<Integer>();
		}

		for(int i = 0;i < N-1;i++){
			int a = nextInt()-1;
			int b = nextInt()-1;

			graph[a].add(b);
			graph[b].add(a);
		}

		for(int i = 0;i < N;i++){
			int count = 0;
			for(int next : graph[i]){
				if(graph[next].size() == 1){
					count++;
				}
			}

			if(count >= 2){
				out.println("First");
				return;
			}
		}
		used = new boolean[N];
		ArrayDeque<Integer> q = new ArrayDeque<Integer>();
		for(int i = 0;i < N;i++){
			if(graph[i].size() == 1){
				q.add(i);
			}
		}

		while(q.size() > 0){

			int v = q.poll();
			int next = -1;
			for(int u : graph[v]){
				if(used[u])continue;
				next = u;
				break;
			}

			if(next == -1)continue;
			used[next] = true;
			used[v] = true;

			for(int u : graph[next]){
				if(used[u])continue;
				q.add(u);
			}
		}


		for(int i = 0;i < N;i++){
			if(!used[i]){
				out.println("First");
				return;
			}
		}
		out.println("Second");


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