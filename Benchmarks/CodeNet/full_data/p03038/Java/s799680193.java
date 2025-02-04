
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	private static final long MOD = (long)Math.pow(10, 9) + 7;
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int n = sc.nextInt();
		int m = sc.nextInt();
		long res = 0l;
		int[][] q = new int[m][2];
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			pq.offer(a);
			res += a;
		}
		
		for (int i = 0; i < m; i++) {
			q[i][0] = sc.nextInt();
			q[i][1] = sc.nextInt();
		}
		Arrays.sort(q, (a, b) -> (b[1] - a[1]));
		
		for (int i = 0; i < m; i++) {
			int b = q[i][0];
			int c = q[i][1];
			int min = pq.peek();
			if (c < min) { break;}
			
			while (b > 0) {
				min = pq.poll();
				if (c > min) {
					pq.offer(c);
					res = res - min + c;
				} else {
					pq.offer(min);
					break;
				}
				b--;
			}
		}
			
		
		
		/*while (!pq.isEmpty()) {
			res += pq.poll();
		}*/
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
