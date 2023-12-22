import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    private static long n;

    // 15:41-
    public static void main(String[] args) throws Exception {
        try (BufferedInputStream in = new BufferedInputStream(System.in);
             PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out))) {

            Scanner sc = new Scanner(in);

            String s = sc.next();

            int i = 0;
            int ml = 0;
            while (i < s.length()) {
                while (i < s.length() && !b(s.charAt(i))) i++;
                int start = i;
                while (i < s.length() && b(s.charAt(i))) ml = Math.max(ml, ++i - start);
            }

            out.println(ml);
        }
    }

    private static boolean b(char c) {
        switch (c) {
            case 'A':
            case 'C':
            case 'G':
            case 'T':
                return true;
            default:
                return false;
        }
    }
}
