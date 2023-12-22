import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.util.*;
public class Main
{

    public static void main(String[] args)throws IOException
    {
    FastReader in=new FastReader(System.in);
    StringBuffer st=new StringBuffer();
        
    int n=in.nextInt();
    int  xs[][]=new int[1000][1000];
    int  ys[]=new int[1000];
    boolean fs[]=new boolean[1000];
    for (int i = 0; i < n; ++i)
    {
        for (int j = 0; j < n - 1; ++j)
        {
            int x=in.nextInt();
            xs[i][j] = x - 1;
        }
    }
 
    int r = (int)(n * (n - 1) / 2);
    int c = 0;
 
    while (0 < r)
    {
        int fn = 0;
 
        for (int i = 0; i < n; ++i)
        {
            if (ys[i] < n - 1)
            {
                int x = xs[i][ys[i]];
                fs[i] = (xs[x][ys[x]] == i);
            }
        }
 
        for (int i = 0; i < n; ++i)
        {
            if (fs[i] == true)
            {
                ++fn;
                ys[i] += 1;
            }
 
            fs[i] = false;
        }
 
        if (fn == 0)
        {
            c = -1;
            break;
        }
        else
        {
            r -= fn / 2;
            c += 1;
        }
    }
 
          
        System.out.println(c);
    }
    static class FastReader{
 
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
}      