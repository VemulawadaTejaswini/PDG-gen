import java.io.*;
import java.util.*;

public class Main {

    public static void main(String args[]) {
        FastReader sc = new FastReader();
        PrintWriter pw = new PrintWriter(System.out);
        String a, b;
        a = sc.next();
        b = sc.next();
        int ans = func(a, b);
        if (ans > 0) {
            pw.println("GREATER");
        }
        else if (ans == 0) {
            pw.println("EQUAL");
        }
        else
            pw.println("LESS");
        pw.close();
    }

    private static int func(String a, String b) {
        if (a.length() != b.length()) {
            if (a.length() > b.length()) return 1;
            else return -1;
        }
        else {
            for (int i = 0; i < a.length(); i++) {
                int first = a.charAt(i) - '0';
                int second = b.charAt(i) - '0';
                if (first > second) {
                    return 1;
                }
                if (first < second) {
                    return -1;
                }
            }
        }
        return 0;
    }


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
}