import java.util.*;
import java.io.*;
import java.lang.reflect.Array;

import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
 
public class Main{
    static final long mod=1000000007;
//    static int dx[]={-1,0,1,0};
//    static int dy[]={0,-1,0,1};

    public  static void main(String[] args)   throws Exception, IOException{        
        Reader sc = new Reader(System.in);
        //110110011
        PrintWriter out=new PrintWriter(System.out);
        // int n=sc.nextInt();
        int n=sc.nextInt();
        int d[] = sc.nextIntArray(n);        
        int a[] = new int[n];
        int f=0;
        ArrayList<Integer> ls=new ArrayList<>();
        for (int i = 0; i <d.length; i++) {
        	ls.add(d[i]);
        }
        for (int i = 0; i <d.length; i++) {
			int id=-1;
			for (int t = 0; t < ls.size(); t++) {
				if(ls.get(t)==t+1 ) {id=t; }
			}
			if(id<0) {f++;break;}
			ls.remove(id);
			a[i]=id+1;
		}
        if(f>0)
        out.println(-1);
        else {
        	for (int i = 0; i < d.length; i++) {
				out.println(a[d.length-i-1]);
			}
        }
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
    int id,T;
    P(int id, int T) {
        this.id=id;
        this.T=T;
    }
    public int compareTo(P p){
        return id-p.id; //des
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
