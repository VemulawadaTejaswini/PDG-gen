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
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.TreeSet;
 
public class Main {
	
	public static void main(String[] args) throws IOException {
		final Scanner sc = new Scanner(System.in);
		
		final int N = sc.nextInt();
		final int M = sc.nextInt();
		
		ArrayList<HashMap<Integer, HashSet<Integer>>> adj_list = new ArrayList<HashMap<Integer, HashSet<Integer>>>();
		for(int i = 0; i < N; i++){
			adj_list.add(new HashMap<Integer, HashSet<Integer>>());
		}
		
		for(int i = 0; i < M; i++){
			final int p = sc.nextInt() - 1;
			final int q = sc.nextInt() - 1;
			final int c = sc.nextInt();
			
			if(!adj_list.get(p).containsKey(q)){
				adj_list.get(p).put(q, new HashSet<Integer>());
			}
			adj_list.get(p).get(q).add(c);
			
			if(!adj_list.get(q).containsKey(p)){
				adj_list.get(q).put(p, new HashSet<Integer>());
			}
			adj_list.get(q).get(p).add(c);
		}
		
		//System.out.println(adj_list);
		
		ArrayList<HashMap<Integer, Long>> min_cost = new ArrayList<HashMap<Integer, Long>>();
		for(int i = 0; i < N; i++){
			min_cost.add(new HashMap<Integer, Long>());
		}
		
		LinkedList<Integer> queue = new LinkedList<Integer>();
		min_cost.get(0).put(-1, 0l);
		
		queue.add(0); queue.add(-1);
		
		while(!queue.isEmpty()){
			final int curr = queue.poll();
			final int prev_company = queue.poll();
			
			
			for(final Entry<Integer, HashSet<Integer>> entry : adj_list.get(curr).entrySet()){
				final int next = entry.getKey();
				//System.out.println(next);
				
				for(final int company : entry.getValue()){
					final long curr_cost = min_cost.get(curr).get(prev_company);
					final long next_cost = curr_cost + (prev_company == company ? 0 : 1);
					
					if(!min_cost.get(next).containsKey(company)){
						min_cost.get(next).put(company, next_cost);
						
						if(prev_company == company){
							queue.addFirst(company);
							queue.addFirst(next);
						}else{
							queue.addLast(next);
							queue.addLast(company);
						}
					}else{
						final long cost = min_cost.get(next).get(company);
						
						if(cost <= next_cost){
							continue;
						}else{
							min_cost.get(next).put(company, next_cost);
						}
						
						if(prev_company == company){
							queue.addFirst(company);
							queue.addFirst(next);
						}else{
							queue.addLast(next);
							queue.addLast(company);
						}
					}
				}
			}
		}
			
		long min = Long.MAX_VALUE;
		for(final Entry<Integer, Long> entry : min_cost.get(N - 1).entrySet()){
			min = Math.min(min, entry.getValue());
		}
		
		System.out.println(min == Long.MAX_VALUE ? -1 :min);
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