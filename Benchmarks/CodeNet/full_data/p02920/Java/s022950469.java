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

        int N=sc.nextInt();
        int n=1<<N;
        int a[]=sc.nextIntArray(n);
        sort(a);
        TreeMap<Integer, Integer> m=new TreeMap<>();
        PriorityQueue<Integer> q=new PriorityQueue<>();
        PriorityQueue<Integer> qq=new PriorityQueue<>();
        q.add(a[n-1]);
        for (int i = 1; i < a.length; i++) {
        	if(m.containsKey(a[n-i-1])) {
        		m.put(a[n-i-1], m.get(a[n-i-1])+1);
        	} else 
			m.put(a[n-i-1],1);
		}
        db(a);       
        for (int i = 0,p,v,w; i < N; i++) {
        	while(!q.isEmpty()) {
        		p=q.poll();
        		v=-1;
        		Integer V=m.lowerKey(p);
        		if(V==null) {
        			ret("No");
        		}
        		v=V;
        		w=m.get(v);
        		if(w>1) {
        			m.put(v, w-1);
        		}
        		else m.remove(v);
        		qq.add(v);
        		qq.add(p);
        	}
        	q=new PriorityQueue<>(qq);
        	qq.clear();
		}
        
        out.println("Yes");
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
