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
    static int dx[]={-1,0,1,0};
    static int dy[]={0,-1,0,1};
    static long mod=1000000007;
    
    public static void main(String[] args) {        
        new Thread(null, new Main(), "", 200 * 1024 * 1024).start();        
    }

    public void run() {
        Reader sc = new Reader(System.in);
        PrintWriter out=new PrintWriter(System.out);

        int n=sc.nextInt();
        int a[]=sc.nextIntArray(n);
        int b[]=sc.nextIntArray(n);
        int c[]=new int[n];
        int d[]=new int[n];
        int ans=-1;
        for (int i = 0,f; i < 1<<n; i++) {
        	fill(d,0);
        	f=0;
			for (int j = 0; j < n; j++) {
				if((i>>j)%2==1) {
					c[j]=b[j];
				}
				else c[j]=a[j];
			}
			bs(c,d);
			for (int j = 0; j < n; j++) {
				if((i>>j)%2!=d[j]%2) {
					f=1;break;
				}
			}
			if(f==0) {
				f=0;
				for (int j = 0; j < d.length; j++) {
					f+=d[j];
				}
//				db(c);
				if(ans<0)ans=1<<28;
				ans=min(f/2,ans);
			}
		}
        
        out.print(ans);
     	out.flush();
    }
    
    static void bs(int a[], int b[]) {
    	for (int i = 0; i < b.length; i++) {
			for (int j = i+1; j < b.length; j++) {
				if(a[i]>a[j]) {
					b[i]++;
					b[j]++;
				}
			}
		}
    	
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


class P implements Comparable<P>{
    int x,y;
    P(int x,int y) {
    	this.x=x;
    	this.y=y;
    }

    public int compareTo(P p){
        return y-p.y;
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
