
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	private static final long MOD = (long)Math.pow(10, 9) + 7;
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		long q = sc.nextLong();  // 0.25
		long h = sc.nextLong();  // 0.5
		long s = sc.nextLong(); // 1.0
		long d = sc.nextLong(); // 2.0
		long n = sc.nextLong();
		long res = 0;
		// N 為整數，所以購買0.25與0.5的次數一定是偶數
		
		// 找出新的1.0價格s，此價格為原來的s，或是0.25買四個，或是0.5買兩個，其中最小的
		s = Math.min(s, Math.min(q * 4, h * 2));
		
		// 找出新的2.0價格s，此價格為原來的d，或是s買兩個或是0.25買8個，或是0.5買4個，其中最小的。
		d = Math.min(Math.min(d, s * 2), Math.min(h * 4, q * 8));
		
		if (2*s < d) {
			// 買兩個s比一罐d划算時，全買s
			res = n * s;
		} else {
			// 買兩個s比一罐d貴時，盡可能買d，如果有剩下一瓶再買s
			res = (n/2)*d + (n%2)*s;
		}
		
		System.out.println(res);
	}
	
	static class FastReader {
	    BufferedReader br;
	    StringTokenizer st;
	
	    public FastReader() {
	      br = new BufferedReader(new InputStreamReader(System.in));
	    }
	  
	    String next() { 
	      while (st == null || !st.hasMoreElements()) {
	        try {
	          st = new StringTokenizer(br.readLine());
	        } catch (IOException  e) {
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
	        try{
	            str = br.readLine();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        return str;
	      }
	  }
}
