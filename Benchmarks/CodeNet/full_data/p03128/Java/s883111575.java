import java.util.*;
import java.io.*;

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
        // int n=sc.nextInt();
        // char c[][] = new char[h][w];
        // char c[]=sc.nextString().toCharArray();
        // int d[]=new int[n];
        // for(int i=0; i<n; i++) {d[i]=sc.nextInt();}

        int n=sc.nextInt();
        int m=sc.nextInt();
        int d[]=new int[10];

        for (int i = 0; i < m; i++) {
        	int e=sc.nextInt();
        	if(e==1)d[2]=12;
        	if(e==7)d[3]=73;
        	if(e==4)d[4]=44;
        	if(e==2||e==3||e==5)d[5]=max(d[5],e*10+5);
        	if(e==6|| e==9)d[6]=max(d[6],e*10+6);
        	if(e==8)d[7]=87;
		}
        sort(d);
        
        int dig[] = new int[n+1];
        for (int i = 0; i <= n; i++) {
            getd(i, d, dig);			
		}
//        db(d);
//        db(dig);
       
        for (int i = dig[n]; -1 < i; i--) {
        	for (int t = 9; -1 < t; t--) {
    			if(d[t]<1)break;
    			if(n-d[t]%10>=0 && dig[n]-1==dig[n-d[t]%10]) {
    				out.print(d[t]/10);
    				n-=d[t]%10;
    				break;
    			}
    		}        	
		}

        out.println();
        out.flush();
    }
    
    static int getd(int n, int d[], int m[]) {
    	if(m[n]!=0)return m[n];
    	if(n==0)return 0;
    	int r=-1;
    	for (int i = 4; i < d.length; i++) {
			if(d[i]>0 && n-d[i]%10>=0) {
				r = max(r, 1+getd(n-d[i]%10,d,m));
			}
		}
    	return m[n]=r;
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
//    int a,b;
//    P(int a, int b) {
//        this.a=a;
//        this.b=b;
//    }
//    public int compareTo(P p){
//        return b-p.b; //des
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
