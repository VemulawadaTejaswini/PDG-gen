import static java.lang.Integer.*;
import static java.lang.Integer.max;
import static java.lang.Long.*;
import static java.lang.System.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static void solve() throws Exception {
        int X = scanInt(), Y = scanInt(), A = scanInt(), B = scanInt(), C = scanInt();
        int ad[] = new int[A];
        int bd[] = new int[B];
        int cd[] = new int[C];

        for (int i = 0; i < A; i++) {
            ad[i] = scanInt();
        }
        for (int i = 0; i < B; i++) {
            bd[i] = scanInt();
        }

        for (int i = 0; i < C; i++) {
            cd[i] = scanInt();
        }
        Arrays.sort(ad);
        Arrays.sort(bd);
        Arrays.sort(cd);
        int[] ta = new int[X];
        int[] tb = new int[Y];
        System.arraycopy(ad, max(0, A - X), ta, 0 , X);
        System.arraycopy(bd, max(0, A - Y), tb, 0 , Y);

        for (int i = max(0, C - X - Y); i < cd.length; i++) {
            int j, k;
            for (j = 0; j < ta.length - 1 && cd[i] < ta[j]; j++) {
            }
            for (k = 0; k < tb.length - 1 && cd[i] < tb[k]; k++) {
            }

            if (cd[i] > ta[j] && ta[j] < bd[k]) {
                ta[j] = cd[i];
            }
            else if(cd[i] > tb[k] && ta[j] > bd[k]) {
                tb[k] = cd[i];
            }
        }
        int answer = 0;
        for (int i = 0; i < ta.length; i++) {
            answer += ta[i];
        }
        for (int i = 0; i < tb.length; i++) {
            answer += tb[i];
        }
        out.print(answer);
    }

    static int scanInt() throws IOException {
        return parseInt(scanString());
    }

    static long scanLong() throws IOException {
        return parseLong(scanString());
    }

    static String scanString() throws IOException {
        while (tok == null || !tok.hasMoreTokens()) {
            tok = new StringTokenizer(in.readLine());
        }
        return tok.nextToken();
    }

    static BufferedReader in;
    static PrintWriter out;
    static StringTokenizer tok;

    public static void main(String[] args) {
        try {
            in = new BufferedReader(new InputStreamReader(System.in));
            out = new PrintWriter(System.out);
            solve();
            in.close();
            out.close();
        }
        catch (Throwable e) {
            e.printStackTrace();
            exit(1);
        }
    }
}