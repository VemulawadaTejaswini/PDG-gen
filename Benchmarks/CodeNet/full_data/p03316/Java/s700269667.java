import java.io.IOException;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in))) {
            final String s = reader.readLine();
            final int N = Integer.parseInt(s);

            int sn = 0;

            for (int i = 0; i < s.length(); i++) {
                sn += Character.getNumericValue(s.charAt(i));
            }

            System.out.println(N % sn == 0 ? "Yes" : "No");
        }
    }
}
