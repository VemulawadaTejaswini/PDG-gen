import java.util.*;
import java.io.*;
import java.math.*;
public class Main{
	static InputReader in = new InputReader(System.in);
	static PrintWriter out = new PrintWriter(System.out);
	
	
	
	
	
	
	
	
	int n, a, b;
	long[] v = new long[100];
	HashMap<Long, Integer> m  = new HashMap<>();
	
	BigInteger fac(int x){
		BigInteger c = new BigInteger("1");
		for(int i=1; i<=x; i++) {
			c = c.multiply(new BigInteger(""+i));
		}
		return c;
	}
	BigInteger ncr(int n, int k){
		return fac(n).divide(fac(k)).divide(fac(n-k));
	}

	void solve(){
		n = in.nextInt();
		a = in.nextInt();
		b = in.nextInt();
		for(int i=1; i<=n; i++){ v[i] = in.nextLong();
			m.put(v[i], m.getOrDefault(v[i], 0) + 1);
		}
		
		Arrays.sort(v, 1, n+1);
		long maxsum = 0;
	
	for(int j=1, i = n; j <= a; j++,i--){
		maxsum += v[i];
	}
	if(a == n){
		out.printf("%.10f\n%d\n", (double)maxsum/(double)n, 1);
	}
	else{
		
		double ans = (double)maxsum/a;
		BigInteger ways = new BigInteger("0");
		if(v[n-a] < v[n-a+1]) ways = new BigInteger("1");
		else{
			int k = n-a+1;
			while(k+1 <= n && v[k+1] == v[k]) k++;
			int occ = k - (n-a+1) + 1;
			// compute X choose occ
			ways = ncr(m.get(v[n-a+1]), occ);
		}
		out.printf("%.10f\n%s\n", ans, ways);
	}
		
	}
	
	
		
	
	
	
	
	
	
	
	
	public static void main(String[] args){
		a m = new a();
		m.solve();
		out.flush();
		out.close();
	}
	
	static class InputReader{
		public BufferedReader reader;
		public StringTokenizer tokenizer;
		public InputReader(InputStream instream){
			reader = new BufferedReader(new InputStreamReader(instream), 1<<15);
			tokenizer = null;
		}
		public String next(){
			while(tokenizer == null || !tokenizer.hasMoreTokens()){
				try{
					tokenizer = new StringTokenizer(reader.readLine());
				}catch(Exception e){
					throw new RuntimeException(e);
				}
			}
			return tokenizer.nextToken();	
		}
		public String nextLine(){
			try{
			return reader.readLine();
			}catch(Exception e){
				throw new RuntimeException(e);
			}
		}
		public int nextInt(){
			return Integer.parseInt(next());
		}
		public long nextLong(){
			return Long.parseLong(next());
		}
		public double nextDouble(){
			return Double.parseDouble(next());
		}


	}
}
