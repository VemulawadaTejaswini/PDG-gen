import java.io.IOException;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.io.PrintWriter;

import java.util.HashSet;

@SuppressWarnings("unchecked")
public class Main {
    static int f(int s) {
        int cnt = 0;
        HashSet<Integer> hs = new HashSet<>();

        cnt++;
        hs.add(s);

        boolean flg = true;

        while (flg) {
            int tmp;

            cnt++;

            if (s % 2 == 0) tmp = s / 2;
            else tmp = 3 * s + 1;

            if (hs.contains(tmp)) {
                flg = false;
            }

            hs.add(tmp);

            s = tmp;
        }

        return cnt;
    }

    public static void main(String[] args) throws IOException {
        final String S;

        try (
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in))) {
            S = reader.readLine();
        }

        PrintWriter out = new PrintWriter(System.out);

        int s = Integer.parseInt(S);

        out.println(f(s));

        out.flush();
    }
}
