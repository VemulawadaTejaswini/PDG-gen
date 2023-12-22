import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;
import java.util.StringTokenizer;

public class Main {
    public static void main (String[] args) {new Main();}

    Main() {
        FastScanner fs = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);

        int n = fs.nextInt();
        int[] a = fs.nextIntArray(2 * n);
        Arrays.sort(a);
        int res = 0;
        for(int i = 0; i < 2 * n; i += 2) {
            res += a[i];
        }
        out.println(res);

        out.close();
    }

    void sort (int[] a) {
        int n = a.length;
        for(int i = 0; i < 1000; i++) {
            Random r = new Random();
            int x = r.nextInt(n), y = r.nextInt(n);
            int temp = a[x];
            a[x] = a[y];
            a[y] = temp;
        }
        Arrays.sort(a);
    }

    class FastScanner {
        BufferedReader br;
        StringTokenizer st;
        public FastScanner() {
            try	{
                br = new BufferedReader(new InputStreamReader(System.in));
//                br = new BufferedReader(new FileReader("testdata.out"));
                st = new StringTokenizer("");
            } catch (Exception e){e.printStackTrace();}
        }
        public String next() {
            if (st.hasMoreTokens())	return st.nextToken();
            try {st = new StringTokenizer(br.readLine());}
            catch (Exception e) {e.printStackTrace();}
            return st.nextToken();
        }
        public int nextInt() {return Integer.parseInt(next());}
        public long nextLong() {return Long.parseLong(next());}
        public double nextDouble() {return Double.parseDouble(next());}

        public String nextLine() {
            String line = "";
            try {line = br.readLine();}
            catch (Exception e) {e.printStackTrace();}
            return line;
        }
        public Integer[] nextIntegerArray(int n) {
            Integer[] a = new Integer[n];
            for(int i = 0; i < n; i++) a[i] = nextInt();
            return a;
        }
        public int[] nextIntArray(int n) {
            int[] a = new int[n];
            for(int i = 0; i < n; i++) a[i] = nextInt();
            return a;
        }
        public char[] nextCharArray() {return nextLine().toCharArray();}
    }

}
