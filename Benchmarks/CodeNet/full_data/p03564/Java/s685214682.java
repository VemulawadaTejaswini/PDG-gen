import java.io.IOException;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in))) {
            String s = reader.readLine();
            int N = Integer.parseInt(s);

            s = reader.readLine();
            int K = Integer.parseInt(s);

            int now = 1;
            for (int i = 0; i < N; i++) {
                if (now * 2 < now + K) now *= 2;
                else now += K;
            }
            System.out.println(now);
        }
    }
}
