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

//        int n = sc.nextInt();
        char c[]=sc.nextString().toCharArray();
        int n=c.length;
        int abc[][] = new int[3][n];
        int v=0;
        int ans=0;
        for (int i = 0; i < n; i++) {
			int r=getABC(c,i);
			if(r<0)break;
			abc[0][v]=r;
			int ret[]=abc(c,r);
			abc[1][v]=ret[0];
			abc[2][v]=ret[1];
			ans+=ret[0]+ret[1]+1;
			i=r+abc[2][v]*2+2;
			v++;
//			db(i,ret);
		}
        for (int i = 0; i+1 < v; i++) {
			if(abc[0][i]+3+2*abc[1][2] == abc[0][i+1]-abc[1][i+1])ans++;
		}
        
        out.println(ans+scABC(c));
        out.flush();
    }
    
    static int scABC(char c[]) {
    	int r=0;
    	for (int i = 0; i+2 < c.length; i++) {
    		int v=0;
			while(i+2<c.length && c[i]=='A'&&c[i+1]=='B'&&c[i+2]=='C') {
				v++;
				i+=3;
			}
			r+=(v-2)*(v-1)/2;
		}
    	return r;
    }
    
    static int getABC(char c[], int st) {
    	for (int i = st; i+2 < c.length; i++) {
			if(c[i]=='A'&&c[i+1]=='B'&&c[i+2]=='C')return i;
		}
    	return -1;
    }

    static int[] abc(char s[], int a) {
    	int r[]=new int[2];
    	for (int i = a+3; i+1 < s.length; i+=2) {
			if(s[i]=='B' && s[i+1]=='C')r[1]++;
			else break;
		}
    	for (int i = a-1; -1 < i; i--) {
			if(s[i]!='A')break;
			r[0]++;
		}
    	return r;
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
    int b,l,r;
    P(int b, int l, int r) {
        this.b=b;
        this.l=l;
        this.r=r;
    }

    public int compareTo(P p){
        return -(max(r,l)) + max(p.l,p.r);
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
