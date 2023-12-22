import java.io.IOException;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in))) {
            final String s = reader.readLine();

            int N = Integer.parseInt(s);

            System.out.println(getLucas(N));
        }
    }

    static long getLucas(int N) {
        long[] L = new long[N + 1];

        L[0] = 2;
        L[1] = 1;

        if (N == 0) return L[0];
        if (N == 1) return L[1];

        for (int i = 2; i < N + 1; i++)
        {
            L[i] = L[i - 2] + L[i - 1];
        }
        return L[N];
    }
}
