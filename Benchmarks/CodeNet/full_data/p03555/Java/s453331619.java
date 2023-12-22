import java.io.IOException;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in))) {
            final String c1 = reader.readLine();
            final String c2 = reader.readLine();

            System.out.println(
                c1.charAt(0) == c2.charAt(2)
                    && c1.charAt(1) == c2.charAt(1)
                        && c1.charAt(2) == c2.charAt(0) ? "YES" : "NO");
        }
    }
}
