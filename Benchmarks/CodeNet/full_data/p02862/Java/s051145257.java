import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

	static class FastReader { 
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
	public static List<Integer>[] edges;
	public static long[] fac,inv;
	public static int mod = (int) (1e9+7),MAX = (int) (1e5+1);
	public static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FastReader sc = new FastReader();
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int a = (2 * x - y) / 3;
		int b =  (2 * y - x) / 3;
		if((x+y) % 3 != 0 || a < 0 || b < 0)
			System.out.println(0);
		else{
			long[] mm = new long[1000005];
			long[] nn = new long[1000005];
			
			mm[0] = 1;
			for(int i=1;i<mm.length;i++){
				mm[i] = mm[i-1] * i % mod;
			}
 
			nn[0] = 1;
			nn[1] = 1;
			for(int i=2;i<nn.length;i++){
				nn[i] = nn[i-1] * pow(i, mod-2) % mod;
			}
			
			out.println(mm[a+b] * nn[a] % mod * nn[b] % mod);
			out.close();
		}
	}
	static long pow(int a, int k){
		
		if(k == 0)
			return 1;
		
		long num = pow(a, k/2);
		if(k % 2 != 0)
			return a * num % mod * num % mod;
		else
			return num * num % mod;
	}
}
	