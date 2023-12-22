
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

	public static void solve() {
		int n=s.nextInt();
		int m=s.nextInt();
		int v=s.nextInt();
		int p=s.nextInt();
		Integer[] arr = new Integer[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		Arrays.sort(arr,Collections.reverseOrder());
		long[] prefix_sum = new long[n];
		for(int i=0;i<n;i++) {
			prefix_sum[i]=arr[i];
			if(i!=0) {
				prefix_sum[i]+=prefix_sum[i-1];
			}
		}
//		int[] defeat = new int[n];
//		boolean[] helper = new boolean[n];
//		int pos = p<=v?0:p-v-1;
//		for(int i=0;i<n;i++) {
//			defeat[i]=bs(arr,arr[i]+m);
//			if(defeat[i]<=pos) {
//				helper[i]=true;
//			}
//		}
		int ans= p;
		for(int i=p;i<n;i++) {
			int before = i- p +1;
			before = n- before;
			if(before>=v) {
				int current = m + arr[i];
				if(current>=arr[p-1]) {
					ans++;
				}
			}else {
//				if(p-2<0)continue;
				int current = m + arr[i];
				if(current<arr[p-1]) {
					break;
				}
				long sum = prefix_sum[i-1]-(p-2>=0?prefix_sum[p-2]:0);
				long remaining = v-before;
				long temp = (long)(m+arr[i])*(long)(i-p+1)-sum;
				if(temp >= remaining* (long)m) {
					ans++;
				}
			}
		}
		out.println(ans);
	}

	public static int bs(Integer[] arr,int val) {
		int start = 0;
		int end = arr.length-1;
		int ans = arr.length-1;
		while(start<=end) {
			int mid  = (start+end)>>1;
			if(arr[mid]<=val) {
				ans = mid;
				end = mid-1;
			}else {
				start=mid+1;
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		out = new PrintWriter(new BufferedOutputStream(System.out));
		s = new FastReader();
		solve();
		out.close();
	}

	public static FastReader s;
	public static PrintWriter out;

	public static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
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
			} catch (Exception e) {
				e.printStackTrace();
			}
			return str;
		}
	}

	
}
