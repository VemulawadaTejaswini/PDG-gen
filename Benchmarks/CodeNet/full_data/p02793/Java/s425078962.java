import java.io.*;
import java.util.*;
public class Main {
	static long mod=(long)1e9+7;
	static long fastpow(long n,long ti) {
		 if (ti == 0) 
		        return 1l;
		if(ti%2==0) {
			long y=fastpow(n, ti/2);
			long k=y*y;
			k%=mod;
			return k;
		}
		else {
			long y=fastpow(n, ti/2);
			long k=((n*y)%mod)*y;
			k%=mod;
			return k;
		}
	}
	static int[]primes;
    static int sizeofp=0;
	static int[] isComposite;
	
	
	static void sieve(int N)	// O(N log log N) 
	{
		isComposite = new int[N+1];					
		isComposite[0] = isComposite[1] = 1;			
		primes = new int[N];

		for (int i = 2; i <= N; ++i) 					
			if (isComposite[i] == 0) 					
			{
				primes[sizeofp++]=i;;
				if(1l * i * i <= N)
					for (int j = i * i; j <= N; j += i)	
						isComposite[j] = 1;
			}   
	}
	public static void main(String[] args) throws Exception {
		MScanner sc=new MScanner(System.in);
		PrintWriter pw=new PrintWriter(System.out);
		int n=sc.nextInt();
		int []in=sc.takearr(n);
		long lcm=1;
		sieve(1000000);
		int[]powers=new int[1000001];
		for(int i=0;i<n;i++) {
			int x=in[i],idx=0;
			int p=primes[idx];
			while(p*1l*p<=x) {
				int cnt=0;
				while(x%p==0) {
					cnt++;x/=p;
				}
				powers[p]=Math.max(powers[p], cnt);
				p=primes[++idx];
			}
			if(x!=1) {
				powers[x]=Math.max(1, powers[x]);
			}
		}
		for(int i=2;i<=1000000;i++) {
			lcm=(lcm*fastpow(i, powers[i]))%mod;
		}
		long ans=0;
		for(int i=0;i<n;i++) {
			long modinverse=fastpow(in[i],mod-2);
			long inc=(modinverse*lcm);
			inc%=mod;
			ans=(ans+inc)%mod;
		}
		pw.println(ans);
		pw.flush();
	}
	static class MScanner {
		StringTokenizer st;
		BufferedReader br;
		public MScanner(InputStream system) {
			br = new BufferedReader(new InputStreamReader(system));
		}
 
		public MScanner(String file) throws Exception {
			br = new BufferedReader(new FileReader(file));
		}
 
		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}
		public int[] takearr(int n) throws IOException {
	        int[]in=new int[n];for(int i=0;i<n;i++)in[i]=nextInt();
	        return in;
		}
		public long[] takearrl(int n) throws IOException {
	        long[]in=new long[n];for(int i=0;i<n;i++)in[i]=nextLong();
	        return in;
		}
		public Integer[] takearrobj(int n) throws IOException {
	        Integer[]in=new Integer[n];for(int i=0;i<n;i++)in[i]=nextInt();
	        return in;
		}
		public Long[] takearrlobj(int n) throws IOException {
	        Long[]in=new Long[n];for(int i=0;i<n;i++)in[i]=nextLong();
	        return in;
		}
		public String nextLine() throws IOException {
			return br.readLine();
		}
 
		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}
 
		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}
 
		public char nextChar() throws IOException {
			return next().charAt(0);
		}
 
		public Long nextLong() throws IOException {
			return Long.parseLong(next());
		}
 
		public boolean ready() throws IOException {
			return br.ready();
		}
 
		public void waitForInput() throws InterruptedException {
			Thread.sleep(3000);
		}
	}
}
