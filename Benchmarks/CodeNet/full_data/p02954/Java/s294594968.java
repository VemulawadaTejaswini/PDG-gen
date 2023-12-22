import java.util.*;
import java.util.Map.Entry;
import java.io.*;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.rmi.server.UnicastRemoteObject;

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
        
//        int n=sc.nextInt();
        char c[]=sc.nextString().toCharArray();
        int a[]=new int[c.length];

        int st=-1;
        for (int i = 0; i < c.length; i++) {
			if(c[i]=='L') {
				if(c[i-1]=='L')continue;
//				db(st);
				a[i-1]=(i-st)/2;
				a[i]=(i-st)/2;
				if((i-st)%2==1)a[i-1]++;
				st=-1;
			} else {
				if(st<0)st=i;
			}
		}

//        db(a);
        st=-1;
        for (int i = c.length-1; -1 < i; i--) {
			if(c[i]=='R') {
				if(c[i+1]=='R')continue;
//				db(st,i);
				a[i+1]+=(st-i)/2;
				a[i]+=(st-i)/2;
				if((st-i)%2==1)a[i+1]++;
				st=-1;
			} else {
				if(st<0)st=i;
			}
		}

//        db(a);
        for (int i = 0; i < a.length; i++) {
            out.print(a[i]+" ");			
		}
        out.println();
        out.flush();
    }



    static boolean validpos(int x,int y,int r, int c){
        return x<r && 0<=x && y<c && 0<=y;
    }

    static void db(Object... os){
        System.err.println(Arrays.deepToString(os));
    }
}

class P {
	int x, y;
	P(int  x, int y) {
	  this.x=x;
	  this.y=y;
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
//    P(int a, int b) {
//    	this.b=b;
//    	this.a=a;
//    }
//
//    public int compareTo(P p){
//        return b-p.b;
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
