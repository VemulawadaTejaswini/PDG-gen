import java.io.IOException;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.io.PrintWriter;

import java.util.Arrays;

@SuppressWarnings("unchecked")
public class Main {
    public static void main(String[] args) throws IOException {
        final int ALPHA = 26;

        BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));

        String s = reader.readLine();

        int n = Integer.parseInt(s);

        int[] min = new int[ALPHA];

        Arrays.fill(min, Integer.MAX_VALUE);

        for (int i = 0; i < n; i++) {
            s = reader.readLine();

            int[] cur = new int[ALPHA];

            Arrays.fill(cur, 0);

            for (int j = 0; j < s.length(); j++) cur[s.charAt(j) - 'a']++;

            for (int j = 0; j < ALPHA; j++) min[j] = Math.min(min[j], cur[j]);

        }

        PrintWriter out = new PrintWriter(System.out);

        for (int i = 0; i < ALPHA; i++) {
            int num = min[i];
            for (int j = 0; j < num; j++) out.print((char)('a' + i));
        }

        out.println();

        out.flush();
    }
}
