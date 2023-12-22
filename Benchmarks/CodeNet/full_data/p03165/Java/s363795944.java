import java.io.*;
import java.util.*;

public class  Main{
	static char[] s,t;
	static StringBuilder trace(int pos1, int pos2){
		
		if(pos1 == -1 || pos2 == -1)	return new StringBuilder();
		
		StringBuilder take = new StringBuilder(), leave1 = new StringBuilder(), leave2 = new StringBuilder();

		if(s[pos1] == t[pos2])	take =(new StringBuilder()).append(s[pos1]).append(trace(pos1-1, pos2-1));
	  	
		leave1 = trace(pos1, pos2-1);
		leave2 = trace(pos1-1, pos2);
		
		leave1 = (leave1.length() > leave2.length()) ? leave1 : leave2;
		return (take.length() > leave1.length()) ? take : leave1;
		
	}
	public static void main(String[] args) throws Exception{
		MScanner sc=new MScanner(System.in);
		PrintWriter pw=new PrintWriter(System.out);
		s=sc.nextLine().toCharArray();
		t=sc.nextLine().toCharArray();
		StringBuilder ans = trace(s.length-1, t.length-1);
		if(ans.length()==0)ans=new StringBuilder(" ");
		for(int i=ans.length()-1;i>=0;i--) {
			pw.print(ans.charAt(i));
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
		public int[] takearr(int n) throws IOException {
	        int[]in=new int[n];for(int i=0;i<n;i++)in[i]=nextInt();
	        return in;
		}
		public long[] takearrl(int n) throws IOException {
	        long[]in=new long[n];for(int i=0;i<n;i++)in[i]=nextLong();
	        return in;
		}
		public Integer[] takearrobj(int n) throws IOException {
	        Integer[]in=new Integer[n];for(int i=0;i<n;i++)in[i]=nextInt();
	        return in;
		}
		public Long[] takearrlobj(int n) throws IOException {
	        Long[]in=new Long[n];for(int i=0;i<n;i++)in[i]=nextLong();
	        return in;
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