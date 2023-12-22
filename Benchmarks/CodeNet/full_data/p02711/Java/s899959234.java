import java.io.*;
import java.util.*;

class forces {

    public static void main(String[] args) {
        FastReader rv = new FastReader();
        int n;
        n=rv.nextInt();
        int i;
        int p=0;
        for(i=n;i>0;i=i/10)
        {
            int d=i%10;
            if(d==7)
            {
                p=-1;
                break;
            }
        }
        if(p==-1)
            System.out.println("Yes");
        else
            System.out.println("No");

    }

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
}