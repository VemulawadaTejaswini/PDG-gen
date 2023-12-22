import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
	
	public static class Range implements Comparable<Range>{
		int begin, end;
		
		public Range(int begin, int end){
			this.begin = begin;
			this.end = end;
		}

		@Override
		public int compareTo(Range o) {
			if(Integer.compare(this.end, o.end) != 0){
				return Integer.compare(this.end, o.end);
			}else{
				return Integer.compare(this.begin, o.begin);
			}
		}
		
		public String toString(){
			return "[" + this.begin + ", " + this.end + "]";
		}
	}
	
	public static void main(String[] args) throws IOException {
		try (Scanner sc = new Scanner(System.in)) {
			final int N = sc.nextInt();
			final int C = sc.nextInt();
			
			int[] ss = new int[N];
			int[] ts = new int[N];
			int[] cs = new int[N];
			for(int i = 0; i < N; i++){
				ss[i] = sc.nextInt();
				ts[i] = sc.nextInt();
				cs[i] = sc.nextInt() - 1;
			}
			
			ArrayList<ArrayList<Range>> plain_rs = new ArrayList<ArrayList<Range>>();
			for(int i = 0; i < C; i++){ plain_rs.add(new ArrayList<Range>());} 
			
			for(int i = 0; i < N; i++){
				plain_rs.get(cs[i]).add(new Range(ss[i], ts[i]));
			}
			for(int i = 0; i < C; i++){ Collections.sort(plain_rs.get(i)); }
			//for(int i = 0; i < C; i++){ System.out.println(plain_rs); }
			
			ArrayList<ArrayList<Range>> merged_rs = new ArrayList<ArrayList<Range>>();
			for(int i = 0; i < C; i++){ merged_rs.add(new ArrayList<Range>()); }
			
			for(int i = 0; i < C; i++){
				if(plain_rs.get(i).isEmpty()){ continue; }
				
				Range merged = null;
				for(final Range range : plain_rs.get(i)){
					if(merged == null){
						merged = range;
					}else if(merged.end == range.begin){
						merged.end = range.end;
					}else{
						merged_rs.get(i).add(merged);
						merged = range;
					}
				}
				
				if(merged != null){ merged_rs.get(i).add(merged); }
			}
			//for(int i = 0; i < C; i++){ System.out.println(merged_rs); }
			
			final int MAX = 100000 * 2 + 1;
			int[] imos = new int[MAX + 1];
			for(int i = 0; i < C; i++){
				for(final Range range : merged_rs.get(i)){
					final int begin = range.begin * 2 - 1;
					final int end = range.end * 2;
					
					imos[begin]++;
					imos[end]--;
				}
			}
			
			for(int i = 1; i <= MAX; i++){
				imos[i] += imos[i - 1];
			}
			
			System.out.println(Arrays.stream(imos).max().getAsInt());
		}
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
			for (int i = 0; i < n; i++) {
				ret[i] = this.nextInt();
			}
			return ret;
		}

		public long[] nextLongArray(int n) throws IOException {
			final long[] ret = new long[n];
			for (int i = 0; i < n; i++) {
				ret[i] = this.nextLong();
			}
			return ret;
		}

		public void close() throws IOException {
			br.close();
		}
	}
}