import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main{

	static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    } 
	static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
	public static long mod = (long) (1e9+7);
	public static long[] fac,inv;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FastReader sc = new FastReader();
	    int n = sc.nextInt();
	    int[] x = new int[n];
	    for(int i=0;i<n;++i) x[i] = sc.nextInt();
	    long ans = Long.MAX_VALUE;
	    for(int i=1;i<=100;++i) {
	    	long sum = 0;
	    	for(int j=0;j<n;++j) {
	    		sum+=(x[j] - i)*(x[j] - i);
	    	}
	    	ans = Math.min(ans, sum);
	    }
	    out.println(ans);
	    out.close();

	}

}
