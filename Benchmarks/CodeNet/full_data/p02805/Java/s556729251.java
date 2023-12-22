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
        int x[]=new int[n];
        int y[]=new int[n];
        for (int i = 0; i < y.length; i++) {
			x[i]=sc.nextInt();
			y[i]=sc.nextInt();
		}
        double ans=10000;
        if(n==2) {
        	double X=(x[0]+x[1])/2.0,Y=(x[0]+y[1])/2.0,
        	r=sqrt( (X-x[0])*(X-x[0])+(Y-y[0])*(Y-y[0]) );
//        	db(X,Y);
        	ret(r+"");
        }
        
        for (int i = 0; i < y.length; i++) {
			for (int j = i+1; j < y.length; j++) {
				for (int k = j+1; k < y.length; k++) {
					double d1=x[i]*x[i]+y[i]*y[i];
					double d2=x[j]*x[j]+y[j]*y[j];
					double d3=x[k]*x[k]+y[k]*y[k];
					double A=x[i]*(y[j]-y[k])-y[i]*(x[j]-x[k])+x[j]*y[k]-x[k]*y[j];
					double B=d1*(y[k]-y[j])+d2*(y[i]-y[k])+d3*(y[j]-y[i]);
					double C=d1*(x[j]-x[k])+d2*(x[k]-x[i])+d3*(x[i]-x[j]);
					double D=d1*(x[k]*y[j]-x[j]*y[k])+
							d2*(x[i]*y[k]-x[k]*y[i])
							+d3*(x[j]*y[i]-x[i]*y[j]);
//					db(sqrt( (B*B+C*C-4*A*D)/(4*A*A) ));
					double X=-B/(2*A), Y=-C/(2*A),
							r=sqrt( (B*B+C*C-4*A*D)/(4*A*A) ),rr;
					int c=0;
					for (int l = 0; l < y.length; l++) {
						rr=sqrt((X-x[l])*(X-x[l])+(Y-y[l])*(Y-y[l]));
						if(rr<r || abs(rr-r)<0.0000001)c++;
//						db(c,sqrt((X-x[l])*(X-x[l])+(Y-y[l])*(Y-y[l])),r);
//						db(r,rr);
					}
					
					if(c==n)ans=min(ans,r);
					X=(x[i]+x[j])/2.0;Y=(y[i]+y[j])/2.0;
					r=sqrt((X-x[j])*(X-x[j])+(Y-y[j])*(Y-y[j]));
					c=0;
					for (int l = 0; l < y.length; l++) {
						rr=sqrt((X-x[l])*(X-x[l])+(Y-y[l])*(Y-y[l]));
						if(rr<r || abs(rr-r)<0.0000001)c++;
					}
					if(c==n)ans=min(ans,r);					
				}
			}
		}
        
        out.println(ans);
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


class P implements Comparable<P>{
    int x,y,ds;
    P(int x,int y, int ds) {
    	this.x=x;
    	this.y=y;
    	this.ds=ds;
    }

    public int compareTo(P p){
        return ds-p.ds;
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
