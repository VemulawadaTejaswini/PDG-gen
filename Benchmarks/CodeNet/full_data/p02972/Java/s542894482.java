import java.io.*;
import java.util.*;

public class  Main{
	static int mod=(int)1e9+7;
    public static void main(String[] args) throws Exception{
        //MScanner sc = new MScanner("chess.in");
        MScanner sc = new MScanner(System.in);
        PrintWriter pw=new PrintWriter(System.out);
        int n=sc.nextInt();
        int[]in=new int[n];
        for(int i=0;i<n;i++) {
        	in[i]=sc.nextInt();
        	
        }
        int[]val=new int[n];
        int c=0;
        for(int i=n;i>0;i--) {
        	int sum=0;
        	int j=i-1;
        	while(j<n) {
        		sum+=val[j];j+=i;
        	}
        	if(sum%2!=in[i-1]) {
        		val[i-1]=1;c++;
        	}
        }
        pw.println(c);
        for(int i=0;i<n;i++) {
        	if(val[i]!=0) {
        		pw.println(i+1);
        	}
        }
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