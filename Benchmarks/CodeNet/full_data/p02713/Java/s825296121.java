import java.io.*;
import java.util.*;
import java.lang.*;


public class Main implements Runnable
{
    @Override
    public void run() {
        InputReader in = new InputReader(System.in);
        PrintWriter w = new PrintWriter(System.out);
        int N = in.nextInt();
        // int K = in.nextInt();
        // N == 4
        // K == 3
        // total 64 items. sum of gcd of all the seq
        // build the seq with gcd 1,2,3,4,5,6... and count the number
        // 1111
        // 1112
        // 1113
        // 1114
        // 1121
        // 1122
        // 1123
        // 1124
        // inv = getInvArray(N + 1, mod);
        w.println(getRes(N));

        w.flush();
        w.close();
    }

    static final int mod = (int) 1e9;

    static long[] inv;

    private static long getRes(int N) {
        long res = 0;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                for (int k = 1; k <= N; k++) {
                    res += gcd(i, gcd(j, k));
                }
            }
        }
        // calcuate the sum of gcd * fastExp
        // long[] f = new long[N];
        // i is the number of free choice number out of K..
        // the upper bound of having i multiples if K / i. lower bound is K / (i+1)
        // long choice = 1, temp = K, next = K;
        // while (next > 0) {
        //     next = K / (choice + 1);
        //     long sum = (next + 1 + temp) * (temp - next) / 2;
        //     System.out.println(choice + " " + sum);
        //     long exp = 1;
        //     for (int i = 0; i <= N - 1; i++) {
        //         f[i] = (f[i] + exp * sum % mod) % mod;
        //         exp = exp * (choice - 1) % mod;
        //     }
        //     temp = next;
        //     choice++;
        // }

        // for (int i = 0; i < N; i++) System.out.print(f[i] + " ");
        // System.out.println();

        // long combo = N, res = 0;
        // for (int i = 1; i <= N; i++) {
        //     res = (res + combo * f[N - i]) % mod;
        //     combo = (combo * (N - i)) % mod * inv[i + 1] % mod;
        // }

        // f[0] * combo(N, N);
        // f[1] * combo(N, N-1)

        // 1 pos 1: 3 *    1 * 1
        // 1 pos 2: 3 *    1
        // 1 pos 3: 1 *    1
        // 2 pos 1: 3 *    0
        // 2 pos 2: 2 *    0
        // 2 pos 3: 1 *    1

        // 1 pos 1: 3 *    2 * 2
        // 1 pos 2: 3 *    2
        // 1 pos 3: 1 *    1
        // 2 pos 1: 3 *    0
        // 2 pos 2: 3 *    0
        // 2 pos 3: 1 *    1
        // 3 pos 1: 3 *    0
        // 3 pos 2: 3 *    0
        // 3 pos 3: 3 *    1
        

        //1: K^0, K^1, K^2...K^(N-1)
        //2: (N/2)^1, (N/2)^2, (N/2)^3...
        //3: (N/3)^1, (N/3)^2, (N/3)^3...

        //... 
        //N/3: N/i == 3
        //...
        //N/2: N/i == 2
        //...
        //N-1: (N/(N-1))^1...   N/i == 1

        

            // build at least one posi is i, rest of number can be i or multiples of i.
            // first 1 pos to put i, rest of pos, each we have N / 2 choices.

            // we have 1 pos is i, 2 pos is i, 3 pos is i.... N-1
            // C(n,i) * fastExp(N/i - 1, N - i);

         

        return res;
    }

    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public  static long[] getInvArray(long n, int p){
        long[] inv = new long[(int)n + 1];
        inv[1] = 1;
        for (int i = 2; i <= n; i++) {
            inv[i] = ((p - p / i) * inv[p % i] % p + p) % p;
        }
        return inv;
    }

    static class InputReader
    {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private SpaceCharFilter filter;
        private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        public InputReader(InputStream stream)
        {
            this.stream = stream;
        }

        public int read()
        {
            if (numChars==-1)
                throw new InputMismatchException();

            if (curChar >= numChars)
            {
                curChar = 0;
                try
                {
                    numChars = stream.read(buf);
                }
                catch (IOException e)
                {
                    throw new InputMismatchException();
                }

                if(numChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }

        public String nextLine()
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
        public int nextInt()
        {
            int c = read();

            while(isSpaceChar(c))
                c = read();

            int sgn = 1;

            if (c == '-')
            {
                sgn = -1;
                c = read();
            }

            int res = 0;
            do
            {
                if(c<'0'||c>'9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            }
            while (!isSpaceChar(c));

            return res * sgn;
        }

        public long nextLong()
        {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            int sgn = 1;
            if (c == '-')
            {
                sgn = -1;
                c = read();
            }
            long res = 0;

            do
            {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            }
            while (!isSpaceChar(c));
            return res * sgn;
        }

        public double nextDouble()
        {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            int sgn = 1;
            if (c == '-')
            {
                sgn = -1;
                c = read();
            }
            double res = 0;
            while (!isSpaceChar(c) && c != '.')
            {
                if (c == 'e' || c == 'E')
                    return res * Math.pow(10, nextInt());
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            }
            if (c == '.')
            {
                c = read();
                double m = 1;
                while (!isSpaceChar(c))
                {
                    if (c == 'e' || c == 'E')
                        return res * Math.pow(10, nextInt());
                    if (c < '0' || c > '9')
                        throw new InputMismatchException();
                    m /= 10;
                    res += (c - '0') * m;
                    c = read();
                }
            }
            return res * sgn;
        }

        public String readString()
        {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            StringBuilder res = new StringBuilder();
            do
            {
                res.appendCodePoint(c);
                c = read();
            }
            while (!isSpaceChar(c));

            return res.toString();
        }

        public boolean isSpaceChar(int c)
        {
            if (filter != null)
                return filter.isSpaceChar(c);
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public String next()
        {
            return readString();
        }

        public interface SpaceCharFilter
        {
            public boolean isSpaceChar(int ch);
        }
    }

    public static void main(String args[]) throws Exception
    {
        new Thread(null, new Main(),"Main",1<<27).start();
    }

}
