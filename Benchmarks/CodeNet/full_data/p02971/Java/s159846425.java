import java.io.*;
import java.util.*;

public class  Main{
	static int mod=(int)1e9+7;
    public static void main(String[] args) throws Exception{
        //MScanner sc = new MScanner("chess.in");
        MScanner sc = new MScanner(System.in);
        PrintWriter pw=new PrintWriter(System.out);
        int n=sc.nextInt();
        int max=-1;int maxi=-1;int max2=-1;
        int[]in=new int[n];
        for(int i=0;i<n;i++) {
        	in[i]=sc.nextInt();
        	if(in[i]>max) {
        		max=in[i];maxi=i;
        	}
        }
        for(int i=0;i<n;i++) {
        	if(in[i]>=max2 && maxi!=i) {
        		max2=in[i];
        	}
        }
        for(int i=0;i<n;i++) {
        	if(maxi!=i) {
        		pw.println(max);
        	}
        	else {
        		pw.println(max2);
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