
import java.util.*;
import java.io.*;

class Main
{
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static void main(String[] args)
    {
        FastReader s = new FastReader();
        int val = s.nextInt();
        String line = val+"";
        char one =  line.charAt(0);
        char two  = line.charAt(1);

        int onecount =0 ;
        for (int i =0;i<line.length();i++)
        {
            if(one == line.charAt(i))
                onecount++;
            else
                break;
        }

        int twocount = 0;
        for (int i =0;i<line.length();i++)
        {
            if(two == line.charAt(i))
                twocount++;
            else
                break;
        }

         if (onecount >= 3 || twocount >=3)
             System.out.println("Yes");
        else
            System.out.println("No");


    }
}