import java.io.*;
import java.math.BigInteger;
import java.util.*;
import java.util.Map.Entry;



public class  Main{
	
	public static void main(String[] args) throws Exception{
    	MScanner sc = new MScanner(System.in);
        //MScanner sc = new MScanner("task.in");
        PrintWriter pw=new PrintWriter(System.out);
        char[]in=sc.nextLine().toCharArray();
        char cur='0';
        int ans0=0;
        for(int i=0;i<in.length;i++) {
        	if(in[i]!=cur)ans0++;
        	if(cur=='0')cur='1';
        	else	cur='0';
        }
        int ans1=0;cur='1';
        for(int i=0;i<in.length;i++) {
        	if(in[i]!=cur)ans1++;
        	if(cur=='0')cur='1';
        	else	cur='0';
        }
        pw.println(Math.min(ans0,ans1));
        pw.flush();
    }
	static class pair implements Comparable<pair>{
		int t;int d;
		pair(int x,int y){
			t=x;d=y;
		}
		@Override
		public int compareTo(pair o) {
			if(t!=o.t) {
				return t-o.t;
			}
			return d-o.d;
		}
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