import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.StringTokenizer;

class Main{
	public static void main(String[] args) {
		SC sc=new SC(System.in);
		String s=sc.next();
		String t=sc.next();
		StringBuilder sb=new StringBuilder();
		int m=s.length();
		int n=t.length();
		int[][] len=new int[m+1][n+1];
		for(int i=0; i<=m; i++) {
			len[i][0]=0;
		}
		for(int j=0; j<=n; j++) {
			len[0][j]=0;
		}
		int[] stack=new int[6000];
		int counter=0;

		for(int i=1; i<=m; i++) {
			for(int j=1; j<=n; j++) {
				if(s.charAt(i-1)==t.charAt(j-1)) {
					len[i][j]=len[i-1][j-1]+1;
				}else {
					len[i][j]=Math.max(len[i][j-1], len[i-1][j]);
				}
			}
		}
		int x=m;
		int y=n;
		stack[0]=x*10000+y;
		counter++;

		/*for(int i=0; i<=m; i++) {
			for(int j=0; j<=n; j++) {
				p(len[i][j]+" ");
			}
			pl("");
		}*/
		//aabb abb で　aabb
		while(x>0 && y>0 && len[x][y]>0) {
			if(len[x][y]-1==len[x-1][y] && len[x][y]-1==len[x][y-1] && len[x][y]-1==len[x-1][y-1]) {
				stack[counter]=(x-1)*10000+(y-1);
				x--;
				y--;
				counter++;
				//pl("NYA!");
			}
			else if(len[x-1][y-1]==len[x][y-1] && len[x-1][y-1]<len[x-1][y]) {
				stack[counter]=(x-1)*10000+(y-1);
				x--;
				y--;
				counter++;
				//pl("nuwa!");
			}
			else if(len[x-1][y-1]<len[x][y-1] && len[x-1][y-1]==len[x-1][y]) {
				stack[counter]=x*10000+(y-1);
				y--;
				counter++;

			}
			else if(len[x][y]==len[x][y-1] && len[x][y]==len[x-1][y] && len[x][y]==len[x-1][y-1]) {
				stack[counter]=(x-1)*10000+(y-1);
				x--;
				y--;
				counter++;

			}
			else if(len[x][y]==len[x-1][y-1]+1 && len[x-1][y]==len[x-1][y-1]+1 && len[x][y-1]==len[x-1][y-1]+1) {
				stack[counter]=x*10000+(y-1);
				y--;
				counter++;

			}
			//pl(len[x][y]+" "+len[x-1][y]+" "+len[x][y-1]+" "+len[x-1][y-1]);
		}
		for(int i=counter-1; i>=0; i--) {
			int tx=stack[i]/10000;
			int ty=stack[i]%10000;
			if(tx-1>=0 && ty-1>=0) {
				if(s.charAt(tx-1)==t.charAt(ty-1)) {
					sb.append(s.charAt(tx-1));
				}
			}
		}
		pl(sb.toString());
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