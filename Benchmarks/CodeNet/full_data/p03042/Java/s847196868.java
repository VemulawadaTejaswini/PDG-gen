import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            // main
        Scanner sc = new Scanner(System.in);
        String S = getLine(sc);

        show(calc(S));
    }

    private static String calc(String S) {
        int front = Integer.parseInt(S.substring(0, 2));
        int back = Integer.parseInt(S.substring(2, 4));

        if (isMonth(front)) {
            if (isMonth(back)) return "AMBIGUOUS";
            else return "MMYY";
        } else {
            if (isMonth(back)) return "YYMM";
            else return "NA";
        }
    }

    private static boolean isMonth(int n) {
        return 0 < n && n < 13;
    }

    private static String getLine(Scanner sc) { return sc.next(); }
    private static void show(String answer) {
        System.out.println(answer);
    }
}
