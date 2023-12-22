import java.io.*;
import java.util.*;

public class Main
{
    static IO io = new IO(System.in);
    static int n, k;
    static long[] ar;
    static ArrayList<Long> beauties;

    public static void main(String[] args) throws Exception
    {
        int i, j;

        n = io.nextInt(); k = io.nextInt();
        ar = new long[n];
        for(i = 0; i < n; ++i)
            ar[i] = io.nextLong() + (i > 0 ? ar[i-1] : 0);

        beauties = new ArrayList<>();
        for(i = 0; i < n; ++i)
            for(j = i; j < n; ++j)
                beauties.add(get(i, j));
        //System.out.println(beauties);

        for(i = 62; i >= 0; --i)
            modify(i);

        long ans = Long.MAX_VALUE;
        if(beauties.size() < k)
            io.println(0);
        else
        {
            for (i = 0; i < k; ++i)
                ans &= beauties.get(i);
            io.println(ans);
        }

        //System.out.println(1l << 62);
        io.flush();
    }

    static long get(int l, int r)
    {
        long ret = ar[r];
        if(l > 0)
            ret -= ar[l-1];
        return ret;
    }

    static void modify(int bitPos)
    {
        ArrayList<Long> nextIns = new ArrayList<>();
        Iterator<Long> itr = beauties.iterator();

        while (itr.hasNext())
        {
            long ele = itr.next();
            if((ele & (1l << bitPos)) > 0)
                nextIns.add(ele);
        }

        if(nextIns.size() >= k)
            beauties = nextIns;
    }
}

class IO
{
    static byte[] buf = new byte[2048];
    static int index, total;
    static InputStream in;
    static StringBuilder sb = new StringBuilder();


    IO(InputStream is)
    {
        in = is;
    }

    int scan() throws Exception
    {
        if (index >= total)
        {
            index = 0;
            total = in.read(buf);
            if (total <= 0)
                return -1;
        }
        return buf[index++];
    }

    String next() throws Exception
    {
        int c;
        for (c = scan(); c <= 32; c = scan()) ;
        StringBuilder sb = new StringBuilder();
        for (; c > 32; c = scan())
            sb.append((char) c);
        return sb.toString();
    }

    int nextInt() throws Exception
    {
        int c, val = 0;
        for (c = scan(); c <= 32; c = scan()) ;
        boolean neg = c == '-';
        if (c == '-' || c == '+')
            c = scan();
        for (; c >= '0' && c <= '9'; c = scan())
            val = (val << 3) + (val << 1) + (c & 15);
        return neg ? -val : val;
    }

    long nextLong() throws Exception
    {
        int c;
        long val = 0;
        for (c = scan(); c <= 32; c = scan()) ;
        boolean neg = c == '-';
        if (c == '-' || c == '+')
            c = scan();
        for (; c >= '0' && c <= '9'; c = scan())
            val = (val << 3) + (val << 1) + (c & 15);
        return neg ? -val : val;
    }

    void print(Object a)
    {
        sb.append(a.toString());
    }

    void println(Object a)
    {
        sb.append(a.toString()).append("\n");
    }

    void println()
    {
        sb.append("\n");
    }

    void flush()
    {
        System.out.print(sb);
        sb = new StringBuilder();
    }
}