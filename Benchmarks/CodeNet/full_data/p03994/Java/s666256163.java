import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.*;
/**
 * Created by Aksenov239 on 24.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    BufferedReader br;
    StringTokenizer st;
    PrintWriter out;

    public String nextToken() throws IOException{
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine());
        }
        return st.nextToken();
    }

    public int nextInt() throws IOException{
        return Integer.parseInt(nextToken());
    }

    public void solve() throws IOException {
        char[] c = nextToken().toCharArray();
        int k = nextInt();
        int d = 'z' + 1;
        for (int i = 0; i < c.length; i++) {
            if (c[i] == 'a')
                continue;
            if (d - c[i] <= k) {
                k -= (d - c[i]);
                c[i] = 'a';
            }
        }
        if (k > 0) {
            c[c.length - 1] = (char)('a' + (c[c.length - 1] - 'a' + k) % 26);
        }
        out.println(new String(c));
    }

    public void run() {
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            out = new PrintWriter(System.out);

            solve();

            out.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
