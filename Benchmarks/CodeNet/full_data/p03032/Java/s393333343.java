 
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
		 int n = sc.nextInt();
		 int k = sc.nextInt();
		 int[] v = new int[n];
		 for(int i=0;i<n;++i) v[i] = sc.nextInt();
		 long ans = 0;
		 
		 for(int it = 0;it<=Math.min(n, it);++it){
			 
		        for(int a=0;a<=it;++a){
		            int b = it - a;
		    TreeMap<Integer,Integer> map = new TreeMap<>();
		            
		 
		            for(int i=0;i<a;++i) add(map,v[i]);
		            for(int i=0;i<b;++i) add(map,v[n-1-i]);
		 
		            int res = k - it;
		 
		            int temp = 0;
		            for(int key : map.keySet()) temp+=key*map.get(key);
		            for (int  x: map.keySet()){
		                if (res-- > 0 && x < 0) temp -= x;
		            }
		 
		            ans = Math.max(ans, temp);
		        }
		    }
		 
		    out.println(ans);
		 
		
		 
		 out.close();
		 
	}
	private static void add(TreeMap<Integer, Integer> map, int i) {
		// TODO Auto-generated method stub
		if(map.containsKey(i)) map.put(i, map.get(i)+1);
		else map.put(i, 1);
		
	}
	private static void delete(TreeMap<Integer, Integer> map, int i) {
		if(map.containsKey(i)) {
			if(map.get(i) == 1) map.remove(i);
			else map.put(i, map.get(i)-1);
		}
		
	}
}		 



