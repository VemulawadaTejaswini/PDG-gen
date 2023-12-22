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
        PrintWriter out=new PrintWriter(System.out);

        int n=sc.nextInt();
        int q=sc.nextInt();
        char s[]=sc.nextString().toCharArray();
        char a[]=new char[q];
        char b[]=new char[q];
        
        for (int i = 0; i < b.length; i++) {
			a[i]=sc.nextString().charAt(0);
			b[i]=sc.nextString().charAt(0);
		}
        
        int f=-1,l=0,r=n,m;
        
        for (int i = 0,c; i < 50; i++) {
        	m=c=(l+r)/2; 
        	boolean ok=false;
        	for (int t = 0; t < q; t++) {
				if(a[t]==s[c]) {
					if(b[t]=='R')c++;
					else c--;
					if(c<0) {
						l=f=m; ok=true;
						break;
					}
					if(c>=n)break;
				}
			}
        	if(!ok)r=m;
		}
        int ans=0;
        if(f>=0)ans=f+1;
        
        f=-1;l=0;r=n;
        for (int i = 0,c; i < 50; i++) {
        	m=c=(l+r)>>1; 
        	boolean ok=false;
        	for (int t = 0; t < q; t++) {
				if(a[t]==s[c]) {
					if(b[t]=='R')c++;
					else c--;
					if(c>=n) {
						r=f=m; ok=true;
						break;
					}
					if(c<0)break;
				}
			}
        	if(!ok)l=m;
		}
        
        if(f>=0)ans+=n-f;
        
        out.println(n-ans);
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
