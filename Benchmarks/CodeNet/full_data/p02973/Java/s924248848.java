import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map.Entry;

import java.util.PriorityQueue;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
	
	public static void main(String[] args) throws IOException {
		try(final Scanner sc = new Scanner(System.in)){
			final int N = sc.nextInt();
			
			long[] array = new long[N];
			for(int i = 0; i < N; i++) {
				array[i] = sc.nextLong();
			}
			
			int count = 0;
			LinkedList<Integer> stack = new LinkedList<Integer>();
			LinkedList<Integer> answer = new LinkedList<Integer>();
			
			boolean[] used = new boolean[N];
			while(true) {
				boolean found = false;
				int size = 0;
				
				stack.clear();
				answer.clear();
				
				for(int i = 0; i < N; i++) {
					if(used[i]) { continue; }
					size++;
					
					while(!stack.isEmpty()) {
						final long value = array[stack.getLast()];
						if(array[i] <= value) { stack.removeLast(); }
						else { break; }
					}
					stack.addLast(i);
					
					if(answer.size() < stack.size()) {
						found = true;
						answer = new LinkedList<Integer>(stack);
					}
				}
				
				if(!found) { break; }
				if(answer.size() == 1) { count += size; break; } 
				
				for(final int index : answer) { used[index] = true; }
				count += 1;
			}
			
			System.out.println(count);
			
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