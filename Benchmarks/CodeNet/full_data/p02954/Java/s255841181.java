import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws Exception {
        try (BufferedInputStream in = new BufferedInputStream(System.in);
             PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out))) {

            Scanner sc = new Scanner(in);

            // 15:48-

            String s = sc.next();

            int[] res = new int[s.length()];

            doit(s, res, 1);

            s = reverse(s);

            int[] res1 = new int[s.length()];
            doit(s, res1, 0);
            rev(res1);

            for (int i = 0; i < res1.length; i++) res[i] += res1[i];

            String r = Arrays.stream(res).mapToObj(x -> x + "").collect(Collectors.joining(" "));
            out.println(r);
        }
    }

    private static void rev(int[] r) {
        for (int i = 0; i < r.length / 2; i++) {
            int t = r[i];
            r[i] = r[r.length - 1 - i];
            r[r.length - 1 - i] = t;
        }
    }

    private static void doit(String s, int[] res, int b) {
        int i = 0;
        while (i + 1 < s.length()) {
            int run = 1;
            while (s.charAt(++i) == 'R') run++;
            run--;
            res[i - 1] = b + run / 2;
            res[i] = b + (run + 1) / 2;
            while (i + 1 < s.length() && s.charAt(++i) == 'L');
        }
    }

    private static String reverse(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length / 2; i++) {
            char t = chars[i];
            chars[i] = chars[chars.length - i - 1];
            chars[chars.length - i - 1] = t;
        }

        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            chars[i] = c == 'L' ? 'R' : 'L';
        }

        return new String(chars);
    }

}
