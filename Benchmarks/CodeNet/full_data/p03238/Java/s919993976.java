import java.util.*;
import java.io.*;
class Main{
public static int gcd(int a,int b)
{
    if (a == 0) 
        return b; 
    return gcd(b % a, a); 
}
public static void main(String[] args)throws IOException {
    FastReader in=new FastReader(System.in);
    int n=in.nextInt();
    int m=in.nextInt();
    int x=m/n;
    if(m%n==0)
    System.out.println(x);
    else
    {
        int y=m-(n*x);
        System.out.println(gcd(y,x));
        /*else
        System.out.println("1");*/
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
        for (c = scan(); c <= 32; c = scan());
        StringBuilder sb = new StringBuilder();
        for (; c > 32; c = scan()) {
            sb.append((char) c);
        }
        return sb.toString();
    }
    String nextLine() throws IOException {
        int c;
        for (c = scan(); c <= 32; c = scan());
        StringBuilder sb = new StringBuilder();
        for (; c !=10; c = scan()) {
            sb.append((char) c);
        }
        return sb.toString();
    }
    char nextChar() throws IOException{
        int c;
         for (c = scan(); c <= 32; c = scan());
         return (char)c;
        }
 
    int nextInt() throws IOException {
        int c, val = 0;
        for (c = scan(); c <= 32; c = scan());
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
        for (c = scan(); c <= 32; c = scan());
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