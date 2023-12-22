import java.util.*;
import java.util.Map.Entry;

import javax.swing.text.Segment;
import javax.xml.ws.WebEndpoint;

import java.io.*;
import java.lang.reflect.Array;
import java.math.BigInteger;

import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
 
public class Main implements Runnable
{
//    static int dx[]={-1,0,1,0};
//    static int dy[]={0,-1,0,1};
    static long mod=1000000007;
    
    public static void main(String[] args) {        
        new Thread(null, new Main(), "", 200 * 1024 * 1024).start();        
    }

    public void run() {
        Reader sc = new Reader(System.in);
        PrintWriter out=new PrintWriter(System.out);

        int n=sc.nextInt();
        long d[]=sc.nextLongArray(n);
        int sz=n+2;
        long fr[] = new long[sz];
        long inv[]= new long[sz];

        fr[0] = inv[0] = 1;
        fr[1] = inv[1] = 1;
        int mod = 1000000007;

        for (int i = 2; i <sz; ++i){
            inv[i] = inv[mod % i] * (mod - mod / i) % mod ;
        }

        for (int i = 2; i <sz; ++i){
            fr[i] = fr[i-1]*i %mod;
            inv[i] = inv[i-1]*inv[i] %mod;
        }
        
        long r=0,v,vv;
        long ds[]=new long[n+1];
        long m[]=new long[n+1];
        for (int i = 0; i < d.length-1; i++) {
			for (int j = i+1; j < d.length-1; j++) {
				ds[j-i]+=d[j]-d[i];
				ds[j-i]%=mod;
			}
		}
//        db(ds);
        
        for (int i = 2; i < n; i++) {
        	v=fr[n-1]*inv[n-1-i]%mod;
        	v*=inv[i]*fr[i-2]%mod;
        	v%=mod;
        	v*=fr[n-i-1];
        	v%=mod;

        	vv=fr[n-1]*inv[n-1-i]%mod;
        	vv*=inv[i]*fr[i-1]%mod;
        	vv%=mod;
        	vv*=fr[n-i-1];
        	vv%=mod;
        	m[i]=vv;

        	v*=ds[i-1];
        	v%=mod;
        	r+=v;
        	r%=mod;
        }
        m[1]=fr[n-1];
        for (int i = 0; i < d.length-1; i++) {
			v=d[n-1]-d[i];
			v*=m[n-i-1];
			r+=v;
	        r%=mod;
		}
        
        out.println(r);
     	out.flush();
    }
    
    static void ret(String ans) {
    	System.out.println(ans);
    	System.exit(0);
    }

    static void ret(long ans) {
    	System.out.println(ans);
    	System.exit(0);
    }
    
    static boolean validpos(int x,int y,int r, int c){
        return x<r && 0<=x && y<c && 0<=y;
    }

    static void db(Object... os){
        System.err.println(Arrays.deepToString(os));
    }
}

//class P {
//	int x,y; double d;
//	P(int  x, int y, double d) {
//	  this.x=x;
//	  this.y=y;
//	  this.d=d;
//	}
//}

//
//class P implements Comparable<P>{
//    int id,ds,p;
//    P(int id, int ds, int p) {
//    	this.id=id;
//    	this.ds=ds;
//    	this.p=p;
//    }
//
//    public int compareTo(P p){
//        return ds-p.ds;
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
    public String nextString()
    {
        while( st==null || !st.hasMoreTokens() )
			try {
				st = new StringTokenizer(x.readLine());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        return st.nextToken();
    }
    public int nextInt()
    {
        return Integer.parseInt(nextString());
    }
    public int[] nextIntArray(int size) {
        int r[] = new int[size];
        for (int i = 0; i < size; i++) {
            r[i] = this.nextInt(); 
        }
        return r;
    }
    public long[] nextLongArray(int size) {
        long r[] = new long[size];
        for (int i = 0; i < size; i++) {
            r[i] = this.nextLong(); 
        }
        return r;
    }
    public char[] getCharSet() {
        return this.nextString().toCharArray();
    }    
    public long nextLong()
    {
        return Long.parseLong(nextString());
    }
    public double nextDouble() throws IOException
    {
        return Double.parseDouble(nextString());
    }
}
