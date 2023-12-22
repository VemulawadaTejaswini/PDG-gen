import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

	int N;
	ArrayList<Integer>[] graph;
	Queue<Long> leaf;
	boolean[] used;

	public boolean check(){
		for(int i = 0;i < N;i++){
			int count = 0;
			for(int next : graph[i]){
				if(graph[next].size() == 1){
					count++;
				}
			}

			if(count >= 2){
				return true;
			}
		}

		return false;
	}

	public void dfs(int v){

		if(used[v])return;
		int next = -1;

		for(int u : graph[v]){
			if(used[u])continue;
			next = u;
			break;
		}

		if(next == -1)return;

		used[next] = true;
		used[v] = true;

		int nextnext = -1;
		for(int u :graph[next]){
			if(used[u])continue;
			nextnext = u;
			break;
		}

		if(nextnext == -1)return;

		dfs(nextnext);

	}

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
		if(check()){
			out.println("First");
			return;
		}

		ArrayDeque<Long> q = new ArrayDeque<Long>();
		leaf = new PriorityQueue<Long>(new Comparator<Long>(){

			@Override
			public int compare(Long o1, Long o2) {
				return o1-o2 < 0 ? 1 : (o1-o2 > 0 ? -1 : 0);
			}

		});
		boolean[] visited = new boolean[N];
		q.add(0L);
		while(q.size() > 0){

			long p = q.poll();

			int v = (int)(p/1000000);
			int d = (int)(p%1000000);
			
			if(visited[v])continue;
			visited[v] = true;
			for(int u : graph[v]){
				if(visited[u])continue;
				q.add(u * 1000000L + d+1);
			}

			if(graph[v].size() == 1){
				leaf.add(d * 1000000L + v);
			}
		}
		used = new boolean[N];
		while(leaf.size() > 0){
			long p = leaf.poll();
			int v = (int)(p%1000000);
			dfs(v);
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