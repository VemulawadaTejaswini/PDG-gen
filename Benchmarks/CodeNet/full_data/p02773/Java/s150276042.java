import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

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
		Map<String,Integer> map = new HashMap<>();
		for(int i=0;i<n;++i) {
			add(map,sc.next());
		}
		List<String> list = new ArrayList<>();
		int max = 0;
		for(String key : map.keySet()) {
			if(map.get(key) > max) {
				list.clear();
				max = map.get(key);
				list.add(key);
			}else if(map.get(key) == max) list.add(key);
		}
		Collections.sort(list);
		for(String x : list) out.println(x);
		
	    out.close();

	}
	 static void add(Map<String, Integer> map, String string) {
			// TODO Auto-generated method stub
			if(map.containsKey(string)) map.put(string, map.get(string)+1);
			else map.put(string, 1);
			
		}
	

}
