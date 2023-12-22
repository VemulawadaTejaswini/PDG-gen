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

            int ans = 0;

            for (int i = 1; i <= N; i++) {
                int cnt = 0;
                for (int j = 1; j <= i; j++) {
                    if (i % 2 == 1 && i % j == 0) cnt++;
                }
                if (cnt == 8) ans++;
            }

            System.out.println(ans);
        }
    }
}
