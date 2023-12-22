import java.io.*;
import java.util.*;

public class  zz{
    public static void main(String[] args) throws Exception{
        //MScanner sc = new MScanner("chess.in");
        MScanner sc = new MScanner(System.in);
        PrintWriter pw=new PrintWriter(System.out);
        //int n=sc.nextInt();int[]in=new int[n];
        //for(int i=0;i<n;i++)in[i]=sc.nextInt();
        int w=sc.nextInt();
        int h=sc.nextInt();
        int x=sc.nextInt();
        int y=sc.nextInt();
        int ans1=Math.min(x*h,(w-x)*h);
        int ans2=Math.min(y*w,(h-y)*w);
        if(ans1==ans2) {
        	pw.println(ans1+" "+1);
        }
        else
        	pw.println(Math.max(ans2,ans1)+" "+0);
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