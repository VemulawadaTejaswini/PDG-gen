import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)
    {
        Reader r=new Reader();
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        int N=r.nextInt();
        int[] values=new int[N];
        int[] costs=new int[N];
        int[] diff=new int[N];
        for(int i=0; i<N; i++)
        {
            values[i]=r.nextInt();
        }
        for(int i=0; i<N; i++)
        {
            costs[i]=r.nextInt();
        }
        for(int i=0; i<N; i++)
        {
            diff[i]=values[i]-costs[i];
        }
        Arrays.sort(diff);
        solve(out, diff);
        out.close();


    }
    static void solve(PrintWriter out, int[] diff)
    {
        int max=0;
        for(int i=0; i<diff.length; i++) {
            if (diff[i] > 0) {
                max += diff[i];
            }
        }
        out.println(max);
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
