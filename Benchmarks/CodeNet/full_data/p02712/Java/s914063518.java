import java.io.*;
import java.util.*;
import java.lang.*;

class Main {
    static class FastReader
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
                    catch (IOException e)
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
    public static void main(String[] args) {
        FastReader ob = new FastReader();
        int t = ob.nextInt();
        long ans=0;
        int num=3;
        for (int i = 1; i <=t ;i++ ) {
            if(i%3!=0 && i%5!=0){
                ans+=i;
            }
        }
        System.out.println(ans);
    }
}