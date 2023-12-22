import java.util.*;
import java.io.*;
import java.math.*;
 
 
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
 
public class Main{
    static final long mod=1000000007;
    
    public  static void main(String[] args)   throws Exception, IOException{
        Reader sc = new Reader(System.in);
        PrintWriter out=new PrintWriter(System.out);
        // int n=sc.nextInt();
        // char c[][] = new char[h][w];
        // char c[]=sc.nextString().toCharArray();
        // for(int i=0; i<n; i++) {d[i]=sc.nextInt();}
        int n=sc.nextInt();

        int a[] = new int[n];
        int b[] = new int[n];
        
        for(int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++) {
            b[i] = sc.nextInt();
        }
   
        int c[] = new int[n];
        int ans=0;
        for(int i=0; i<29; i++) {

            int md = (1<<(i+1));
            for(int t=0; t<n; t++) {
                c[t] = b[t]%md;
            }

            sort(c);
            int bit=0;

            for(int t=0; t<n; t++){ 
                long l = -a[t]%md + (1<<i), r = -a[t]%md + (1<<(i+1));

                l=lower_bound(c,l);
                r=lower_bound(c,r) - 1;
                if(r<0)r=n-1;
                if(0<=l)bit^=(r-l+1)%2;

                l = -a[t]%md + (3<<(i)); r = -a[t]%md + (1L<<(i+2));
                l=lower_bound(c,l);
                r=lower_bound(c,r) - 1;

                if(r<0)r=n-1;
                if(0<=l)bit^=(r-l+1)%2;
            }
            ans^=bit<<i;
        }

        out.println(ans);
        out.flush();
    }

    static int lower_bound(int v[], long find) {
        int right, left;
        int res = -1;
        left = 0; right = v.length;
        for(int i=0; i<40; i++) {
            int middle = (left + right) / 2;
     
            if(find <= v[middle]) {
                res = middle;
                right = middle;
            }
            else {
                left = middle;
            }
        }
        return res;
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

class P implements Comparable<P>{
        int id, d;
        P(int  id, int d) {
            this.id=id;
            this.d=d;
        } 
          
        public int compareTo(P p){
            return d-p.d; //descend
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