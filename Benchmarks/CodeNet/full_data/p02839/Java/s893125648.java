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
 
public class Main //implements Runnable
{
//    static int dx[]={-1,0,1,0};
//    static int dy[]={0,-1,0,1};
	
    public static void main(String[] args)   throws Exception, IOException{        
        long mod=1000000007;
        Reader sc = new Reader(System.in);
        PrintWriter out=new PrintWriter(System.out);

        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[][]=new int[n][m];
        int b[][]=new int[n][m];
        
        for (int i = 0; i < b.length; i++) {
			a[i]=sc.nextIntArray(m);
		}
        for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < m; j++) {
				a[i][j]-=sc.nextInt();
			}
		}
        int e=6410;
        boolean d[][][]=new boolean[n][m][6400*2+111];
        int mx=6400*2+111;
        d[0][0][a[0][0]+e]=true;
        d[0][0][-a[0][0]+e]=true;
        for (int i = 0; i < b.length; i++) {
			for (int j = i==0?1:0; j < m; j++) {
				for (int t = 0; t < e*2; t++) {
					if(i-1>=0 && d[i-1][j][t]) {
						if(t+a[i][j]<mx)
						d[i][j][t+a[i][j]]=true;
						if(0<=t-a[i][j])
						d[i][j][t-a[i][j]]=true;
					}
					if(j-1>=0 && d[i][j-1][t]) {
						if(t+a[i][j]<mx)
						d[i][j][t+a[i][j]]=true;
						if(0<=t-a[i][j])
						d[i][j][t-a[i][j]]=true;
					}
				}
			}
		}

        int r=Integer.MAX_VALUE;
        for (int i = 0; i < d[0][0].length; i++) {
			if(d[n-1][m-1][i])r=min(r,abs(i-e));
		}

        out.println(r);
     	out.flush();
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

//
//class P {
//	int x, y, d;
//	P(int  x, int y, int d) {
//	  this.x=x;
//	  this.y=y;
//	  this.d=d;
//	}
//}

class P implements Comparable<P>{
    int a,b;
    P(int a, int b) {
    	this.b=b;
    	this.a=a;
    }

    public int compareTo(P p){
        return -p.a+a;//as
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
