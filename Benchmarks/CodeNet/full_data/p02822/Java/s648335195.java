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
    	ArrayList<Integer>[] t=InputTree(n, sc);
    	int d[]=new int[n];
    	int p[]=new int[n];
    	rep(0,-1,d,p,t);
    	
    	long bi[]=new long[n+2],iv;
    	bi[0]=1;
    	iv=exGCD(2, mod)[1];
    	for (int i = 1; i < bi.length; i++) {
			bi[i]=bi[i-1]*iv;
			bi[i]%=mod;
			bi[i-1]=1-bi[i-1]+mod;
			bi[i-1]%=mod;			
		}
    	
    	long r=0;

    	for (int i = 0; i < d.length; i++) {
    		long rr=0;
			if(t[i].size()==1)continue;
			int s=n-d[i];
			for (int j = 0,ss,v; j < t[i].size(); j++) {
				v=t[i].get(j);
				if(p[i]==v)continue;
				ss=d[v];
				rr+=bi[s]*bi[ss]%mod*(1-bi[n-s-ss]);
				rr%=mod;
				s+=ss;
			}
			r+=rr%mod+mod;
			r%=mod;
		}
    	
    	out.println(r);
     	out.flush();
    }
    
    public static long[] exGCD(long a, long b)
    {
        if(a == 0 || b == 0)return null;
        int as = Long.signum(a);
        int bs = Long.signum(b);
        a = Math.abs(a); b = Math.abs(b);
        long p = 1, q = 0, r = 0, s = 1;
        while(b > 0){
            long c = a / b;
            long d;
            d = a; a = b; b = d % b;
            d = p; p = q; q = d - c * q;
            d = r; r = s; s = d - c * s;
        }// can be minus! 
        return new long[]{a, p * as, r * bs};
    }
    
    static int rep(int cr, int pr,int d[],int p[], ArrayList<Integer> ls[]) {
    	int r=0;
    	p[cr]=pr;
    	for (int i = 0,c; i < ls[cr].size(); i++) {
			c=ls[cr].get(i);
			if(c==pr)continue;
			r+=rep(c,cr,d,p,ls);
		}
    	return d[cr]=r+1;
    }
    
    static ArrayList[] InputTree(int n, Reader sc) {
        ArrayList<Integer> ret[] = new ArrayList[n];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = new ArrayList<>();
        }
        for (int i = 0; i < n-1; i++) {
            int a=sc.nextInt()-1;
            int b=sc.nextInt()-1;
            ret[a].add(b);
            ret[b].add(a);
        }
        return ret;
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

//
//class P {
//	int x, y, d;
//	P(int  x, int y, int d) {
//	  this.x=x;
//	  this.y=y;
//	  this.d=d;
//	}
//}
//

//class P implements Comparable<P>{
//    int a,b;
//    P(int a, int b) {
//    	this.b=b;
//    	this.a=a;
//    }
//
//    public int compareTo(P p){
//        return -p.a+a;//as
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
    public char[] getCharSet() throws IOException{
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
