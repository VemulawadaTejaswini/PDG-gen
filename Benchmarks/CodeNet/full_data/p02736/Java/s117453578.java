import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
/*
1
11
101
1111
10001
110011
1010101
11111111
100000001
1100000011
10100000101
111100001111
1000100010001
11001100110011
101010101010101
1111111111111111
 */
public class Main {
	static PrintWriter out = new PrintWriter(System.out);

	static int N;
	static long twosInFac[];
	public static void main(String[] args) {
		FS in = new FS();
		int maxn = 1000002;
		
		twosInFac = new long[maxn];
		twosInFac[0] = 0;
		for(int i = 1; i < maxn; i++) {
			int val = i;
			twosInFac[i] += twosInFac[i-1];
			while(val%2 == 0) { twosInFac[i]++; val /= 2;}
		}
		
		N = in.nextInt();
		char c[] = in.next().toCharArray();
		int first[] = new int[N];
		for(int i = 0; i < N; i++) first[i] = c[i]-'0';
		
		int vs[] = new int[N-1];
		for(int i = 0; i < N-1; i++) vs[i] = Math.abs(first[i]-first[i+1]);
		N--;
		
		boolean hasOne = false;
		for(int ii : vs) hasOne |= ii == 1;
		
		int res = 0;
		if(hasOne) {
			for(int i = 0; i < N; i++) if(vs[i] == 1) res ^= getCol(i);
		}
		else {
			for(int i = 0; i < N; i++) if(vs[i] == 2) res ^= getCol(i);
			res *= 2;
		}
		out.println(res);
		out.close();
	}
	
	static int getCol(int c) {
		long a = twosInFac[N-1];
		long b = twosInFac[N-1-c] + twosInFac[c];
		return a > b ? 0 : 1;
	}
	
	
	static class FS{
		BufferedReader br;
		StringTokenizer st;
		public FS() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
		String next() {
			while(st == null || !st.hasMoreElements()) {
				try {st = new StringTokenizer(br.readLine());}
				catch(Exception e) { throw null;}
			}
			return st.nextToken();
		}
		int nextInt() { return Integer.parseInt(next());}
		double nextDouble() { return Double.parseDouble(next());}
		long nextLong() { return Long.parseLong(next());}
		int[] NIA(int n) {
			int r[] = new int[n];
			for(int i = 0; i < n; i++) r[i] = nextInt();
			return r;
		}
		long[] NLA(int n) {
			long r[] = new long[n];
			for(int i = 0; i < n; i++) r[i] = nextLong();
			return r;
		}
		char[][] grid(int r, int c){
			char res[][] = new char[r][c];
			for(int i = 0; i < r; i++) {
				char l[] = next().toCharArray();
				for(int j = 0; j < c; j++) {
					res[i][j] = l[j];
				}
			}
			return res;
		}
	}
	
}
