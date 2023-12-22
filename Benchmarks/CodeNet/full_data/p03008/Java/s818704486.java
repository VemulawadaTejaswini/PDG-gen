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
        int g = sc.nextInt();
        int s = sc.nextInt();
        int b = sc.nextInt();
        int G = sc.nextInt();
        int S = sc.nextInt();
        int B = sc.nextInt();

        int ma=n;
        
        for (int i = 0; i <= n;  i++) {
        	if(n-i*g<0)break;
			for (int t = 0; t <= n ; t++) {
	        	if(n-i*g-t*s<0)break;
				int r=n-i*g-t*s, x=i*G+t*S;
				if(b>B) r+=x;
				else r = r - r/b * b + r/b * B + x;
				ma=max(ma,r);
			}
		}
        
        int ans=ma,mx=5000;
        for (int i = 0; i <= mx;  i++) {
        	if(ma-i*G<0)break;
			for (int t = 0; t <= mx ; t++) {
	        	if(ma-i*G-t*S<0)break;
				int r=ma-i*G-t*S, x=i*g+t*s;
				if(B>b) r+=x;
				else r = r - r/B * B + r/B * b + x;
				ans=max(ans,r);
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
//class P {
//    int id, d;
//    P(int  id, int d) {
//        this.id=id;
//        this.d=d;
//    }
//}

//class P implements Comparable<P>{
//    int a,b;
//    double c;
//    P(int a, int b) {
//    	this.b=b;
//    	this.a=a;
//    	this.c=(double)b/a;
//    }
//
//    public int compareTo(P p){
//        return Double.compare(p.c,c);
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
