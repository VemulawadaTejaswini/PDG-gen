import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.StringTokenizer;
 
public class Main {
	
	public static final int INF = Integer.MAX_VALUE /2 - 1;
	
	
	
	public static int[] sweep(int start, ArrayList<HashSet<Integer>> adj, boolean[] deleted){
		LinkedList<Integer> node_queue = new LinkedList<Integer>();
		LinkedList<Integer> parent_queue = new LinkedList<Integer>();
		int[] node_depth = new int[adj.size()];
		Arrays.fill(node_depth, INF);
		
		node_queue.add(start);
		parent_queue.add(-1);
		node_depth[start] = 0;
		
		while(!node_queue.isEmpty()){
			final int node   = node_queue.poll();
			final int parent = parent_queue.poll();
			
			for(final int next : adj.get(node)){
				if(next == parent){ continue; }
				if(deleted[next]){ continue; }
				
				node_depth[next] = node_depth[node] + 1;
				node_queue.add(next);
				parent_queue.add(node);
			}
		}
		
		return node_depth;
	}
	
	public static int double_sweep(ArrayList<HashSet<Integer>> adj, boolean[] deleted, final int K){
		int pre_start = -1;
		for(int i = 0; i < deleted.length; i++){
			if(!deleted[i]){ pre_start = i; }
		}
		
		final int[] pre_sweeped = sweep(pre_start, adj, deleted);
		int pre_max_depth = 0, pre_max_node = pre_start;
		for(int i = 0; i < pre_sweeped.length; i++){
			if(deleted[i]){ continue; }
			
			if(pre_max_depth < pre_sweeped[i]){
				pre_max_depth = pre_sweeped[i];
				pre_max_node = i;
			}
		}
		
		final int[] fst_sweeped = sweep(pre_max_node, adj, deleted);
		int fst_max_depth = 0, fst_max_node = pre_max_node;
		for(int i = 0; i < fst_sweeped.length; i++){
			if(deleted[i]){ continue; }
			
			if(fst_max_depth < fst_sweeped[i]){
				fst_max_depth = fst_sweeped[i];
				fst_max_node = i;
			}
		}
		
		final int[] snd_sweeped = sweep(fst_max_node, adj, deleted);
		int snd_max_depth = 0, snd_max_node = fst_max_node;
		for(int i = 0; i < snd_sweeped.length; i++){
			if(deleted[i]){ continue; }
			
			if(snd_max_depth < snd_sweeped[i]){
				snd_max_depth = snd_sweeped[i];
				snd_max_node = i;
			}
		}
		
		int fst_count = 0, snd_count = 0;
		int fst_over_count = 0, snd_over_count = 0;
		for(int i = 0; i < adj.size(); i++){
			if(deleted[i]){ continue; }
			
			if(fst_max_depth > K && fst_sweeped[i] == fst_max_depth){ fst_count++; }
			if(snd_max_depth > K && snd_sweeped[i] == snd_max_depth){ snd_count++; }
			if(fst_sweeped[i] > K){ fst_over_count++; }
			if(snd_sweeped[i] > K){ snd_over_count++; }
		}
		
		//System.out.println(fst_over_count + " " + snd_over_count);
		//System.out.println(Arrays.toString(deleted));
		
		int delete_count = 0;
		if(fst_count < snd_count || fst_count == snd_count && fst_over_count < fst_over_count){
			for(int i = 0; i < adj.size(); i++){
				if(deleted[i]){ continue; }
				
				if(fst_max_depth > K && fst_sweeped[i] == fst_max_depth){ 
					deleted[i] = true;
					delete_count++;
				}
			}
		}else{
			for(int i = 0; i < adj.size(); i++){
				if(deleted[i]){ continue; }
				
				if(snd_max_depth > K && snd_sweeped[i] == snd_max_depth){
					deleted[i] = true;
					delete_count++;
				}
			}
		}
		
		return delete_count;
	}
	
	public static void main(String[] args) throws IOException {
		final Scanner sc = new Scanner(System.in);
		
		final int N = sc.nextInt();
		final int K = sc.nextInt();
		
		ArrayList<HashSet<Integer>> adj = new ArrayList<HashSet<Integer>>();
		for(int i = 0; i < N; i++){
			adj.add(new HashSet<Integer>());
		}
		
		for(int i = 0; i < N - 1; i++){
			final int fst = sc.nextInt() - 1;
			final int snd = sc.nextInt() - 1;
			
			adj.get(fst).add(snd);
			adj.get(snd).add(fst);
		}
		
		boolean[] deleted = new boolean[N];
		int count = 0;
		while(true){
			final int ret = double_sweep(adj, deleted, K);
			if(ret == 0){ break; }
			
			count += ret;
		}
		System.out.println(count);
	}
 
	public static class Scanner implements Closeable {
		private BufferedReader br;
		private StringTokenizer tok;
 
		public Scanner(InputStream is) throws IOException {
			br = new BufferedReader(new InputStreamReader(is));
		}
 
		private void getLine() throws IOException {
			while (!hasNext()) {
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
 
		public void close() throws IOException {
			br.close();
		}
	}
}