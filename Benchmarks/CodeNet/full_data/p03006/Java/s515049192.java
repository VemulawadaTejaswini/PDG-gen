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
        int x[]=new int[n];
        int y[]=new int[n];
        int d[][]= new int[n*n*n][2];
        int c=0;
        for (int i = 0; i < y.length; i++) {
        	x[i]=sc.nextInt();
        	y[i]=sc.nextInt();
        }

        for (int i = 0; i < y.length; i++) {
			for (int j = i+1; j < y.length; j++) {
				d[c][0]=x[i]-x[j];
				d[c][1]=y[i]-y[j];
				d[c+1][0]=-x[i]+x[j];
				d[1+c][1]=-y[i]+y[j];
				c+=2;
			}
		}
        int ans=Integer.MAX_VALUE;
        for (int i = 0; i < c; i++) {
        	int a=n;
			for (int t = 0; t < x.length; t++) {
				for (int w = 0; w < x.length; w++) {
					if(t==w)continue;
					if(x[t]+d[i][0]==x[w] && y[t]+d[i][1]==y[w])a--;
				}
			}
			
//			db(d[i],a);
			ans=min(ans,a);
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
//    int l,r,b;
//    long s;
//    P(int b, int l, int r, long s) {
//    	this.b=b;
//    	this.l=l;
//        this.r=r;
//        this.s=-s;
//    }
//
//    public int compareTo(P p){
//        return Long.signum(s-p.s);
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
