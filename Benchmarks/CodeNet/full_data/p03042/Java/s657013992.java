import java.util.Scanner;

// B - YYMM or MMYY
// https://atcoder.jp/contests/abc126/tasks/abc126_b
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        scanner.close();

        boolean isYYMM = isYYMM(S);
        boolean isMMYY = isMMYY(S);
        if (isYYMM && isMMYY) {
            System.out.println("AMBIGUOUS");
        } else if (isYYMM) {
            System.out.println("YYMM");
        } else if (isMMYY) {
            System.out.println("MMYY");
        } else {
            System.out.println("NA");
        }
    }

    private static boolean isYYMM(String s) {
        int month = Integer.parseInt(s.substring(2, 4));
        return month >= 1 && month <= 12;
    }

    private static boolean isMMYY(String s) {
        int month = Integer.parseInt(s.substring(0, 2));
        return month >= 1 && month <= 12;
    }
}
