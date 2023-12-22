import java.util.*;
import java.io.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
 
public class Main{
//    static final long mod=1000000007;
    static int dx[]={-1,0,1,0};
    static int dy[]={0,-1,0,1};

    public  static void main(String[] args)   throws Exception, IOException{        
        Reader sc = new Reader(System.in);
        PrintWriter out=new PrintWriter(System.out);
        // int n=sc.nextInt();
        // char c[][] = new char[h][w];
        // char c[]=sc.nextString().toCharArray();
        // int d[]=new int[n];
        // for(int i=0; i<n; i++) {d[i]=sc.nextInt();}

        int h=sc.nextInt();
        int w=sc.nextInt();
        char c[][]=new char[h][w];
        
        for (int i = 0; i < c.length; i++) {
			c[i]=sc.nextString().toCharArray();
		}
        int m[][]=new int[h][w];
        int k=0;
        for (int i = 0; i < m.length; i++) {
			for (int t = 0; t < m[0].length; t++) {
				if(c[i][t]=='#' && m[i][t]==0) {
					rep(c,m,i,t,++k);
				}
			}
		}


        long ans=0;

        for (int i = 1; i <= k; i++) {
        	long pl=0,mi=0;
			for (int t = 0; t < h; t++) {
				for (int j = 0; j < w; j++) {
					if(m[t][j]==i)pl++;
					if(m[t][j]==-i)mi++;
				}
			}
			ans += pl*mi;
		}
        
        

        out.println(ans);
        out.flush();
    }
    
    static void rep(char c[][],int mark[][] ,int x, int y, int k) {
    	for (int i = 0; i < 4; i++) {
			int xx=x+dx[i],yy=y+dy[i];
			if(validpos(xx, yy, c.length, c[0].length) && mark[xx][yy]==0) {
				if(c[xx][yy]=='.' && c[x][y]=='#') {
					mark[xx][yy]=-k;
					rep(c,mark,xx,yy,k);
				}
				if(c[xx][yy]=='#' && c[x][y]=='.') {
					mark[xx][yy]=k;
					rep(c,mark,xx,yy,k);
				}
			}
		}
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
//    int id, d;
//    P(int  id, int d) {
//        this.id=id;
//        this.d=d;
//    }
//    public int compareTo(P p){
//        return d-p.d; //des
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
    public long nextLong() throws IOException
    {
        return Long.parseLong(nextString());
    }
    public double nextDouble() throws IOException
    {
        return Double.parseDouble(nextString());
    }
}
