import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Main
{
    public static void main(String[]args)
    {

        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);

        Solver solver = new Solver();
        solver.solve(1,in,out);
        out.close();
    }
    static class Solver
    {

        public int a[];

        public void solve(int ca,InputReader in,PrintWriter out)
        {
            while(ca -- != 0)
            {
                String str = in.next();
                int ans = 0;
                for(int i = 0;i<str.length();i++)
                {
                    if(str.charAt(i) == '2') ans++;
                }
                out.print(ans);
            }
        }
    }
    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }
        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }
        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }
        public BigInteger nextBigInteger()
        {
            return new BigInteger(next());
        }

    }
}
