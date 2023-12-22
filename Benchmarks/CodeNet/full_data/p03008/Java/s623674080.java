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
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        int xx=sc.nextInt();
        int yy=sc.nextInt();
        int zz=sc.nextInt();

        P p[]=new P[3];
        p[0]=new P(x,xx);
        p[1]=new P(y,yy);
        p[2]=new P(z,zz);
        sort(p);
        db(p[0].a,p[0].b,p[0].c);
        db(p[1].a,p[1].b,p[1].c);
        int s=0;
        if(p[0].c>0 && n>0) {
		int q=n/p[0].a;
			n-=p[0].a*q;
			s+=p[0].b*q;
        }
        if(p[1].c>0 && n>0) {
		int q=n/p[1].a;
			n-=p[1].a*q;
			s+=p[1].b*q;
        }
        if(p[2].c>0 && n>0) {
		int q=n/p[2].a;
			n-=p[2].a*q;
			s+=p[2].b*q;
        }
        
        out.println(n+s);
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
    int a,b;
    double c;
    P(int a, int b) {
    	this.b=b;
    	this.a=a;
    	this.c=(double)b/a;
    }

    public int compareTo(P p){
        return Double.compare(p.c,c);
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
