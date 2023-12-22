import java.util.*;
import java.io.*;
public class Main {
    static InputStreamReader r;
    public static void main(String[] args) throws Exception {
        r = new InputStreamReader(System.in);
        int N = nextInt();
        String S = nextString();

        int ans = 0;
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            if ('A' == S.charAt(i)) {
                cnt = 1;
            }
            else if (cnt == 1 && 'B' == S.charAt(i)) {
                cnt = 2;
            }
            else if (cnt == 2 && 'C' == S.charAt(i)) {
                ans++;
                cnt = 0;
            }
            else {
                cnt = 0;
            }
        }
        System.out.println(ans);
    }

    public static String nextString() throws Exception {
        String res = "";
        while (true) {
            int c = r.read();
            if (c == 32 || c == 10 || c == -1) {
                break;
            }
            res += (char)c;
        }
        return res;
    }

    public static int nextInt() throws Exception {
        return Integer.parseInt(nextString());
    }

    public static long nextLong() throws Exception {
        return Long.parseLong(nextString());
    }
}
