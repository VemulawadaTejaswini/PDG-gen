import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.StringTokenizer;


class Main{
	static int[][] ban;
	static boolean[][] visited;
	static long sum=0;
	static int H,W;
	static long kuro=0;
	static long siro=0;
	public static void main(String[] args) {
		SC sc=new SC(System.in);
		H=sc.nextInt();
		W=sc.nextInt();
		visited=new boolean[H][W];
		ban=new int[H][W];
		String s;
		for(int i=0; i<H; i++){
			s=sc.next();
			for(int j=0; j<W; j++){
				if(s.charAt(j)=='#'){
					ban[i][j]=1;	//黒
				}
				else{
					ban[i][j]=0;	//白
				}
			}
		}

		for(int i=0; i<H; i++){		//しらべる
			for(int j=0; j<W; j++){
				if(ban[i][j]==1 && !visited[i][j]){
					kuro=0; siro=0;
					dfs(i,j);
					sum+=kuro*siro;
				}
			}
		}
		pl(sum);
	}

	public static void dfs(int y,int x){
		int[] vx={0,1,0,-1};
		int[] vy={-1,0,1,0};
		if(ban[y][x]==1){
			kuro++;
		}
		else{
			siro++;
		}
		visited[y][x]=true;
		for(int i=0; i<4; i++){
			if(x+vx[i]>=0 && x+vx[i]<W && y+vy[i]>=0 && y+vy[i]<H){
				if(ban[y][x]!=ban[y+vy[i]][x+vx[i]] && !visited[y+vy[i]][x+vx[i]]){
					dfs(y+vy[i],x+vx[i]);
				}
			}
		}
	}
	public static void pl(Object o) {
		System.out.println(o);
	}
	public static void pl() {
		System.out.println();
	}
	public static void p(Object o) {
		System.out.print(o);
	}
	static class SC {
		private BufferedReader reader = null;
		private StringTokenizer tokenizer = null;
		public SC(InputStream in) {
			reader = new BufferedReader(new InputStreamReader(in));
		}
		public String next() {
			if (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(reader.readLine());
				} catch (IOException e) {
					throw new UncheckedIOException(e);
				}
			}
			return tokenizer.nextToken();
		}
		public int nextInt() {
			return Integer.parseInt(next());
		}
		public long nextLong() {
			return Long.parseLong(next());
		}
		public double nextDouble() {
			return Double.parseDouble(next());
		}
		public String nextLine() {
			try {
				return reader.readLine();
			} catch (IOException e) {
				throw new UncheckedIOException(e);
			}
		}
	}
}