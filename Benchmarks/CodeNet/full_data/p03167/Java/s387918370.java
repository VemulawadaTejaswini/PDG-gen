
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.io.*;

public class Main{
	static long[][]memo;
	static char[][] map;
	public static void main(String[] args) throws NumberFormatException, IOException, InterruptedException {
		// System.out.println("adfsf");
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		int h=sc.nextInt();
		int w=sc.nextInt();
		map=new char[h][w];
		for (int i = 0; i < h; i++) {
			String s=sc.next();
			for (int j = 0; j < w; j++) {
				map[i][j]=s.charAt(j);
			}
		}
		//System.out.println(Arrays.deepToString(map));
		memo=new long[h][w];
		for (long[] x : memo) {
			Arrays.fill(x, -1);
		}
		memo[h-1][w-1]=1;
		System.out.println(dp(0,0));
	}
	static long dp(int h,int w) {
		if(memo[h][w]!=-1)
			return memo[h][w]=(long)(memo[h][w]%(1e9+7));
		if(map[h][w]=='#')
			return memo[h][w]=0;
		long x=0;
		if(valid(h+1,w))
			x+=dp(h+1,w);
		if(valid(h,w+1))
			x+=dp(h,w+1);
		return memo[h][w]=x%=(1e9+7);
		
	}
	private static boolean valid(int h, int i) {
		return h<map.length&&i<map[0].length;
	}
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