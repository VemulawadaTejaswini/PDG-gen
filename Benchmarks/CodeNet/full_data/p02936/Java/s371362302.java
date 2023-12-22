import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class Main {

	static Scanner sc = new Scanner(System.in);

	static class FastScanner {
		private final InputStream in;
		private final byte[] buffer = new byte[1024];
		private int ptr = 0;
		private int buflen = 0;

		public FastScanner(InputStream source) {
			in = source;
		}

		private boolean hasNextByte() {
			if (ptr < buflen) {
				return true;
			} else {
				ptr = 0;
				try {
					buflen = in.read(buffer);
				} catch (IOException e) {
					e.printStackTrace();
				}
				if (buflen <= 0) {
					return false;
				}
			}
			return true;
		}

		private int readByte() {
			if (hasNextByte()) return buffer[ptr++];
			else return -1;
		}

		private static boolean isPrintableChar(int c) {
			return 33 <= c && c <= 126;
		}

		public boolean hasNext() {
			while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
			return hasNextByte();
		}

		public String next() {
			if (!hasNext()) throw new NoSuchElementException();
			StringBuilder sb = new StringBuilder();
			int b = readByte();
			while (isPrintableChar(b)) {
				sb.appendCodePoint(b);
				b = readByte();
			}
			return sb.toString();
		}

		public long nextLong() {
			if (!hasNext()) throw new NoSuchElementException();
			long n = 0;
			boolean minus = false;
			int b = readByte();
			if (b == '-') {
				minus = true;
				b = readByte();
			}
			if (b < '0' || '9' < b) {
				throw new NumberFormatException();
			}
			while (true) {
				if ('0' <= b && b <= '9') {
					n *= 10;
					n += b - '0';
				} else if (b == -1 || !isPrintableChar(b)) {
					return minus ? -n : n;
				} else {
					throw new NumberFormatException();
				}
				b = readByte();
			}
		}

		public int nextInt() {
			long nl = nextLong();
			if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
				throw new NumberFormatException();
			return (int) nl;
		}

		public double nextDouble() {
			return Double.parseDouble(next());
		}
	}

	public static void main(String[] args){

		solve_abc138_d();
	}
  
  	public static void solve_abc138_d(){

		FastScanner sc = new FastScanner(System.in);
		
		int n = sc.nextInt();
		int q = sc.nextInt();
		
		solve_abc138_d_tree[] m = new solve_abc138_d_tree[n];
		for(int i=0;i<m.length;i++) m[i] = new solve_abc138_d_tree();
		
		//Map<Integer, solve_abc138_d_tree> m = new HashMap<>();
		
		for(int i=1;i<n;i++){
			int ai = sc.nextInt() - 1;
			int bi = sc.nextInt() - 1;

			m[ai].child.add(bi);
		}
		
		for(int i=0;i<q;i++){
			
			int idx = sc.nextInt() - 1;
			long point = sc.nextLong();
			m[idx].pt += point;
			
			//solve_abc138_d_dfs
				//solve_abc138_d_dfs(m, idxStart, point);
		}
		
		solve_abc138_d_dfs2(m, 0, 0);

		System.out.print(m[0].pt);
		for(int i=1;i<m.length;i++){
			System.out.print(" " + m[i].pt);
		}

	}

	public static void solve_abc138_d_dfs2(solve_abc138_d_tree[] m, int idx, long pointParent){
		
		m[idx].pt += pointParent;
		long pointSelf = m[idx].pt;
		
		//for m.child
			//solve_abc138_d_dfs(m.child)
		
		for(Integer c: m[idx].child){
			if(c.intValue() == idx) continue;
			solve_abc138_d_dfs2(m, c.intValue(), pointSelf);
		}
	}

	
	public static void solve_abc138_d_dfs(solve_abc138_d_tree[] m, int idx, long point){
		
		solve_abc138_d_tree node = m[idx];
		node.pt += point;
		
		//for m.child
			//solve_abc138_d_dfs(m.child)
		
		for(Integer c: node.child){
			solve_abc138_d_dfs(m, c.intValue(), point);
		}
	}
	
	public static class solve_abc138_d_tree{
		
		long pt;
		List<Integer> child;
		
		solve_abc138_d_tree(){
			this.pt = 0;
			this.child = new ArrayList<>();
		}
		
	}
}