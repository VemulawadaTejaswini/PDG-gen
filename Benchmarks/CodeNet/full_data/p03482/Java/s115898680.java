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
	
	public static int swap_sim(int[] rle, int change_count, char[] chs, char left, char right){
		int ret = Integer.MAX_VALUE;
		
		if(change_count == 1){ return rle[0]; }
		if(change_count == 2){ return Math.max(rle[0], rle[1]); }
	
		if(chs[0] != left){ 
			ret = Math.min(ret, rle[0] + rle[1]);
		}
		
		for(int i = 1; i < change_count - 2; i++){
			//System.out.println(left + " " + i + " " + rle[i] + " " +  rle[i + 1] + " " + right);
			ret = Math.min(ret, rle[i] + rle[i + 1]);
		}
		
		if(chs[chs.length - 1] != right){ 
			ret = Math.min(ret, rle[change_count - 1] + rle[change_count - 2]);
		}
		
		//System.out.println(left + " " + right  + " " + ret);
		return ret;
	}
	
	public static void main(String[] args) throws IOException {
		try (Scanner sc = new Scanner(System.in)) {
			final char[] chs = sc.next().toCharArray();
			
			int change_count = 1;
			for(int i = 1; i < chs.length; i++){
				if(chs[i - 1] != chs[i]){ change_count++; }
			}
			
			int zero_count = 0, one_count = 0;
			for(int i = 0; i < chs.length; i++){
				if(chs[i] == '0'){ zero_count++; }
				else{ one_count++; }
			}
			
			int[] rle = new int[change_count];
			int zero_len = 0, min_zero_len = chs.length;
			int one_len = 0, min_one_len = chs.length;
					
			{
				char prev = chs[0];
				rle[0] = 1;
				int count = 0;
				if(chs[0] == '0'){ zero_len = 1; }
				else{ one_len = 1; }
				
				for(int i = 1; i < chs.length; i++){
					if(prev != chs[i]){
						if(chs[i] == '0'){ 
							min_one_len = Math.min(one_len, min_one_len); 
							zero_len = 1; one_len = 0;
						}else{ 
							min_zero_len = Math.min(zero_len, min_zero_len);
							one_len = 1; zero_len = 0;
						}
						
						count++;
						prev = chs[i];
						rle[count] = 1;
					}else{
						if(chs[i] == '0'){ zero_len++; }
						else{ one_len++; }
						
						rle[count]++;
					}
				}
			}
			//System.out.println(zero_len  +" " + one_len);
			if(zero_len != 0){ min_zero_len = Math.min(zero_len, min_zero_len); }
			if(one_len != 0){ min_one_len = Math.min(one_len, min_one_len); }
			
			final int swap_len_0_0 = Math.min(one_count, swap_sim(rle, change_count, chs, '0', '0'));
			final int swap_len_1_0 = Math.min(Math.max(zero_count, one_count), swap_sim(rle, change_count, chs, '1', '0'));
			final int swap_len_0_1 = Math.min(Math.max(zero_count, one_count), swap_sim(rle, change_count, chs, '0', '1'));
			//final int swap_len_1_1 = swap_sim(rle, change_count, chs, '1', '1');
			//System.out.println(swap_len_0_0);
			final int swap_len = Math.max(swap_len_0_0, Math.max(swap_len_0_1, swap_len_1_0));
			//
			
			//System.out.println(Arrays.toString(rle));
			//System.out.println(swap_len + " " + min_zero_len + " " + min_one_len);
			
			System.out.println(Math.max(Math.max(min_zero_len, min_one_len), swap_len));
			
			//System.out.println(cnt_len + " " + min_zero_len + " " + min_one_len);
			//System.out.println(Math.max(cnt_len, Math.max(min_zero_len, min_one_len)));
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