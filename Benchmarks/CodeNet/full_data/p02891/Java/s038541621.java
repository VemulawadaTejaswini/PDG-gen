import java.io.*;
import java.math.BigInteger;
import java.util.*;
import java.util.Map.Entry;
 
 
public class  Main{
	static int[][][]memo;
	static char[]in;
	static StringBuilder trace(int i,int prev,int first) {
		if(i>=memo.length)return new StringBuilder();
		StringBuilder s=new StringBuilder();
		if(i==0) {
			if(in[0]==in[in.length-1]) {
				if(memo[i][prev][first]==dp(i+1,1,1)+1) {
					s.append('A');
					return s.append(trace(i+1,1,1));
				}
				else {
					s.append(in[i]);
					return s.append(trace(i+1,0,0));
				}
			}
			if(memo[i][prev][first]==dp(i+1,1,first)+1) {
				s.append('A');
				return s.append(trace(i+1,1,first));
			}
			else {
				s.append(in[i]);
				return s.append(trace(i+1,0,first));
			}
		}
		if(i==in.length-1) {
			if(first==0) {
				s.append('A');return s;
			}
			else {
				if(prev==1) {
					if(memo[i][prev][first]==dp(i+1,1,first)+1) {
						s.append('A');return s;
					}
					else {
						s.append(in[i]);return s;
					}
				}
				if(in[i]==in[i-1]) {
					s.append('A');return s;
				}
				if(memo[i][prev][first]==dp(i+1,1,first)+1) {
					s.append('A');return s;
				}
				else {
					s.append(in[i]);return s;
				}
			} 
		}
		if(prev==1) {
			if(memo[i][prev][first]==dp(i+1,0,first)) {
				s.append(in[i]);
				return s.append(trace(i+1,0,first));
				
			}
			else {
				s.append('A');
				return s.append(trace(i+1,1,first));
			}
		}
		if(in[i]==in[i-1]) {
			s.append('A');
			return s.append(trace(i+1,1,first));
		}
		if(memo[i][prev][first]==dp(i+1,0,first)) {
			s.append(in[i]);
			return s.append(trace(i+1,0,first));
			
		}
		s.append('A');
		return s.append(trace(i+1,1,first));
		
	}
	static int dp(int i,int prev,int first) {
		if(i>=memo.length)return 0;
		if(memo[i][prev][first]!=-1)return memo[i][prev][first];
		if(i==0) {
			if(in[0]==in[in.length-1]) {
				return memo[i][prev][first]=Math.min(dp(i+1,1,1)+1, dp(i+1,0,0));
			}
			return memo[i][prev][first]=Math.min(dp(i+1,0,first), dp(i+1,1,first)+1);
		}
		if(i==in.length-1) {
			if(first==0) {
				return memo[i][prev][first]=1;
			}
			else {
				if(prev==1) {
					return memo[i][prev][first]=Math.min(dp(i+1,0,first), dp(i+1,1,first)+1);
				}
				if(in[i]==in[i-1]) {
					return memo[i][prev][first]=dp(i+1,1,first)+1;
				}
				return memo[i][prev][first]=Math.min(dp(i+1,0,first), dp(i+1,1,first)+1);
			}
		}
		if(prev==1) {
			return memo[i][prev][first]=Math.min(dp(i+1,0,first), dp(i+1,1,first)+1);
		}
		if(in[i]==in[i-1]) {
			return memo[i][prev][first]=dp(i+1,1,first)+1;
		}
		return memo[i][prev][first]=Math.min(dp(i+1,0,first), dp(i+1,1,first)+1);
	}
	public static void main(String[] args) throws Exception{
    	MScanner sc = new MScanner(System.in);
        PrintWriter pw=new PrintWriter(System.out);
        in=sc.nextLine().toCharArray();
        int k=sc.nextInt();
        if(in.length==1) {
        	pw.println(k/2);
        	pw.flush();
        	return;
        }
        int cnt=0;
        for(int i=1;i<in.length;i++) {
        	if(in[i]==in[i-1]) {
        		cnt++;
        		in[i]='A';
        	}
        }
        if(in[0]==in[in.length-1] && !(in.length>=3 && in[in.length-1]==in[in.length-2])) {
        	pw.println(cnt*1l*k+k-1);
        }
        else {
        	pw.println(cnt*1l*k);
        }
        pw.flush();
        pw.close();
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