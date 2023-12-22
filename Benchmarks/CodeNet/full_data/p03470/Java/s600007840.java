import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

class ABC {
    static class Reader {
        private BufferedReader br;
        private StringTokenizer token;
        protected Reader(InputStream obj)
        {
            br = new BufferedReader(new InputStreamReader(obj));
            token = null;
        }
        protected String next()
        {
            while (token == null || !token.hasMoreElements())
            {
                try
                {
                    token = new StringTokenizer(br.readLine());
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
            return token.nextToken();
        }
        protected long[] nextLongArr(int n)
        {
            long[] arr = new long[n];
            for(int i=0; i<n; i++){
                arr[i] = nextLong();
            }
            return arr;
        }
        protected int[] nextIntArr(int n)
        {
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = nextInt();
            }
            return arr;
        }
        protected Integer[] nextIntegerArray(int n)
        {
            Integer[] arr = new Integer[n];
            for(int i=0; i<n; i++){
                arr[i] = nextInt();
            }
            return arr;
        }
        protected Long[] nextLongArray(int n)
        {
            Long[] arr = new Long[n];
            for(int i=0; i<n; i++){
                arr[i] = nextLong();
            }
            return arr;
        }
        protected int[][] nextIntMap (int rows, int columns) {
            int[][] arr = new int[rows][columns];
            for (int i=0; i<rows; i++) {
                for (int j=0; j<columns; j++) {
                    arr[i][j] = nextInt();
                }
            }
            return arr;
        }
        protected long[][] nextLongMap (int rows, int columns) {
            long[][] arr = new long[rows][columns];
            for (int i=0; i<rows; i++) {
                for (int j=0; j<columns; j++) {
                    arr[i][j] = nextLong();
                }
            }
            return arr;
        }
        protected int nextInt() {return Integer.parseInt(next());}
        protected long nextLong() {return Long.parseLong(next());}
        protected double nextDouble() {return Double.parseDouble(next());}

        protected String nextLine()
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

    public static <T extends Comparable<T>> T max (T... vars) {
        T max = vars[0];
        for (T x: vars) {
            if (x.compareTo(max) > 0) max = x;
        }
        return max;
    }
    public static <T extends Comparable<T>> T min (T... vars) {
        T min = vars[0];
        for (T x: vars) {
            if (x.compareTo(min) < 0) min = x;
        }
        return min;
    }
    
    public static void main(String[] args) throws IOException {
        Reader in = new Reader(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        HashSet<Integer> hs = new HashSet<>();
        while (n-->0) {
            hs.add(in.nextInt());
        }
        out.printf("%d\n", hs.size());

        out.close();
    }
}