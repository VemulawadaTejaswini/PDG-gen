import java.util.*;
import java.util.Map.Entry;

import javax.swing.text.Segment;

import java.io.*;
import java.lang.reflect.Array;
import java.math.BigInteger;

import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
 
public class Main //implements Runnable
{
//    static int dx[]={-1,0,1,0};
//    static int dy[]={0,-1,0,1};

    public static void main(String[] args)   throws Exception, IOException{        
        long mod=1000000007;
        Reader sc = new Reader(System.in);
        PrintWriter out=new PrintWriter(System.out);

        int n=sc.nextInt();
        String s=sc.nextString();
        RH r1=new RH(s, 13, mod);
        RH r2=new RH(s, 17, mod+2);

        for (int i = n-1; 1<=i ; i--) {
        	ArrayList<Long> l=new ArrayList<>();
        	ArrayList<Long> ll=new ArrayList<>();
			long w,ww;
			for (int j = 0; j+i-1 < n; j++) {
				w=r1.get(j, j+i-1);
				ww=r2.get(j, j+i-1);
				l.add(w);
				ll.add(ww);
			}
			sort(l);
			sort(ll);
			for (int j = 0; j < l.size(); j++) {
				l.get(j);
				ll.get(j);
			}
		}
       
        out.println(0);
     	out.flush();
    }
    
    static long[] exGCD(long a, long b)
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
    


    static void ret(String ans) {
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
//	int x, y;
//	P(int  x, int y) {
//	  this.x=x;
//	  this.y=y;
//	}
//}

class P implements Comparable<P>{
    int a,b;
    P(int a, int b) {
    	this.b=b;
    	this.a=a;
    }

    public int compareTo(P p){
        return p.a-a;//des
    }
}

class RH {
	//rolling hash
	long mod,inv[],hs[];
	RH(String s, int v, long mod) {
		this.mod = mod;
		hs=new long[s.length()];
		inv=new long[s.length()];
		char c[]=s.toCharArray();
		hs[0]=c[0]-'a';
		inv[0]=1;
		long m=v;
		for (int i = 1; i < hs.length; i++) {
			hs[i]=m*(c[i]-'a')+hs[i-1];
			hs[i]%=mod;
			inv[i]=Main.exGCD(mod, m)[2];
			m*=v;
			m%=mod;
		}
	}
	
	long get(int l, int r) {
		long ret=hs[r];
		if(0<l)ret-=hs[l-1];
		ret*=inv[l];
		ret%=mod;
		if(ret<0)ret+=mod;
		return ret;
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
    public char[] getCharSet() throws IOException{
        return this.nextString().toCharArray();
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
