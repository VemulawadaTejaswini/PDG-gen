import java.io.IOException;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.io.PrintWriter;

@SuppressWarnings("unchecked")
public class Main {

    static long N;
    static final String s753 = "753";

    static int dfs(String s) {
        long num = Long.parseLong(s);

        if (N < num) return 0;

        int ret = 1;

        for (int i = 0; i < s753.length(); i++) {
            boolean flg = false;

            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == s753.charAt(i)) {
                    flg = true;
                    break;
                }
            }

            if (!flg) ret = 0;
        }


        for (int i = 0; i < s753.length(); i++) {
            long tmp
                = 10 * num
                    + Long.parseLong(
                        String.valueOf(s753.charAt(i)));

            ret += dfs(String.valueOf(tmp));
        }

        return ret;
    }

    public static void main(String[] args) throws IOException {
        final String s;

        try (
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in))) {
            s = reader.readLine();
        }

        PrintWriter out = new PrintWriter(System.out);

        N = Long.parseLong(s);

        out.println(dfs("0"));

        out.flush();
    }
}
