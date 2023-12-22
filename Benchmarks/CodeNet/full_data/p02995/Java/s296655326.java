
import java.io.*;
import java.util.*;
import java.util.Stack;
import java.util.regex.Pattern;


public class Main {

	
	public static class FastReader {
		BufferedReader br;
		StringTokenizer st;
		//it reads the data about the specified point and divide the data about it ,it is quite fast
		//than using direct 

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (Exception r) {
					r.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());//converts string to integer
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (Exception r) {
				r.printStackTrace();
			}
			return str;
		}
	}
	
	public static PrintWriter out = new PrintWriter (new BufferedOutputStream(System.out));
	static long mod = (long)(1e9+7);
	public static void main(String[] args) {
		 FastReader sc = new FastReader();
		 long a = sc.nextLong();
		 long b = sc.nextLong();
		 long c = sc.nextLong();
		 long d = sc.nextLong();
		 long ans = b-a+1-range(a,b,c,d);
         out.println(ans);
		 out.close();
		 
	}
	
	static long FindLCM(long c, long d) 
    { 
        return (c * d) / gcd(c,d);
    } 
	private static long gcd(long c, long d) {
		
		// TIME COMPLEXITY: O(Log(max(a,b)))
		if(c<d) return gcd(d,c);
		if(d==0) return c;
		else return gcd(d,c%d);
	}
	static long range(long a, long b, long c, long d) 
    { 
       
        long lcm = FindLCM(c, d); 
       
        long a_divisor = b / c - (a - 1) / c; 
        long b_divisor = b / d - (a - 1) / d; 
       
       
        long common_divisor = b / lcm - (a - 1) / lcm; 
       
        long ans = a_divisor + b_divisor - common_divisor; 
        return ans; 
    } 

}		 



