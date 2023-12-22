import javax.swing.*;
import java.io.*;
import java.util.*;
import java.math.*;

import static java.util.Comparator.*;


public class Main {
    static int findDiv(int n)
    {
        for(int i=3;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return Math.max(i,n/i);
            }
        }
        return 1;
    }
    public static void main(String[] args) throws IOException {
        FastReader s = new FastReader();
//        int t=s.nextInt();
////        StringBuilder ans=new StringBuilder();
//        while(t-->0) {
            int n=s.nextInt();
            StringBuilder ans=new StringBuilder();
            for(int i=1;i<=n;i++) {
                if (i % 15 == 0) {
                    ans.append("FizzBuzz");
                } else if (i % 5 == 0) {
                    ans.append("Buzz");
                } else if (i % 3 == 0) {
                    ans.append("Fizz");
                } else {
                    ans.append(i);
                }
                if(i<n)
                {
                    ans.append(",");
                }
            }
            System.out.println(ans.toString());

//        }
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
//3
//2 1 3
//3 3 6
//99995 9998900021 999890031