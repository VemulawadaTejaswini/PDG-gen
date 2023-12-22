import java.util.*;
import java.util.Map.Entry;
import java.io.*;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.rmi.server.UnicastRemoteObject;

import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
 
public class Main //implements Runnable
{
    static long mod=1000000007;
//    static int dx[]={-1,0,1,0};
//    static int dy[]={0,-1,0,1};


    public static void main(String[] args)   throws Exception, IOException{        
        Reader sc = new Reader(System.in);
        PrintWriter out=new PrintWriter(System.out);

//        int n=sc.nextInt();
        String s=sc.nextString();
        String t=sc.nextString();
        char c[]=s.toCharArray();
        char d[]=t.toCharArray();
//        int x[]=new int[26];
//        int y[]=new int[26];
//        
//        for (int i = 0; i < c.length; i++) {
//			x[c[i]-'a']++;
//		}
//        for (int i = 0; i < d.length; i++) {
//			y[d[i]-'a']++;
//		}
        int ans=0;
//        for (int i = 0; i < y.length; i++) {
//			if(y[i]>0 && x[i]==0) {
//				ans=-1;
//				break;
//			}
//		}
    	int ds[][]=new int[26][c.length];
    	int ta[]=new int[26];
    	int inf=1<<28;
    	fill(ta,inf);
    	for (int i = c.length-1; -1 < i; i--) {
    		ta[c[i]-'a']=i;
			for (int j = 0; j < 26; j++) {
				ds[j][i]=ta[j];
			}
		}
    	fill(ta,inf);
    	for (int i = 0; i < c.length; i++) {
    		ta[c[i]-'a']=i;
			for (int j = 0; j < 26; j++) {
				if(ds[j][i]==inf)ds[j][i]=ta[j];
			}				
		}
    	
    	for (int i = 0,p=0; i < d.length; i++) {
    		int x=d[i]-'a';
//    		db(i,x,p,ds[x][p],ans);
    		if(ds[x][p]==inf) {
    			ans=-1;
    			break;
    		}
    		if(p<=ds[x][p])ans+=ds[x][p]-p;
    		else ans+=c.length-(-ds[x][p]+p);
    		p=ds[x][p]+1;
    		p%=c.length;
    		ans++;
		}
//    	contest
//    	son
        
        out.println(ans);
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
//	int x, y;
//	P(int  x, int y) {
//	  this.x=x;
//	  this.y=y;
//	}
//}


//class P {
//    int id, d;
//    P(int  id, int d) {
//        this.id=id;
//        this.d=d;
//    }
//}

class P implements Comparable<P>{
    int a,b;
    P(int a, int b) {
    	this.b=b;
    	this.a=a;
    }

    public int compareTo(P p){
    	if(a==p.a) return b-p.b;
        return -p.a+a;
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
