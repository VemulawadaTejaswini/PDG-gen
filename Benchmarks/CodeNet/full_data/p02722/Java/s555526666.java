import javax.swing.*;
import java.io.*;
import java.util.*;
import java.math.*;

import static java.util.Comparator.*;


public class Main {
    public static void main(String[] args) throws IOException {
        FastReader s = new FastReader();
        long n=s.nextLong();

        int count=1;
        for(long i=2;i<n;i++)
        {
            if(n%i!=0)
            {
                if(n%i==1)
                    count++;
            }
            else
            {
                long val=n;
                while(val%i==0)
                {
                    val/=i;
                }
                if(val%i==1)
                {
                    count++;
                }
            }
        }
        System.out.println(count);
    }

}


class FastReader
{
    BufferedReader br;
    StringTokenizer st;

    public FastReader()
    {
        br = new BufferedReader(new
                InputStreamReader(System.in));
    }

    String next()
    {
        while (st == null || !st.hasMoreElements())
        {
            try
            {
                st = new StringTokenizer(br.readLine());
            }
            catch (IOException  e)
            {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }

    int nextInt()
    {
        return Integer.parseInt(next());
    }

    long nextLong()
    {
        return Long.parseLong(next());
    }

    double nextDouble()
    {
        return Double.parseDouble(next());
    }

    String nextLine()
    {
        String str = "";
        try
        {
            str = br.readLine();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return str;
    }
}