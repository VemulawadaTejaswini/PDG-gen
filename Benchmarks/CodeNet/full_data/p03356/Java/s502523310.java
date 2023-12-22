import java.util.*;
import java.io.*;
import java.math.*;
 
 
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
 
public class Main{ 
 
 
    static long mod=1000000007;
    static int dx[]={1,-1,0,0};
    static int dy[]={0,0,1,-1};
    // static int dx[]={1,-1,0,0,1,1,-1,-1};
    // static int dy[]={0,0,1,-1,1,-1,1,-1};
    // PriorityQueue<Integer> que = new PriorityQueue<Integer>(); 
    // HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
    // ArrayList<Integer> lis = new ArrayList<Integer>();
    // ArrayList<Integer> map[]=new ArrayList[26];
    // static HashMap<Integer,Long> map = new HashMap<Integer,Long>();

    public  static void main(String[] args)   throws Exception, IOException{
        Reader sc = new Reader(System.in);
        PrintWriter out=new PrintWriter(System.out);
        // int n=sc.nextInt();
        // long n=sc.nextLong();
        // char c[][] = new char[h][w];
        // long a[] = new long [n];
        // char c[]=sc.nextString().toCharArray();
        // for(int i=0; i<n; i++) {a[i]=sc.nextInt();}
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[] = new int[n];
        int d[] = new int[m];
        QuickUnionWeighted uf = new QuickUnionWeighted(n);
        for(int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }
        for(int i=0; i<m; i++) {
        int x = sc.nextInt()-1;
        int y = sc.nextInt()-1;
            uf.union(x,y);
        }
        int ans = 0;
        for(int i=0; i<n; i++) {
            if(uf.connected(a[i]-1, i))ans++;
        }
        

        out.println(ans);
        out.flush();
    }

    static void db(Object... os){
        System.err.println(Arrays.deepToString(os));
    }
     
    static boolean validpos(int x,int y,int r, int c){
        return x<r && 0<=x && y<c && 0<=y;
    }
     
    static boolean bit(long x,int k){
        // weather k-th bit (from right) be one or zero
        return  ( 0 < ( (x>>k) & 1 )  )  ? true:false;
    }    
}

class XY {
    int x,y,d;
    XY(int x, int y, int d) {
        this.x=x;
        this.y=y;
        this.d=d;
    } 
}
 
class P implements Comparable<P>{
    int x,y;
    P(int x, int y) {
        this.x=x;
        this.y=y;
    } 
      
    public int compareTo(P p){
        return -x + p.x;//des
    } 
}

  class QuickUnionWeighted {
     public int[] id;
     private int[] sz;
     public QuickUnionWeighted(int N)
     {
         id = new int[N];
         sz = new int[N];
         for (int i = 0; i < N; i++) {
             id[i] = i;
             sz[i] = 1;
         }
     }
     
     private int root(int p) {
         while (id[p] != p) p = id[p];
         return p;
     }
     
     public boolean connected(int id1, int id2) {
         return root(id1) == root(id2);
     }
     
     public void union(int p, int q) {
         int i = root(p);
         int j = root(q);
         if( i==j )return;
         if (sz[i] < sz[j]) { id[i] = j; sz[j] += sz[i];   }
         else               { id[j] = i; sz[i] += sz[j];   }  
     }
     public int sz(int x){
         return sz[ root(x) ];// weight
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
    public long nextLong() throws IOException
    {
        return Long.parseLong(nextString());
    }
    public double nextDouble() throws IOException
    {
        return Double.parseDouble(nextString());
    }
}