import java.util.*;
import java.io.*;
import java.math.*;
public class Main{
	static int mod = (int)1e9+7;
	public static PrintWriter out = new PrintWriter (new BufferedOutputStream(System.out));
	public static void main(String sp[])throws IOException{
		FastReader sc = new FastReader();
		int n = sc.nextInt();
		int k = sc.nextInt();
		int q = sc.nextInt();
		long arr[] = new long[n+2];
		for(int i=0;i<q;i++)
			arr[sc.nextInt()]+=1;
		
		long pre[] = new long[n+2];
		long suf[] = new long[n+2];
		for(int i=1;i<=n;i++){
			pre[i]=arr[i];
			suf[i]=arr[i];
		}
		
		for(int i=1;i<=n;i++){
			pre[i]+=pre[i-1];
		}
		for(int i=n;i>=1;i--){
			suf[i]+=suf[i+1];
		}
		
		
		for(int i=1;i<=n;i++){
			long total = (long)pre[i-1]+(long)suf[i+1];
			if(total>=k)	
				System.out.println("No");
			else System.out.println("Yes");
			
		}

	}
	
	public static class pair{
		int pos;
		int bomb;
	}
	
	
	public static int partition(int [] arr, int s, int e){
		
		int index=s;
		int pivot = arr[e];
		for(int i=s;i<=e-1;i++){
			if(arr[i]<=pivot){
				arr = swap(arr, index, i);
				index++;
			}
		}
		swap(arr,index,e);
		print(arr);
		return index;
	}
	
	public static int[] swap(int[] arr, int low, int high){
		int temp = arr[low];
		arr[low]=arr[high];
		arr[high]=temp;
		return arr;
	}
	
	
	public static long gcd(long a, long b){
		if(a==0)
			return b;
		
		return gcd(b%a,a);
	}
	
	public static void print(int[] arr){
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
	}
	

	public static class comp implements Comparator<pair>{
		public int compare(pair o1, pair o2){
			return o1.bomb-o2.bomb;
		}
	}
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
	
}