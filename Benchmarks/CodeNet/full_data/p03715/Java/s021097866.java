import java.util.*;
import java.io.*;
import java.math.*;


import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;


public class Main{ 


    static long mod=1000000007;
     // static int dx[]={1,-1,0,0};
     //  static int dy[]={0,0,1,-1};
    // static int dx[]={1,-1,0,0,1,1,-1,-1};
    // static int dy[]={0,0,1,-1,1,-1,1,-1}; 

public  static void main(String[] args)   throws Exception, IOException{

    
    Reader sc = new Reader(System.in);
    PrintWriter out=new PrintWriter(System.out);

    //  int n=sc.nextInt();  
    // int n=sc.nextInt(), m=sc.nextInt();  
    // int h=sc.nextInt();  
    long h=sc.nextLong();
    long w=sc.nextLong();
    long ans=1L<<61;

    if(h%3==0 || w%3==0){
        ans=0;
    }
    else{
        long x=h/2,y=h/2;
        if(h%2==1)x++;
        if(h>1)for( int i=1; i<w; i++ ){
            long d[]={ i*h ,(w-i)*x,(w-i)*y};
            sort(d);
            ans=min(ans, d[2]-d[0]);
            d[0] = i*h;
            d[1] = (w-i)/2 * h;
            d[2] = (w-i)/2 * h;
            if((w-i)%2==1)d[1] = (1 + (w-i)/2 )* h; 
            sort(d);
            ans=min(ans, d[2]-d[0]);
               
        }

        x=w/2; y=w/2;
        if(w>1)if(w%2==1)x++;
        for( int i=1; i<h; i++ ){
            long d[]={ i*w ,(h-i)*x,(h-i)*y};
            sort(d);
            ans=min(ans, d[2]-d[0]);
            d[0] = i*w;
            d[1] = (h-i)/2 * w;
            d[2] = (h-i)/2 * w;
            if((h-i)%2==1)d[1] = (1 + (h-i)/2) * w;
            sort(d);
            ans=min(ans, d[2]-d[0]);
        }
    }


    out.println(ans);
    out.flush();
}

static void rep(int x, long d){

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
        return x - p.x;
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

