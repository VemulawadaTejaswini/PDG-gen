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
    //HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
 
    public  static void main(String[] args)   throws Exception, IOException{
     
        
        Reader sc = new Reader(System.in);
        PrintWriter out=new PrintWriter(System.out);
     
        // int n=sc.nextInt();
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        long ans=0;
        for (int i=0;i<n ;i++ ) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        if(k==0){
            for (int i=0;i<n ;i++ )if(a[i]==0)ans+=b[i];
        }
        else {
            int bit=1,one=0;
            long ans2=0;
                for (int i=0;i<n ;i++ )if( (k|a[i])==k )ans+=b[i];

            while(true){
                ans2 = 0;
                if(bit*2>k)break;
                else bit*=2;
                one = bit - 1;
                if( k<(k|bit) )continue;
                // db(k,bit,one,ans,((k-bit) | one));
                for (int i=0;i<n ;i++ ) {
                    if( (((k-bit) | one) | a[i]) == ( (k-bit) | one) )ans2+=b[i];
                }
                    ans=max(ans,ans2);
            }
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