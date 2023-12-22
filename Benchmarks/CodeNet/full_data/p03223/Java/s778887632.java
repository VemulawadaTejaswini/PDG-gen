import java.util.*;
import java.io.*;
 
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
 
public class Main{
    static final long mod=1000000007;
    static int dx[]={1,-1,0,0};
    static int dy[]={0,0,1,-1};

    public  static void main(String[] args)   throws Exception, IOException{
        Reader sc = new Reader(System.in);
        PrintWriter out=new PrintWriter(System.out);
        // int n=sc.nextInt();
        // char c[][] = new char[h][w];
        // char c[]=sc.nextString().toCharArray();
        // int d[]=new int[n];
        // for(int i=0; i<n; i++) {d[i]=sc.nextInt();}

        int n=sc.nextInt();
        int d[] = new int[n];
        int e[] = new int[n];

        for (int i = 0; i < n; i++) {
			d[i] = sc.nextInt();
		}
        sort(d);
        int l=d[0],r=d[n-1];
        long ans=abs(l-r);
        for (int i = 2,x=1,y=n-2; i < n; i++) {
        	db(l,r);
        	int ll=0,a=0,rr=0,b=0;
        	if(abs(l-d[x])<abs(r-d[x])) {ll=abs(r-d[x]);a=1;}
        	else {ll=abs(l-d[x]);}
        	if(abs(l-d[y])<abs(r-d[y])) {rr=abs(r-d[y]);b=1;}
        	else {rr=abs(l-d[y]);}
        	
        	if(ll<rr) {ans+=rr; if(b==0)l=d[y]; else r=d[y]; y--;}
        	else {ans+=ll; if(a==0)l=d[x]; else r=d[x]; x++;}
 	
        }
     
        out.println(ans);
        out.flush();
    }

    static void db(Object... os){
        System.err.println(Arrays.deepToString(os));
    }  
}

class P implements Comparable<P>{
    int id, d;
    P(int  id, int d) {
        this.id=id;
        this.d=d;
    }
    public int compareTo(P p){
        return d-p.d; //des
    }
}

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
