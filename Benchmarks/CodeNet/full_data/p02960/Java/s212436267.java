import java.io.PrintStream;
import java.util.*;
import java.util.regex.Pattern;

class Main {
    public static void main(String[] args) throws java.lang.Exception {
        final int MOD = 1000000007;
        Scanner sc = new Scanner(System.in);
        PrintStream out = System.out;
        String s = sc.next();
        sc.close();
        int min = Integer.valueOf(s.replaceAll("\\?", "0"));
        int max = Integer.valueOf(s.replaceAll("\\?", "9"));
        int[] a = diffArray(min, max);
        int count = 0;
        for (int i : a) {
            String pattern = s.replaceAll("\\?", "[0-9]");
            Pattern p = Pattern.compile(pattern);
            if (p.matcher(zeroPad(String.valueOf(i), s.length())).find()) {
                count = (count + 1) % MOD;
            }
        }
        out.println(count);
        out.close();
    }

    private static int[] diffArray(int min, int max) {
        int start = min / 13;
        start = start * 13 + 5 > min ? start : start + 1;
        int end = max / 13;
        end = end * 13 + 5 > max ? end - 1 : end;
        int length = end - start + 1;
        int[] ret = new int[length];
        for (int i = 0; i < length; i++) {
            ret[i] = (start + i) * 13 + 5;
        }
        return ret;
    }

    private static String zeroPad(String str, int length) {
        while (str.length() < length) {
            str = "0" + str;
        }
        return str;
    }
}
