import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args)throws Exception {
        InputReader in = new InputReader (System.in);
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        // Code starts from here //
        long start = in.nextLong();
        long end = in.nextLong();
        long x = in.nextLong();
        long ans = countDivisors(start, end, x);
        if(start % x == 0) pw.println((ans + 1));
        else pw.println(ans);
        pw.close();
    }
    
    static long countDivisors(long a, long b, long x) {
        return (b / x) - (a / x);
    }
    





    /****************************************
     ******* IO STUFF STARTS FROM HERE ******
     ****************************************/

    static void debug(Object...obj) {
        System.err.println(Arrays.deepToString
                (obj));
    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new
                    InputStreamReader(stream));
            tokenizer = null;
        }

        //InputReader in = new InputReader(new FileReader("File_Name"));
        public InputReader(FileReader file) {
            reader = new BufferedReader(file);
            tokenizer = null;
        }

        public String next() {

            try {
                while (tokenizer == null || !
                        tokenizer.hasMoreTokens())
                    tokenizer = new StringTokenizer
                            (reader.readLine());
            } catch (IOException e) {
                return null;
            }
            return tokenizer.nextToken();
        }

        public String nextLine() {
            String line = null;
            try {
                tokenizer = null;
                line =  reader.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            return line;
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public boolean hasNext(){
            try {
                while (tokenizer == null || !
                        tokenizer.hasMoreTokens())
                    tokenizer = new StringTokenizer
                            (reader.readLine());
            }
            catch (Exception e) {
                return false;
            }
            return true;
        }
    }
}