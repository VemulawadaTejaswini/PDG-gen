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

    public static void main(String[] args)   throws Exception, IOException{        
        Reader sc = new Reader(System.in);
        PrintWriter out=new PrintWriter(System.out);

        int n = sc.nextInt();
        long a[]=sc.nextLongArray(n);
        sort(a);
    	
    	if(n==2) {
    		out.println(a[1]-a[0]);
    		out.println(a[1]+" "+a[0]);
    		out.flush();
    		return;
    	}
    	

        PriorityQueue<Long> min = new PriorityQueue<>();
    	PriorityQueue<Long> max = new PriorityQueue<>();
    	for (int i = 0; i < a.length; i++) {
			if(a[i]<0)min.add(a[i]);
			else max.add(a[i]);
		}

    	ArrayList<Long> ans=new ArrayList<>();
        if(min.size()==0) {
//            out.println(a[0]+" "+a[1]);
            ans.add(a[0]);
            ans.add(a[1]);
            max.poll();
            max.poll();
        	min.add(a[0]-a[1]);
        }else if(max.size()==0) {
//            out.println(a[n-1]+" "+a[n-2]);
            ans.add(a[n-1]);
            ans.add(a[n-2]);
            min.clear();
            for (int i = 0; i < a.length-2; i++) {
				min.add(a[i]);
			}
        	max.add(a[n-1]-a[n-2]);
        }

    	
    	while(1<max.size()) {
    		long x=min.poll();
    		long y=max.poll();
            ans.add(x);
            ans.add(y);

//            out.println(x+" "+y);
    		min.add(x-y);
    	}
    	while(!min.isEmpty()) {
    		long x=min.poll();
    		long y=max.poll();
            ans.add(y);
            ans.add(x);
//            out.println(y+" "+x);
            max.add(y-x);
    	}
        out.println(max.poll());
        
    	for (int i = 0; i < ans.size(); i+=2) {
			out.println(ans.get(i)+" "+ans.get(i+1));
		}
        
//        out.println();
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

//class P implements Comparable<P>{
//    int l,r,b;
//    long s;
//    P(int b, int l, int r, long s) {
//    	this.b=b;
//    	this.l=l;
//        this.r=r;
//        this.s=-s;
//    }
//
//    public int compareTo(P p){
//        return Long.signum(s-p.s);
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
