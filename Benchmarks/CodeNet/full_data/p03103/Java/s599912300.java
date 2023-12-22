import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		FastReader scan = new FastReader();
		int n = scan.nextInt(), m = scan.nextInt();
		long total = 0;
		Store[] s = new Store[n];
		for(int i = 0; i < n; i++) s[i] = new Store(scan.nextInt(), scan.nextInt());
		Arrays.sort(s);
		for(int i = 0; i < n; i++) {
			long need = Math.min(m, s[i].a);
			m -= need;
			total += s[i].p * need;
			if(m == 0) break;
		}
		System.out.println(total);
	}
	
	static class Store implements Comparable<Store>{
		long a;
		long p;
		
		public Store(int aa, int bb) {
			p = aa;
			a = bb;
		}

		@Override
		public int compareTo(Store o) {
			return Long.compare(this.p, o.p);
		}
		
		
	}
	
	
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

}
