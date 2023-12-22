import java.util.*;
import java.io.*;
import java.time.chrono.MinguoDate;

import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
 
public class Main{
    static final long mod=1000000007;
    static int dx[]={-1,0,1,0};
    static int dy[]={0,-1,0,1};

    public  static void main(String[] args)   throws Exception, IOException{        
        Reader sc = new Reader(System.in);
        PrintWriter out=new PrintWriter(System.out);
        // int n=sc.nextInt();
        // char c[][] = new char[h][w];
        // char c[]=sc.nextString().toCharArray();
        // int d[]=new int[n];
        // for(int i=0; i<n; i++) {d[i]=sc.nextInt();}

        
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a[]=new int[n];
        long d[]=new long[n*(n+1)/2];
        for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
        for (int i = 0,c=0; i < a.length; i++) {
        	long s=0;
        	for (int j = i; j < a.length; j++) {
				s+=a[j];
				d[c++]=s;
			}
		}
        sort(d);
        ArrayList<Long> lx=new ArrayList<>();
        ArrayList<Long> ly=new ArrayList<>();
        lp:for (int i = 63; -1 < i; i--) {
        	int c=0;
        	if(lx.size()==0) {
        		for (int t = d.length-1; -1 < t; t--) {
       				if( (d[t]&(1L<<i))>0 )lx.add(d[t]);
        	    }
//        		db(i,lx.size());
        	}
        	else {        		
        		for (int t = 0; t < lx.size(); t++) {
        			long w=lx.get(t);
        			if( (w&(1L<<i))>0 )ly.add(w);
        	    }
        		if(ly.size()>=k) {lx=new ArrayList<>(ly); }
        		ly.clear();
        	}
        	if(lx.size()<k)lx.clear();
//        	db(i,lx.size());
		}
//        db(d);
        long ans=0;
        if(lx.size()>=k) {
        	ans=lx.get(0);
			for (int t = 1; t < k; t++) {
				ans &= lx.get(t);
			}
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
    public long nextLong() throws IOException
    {
        return Long.parseLong(nextString());
    }
    public double nextDouble() throws IOException
    {
        return Double.parseDouble(nextString());
    }
}
