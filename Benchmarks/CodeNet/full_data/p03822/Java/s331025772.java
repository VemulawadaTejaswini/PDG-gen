import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	
	public static class Person implements Comparable<Person> {
		int number, wins;
		
		public Person(int number, int wins){
			this.number = number;
			this.wins = wins;
		}
		
		public int compareTo(Person arg0){
			if(this.number == 0){ return -1; }
			if(arg0.number == 0){ return 1; }
			
			if(Integer.compare(arg0.wins, this.wins) != 0){
				return Integer.compare(arg0.wins, this.wins);				
			}else{
				return Integer.compare(this.number, arg0.number);
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		final Scanner sc = new Scanner(System.in);
		
		final int N = sc.nextInt();
		
		int[] as = new int[N - 1];
		for(int i = 0; i < N - 1; i++){
			as[i] = sc.nextInt() - 1;
		}
		
		int[] count = new int[N];
		for(final int a : as){
			count[a]++;
		}
		
		PriorityQueue<Person> queue = new PriorityQueue<Person>();
		for(int i = 0; i < N; i++){
			queue.add(new Person(i, count[i]));
		}
		
		int[] depth = new int[N + 1];
		int curr_min_depth = -1;
		while(!queue.isEmpty()){
			final Person person = queue.poll();
			
			int start_depth = curr_min_depth;
			
			if(curr_min_depth < 0){
				curr_min_depth = 0;
				start_depth = 0;
			}else{
				depth[curr_min_depth]--;
				
				start_depth++;
				if(depth[curr_min_depth] == 0){
					curr_min_depth++;
				}
			}
			
			for(int d = 0; d < person.wins; d++){
				depth[start_depth + d]++;
			}
			
			//System.out.println((person.number + 1) + " " + person.wins + " " + curr_min_depth + " " + Arrays.toString(depth));
		}
		
		
		//System.out.println(Arrays.toString(count));
		System.out.println(curr_min_depth);
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
		
		public int[] nextIntArray(int n) throws IOException {
			final int[] ret = new int[n];
			for(int i = 0; i < n; i++){
				ret[i] = this.nextInt();
			}
			return ret;
		}
 
		public void close() throws IOException {
			br.close();
		}
	}
}