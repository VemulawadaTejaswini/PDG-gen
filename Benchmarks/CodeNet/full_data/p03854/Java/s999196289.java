import java.io.IOException;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.io.PrintWriter;

@SuppressWarnings("unchecked")
public class Main {
    public static void main(String[] args) throws IOException {
        final String YES = "YES";
        final String NO = "NO";

        String s;

        try (
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in))) {
            s = reader.readLine();
        }

        PrintWriter out = new PrintWriter(System.out);

        boolean flg = true;
        while (0 < s.length()) {
            int len = s.length();

            s = s.replaceAll("dream$", "");
            s = s.replaceAll("dreamer$", "");
            s = s.replaceAll("erase$", "");
            s = s.replaceAll("eraser$", "");

            if (len == s.length()) {
                flg = false;
                break;
            }
        }

        out.println(flg ? YES : NO);

        out.flush();
    }
}
