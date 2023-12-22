import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in), 1000000);

    StringTokenizer tok = new StringTokenizer("");

    String next() throws IOException {
        /*if (!tok.hasMoreTokens()) {
            tok = new StringTokenizer(in.readLine());
        }*/
        return tok.nextToken();
    }

    int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    long mod = (long) (1e9 + 7);

    void slave() throws IOException {
        tok = new StringTokenizer(in.readLine());
        int n = nextInt();
        int last[] = new int[200001];
        long col[] = new long[n + 1];
        col[0] = 1;
        for (int i = 1; i < n + 1; i++) {
            tok = new StringTokenizer(in.readLine());
            int c = nextInt();
            col[i] = col[i - 1];
            if (last[c] != 0 && last[c] != i - 1) {
                col[i] = (col[i] + col[last[c]]) % mod;
            }
            last[c] = i;
        }
        System.out.println(col[n]);
    }

    public static void main(String[] args) throws IOException {
        new Main().slave();
    }
}