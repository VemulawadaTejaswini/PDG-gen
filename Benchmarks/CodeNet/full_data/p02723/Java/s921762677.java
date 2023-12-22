import java.io.IOException;
import java.io.InputStream;
import java.util.*;
class sol {
    /*static ArrayList<Integer> ar[];
    static boolean vis[];
    static void dfs(int s) {
        vis[s]=true;
        c++;
        for(int j=0;j<ar[s].size();j++) {
            if(vis[ar[s].get(j)]==false)
                dfs(ar[s].get(j));
        }
    }*/
    /*static int power(int a,int b,int p) {
        int res=1;
        a = a % p;  
        while (b > 0) { 
            if((b & 1)==1) 
                res = (res * a) % p;
            b = b >> 1;  
            a = (a * a) % p;  
        } 
        return res; 
    }
    static long gcd(long a,long b) {
        if(a==0)
            return b;
        return gcd(b%a,a);
    }*/
    public static void main(String args[])throws Exception {
        FastReader in = new FastReader(System.in);    
        int t = 1,i,j;
        StringBuilder sb = new StringBuilder();
        start:while(t-->0) {
            String s=in.next();
            if(s.charAt(2)==s.charAt(3) && s.charAt(4)==s.charAt(5))
                System.out.println("yes");
            else
                System.out.println("no");
            
        }
    }
}
class FastReader {
    byte[] buf = new byte[2048];
    int index, total;
    InputStream in;
    FastReader(InputStream is) {
        in = is;
    }
    int scan() throws IOException {
        if (index >= total) {
            index = 0;
            total = in.read(buf);
            if (total <= 0) {
                return -1;
            }
        }
        return buf[index++];
    }
    String next() throws IOException {
        int c;
        for (c = scan(); c <= 32; c = scan()) ;
        StringBuilder sb = new StringBuilder();
        for (; c > 32; c = scan()) {
            sb.append((char) c);
        }
        return sb.toString();
    }
    String nextLine() throws IOException {
        int c;
        for (c = scan(); c <= 32; c = scan()) ;
        StringBuilder sb = new StringBuilder();
        for (; c != 10 && c != 13; c = scan()) {
            sb.append((char) c);
        }
        return sb.toString();
    }
    char nextChar() throws IOException {
        int c;
        for (c = scan(); c <= 32; c = scan()) ;
        return (char) c;
    }
    int nextInt() throws IOException {
        int c, val = 0;
        for (c = scan(); c <= 32; c = scan()) ;
        boolean neg = c == '-';
        if (c == '-' || c == '+') {
            c = scan();
        }
        for (; c >= '0' && c <= '9'; c = scan()) {
            val = (val << 3) + (val << 1) + (c & 15);
        }
        return neg ? -val : val;
    }
    long nextLong() throws IOException {
        int c;
        long val = 0;
        for (c = scan(); c <= 32; c = scan()) ;
        boolean neg = c == '-';
        if (c == '-' || c == '+') {
            c = scan();
        }
        for (; c >= '0' && c <= '9'; c = scan()) {
            val = (val << 3) + (val << 1) + (c & 15);
        }
        return neg ? -val : val;
    }
}