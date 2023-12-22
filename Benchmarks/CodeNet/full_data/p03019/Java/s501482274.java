import java.util.*;
import java.io.*;
import java.lang.reflect.Array;
import java.math.BigInteger;

import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
 
public class Main{
    static long mod=1000000007;
//    static int dx[]={-1,0,1,0};
//    static int dy[]={0,-1,0,1};

    public static void main(String[] args)   throws Exception, IOException{        
        Reader sc = new Reader(System.in);
        PrintWriter out=new PrintWriter(System.out);

        int n = sc.nextInt();
        int x = sc.nextInt();
        P p[] = new P[n];
        long a=0;
        
        for (int i = 0; i < p.length; i++) {
			int b=sc.nextInt();
			int l=sc.nextInt();
			int r=sc.nextInt();
			p[i] = new P(b,l,r, (long)b*l+(long)(x-b)*r);
			a -= (long)b*l;
		}
        sort(p);
        
        long dw=0, up=(long)x*n+1, md, ans=up;
        
        for (int i = 0; i < 77; i++) {
			md = (dw+up)/2;
			long e=a, r=md;
			for (int j = 0; j < p.length; j++) {
				long s=-p[j].s;
//				db(p[j].b,p[j].l,p[j].r, s, e, md);
				if(r>=x) {
					e+=s;
					r-=x;
				} else {
					long c=e;
					for (int k = j; k < p.length; k++) {
						long rr=r,ee=e;
						if(p[k].b<=rr) {
							ee+= (long)p[k].b*p[k].l;
							rr-=p[k].b;
							ee+= (long)p[k].r * rr;
						}
						else ee+= rr*p[k].l;
						c=max(ee,c);
					}
					e=c;
					break;
				}
			}
			if(e>=0) {ans=min(md,ans); up=md;}
			else dw=md;
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

class P implements Comparable<P>{
    int l,r,b;
    long s;
    P(int b, int l, int r, long s) {
    	this.b=b;
    	this.l=l;
        this.r=r;
        this.s=-s;
    }

    public int compareTo(P p){
        return Long.signum(s-p.s);
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
    public int[] nextIntArray(int size) throws IOException{
        int r[] = new int[size];
        for (int i = 0; i < size; i++) {
            r[i] = this.nextInt(); 
        }
        return r;
    }
    public long[] nextLongArray(int size) throws IOException{
        long r[] = new long[size];
        for (int i = 0; i < size; i++) {
            r[i] = this.nextLong(); 
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
