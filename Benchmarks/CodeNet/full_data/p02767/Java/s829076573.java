import java.util.*;

import java.io.*;

public class Main {
	static PrintWriter out;
	static StringBuilder sb;
	static long mod = 1000000007;
	static int inf = (int) 1e15;
	static ArrayList<Integer>[] adL, adH;
	static int n, q;

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		out = new PrintWriter(System.out);
        int n=sc.nextInt();
         //int p=0;
         long ans=Long.MAX_VALUE;
         int []a=new int [n];
         for(int i=0;i<n;i++)
        	 a[i]=sc.nextInt();
         Arrays.sort(a);
         //System.out.println(Arrays.toString(a));
         for(int i=a[0];i<=a[n-1];i++) {
        	 long tem=0;
        	 for(int j=0;j<n;j++)
        		 tem+=(i-a[j])*(i-a[j]);
        //	 System.out.println(i+" "+tem);
        	 ans=Math.min(ans, tem);
         }
         System.out.println(ans);
		out.flush();
	}

	static class Scanner {
		StringTokenizer st;
		BufferedReader br;

		public Scanner(InputStream system) {
			br = new BufferedReader(new InputStreamReader(system));
		}

		public Scanner(String file) throws Exception {
			br = new BufferedReader(new FileReader(file));
		}

		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
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