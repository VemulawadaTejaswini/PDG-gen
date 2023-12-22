import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
import java.util.TreeMap;



 class Main{
	 
	 
	 
	

	public static void main(String[] args) throws IOException {
		
		
		FastScanner sc=new FastScanner();
		int n = sc.nextInt();
		long arr[][] = new long[n+1][3];
		for(int i=1; i<=n; i++) {
			arr[i][0] = sc.nextLong();
			arr[i][1] = sc.nextLong();
			arr[i][2] = sc.nextLong();
		}
		long dp[][] = new long[n+1][3];
		
		dp[1][0] = arr[1][0];
		dp[1][1] = arr[1][1];
		dp[1][2] = arr[1][2];
		
		for(int i=2; i<=n; i++) {
//			System.out.println(arr[i][0]+" "+arr[i][1]+" "+arr[i][2]);
			dp[i][0] = Math.max(dp[i-1][1], dp[i-1][2]) + arr[i][0];
			dp[i][1] = Math.max(dp[i-1][0], dp[i-1][2]) + arr[i][1];
			dp[i][2] = Math.max(dp[i-1][0], dp[i-1][1]) + arr[i][2];
			
		}
		System.out.println(Math.max(dp[n][2],Math.max(dp[n][0], dp[n][1])));
		
				
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
