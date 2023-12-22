import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	
	public static class State implements Comparable<State> {
		int node;
		long cost;
		
		public State(int node, long cost) {
			this.node = node;
			this.cost = cost;
		}
		
		public int compareTo(State state) {
			return Long.compare(this.cost, state.cost);
		}
	}
	
	public static final long INF = Long.MAX_VALUE / 2 - 1;
	public static final long INIT = 1000000000000000L;
	
	public static void main(String[] args) throws IOException {
		try(final Scanner sc = new Scanner(System.in)){
			final int n = sc.nextInt();
			final int m = sc.nextInt();
			
			final int s = sc.nextInt() - 1;
			final int t = sc.nextInt() - 1;
			
			ArrayList<HashMap<Integer, Long>> yen_adj = new ArrayList<HashMap<Integer, Long>>();
			ArrayList<HashMap<Integer, Long>> snuke_adj = new ArrayList<HashMap<Integer, Long>>();
			for(int i = 0; i < n; i++) { 
				yen_adj.add(new HashMap<Integer, Long>());
				snuke_adj.add(new HashMap<Integer, Long>());
			}
			
			for(int i = 0; i < m; i++) {
				final int u = sc.nextInt() - 1;
				final int v = sc.nextInt() - 1;
				final long yen = sc.nextLong();
				final long snuke = sc.nextLong();
				
				yen_adj.get(u).put(v, yen);
				yen_adj.get(v).put(u, yen);
				snuke_adj.get(u).put(v, snuke);
				snuke_adj.get(v).put(u, snuke);
			}
			
			long[] from_s_yen = new long[n];
			Arrays.fill(from_s_yen, INF);
			{
				PriorityQueue<State> from_s_yen_queue = new PriorityQueue<>();
				from_s_yen_queue.add(new State(s, 0));
				from_s_yen[s] = 0;
				
				while(!from_s_yen_queue.isEmpty()) {
					final State state = from_s_yen_queue.poll();
					
					for(final Entry<Integer, Long> entry :  yen_adj.get(state.node).entrySet()) {
						final int next_node = entry.getKey();
						final long next_cost = state.cost + entry.getValue();
						
						if(from_s_yen[next_node] > next_cost) {
							from_s_yen[next_node] = next_cost;
							from_s_yen_queue.add(new State(next_node, next_cost));
						}
					}
				}
			}
			
			long[] to_t_snuke = new long[n];
			Arrays.fill(to_t_snuke, INF);
			{
				PriorityQueue<State> to_t_snuke_queue = new PriorityQueue<>();
				to_t_snuke_queue.add(new State(t, 0));
				to_t_snuke[t] = 0;
				
				while(!to_t_snuke_queue.isEmpty()) {
					final State state = to_t_snuke_queue.poll();
					
					for(final Entry<Integer, Long> entry :  snuke_adj.get(state.node).entrySet()) {
						final int next_node = entry.getKey();
						final long next_cost = state.cost + entry.getValue();
						
						if(to_t_snuke[next_node] > next_cost) {
							to_t_snuke[next_node] = next_cost;
							to_t_snuke_queue.add(new State(next_node, next_cost));
						}
					}
				}
			}
			
			long[] answers = new long[n];
			for(int i = 0; i < n; i++) {
				answers[i] = INIT - from_s_yen[i] - to_t_snuke[i];
			}
			for(int i = n - 2; i >= 0; i--) {
				answers[i] = Math.max(answers[i], answers[i + 1]);
			}
			
			for(int i = 0; i < n; i++) {
				System.out.println(answers[i]);
			}
			
		}
	}

	public static class Scanner implements Closeable {
		private BufferedReader br;
		private StringTokenizer tok;

		public Scanner(InputStream is) throws IOException {
			br = new BufferedReader(new InputStreamReader(is));
		}

		private void getLine() throws IOException {
			while(!hasNext()){
				tok = new StringTokenizer(br.readLine());
			}
		}

		private boolean hasNext() {
			return tok != null && tok.hasMoreTokens();
		}

		public String next() throws IOException {
			getLine();
			return tok.nextToken();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}

		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}

		public int[] nextIntArray(int n) throws IOException {
			final int[] ret = new int[n];
			for(int i = 0; i < n; i++){
				ret[i] = this.nextInt();
			}
			return ret;
		}

		public long[] nextLongArray(int n) throws IOException {
			final long[] ret = new long[n];
			for(int i = 0; i < n; i++){
				ret[i] = this.nextLong();
			}
			return ret;
		}

		public void close() throws IOException {
			br.close();
		}
	}
}