import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        sc.close();

        System.out.println(isTuyoiKaibun(S) ? "Yes" : "No");
    }

    private static boolean isTuyoiKaibun(String s) {
        if (!isKaibun(s)) {
            return false;
        }

        String s2 = s.substring(0, (s.length() - 1) / 2);

        if (!isKaibun(s2)) {
            return false;
        }

        String s3 = s.substring((s.length() + 3 - 1) / 2);

        if (!isKaibun(s3)) {
            return false;
        }

        return true;

    }

    private static boolean isKaibun(String s) {
        String r = new StringBuilder(s).reverse().toString();
        return s.equals(r);
    }
}
