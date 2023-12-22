import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
	static int SZ=100;
	public static void main(String[] args) throws IOException {
		MyScanner sc = new MyScanner(System.in);
		int n=sc.nextInt();
		long[] a = new long[n];
		for(int i=0; i<n; i++) a[i]=sc.nextLong();
		long[]bkt=new long[200];
		Arrays.fill(bkt, Long.MAX_VALUE);
		for(int i=0; i<n; i++) {
			bkt[i/SZ]=Math.min(a[i], bkt[i/SZ]);
		}
		long ans=0;
		for(int i=0; i<n; i++) {
			int l=0;
			for(;l<200; l++) {
				if(bkt[l]==a[i])
					break;
			}
			if(l>199) {
				int kl;
				for(kl=0; i-kl>=0; kl++) {
					if(a[i]>a[i-kl]) break;
				}
				int kr;
				for(kr=0; i+kr<n; kr++) {
					if(a[i]>a[i+kr]) break;
				}
				//ans+=(1+kr)*(1+kl);
				long b=kr*kl;
				ans+=b*a[i];
			} else {
				int r=l;
				for(;r<200; r++) {
					if(bkt[r]!=a[i])
						break;
				}
				// l*SZ..r*sz
				l=Math.max(0, (l-1)*SZ);
				r=Math.min(n-1, (r+2)*SZ);
				int kl;
				for(kl=0; i-kl>=l; kl++) {
					if(a[i]>a[i-kl]) break;
				}
				int kr=0;
				for(;i+kr<=r; kr++) {
					if(a[i]>a[i+kr]) break;
				}
				//ans+=(1+kr)*(1+kl);
				long b=kr*kl;
				ans+=b*a[i];
			}
		}
		System.out.println(ans);
	}

	static class MyScanner
	{
		BufferedReader br;
		StringTokenizer st;
		public MyScanner(InputStream s) 
		{
			br=new BufferedReader(new InputStreamReader(s));
		}
		public String nextLine() throws IOException
		{
			return br.readLine();
		}
		public String next() throws IOException
		{
			while(st==null || !st.hasMoreTokens())
				st=new StringTokenizer(br.readLine());
			return st.nextToken();
		}
		public int nextInt() throws IOException
		{
			return Integer.parseInt(next());
			
		}
		public double nextDouble() throws IOException
		{
			return Double.parseDouble(next());
		}
		public boolean ready() throws IOException
		{
			return br.ready();
		}
		public long nextLong() throws IOException
		{
			return Long.parseLong(next());
		}
	}
}
