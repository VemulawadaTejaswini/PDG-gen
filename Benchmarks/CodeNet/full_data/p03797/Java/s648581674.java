import java.io.IOException;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.io.PrintWriter;

@SuppressWarnings("unchecked")
public class Main {
    public static void main(String[] args) throws IOException {
        final String s;

        try (
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in))) {
            s = reader.readLine();
        }

        PrintWriter out = new PrintWriter(System.out);

        final String[] sl = s.split(" ");
        long N = Long.parseLong(sl[0]);
        long M = Long.parseLong(sl[1]);

        long N2 = 2L * N;
        long tmps = N2 < M ? N : M / 2;
        long tmpm = M - tmps * 2;

        out.println(tmps + tmpm / 4);

        out.flush();
    }
}
