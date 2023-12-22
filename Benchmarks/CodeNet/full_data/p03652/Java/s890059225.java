import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		int N = sc.nextInt(), M = sc.nextInt(), fav[][] = new int[N][M];
		for(int i = 0; i < N; ++i)
			for(int j = 0; j < M; ++j)
				fav[i][j] = sc.nextInt() - 1;
		int[] cnt = new int[M];
		for(int i = 0; i < N; ++i)
			cnt[fav[i][0]]++;
		int ans = N, ptr[] = new int[N];
		for(int k = 0; k + 1 < M; ++k)
		{
			int max = -1, idx = -1;
			for(int i = 0; i < M; ++i)
				if(cnt[i] > max)
					max = cnt[idx = i];

			ans = Math.min(ans, max);
			cnt[idx] = -1;
			for(int i = 0; i < N; ++i)
			{	
				cnt[fav[i][ptr[i]]]--;
				while(cnt[fav[i][ptr[i]]] < 0)
					++ptr[i];
				cnt[fav[i][ptr[i]]]++;
			}
		}
		out.println(ans);
		out.close();
	}

	static class Scanner 
	{
		StringTokenizer st;
		BufferedReader br;

		public Scanner(InputStream s){	br = new BufferedReader(new InputStreamReader(s));}

		public Scanner(String s) throws FileNotFoundException{	br = new BufferedReader(new FileReader(s));}

		public String next() throws IOException 
		{
			while (st == null || !st.hasMoreTokens()) 
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		public int nextInt() throws IOException {return Integer.parseInt(next());}

		public long nextLong() throws IOException {return Long.parseLong(next());}

		public String nextLine() throws IOException {return br.readLine();}

		public double nextDouble() throws IOException { return Double.parseDouble(next()); }

		public boolean ready() throws IOException {return br.ready();} 
	}
}