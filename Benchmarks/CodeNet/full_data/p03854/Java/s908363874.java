import java.io.IOException;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.io.PrintWriter;

import java.util.regex.Pattern;

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

        StringBuilder sb = new StringBuilder();
        sb.append(s);

        boolean flg = true;

        while (0 < sb.toString().length()) {
            int len = sb.length();

            if (Pattern.matches("^.*dream$", sb.toString()))
                sb.setLength(sb.length() - 5);

            if (Pattern.matches("^.*dreamer$", sb.toString()))
                sb.setLength(sb.length() - 7);

            if (Pattern.matches("^.*erase$", sb.toString()))
                sb.setLength(sb.length() - 5);

            if (Pattern.matches("^.*eraser$", sb.toString()))
                sb.setLength(sb.length() - 6);

            if (len == sb.length()) {
                flg = false;
                break;
            }
        }

        out.println(flg ? YES : NO);

        out.flush();
    }
}
