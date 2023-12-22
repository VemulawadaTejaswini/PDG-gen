import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)
    {
        Reader r=new Reader();
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        int N=r.nextInt();
        String str=r.next();
        solve(str, out);
        out.close();


    }
    static void solve(String str, PrintWriter out)
    {
        int numBlack=0;
        int numWhite=0;
        for(int i=0; i<str.length(); i++)
        {
            if(str.charAt(i)=='#')
            {
                numBlack++;
            }
            else {
                numWhite++;
            }
        }
        if(numBlack>=numWhite)
        {

                out.println(numWhite);

        }
        else if(numBlack<numWhite)
        {
            if(str.charAt(str.length()-1)=='#')
            {
                out.println(numBlack-1);
            }
            else
            {
            out.println(numBlack);
            }
        }
    }
    static boolean hasWhite(String str)
    {
        for(int i=0; i<str.length(); i++)
        {
            if(str.charAt(i)=='#' && str.charAt(i+1)=='w')
            {
                return true;
            }
        }

        return false;
    }

    //Fast I/O class
    static class Reader
    {
        BufferedReader br;
        StringTokenizer st;

        public Reader() {
            br = new BufferedReader(new InputStreamReader(System.in));
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

        String nextLine(){
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }


}
