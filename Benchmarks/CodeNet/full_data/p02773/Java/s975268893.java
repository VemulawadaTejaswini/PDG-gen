import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
import java.util.HashMap;

public class Main {
	static PrintWriter out;
	static Scanner sc;
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		sc = new Scanner(System.in);
		out = new PrintWriter(System.out);
		int n = sc.nextInt();
		HashMap<String, Integer> map = new HashMap<>();
		String vote;
		int max = 0;
		while(n-->0) {
			vote = sc.nextLine();
			int v = map.getOrDefault(vote, 0)+1;			
			map.put(vote, v);
			max = Math.max(max, v);
		}
		PriorityQueue<String> pq = new PriorityQueue<>();
		for(Entry<String, Integer>e:map.entrySet()) {
			if(e.getValue() == max) pq.add(e.getKey());
		}
		while(!pq.isEmpty())
			out.println(pq.poll());
		out.close();
	}
	static class Scanner{
		BufferedReader br;
		StringTokenizer st;
		public Scanner(InputStream in) {
			br = new BufferedReader(new InputStreamReader(in));			
		}
		private String next() throws IOException{
			while(st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}
		public int nextInt() throws NumberFormatException, IOException {
			return Integer.parseInt(next());
		}
		public long nextLong() throws NumberFormatException, IOException {
			return Long.parseLong(next());
		}
		public String nextLine() throws IOException {
			return br.readLine();
		}
	}
}
