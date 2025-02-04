import java.io.*;
import java.util.*;
public class  Main{
	static class pair implements Comparable<pair>{
		int i,j,idx;
		pair(int x,int y,int index){i=x;j=y;idx=index;}
		@Override
		public int compareTo(pair o) {
			if(i==o.i) {
				if(j==o.j)return idx-o.idx;
				return j-o.j;
			}
			return i-o.i;
		}
		
	}
	public static void main(String[] args) throws Exception{
		MScanner sc=new MScanner(System.in);
		PrintWriter pw=new PrintWriter(System.out);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			pair[]in=new pair[n];
			TreeSet<pair>ts=new TreeSet<pair>();
			for(int i=0;i<n;i++) {
				in[i]=new pair(sc.nextInt(), sc.nextInt(),i);
				ts.add(in[i]);
			}
			
			int[]par=new int[n];
			Arrays.fill(par, -1);
			for(int i=0;i<n;i++) {
				ts.remove(in[i]);
				pair cand=ts.floor(new pair(in[i].i+1, in[i].j+1, 0));
				if(cand==null) {
					continue;
				}
				System.out.println(i+" "+cand.idx);
				par[i]=cand.idx;
				ts.remove(cand);
			}
			int ans=0;
			for(int i=0;i<n;i++) {
				if(par[i]==-1) {
					ans++;
				}
			}
			pw.println(ans);
			
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