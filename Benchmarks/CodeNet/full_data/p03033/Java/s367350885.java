import java.util.*;
import java.io.*;
import java.lang.reflect.Array;
import java.math.BigInteger;

import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
 
public class Main{
    static long mod=1000000007;
//    static int dx[]={-1,0,1,0};
//    static int dy[]={0,-1,0,1};

    public  static void main(String[] args)   throws Exception, IOException{        
        Reader sc = new Reader(System.in);
        PrintWriter out=new PrintWriter(System.out);

        int n=sc.nextInt();
        int q=sc.nextInt();
        P p[]=new P[q+n*2];
        int c=0;
        int d[]=new int[n];
        for (int i = 0; i < n; i++) {
        	int s=sc.nextInt();
        	int t=sc.nextInt();
        	int x=sc.nextInt();
        	d[i]=x;
			p[c++]=new P(i,s-x,1 );
			p[c++]=new P(i,t-x+1,0);
		}
        
        for (int i = 0; i < q; i++) {
			p[c++]= new P(-1, sc.nextInt(), 2 );
		}
        sort(p);
        boolean u[] = new boolean[n];
        PriorityQueue<Q> l = new PriorityQueue<>(); 

        for (int i = 0; i < p.length; i++) {
			db(p[i].id, p[i].x, p[i].w);
			if(p[i].w==1) {u[p[i].id]=true; l.add(new Q(p[i].id, d[p[i].id]));}
			else if(p[i].w==0)u[p[i].id]=false;
			else {
				while(!l.isEmpty() && !u[l.peek().id]) {
					l.poll();
				}
				if(l.isEmpty()) {
			        out.println(-1);
				}
				else {
//					db(l.peek().x);
					out.println(l.peek().x);
				}
			}
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

//class P {
//    int id, d;
//    P(int  id, int d) {
//        this.id=id;
//        this.d=d;
//    }
//}

class P implements Comparable<P>{
	int x,w,id,ox;
	P(int id, int x, int w) {
		this.id=id;
		this.x=x;
		this.w=w;
	}

	public int compareTo(P p){
		if(x==p.x) {
			return w-p.w;
		}
		return x-p.x;
	}
}

class Q implements Comparable<Q>{
	int x,id;
	Q(int id, int x) {
		this.id=id;
		this.x=x;
	}

	public int compareTo(Q p){
		return x-p.x;
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
    public long nextLong() throws IOException
    {
        return Long.parseLong(nextString());
    }
    public double nextDouble() throws IOException
    {
        return Double.parseDouble(nextString());
    }
}
