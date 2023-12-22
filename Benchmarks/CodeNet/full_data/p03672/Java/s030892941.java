import java.io.IOException;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in))) {
            StringBuilder S = new StringBuilder(reader.readLine());

            do {
                S.setLength(S.length() - 2);

                boolean flg = true;

                int half = S.length() / 2;

                for (int i = 0; i < half; i++)
                    if (S.charAt(i) != S.charAt(half + i)) flg = false;

                if (flg) break;

            } while (2 < S.length());

            System.out.println(S.length());
        }
    }
}
