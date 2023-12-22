

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
        String line = s.nextLine();
        int a = Integer.parseInt(line.charAt(0)+"");
        int b = Integer.parseInt(line.charAt(1)+"");
        int c = Integer.parseInt(line.charAt(2)+"");
        int d = Integer.parseInt(line.charAt(3)+"");

        if(a+b+c+d == 7)
        {
            System.out.println(a+"+"+b+"+"+c+"+"+d+"=7");
        }
        else if(a-b+c+d == 7)
        {
            System.out.println(a+"-"+b+"+"+c+"+"+d+"=7");
        }
        else if (a+b-c+d == 7)
        {
            System.out.println(a+"+"+b+"-"+c+"+"+d+"=7");
        }
        else if (a-b-c+d == 7)
        {
            System.out.println(a+"-"+b+"-"+c+"+"+d+"=7");
        }
        else if (a+b+c-d == 7 )
        {
            System.out.println(a+"+"+b+"+"+c+"-"+d+"=7");
        }
        else if (a-b+c-d == 7)
        {
            System.out.println(a+"-"+b+"+"+c+"-"+d+"=7");
        }
        else if (a+b-c-d == 7)
        {
            System.out.println(a+"+"+b+"-"+c+"-"+d+"=7");
        }
        else
        {
            System.out.println(a+"-"+b+"-"+c+"-"+d+"=7");
        }


    }
}