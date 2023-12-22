import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class Main {
	static int MAX = 10000;
	static char[][] map;
	static int H;
	static int W;
	static int[][] d = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		PrintWriter pw=new PrintWriter(System.out);
		H = sc.nextInt(); W = sc.nextInt();
		int black = 0;
		map = new char[H][W];
		int[][] cost = new int[H][W];
		for(int i=0; i<H; i++) {
			String s = sc.next();
			for(int j=0; j<W; j++) {
				map[i][j] = s.charAt(j);
				if(map[i][j] == '#') black++;
			}
		}
		ArrayDeque<Pair> q = new ArrayDeque<>();
		q.add(new Pair(0, 0));
		while(!q.isEmpty()) {
			Pair tmp = q.poll();
			int ch = tmp.h;
			int cw = tmp.w;
			if(ch == H-1 && cw == W-1) break;
			for(int i=0; i<4; i++) {
				int nh = ch + d[i][0];
				int nw = cw + d[i][1];
				if((nh!=0 || nw!=0)&& 0<=nh && nh < H && 0 <= nw && nw < W && map[nh][nw]=='.' && cost[nh][nw] == 0) {
					cost[nh][nw] = cost[ch][cw] + 1;
					q.add(new Pair(nh, nw));
				}
			}
		}
		if(cost[H-1][W-1]!=0)
			pw.println(H*W-cost[H-1][W-1]-black-1);
		else
			pw.println(-1);
		pw.close();
	}
	
	static class Pair {
		int h; int w;
		Pair(int _h, int _w) {
			h = _h; w = _w;
		}
	}

	static class Scanner
	{
		BufferedReader br;
		StringTokenizer st;
		public Scanner(InputStream s)
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
