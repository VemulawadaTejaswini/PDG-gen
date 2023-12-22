import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        int n = nextInt(), l = nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = nextInt();
        int q = -1;
        for (int i = 0; i < n - 1; i++) {
            if (a[i] + a[i + 1] >= l) q = i;
        }
        if (q == -1) out.println("Impossible"); else {
            out.println("Possible");
            for (int i = 0; i <= q - 1; i++) out.println(i + 1);
            for (int i = n - 2; i >= q; i--) out.println(i + 1);
        }
        out.close();
    }

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);
    static StringTokenizer st = null;

    static String nextToken() throws IOException
    {
        while (st == null || !st.hasMoreTokens()) st = new StringTokenizer(in.readLine());
        return st.nextToken();
    }

    static int nextInt() throws IOException
    {
        return Integer.parseInt(nextToken());
    }
}
