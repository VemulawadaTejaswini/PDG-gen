import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in), 32768);
    static PrintWriter out = new PrintWriter(System.out);
    static StringTokenizer t;

    static String sn() {
        while (t == null || !t.hasMoreTokens()) {
            try {
                t = new StringTokenizer(br.readLine());
            } catch (IOException e) {
                throw new RuntimeException();
            }
        }
        return t.nextToken();
    }

    static int ni() {
        return Integer.parseInt(sn());
    }

    static long nlo() {
        return Long.parseLong(sn());
    }

    public static void main(String args[]) {
        int t = 1;//ni();
        while (t-- > 0) {
            solve();
        }
        out.close();
    }

    static long mod = 998244353;

    static long pro(long a, long b) {
        return (a % mod * b % mod) % mod;
    }

    static long add(long a, long b) {
        return (a + b) % mod;
    }

    static long maxn = 200005;

    static void solve() {
        char a[] = sn().toCharArray();
        char b[] = sn().toCharArray();
        char c[] = sn().toCharArray();
        int n = a.length;
        int m = b.length;
        int k = c.length;
        Stack<Character> arr[] = new Stack[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = new Stack<>();
        }
        for (int i = n - 1; i >= 0; i--)
            arr[0].push(a[i]);
        for (int i = m - 1; i >= 0; i--)
            arr[1].push(b[i]);
        for (int i = k - 1; i >= 0; i--)
            arr[2].push(c[i]);
        int cur = 0;
        char ans[] = {'A', 'B', 'C'};
        while (!arr[0].isEmpty() || !arr[1].isEmpty() || !arr[2].isEmpty()) {
            if (arr[cur].isEmpty()) {
                out.println(ans[cur]);
                return;
            }
            char ch = arr[cur].pop();
            cur = (ch == 'a') ? 0 : ((ch == 'b') ? 1 : 2);
        }

    }
}