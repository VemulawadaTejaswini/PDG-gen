import java.io.IOException;

import java.io.BufferedReader;
import java.io.InputStreamReader;

@SuppressWarnings("unchecked")
public class Main {
    public static void main(String[] args) throws IOException {
        final String s;

        try (
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in))) {
            s = reader.readLine();
        }

        int N = Integer.parseInt(s);

        for (int i = N; i < 1000; i++) {
            String str = String.valueOf(i);
            if (str.charAt(0) == str.charAt(1)
                && str.charAt(1) == str.charAt(2)) {
                System.out.println(i);
                break;
            }
        }
    }
}
