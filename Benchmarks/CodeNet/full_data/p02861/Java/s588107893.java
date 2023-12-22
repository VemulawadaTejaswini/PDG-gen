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
        long mod=1000000007;
        Reader sc = new Reader(System.in);
        PrintWriter out=new PrintWriter(System.out);
        PriorityQueue<Integer> q=new PriorityQueue<>();
        
        int n=sc.nextInt();
        s=0;
        double dx[]=new double[n];
        double dy[]=new double[n], f=1;
        for (int i = 0; i < dy.length; i++) {
			dx[i]=sc.nextDouble();
			dy[i]=sc.nextDouble();
			f*=i+1;
		}
        double ds[][]=new double[n][n];
        for (int i = 0; i < dy.length; i++) {
			for (int j = 0; j < dy.length; j++) {
				ds[i][j]=sqrt((dx[i]-dx[j])*(dx[i]-dx[j])+
						(dy[i]-dy[j])*(dy[i]-dy[j]));
			}
		}

        for (int i = 0; i < ds.length; i++) {
            rep(ds, new boolean[n], i, 0);
//            db(i,s);
		}
        
        out.println(s/f);
     	out.flush();
    }
    
    static void rep(double d[][], boolean u[],int p, double r) {
    	boolean k=false;
    	u[p]=true;
    	for (int i = 0; i < u.length; i++) {
			if(u[i])continue;
			k=true;
			u[i]=true;
			rep(d,u,i,r+d[p][i]);
			u[i]=false;
		}
    	if(!k)s+=r;
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


class P {
	int x, y, d;
	P(int  x, int y, int d) {
	  this.x=x;
	  this.y=y;
	  this.d=d;
	}
}

//class P implements Comparable<P>{
//    int a,b;
//    P(int a, int b) {
//    	this.b=b;
//    	this.a=a;
//    }
//
//    public int compareTo(P p){
//        return p.a-a;//des
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
