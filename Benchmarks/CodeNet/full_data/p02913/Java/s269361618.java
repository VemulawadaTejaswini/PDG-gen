import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) {
		FastReader scan = new FastReader();
		PrintWriter out = new PrintWriter(System.out);
		Task solver = new Task();
		solver.solve(1, scan, out);
		out.close();
	}
	
	static class Task {
		static long[][] exp;
		static char[] s;
		static long[] MOD = {(int) 1e9+7, (int) 1e9+9, (int) 1e9+23};
		
		public void solve(int testNumber, FastReader scan, PrintWriter out) {
			int n = scan.nextInt();
			s = scan.next().toCharArray();
			exp = new long[s.length+1][MOD.length];
			for(int i = 0; i <= s.length; i++) {
				for(int j = 0; j < MOD.length; j++) {
					if(i == 0) exp[i][j] = 1;
					else exp[i][j] = mult(exp[i-1][j], 27, MOD[j]);
				}
			}
			int low = 1, high = n/2, ans = 0;
			while(low <= high) {
				int mid = (low + high)/2;
				boolean ok = false;
				ArrayList<Integer> a = new ArrayList<>();
				RollingHash curr = new RollingHash();
				for(int i = 0; i < mid; i++) curr.addLast(s[i]-'a');
				a.add(hash(curr));
				for(int i = mid; i < n; i++) {
					curr.pollFirst();
					curr.addLast(s[i]-'a');
					a.add(hash(curr));
				}
				HashSet<Integer> check = new HashSet<>();
				for(int i = mid; i < a.size(); i++) check.add(a.get(i));
				for(int i = 0; i < a.size(); i++) {
					if(check.contains(a.get(i))) {
						ok = true;
						break;
					}
					if(check.isEmpty()) break;
					check.remove(a.get(i+mid));
				}
				if(ok) {
					ans = mid;
					low = mid+1;
				}
				else high = mid-1;
			}
			out.println(ans);
 		}
		
		static long mult(long a, long b, long mod) {
			return ((a%mod)*(b%mod))%mod;
		}
		static long add(long a, long b, long mod) {
			return (a%mod+b%mod)%mod;
		}
		static long sub(long a, long b, long mod) {
			return (a%mod - b%mod + mod)%mod;
		}
		
		static int hash(RollingHash a) {
			long val = 0;
			for(int i = 1; i < a.value.length; i++) val += a.value[i];
			val *= a.value[0];
			return Long.hashCode(val);
		}
		
		static class RollingHash {
			int size = 0;
			long[] value = new long[MOD.length];
			ArrayDeque<Integer> check = new ArrayDeque<>();
			
			public void addFirst(int v) {
				for(int i = 0; i < value.length; i++) {
					value[i] = add(value[i], mult(v, exp[size][i], MOD[i]), MOD[i]);
				}
				size++;
			}
			public void addLast(int v) {
				for(int i = 0; i < value.length; i++) {
					value[i] = mult(value[i], 27, MOD[i]);
					value[i] = add(value[i], v, MOD[i]);
				}
				check.addLast(v);;
				size++;
			}
			public void pollFirst() {
				int v = check.pollFirst();
				for(int i = 0; i < value.length; i++) {
					value[i] = sub(value[i], mult(v, exp[size-1][i], MOD[i]), MOD[i]);
				}
				size--;
			}
		}
	}
	
	static void shuffle(int[] a) {
		Random get = new Random();
		for(int i = 0; i < a.length; i++) {
			int r = get.nextInt(a.length);
			int temp = a[i];
			a[i] = a[r];
			a[r] = temp;
		}
	}
	
	static void shuffle(long[] a) {
		Random get = new Random();
		for(int i = 0; i < a.length; i++) {
			int r = get.nextInt(a.length);
			long temp = a[i];
			a[i] = a[r];
			a[r] = temp;
		}
	}
	

	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
		public FastReader(String s) throws FileNotFoundException {
			br = new BufferedReader(new FileReader(new File(s)));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}

}