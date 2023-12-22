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
	static double s;
	
    public static void main(String[] args)   throws Exception, IOException{        
//        long mod=1000000007;
        Reader sc = new Reader(System.in);
        PrintWriter out=new PrintWriter(System.out);

        int n=sc.nextInt();
        int m=sc.nextInt();
        int k=sc.nextInt();
        char c[][]=new char[n][m];
        for (int i = 0; i < c.length; i++) {
			c[i]=sc.getCharSet();
		}
        
        int d[]=new int[n];
        
        for (int i = 0; i < d.length; i++) {
			for (int j = 0; j < m; j++) {
				if(c[i][j]=='#')d[i]++;
			}
		}
        int a[][]=new int[n][m];
        int e=0;
        for (int i = 0; i < n; i++) {
			if(d[i]==0) {
				if(i>0) {
					for (int j = 0; j < m; j++) {
						a[i][j]=a[i-1][j];
					}
				}
				continue;
			}
			for (int j = 0,t; j < m; j++) {
				if(c[i][j]=='#') {
					e++;
					t=j;
					while(0<=t && a[i][t]==0) {a[i][t]=e;t--;}
				}
			}
		}

        for (int i = n-1; -1 < i; i--) {
			if(d[i]==0 && a[i][0]==0) {
				for (int j = 0; j < m; j++) {
					a[i][j]=a[i+1][j];
				}
			}
		}

        
        for (int i = 0; i < a.length; i++) {
			if(a[i][m-1]==0) {
		        for (int t = 0; t < m; t++) {
		        	if(a[i][t]==0)a[i][t]=a[i][t-1];
		        }				
			}
		}


        for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < m; j++) {
		        out.print(a[i][j]+" ");				
			}
	        out.println();
		}
//        out.println();
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
