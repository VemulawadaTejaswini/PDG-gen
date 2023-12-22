import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main{
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
    public static void main(String[] args) throws IOException {
        FastReader in = new FastReader();
        String[] arr = new String[3];
        char[] ans = new char[3];
        for(int i = 0 ; i < 3 ; i++ ){
            arr[i] = in.next();
            ans[i] = arr[i].toUpperCase().toCharArray()[0];
        }
        String temp = new String(ans);
        System.out.println(temp);
    }
}

