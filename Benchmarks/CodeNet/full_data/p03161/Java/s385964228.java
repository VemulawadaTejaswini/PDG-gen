import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;
import java.util.StringTokenizer;

class Main {
	public static void main(String[] args)
	{
		FastScanner in=new FastScanner();
		int n=in.nextInt();
		int k=in.nextInt();
		int[] h=in.readArray(n);
		int[]dp =new int[n];
		for(int i=0;i<n;i++)
			dp[i]=Integer.MAX_VALUE;
		dp[0]=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<=(i+k);j++)
			{
				if(j<n)
				dp[j]=Math.min(dp[j], dp[i]+Math.abs(h[i]-h[j]));
			}
		}
		System.out.println(dp[n-1]);
	}
	
static final Random random=new Random();
	
	static void ruffleSort(int[] a) {
		int n=a.length;//shuffle, then sort 
		for (int i=0; i<n; i++) {
			int oi=random.nextInt(n), temp=a[oi];
			a[oi]=a[i]; a[i]=temp;
		}
		Arrays.sort(a);
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
		long nextLong() {
			return Long.parseLong(next());
		}
	}
}
