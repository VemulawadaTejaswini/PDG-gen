
import java.io.*;
import java.util.*;
public class Main {
	static final int N=100005;
	static int a[]=new int[10005];
	static int map[][]=new int[105][105];
	public static void main(String[] args){
		InputReader in = new InputReader(System.in);
	    PrintWriter out = new PrintWriter(System.out);
	    int h=in.nextInt(),w=in.nextInt();
	    int n=in.nextInt();int x=0,y=0;
	    for(int i=1;i<=n;i++){
	    	a[i]=in.nextInt();
	    }
	    map[0][0]=1;a[1]--;
	    int cnt=1;
	    while(cnt<=n&&a[n]>0) {
	    		while(y+1<w&&map[x][y+1]==0) {
	    			if(a[cnt]==0) cnt++;
	    			map[x][++y]=cnt;
	    			a[cnt]--;
	    		}
	    		while(x+1<h&&map[x+1][y]==0) {
	    			if(a[cnt]==0) cnt++;
	    			map[++x][y]=cnt;
	    			a[cnt]--;
	    		}
	    		while(y-1>=0&&map[x][y-1]==0) {
	    			if(a[cnt]==0) cnt++;
	    			map[x][--y]=cnt;
	    			a[cnt]--;
	    		}
	    		while(x-1>=0&&map[x-1][y]==0) {
	    			if(a[cnt]==0) cnt++;
	    			map[--x][y]=cnt;
	    			a[cnt]--;
	    		}
	    }
	    for(int i=0;i<h;i++) {
	    	for(int j=0;j<w;j++) {
	    		if(j!=0) out.print(" ");
	    		out.print(map[i][j]);
	    	}
	    	out.println();
	    }
	    out.flush();
	}
	static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;
        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }
        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }
        public int nextInt() {
            return Integer.parseInt(next());
        }
    }
}