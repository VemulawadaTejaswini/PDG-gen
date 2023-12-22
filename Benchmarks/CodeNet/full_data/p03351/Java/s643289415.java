import java.io.IOException;
import java.util.NoSuchElementException;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in))) {
            final String s = reader.readLine();

            final String sl[] = s.split(" ");
            int a = Integer.parseInt(sl[0]);
            int b = Integer.parseInt(sl[1]);
            int c = Integer.parseInt(sl[2]);
            int d = Integer.parseInt(sl[3]);

            System.out.println(
                (Math.abs(b - a) <= d && Math.abs(c - b) <= d)
                    || Math.abs(c - a) <= d  ? "Yes" : "No");
        }
    }
}
