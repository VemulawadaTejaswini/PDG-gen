import java.io.*;
import java.lang.*;
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
        int ca = 1;
        solver.solve(ca,in,out);
        out.close();
    }
    static class Solver
    {

        public void solve(int ca,InputReader in,PrintWriter out)
        {
            while(ca -- != 0)
            {
                int n = in.nextInt();
                int a[] = new int[n];
                int b[] = new int[n];
                int d[] = new int[n];
                for(int i = 0;i<n;i++) a[i] = in.nextInt();
                for(int i = 0;i<n;i++) b[i]= in.nextInt();
                long sum =  0;
                int ans = 0;
                for(int i =  0;i<n;i++)
                {
                    d[i] = a[i] - b[i];

                    if(b[i] > a[i])
                    {
                        ans++;
                        sum += b[i] - a[i];
                    }
                }
                Arrays.sort(d);
                for(int i =  n-1;i >= 0;i--)
                {
                    if(sum == 0) break;
                    if(sum < d[i])sum = 0;
                    else sum -= d[i];
                    ans++;
                }
                if(sum != 0) out.println(-1);
                else out.println(ans);

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