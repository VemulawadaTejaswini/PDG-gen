import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.StringTokenizer;

class Main{
	static int H,W;
	static int[][] meiro,bfs;
	static int addqueue=0;
	static int showqueue=0;
	static int before=0;
	static int[] queue;
	static int kaihou=0;
	static final int INF=1000000007;
	static int[] x= {0,1,0,-1};
	static int[] y= {1,0,-1,0};
	static int area=0;
	static int kuro=0;
	public static void main(String[] args) {
		SC sc=new SC(System.in);
		H=sc.nextInt();
		W=sc.nextInt();
		area=H*W;
		String s="";
		meiro=new int[H][W];
		bfs=new int[H][W];
		queue=new int[H*W*6000];
		for(int i=0; i<H; i++) {
			s=sc.next();
			for(int j=0; j<W; j++) {
				if(s.charAt(j)=='.') {
					meiro[i][j]=0;
					bfs[i][j]=INF;
				}
				else if(s.charAt(j)=='#') {
					meiro[i][j]=1;
					kuro++;
					bfs[i][j]=INF;
				}
			}
		}
		if(meiro[0][0]==0) {
			bfs[0][0]=1;
			queue[addqueue]=0;
			addqueue++;
			while(true) {
				int coord_x=queue[showqueue]%100;
				int coord_y=queue[showqueue]/100;
				if(coord_y*100+coord_x==(H-1)*100+W-1) {
					pl((area-kuro-bfs[coord_y][coord_x]));
					System.exit(0);
				}
				showqueue++;
				for(int i=0; i<4; i++) {
					if(coord_x+x[i]>=0 && coord_x+x[i]<W) {
						if(coord_y+y[i]>=0 && coord_y+y[i]<H) {
							if(meiro[coord_y+y[i]][coord_x+x[i]]==0) {
								bfs[coord_y+y[i]][coord_x+x[i]]=Math.min(bfs[coord_y+y[i]][coord_x+x[i]], bfs[coord_y][coord_x]+1);
								if(bfs[coord_y+y[i]][coord_x+x[i]]==bfs[coord_y][coord_x]+1) {
									queue[addqueue]=(coord_y+y[i])*100+coord_x+x[i];
									addqueue++;
								}
							}
						}
					}
				}
				if(before==addqueue) {
					kaihou++;
				}
				else if(before!=addqueue) {
					kaihou=0;
				}
				if(before==addqueue && kaihou>10000) {
					pl(-1);
					System.exit(0);
				}
				before=addqueue;
			}
		}
		else {
			pl(-1);
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