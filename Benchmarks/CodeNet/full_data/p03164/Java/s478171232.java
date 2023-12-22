
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;





 class Main{
	
	

	public static void main(String[] args) throws IOException {
		
		
		FastScanner sc=new FastScanner();
		int n = sc.nextInt();
		long capacity = sc.nextLong();
		
		long wights[] = new long[n];
		long value[] = new long[n];
		for(int i=0; i<n; i++) {
			wights[i] = sc.nextLong();
			value[i] = sc.nextLong();
		}
		long v = solve(wights,value,n,capacity);
		System.out.println(v);
	}
	
	
	
	static HashMap<String, Long> dp = new HashMap<String, Long>();
	
 
	private static long solve(long[] wights, long[] value, int n, long W) {
		if(n == 0 || W==0)
			return 0;
		String str = n+"@"+W;
		if(dp.containsKey(str))
			return dp.get(str);
		long ans = -1;
		if(wights[n-1] <= W) {
			 ans = Math.max(solve(wights, value, n-1,  (W-wights[n-1])) 
					+ value[n-1],
					solve(wights, value, n-1, W));
		}
		else {
			ans =  solve(wights, value, n-1, W);
		}
		dp.put(str, ans);
		return ans;
		
	}





	static void sort(int[] a) {
		ArrayList<Integer> l=new ArrayList<>();
		for (int i:a) l.add(i);
		Collections.sort(l);
		for (int i=0; i<a.length; i++) a[i]=l.get(i);
	}
	
	static class FastScanner {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");
		String next() {
			while (!st.hasMoreTokens())
				try {
					st=new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}
		
		int nextInt() {
			return Integer.parseInt(next());
		}
		int[] readArray(int n) {
			int[] a=new int[n];
			for (int i=0; i<n; i++) a[i]=nextInt();
			return a;
		}
		long[] readArrayLong(int n) {
        	long[] a=new long[n];
			for (int i=0; i<n; i++) a[i]=nextInt();
			return a;
        }
		long nextLong() {
			return Long.parseLong(next());
		}
		String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
	}
}
