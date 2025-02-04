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
        int e[]=new int[n];
        double d=0;
        for (int  i = 0; i < n; i++) {
			e[i]=sc.nextInt();
			d+=e[i];
		}
        d/=n;
        double min=1<<28;
        int ans=0;
        for (int  i = 0; i < n; i++) {
        	if(abs(d-e[i])<min) {
        		ans=i;
        		min = abs(d-e[i]);
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
