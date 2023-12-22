import java.io.IOException;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.io.PrintWriter;

@SuppressWarnings("unchecked")
public class Main {
    static final int INF = 1000000007;
    static int[] FCT;

    public static void main(String[] args) throws IOException {
        final String s;

        try (
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in))) {
            s = reader.readLine();
        }

        PrintWriter out = new PrintWriter(System.out);

        final String[] sl = s.split(" ");
        int N = Integer.parseInt(sl[0]);
        int M = Integer.parseInt(sl[1]);

        if (M < N) {
            int tmp = M;
            M = N;
            N = tmp;
        }

        if (1 < M - N) {
            out.println(0);
            out.flush();
            return;
        }

        factorial(M);

        int ans = modmulti(FCT[N], FCT[M]);

        if (N != M) out.println(ans);
        else out.println(modmulti(2, ans));

        out.flush();
    }

    static void factorial(int x)
    {
        FCT = new int[x + 1];
        FCT[0] = 1;
        FCT[1] = 1;
        for (int i = 2; i <= x; i++)
        {
            FCT[i] = modmulti(FCT[i - 1], i);
        }
    }

    // aとbを掛けた値をmodする(a * b mod p)
    static int modmulti(int a, int b)
    {
        int res = 0;
        int mod = a % INF;
        while (b > 0)
        {
            if ((b & 1) == 1)
            {
                res += mod;
                if (res > INF)
                {
                    res -= INF;
                }
            }
            mod <<= 1;
            if (mod > INF)
            {
                mod -= INF;
            }
            b >>= 1;
        }
        return res;
    }
}
