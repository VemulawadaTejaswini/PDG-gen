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
        int dp[][]=new int[1<<n][n];
        int max=1<<28;
        for (int i = 0; i < 1<<n; i++) {
			fill(dp[i],max);
		}
        for (int i = 0; i < n; i++) {
			dp[1<<i][i]=0;
		}

        for (int i = 1,s; i < 1<<n; i++) {
			s=Integer.bitCount(i);
			for (int j = 0,v=0,c,d; j < n; j++) {
				if((i>>j)%2!=1)continue;
				c=abs(j-s+1)%2==1?b[j]:a[j];
				v++;
				for (int t = 0; t < n; t++) {
					if(t==j || (i>>t)%2!=1 || dp[i^(1<<j)][t]<0)continue;
					d=abs(t-s+2)%2==1?b[t]:a[t];
					if(c<d)continue;
					dp[i][j]=min(dp[i][j], dp[i^(1<<j)][t]+s-v);
				}
			}
//			db(i,dp[i]);
		}
        int ans=max;
        for (int i = 0; i < n; i++) {
			if(dp[(1<<n)-1][i]!=max)ans=min(dp[(1<<n)-1][i],ans);
		}
        if(ans==max)ans=-1;
        
        out.print(ans);
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
