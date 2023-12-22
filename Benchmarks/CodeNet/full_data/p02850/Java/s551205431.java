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
        ArrayList<Long> ret[] = new ArrayList[n];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = new ArrayList<>();
        }
        for (int i = 0; i < n-1; i++) {
            int a=sc.nextInt()-1;
            int b=sc.nextInt()-1;
            ret[a].add((long)1000000*b+i);
            ret[b].add((long)1000000*a+i);
        }

        int p[]=new int[n];
        int cn[]=new int[n];
        int c[]=new int[n-1];
        fill(p,-1);

        LinkedList<Integer> l=new LinkedList<>();
        long t=1000000,e,nm=1;
        l.add(0);
        while(!l.isEmpty()) {
        	int w=l.poll();
//        	db(w);
        	for (int i = 0,to,nc=1,ei; i < ret[w].size(); i++) {
        		e=ret[w].get(i);
        		to=(int)(e/t);
        		ei=(int)(e%t);
				if(to==p[w])continue;
				if(nc==cn[w])nc++;
				c[ei]=nc;
				p[to]=w;
				cn[to]=nc;
				nm=max(nc,nm);
				l.add(to);
				nc++;
			}
        }
        
        out.println(nm);
        for (int i = 0; i < c.length; i++) {
            out.println(c[i]);
		}

        out.println();
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
