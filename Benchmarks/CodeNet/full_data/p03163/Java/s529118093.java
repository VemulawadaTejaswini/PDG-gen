
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.io.*;

public class Main{
	public static void main(String[] args) throws NumberFormatException, IOException, InterruptedException {
		// System.out.println("adfsf");
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		int n=sc.nextInt();
		int s=sc.nextInt();
		w=new int[n];
		v=new int [n];
		for (int i = 0; i < n; i++) {
			w[i]=sc.nextInt();
			v[i]=sc.nextInt();
		}
		memo=new long[n][s+1];
		for (long[] i : memo) {
			Arrays.fill(i, -1);
		}
		//Arrays.fill(memo,-1);
		pw.print(dp(0,s));
		pw.close();
	}
	
	static long [][]memo;
	static int []w,v;
	public static long dp(int idx,int remw) {
		if(idx==memo.length)
			return 0;
		if(memo[idx][remw]!=-1) 
			return memo[idx][remw];
		if(w[idx]>remw)
			return memo[idx][remw]=dp(idx+1,remw);
		return memo[idx][remw]=Math.max(dp(idx+1,remw), dp(idx+1,remw-w[idx])+v[idx]);
	}

	
//	static class pair{
//		int v;
//		StringBuilder sb;
//		pair(int v,StringBuilder s){
//			this.v=v;
//			sb=s;
//		}
//		pair max(pair b) {
//			return (this.v>b.v)? this:b;
//		}
//		public String toString() {
//			return v+"\n"+sb.toString();
//		}
//	}
//	public static void main(String[] args) throws NumberFormatException, IOException, InterruptedException {
//		// System.out.println("adfsf");
//		Scanner sc = new Scanner(System.in);
//		PrintWriter pw = new PrintWriter(System.out);
//		int n=sc.nextInt();
//		int s=sc.nextInt();
//		w=sc.nextIntArr(n);
//		v=sc.nextIntArr(n);
//		memo=new pair[n][s+1];
//		
//		//Arrays.fill(memo,-1);
//		pw.print(dp(0,s,0));
//		pw.close();
//	}
//	static pair [][]memo;
//	static int []w,v;
//	public static pair dp(int idx,int remw,int value) {
//		if(idx==memo.length)
//			return new pair(0,new StringBuilder());
//		if(memo[idx][remw]!=null) 
//			return memo[idx][remw];
//		if(w[idx]>remw)
//			return memo[idx][remw]=dp(idx+1,remw,value);
//		return memo[idx][remw]=(dp(idx+1,remw,value)).max(new pair(value+v[idx],(dp(idx+1,remw-w[idx],value+v[idx])).sb.append(idx+" ")));
//	}



	static void shuffleArray(int[] ar) {
		// If running on Java 6 or older, use `new Random()` on RHS here
		Random rnd = ThreadLocalRandom.current();
		for (int i = ar.length - 1; i > 0; i--) {
			int index = rnd.nextInt(i + 1);
			// Simple swap
			int a = ar[index];
			ar[index] = ar[i];
			ar[i] = a;
		}
	}

	static class Scanner {
		StringTokenizer st;
		BufferedReader br;

		public Scanner(InputStream s) {
			br = new BufferedReader(new InputStreamReader(s));
		}

		public Scanner(FileReader r) {
			br = new BufferedReader(r);
		}

		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}

		public String nextLine() throws IOException {
			return br.readLine();
		}

		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}

		public int[] nextIntArr(int n) throws IOException {
			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++)
				arr[i] = nextInt();
			return arr;
		}

		public boolean ready() throws IOException {
			return br.ready();
		}
	}

}