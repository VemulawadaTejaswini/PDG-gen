import java.util.*;
import java.io.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
 
public class Main{
//    static final long mod=1000000007;
//    static int dx[]={-1,0,1,0};
//    static int dy[]={0,-1,0,1};

    public  static void main(String[] args)   throws Exception, IOException{        
        Reader sc = new Reader(System.in);
        PrintWriter out=new PrintWriter(System.out);
        // int n=sc.nextInt();
        // char c[][] = new char[h][w];
        // char c[]=sc.nextString().toCharArray();
        // int d[]=new int[n];
        // for(int i=0; i<n; i++) {d[i]=sc.nextInt();}

        int n=sc.nextInt(),m=sc.nextInt();
        long dp[]=new long[n];
        int ts[]=new int[n];
        int dg[]=new int[n];
        ArrayList<Integer> lis[]=new ArrayList[n];
        for (int i = 0; i < lis.length; i++) {
			lis[i] = new ArrayList<Integer>();
		}
        
        for (int i = 0; i < m; i++) {
			int from=sc.nextInt()-1, to=sc.nextInt()-1;
			lis[from].add(to);
			dg[to]++;
		}
        int c=0;
        for (int i = 0; i < n; i++) {
        	if(dg[i]==0)ts[c++]=i;
		}
        
        for (int i = 0; i < n; i++) {
//        	db(ts[i]);
			for (int j = 0,to; j < lis[ts[i]].size(); j++) {
				to = lis[ts[i]].get(j);
				if(--dg[to]==0) ts[c++]=to;
			}
		}
        long ans=0;
        for (int i = n-1; -1 < i; i--) {
        	int from=ts[i];
			for (int t = 0; t < lis[from].size(); t++) {
				dp[from]=max(dp[from],dp[lis[from].get(t)]+1);
			}
			ans=max(dp[from],ans);
		}
        
        out.println(ans);
        out.flush();
    }
    
    static boolean validpos(int x,int y,int r, int c){
        return x<r && 0<=x && y<c && 0<=y;
    }


    static void db(Object... os){
        System.err.println(Arrays.deepToString(os));
    }  
}

//class P {
//    int id, d;
//    P(int  id, int d) {
//        this.id=id;
//        this.d=d;
//    }
//}

//class P implements Comparable<P>{
//    int id, d;
//    P(int  id, int d) {
//        this.id=id;
//        this.d=d;
//    }
//    public int compareTo(P p){
//        return d-p.d; //des
//    }
//}

class Reader
{ 
    private BufferedReader x;
    private StringTokenizer st;
    
    public Reader(InputStream in)
    {
        x = new BufferedReader(new InputStreamReader(in));
        st = null;
    }
    public String nextString() throws IOException
    {
        while( st==null || !st.hasMoreTokens() )
            st = new StringTokenizer(x.readLine());
        return st.nextToken();
    }
    public int nextInt() throws IOException
    {
        return Integer.parseInt(nextString());
    }
    public int[] nextIntArray(int size) throws IOException{
    	int r[] = new int[size];
    	for (int i = 0; i < size; i++) {
			r[i] = this.nextInt(); 
		}
    	return r;
    }
    public long nextLong() throws IOException
    {
        return Long.parseLong(nextString());
    }
    public double nextDouble() throws IOException
    {
        return Double.parseDouble(nextString());
    }
}
