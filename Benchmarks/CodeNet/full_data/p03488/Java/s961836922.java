
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		FastInput in = new FastInput(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		ABC082D solver = new ABC082D();
		solver.solve(1, in, out);
		out.close();
	}

	static class ABC082D {

		public void solve(int testNum, FastInput in, PrintWriter out) {
			
			String s = in.next();
			int n = s.length();
			
			int x = in.nextInt(); int y = in.nextInt();
			
			int fx = 0;
			int sx = 0 ; int sy = 0;
			int now = 0;
			List<Integer> X = new ArrayList<Integer>();
			List<Integer> Y = new ArrayList<Integer>();
			
			
			for(int i = 0 ; i < n ;i++) {
				char c = s.charAt(i);
				
				if(c == 'T') {
					now++;
				}
				else {
					
					if(now == 0) {
						fx++;
					}
					else if(now % 2 == 0) {
						if(sy != 0) {
							Y.add(sy); sy = 0;
						}
						sx++;
					}
					else {
						if(sx != 0) {
							X.add(sx); sx = 0;
						}
						sy++;
					}
				}
			}
			
			X.add(sx);
			Y.add(sy);
			
			int []dpX = new int [20000];
			int []dpY = new int [20000];
			dpX[10000+fx] = 1;
			
			for(int i = 0 ; i < X.size() ; i++) {
				int kx = X.get(i);
				if(kx == 0) {
					continue;
				}
				for(int j = 1000 ; j < 19000 ; j++) {
					if(dpX[j] == 1) {
						dpX[j+kx] = dpX[j];
						dpX[j-kx] = dpX[j];
					}
				}
			}
			
			dpY[10000] = 1;
			for(int i = 0 ; i < Y.size() ; i++) {
				int ky = Y.get(i);
				if(ky == 0) {
					continue;
				}
				for(int j = 1000; j < 19000 ; j++) {
					if(dpY[j] == 1) {
						dpY[j+ky] = dpY[j];
						dpY[j-ky] = dpY[j];
					}
				}
			}
			
			if(dpX[x+10000] == 1 && dpY[y+10000] == 1) {
				out.println("Yes");
			}
			else {
				out.println("No");
			}
			
			
		}	
			
	}

static class FastInput{
	private final BufferedReader in;
	private String[] buff;
	private int index = 0;
	
	public FastInput(InputStream is) {
		in = new BufferedReader(new InputStreamReader(is));
	}
	String nextLine() {
		try {
			return in.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	String next() {
		while (buff == null || index >= buff.length) {
			buff = nextLine().split(" ");
			index = 0;
		}
		return buff[index++];
	}
	int nextInt() {
		return Integer.parseInt(next());
	}
	
	long nextLong() {
		return Long.parseLong(next());
	}
	
	Double nextDouble() {
		return Double.parseDouble(next());
	}
	
	BigInteger nextBigInteger() {
		return new BigInteger(next());
	}
	
	BigDecimal nextBigDecimal() {
		return new BigDecimal(next());
	}
	
	public int[] nextIntArray(final int n) {
		final int[] res = new int [n];
		
		for(int i = 0 ; i < n ;i++) {
			res[i] = nextInt();
		}
		return res;
	}
	
	public long[] nextLongArray(final int n) {
		final long[] res= new long [n];
		
		for(int i = 0 ; i < n ;i++) {
			res[i] = nextLong();
		}
		return res;
	}
	
	public double[] nextDoubleArray(final int n ) {
		final double[] res = new double [n];
		
		for(int i = 0 ; i < n ;i++) {
			res[i] = nextDouble();
		}
		return res;
	}
	
	
	public int[][] nextInt2DArray(final int n , final int m){
		int [][]res = new int [n][m];
		
		for(int i = 0 ; i < n ;i++) {
			for(int j = 0 ; j < m ;j++) {
				res[i][j] = nextInt();
			}
		}
		return res;
	}
	public long[][] nextLong2DArray(final int n , final int m){
		long [][]res = new long [n][m];
		
		for(int i = 0 ; i < n ;i++) {
			for(int j = 0 ; j < m ;j++) {
				res[i][j] = nextLong();
			}
		}
		return res;
	}
	
	public char[][] nextChar2DArray(final int n){
		char [][]res = new char [n][];
		
		for(int i = 0 ; i < n ;i++) {
			String s = next();
			res[i] = s.toCharArray();
		}
		
		return res;
	}
}
}


