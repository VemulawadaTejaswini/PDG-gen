import java.util.*;
import java.io.*;
class Main{
public static long gcd(long a,long b)
{
    if (a == 0) 
        return b; 
    return gcd(b % a, a); 
}
public static void main(String[] args)throws IOException {
    FastReader in=new FastReader(System.in);
    long n=in.nextInt();
    long m=in.nextInt();
    long x=m/n,s,max,z;
    if(m%n==0)
    System.out.println(x);
    else
    {
        long y=m-(n*x);
        max=gcd(x,y);
        for(long i=1;i*i<=x;i++)
        {
            s=gcd(x-i,y+x-i+i*n);
            if(s>max)
            max=s;
        }
        System.out.println(max);
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