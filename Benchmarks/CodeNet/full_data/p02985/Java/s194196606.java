import java.io.*;
import java.math.BigInteger;
import java.util.*;


public class  Main{
	static int mod=(int)1e9+7;
	static LinkedList<Integer>[]adj;
	static int k;
	static boolean yes=true;
	static boolean[]v;
	static long dfs(int i) {
		v[i]=true;
		int start;
		long ans=1;
		if(i==0) {
			start=k-1;ans=k;
		}
		else {
			start=k-2;
		}
		for(int j:adj[i]) {
			if(!v[j]) {
				if(start<=0) {
					yes=false;break;
				}
				ans=(int)((ans*1l*(start--)*dfs(j))%mod);
			}
			
		}
		return ans%mod;
	}
    public static void main(String[] args) throws Exception{
    	MScanner sc = new MScanner(System.in);
        //MScanner sc = new MScanner("reduce.in");
        PrintWriter pw=new PrintWriter(System.out);
        int n=sc.nextInt();
        k=sc.nextInt();
        adj=new LinkedList[n];
        for(int i=0;i<n;i++)adj[i]=new LinkedList<Integer>();
        for(int i=0;i<n-1;i++) {
        	int x=sc.nextInt()-1;int y=sc.nextInt()-1;
        	adj[x].add(y);adj[y].add(x);
        }
        v=new boolean[n];
        long x=dfs(0);
        if(yes) {
        	pw.println(x);
        }
        else {
        	pw.println(0);
        }
        pw.flush();
    }
    static StringBuilder tosb(int[]in) {
    	StringBuilder s=new StringBuilder();
    	for(int i=0;i<in.length;i++) {
    		s.append(in[i]+" ");
    	}
    	return s;
    }
    static StringBuilder tosb(long[]in) {
    	StringBuilder s=new StringBuilder();
    	for(int i=0;i<in.length;i++) {
    		s.append(in[i]+" ");
    	}
    	return s;
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