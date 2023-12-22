import java.util.*;
import java.io.*;
import java.lang.reflect.Array;
import java.math.BigInteger;

import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
 
public class Main{
    static long mod=1000000007;
    static int dx[]={-1,0,1,0};
    static int dy[]={0,-1,0,1};

    public  static void main(String[] args)   throws Exception, IOException{        
        Reader sc = new Reader(System.in);
        PrintWriter out=new PrintWriter(System.out);

//        int n = sc.nextInt();
        int h = sc.nextInt();
        int w = sc.nextInt();
        char c[][]=new char[h][];
        for (int i = 0; i < h; i++) {
			c[i]=sc.nextString().toCharArray();
		}
        
        LinkedList<Integer> q = new LinkedList<>();
        int d[][]=new int[h][w];
        
        for (int i = 0; i < c.length; i++) {
			for (int t = 0; t < c[0].length; t++) {
				if(c[i][t]=='#') {d[i][t]=1; q.add(i*10000+t);}
			}
		}
        
        int ans=1;
        while(!q.isEmpty()) {
        	int p=q.poll();
        	int x=p/10000, y=p%10000;
        	for (int i = 0; i < 4; i++) {
				int xx=x+dx[i];
				int yy=y+dy[i];
				if(xx<0||yy<0||h==xx||w==yy|| d[xx][yy]!=0)continue;
				d[xx][yy]=d[x][y]+1;
				ans=max(d[xx][yy],ans);
				q.add(xx*10000+yy);
			}
        }

        out.println(ans-1);
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
//    int id,T;
//    P(int id, int T) {
//        this.id=id;
//        this.T=T;
//    }
//    public int compareTo(P p){
//        return id-p.id; //des
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
