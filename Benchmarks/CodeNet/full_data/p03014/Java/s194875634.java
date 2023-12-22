import java.io.*;
import java.util.*;

public class  Main{
	static int mod=(int)1e9+7;
    public static void main(String[] args) throws Exception{
        //MScanner sc = new MScanner("chess.in");
        MScanner sc = new MScanner(System.in);
        PrintWriter pw=new PrintWriter(System.out);
        int n=sc.nextInt();
        int m=sc.nextInt();
        char[][]in=new char[n][m];
        for(int i=0;i<n;i++)in[i]=sc.nextLine().toCharArray();
        int[][]cumr=new int[n+1][m+1];
        int[][]cumu=new int[n+1][m+1];
        int[][]cuml=new int[n+1][m+1];
        int[][]cumd=new int[n+1][m+1];
        for(int i=0;i<n;i++) {
        	for(int j=0;j<m;j++) {
        		if(in[i][j]=='.') {
        			if(j==0) {
        				cuml[i][j]=1;
        			}
        			else {
        				cuml[i][j]=cuml[i][j-1]+1;
        			}
        		}
        	}
        }
        for(int i=0;i<n;i++) {
        	for(int j=m-1;j>=0;j--) {
        		if(in[i][j]=='.') {
        			if(j==m-1) {
        				cumr[i][j]=1;
        			}
        			else {
        				cumr[i][j]=cumr[i][j+1]+1;
        			}
        		}
        	}
        }
        for(int i=0;i<n;i++) {
        	for(int j=0;j<m;j++) {
        		if(in[i][j]=='.') {
        			if(i==0) {
        				cumu[i][j]=1;
        			}
        			else {
        				cumu[i][j]=cumu[i-1][j]+1;
        			}
        		}
        	}
        }
        for(int i=n-1;i>=0;i--) {
        	for(int j=0;j<m;j++) {
        		if(in[i][j]=='.') {
        			if(i==n-1) {
        				cumd[i][j]=1;
        			}
        			else {
        				cumd[i][j]=cumd[i+1][j]+1;
        			}
        		}
        	}
        }
        int ans=0;
        for(int i=0;i<n;i++) {
        	for(int j=0;j<m;j++) {
        		
        		ans=Math.max(ans,cuml[i][j]+cumr[i][j]+cumu[i][j]+cumd[i][j]-3);
        	}
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