import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            String S = in.next();
            int l = Integer.parseInt(S.substring(0, 2));
            int r = Integer.parseInt(S.substring(2, 4));
            if (canMonth(l)) {
                if (canMonth(r)) {
                    System.out.println("AMBIGUOUS");
                } else {
                    System.out.println("MMYY");
                }
            } else {
                if (canMonth(r)) {
                    System.out.println("YYMM");
                } else {
                    System.out.println("NA");
                }
            }
        }
    }

    private static boolean canMonth(int n) {
        return n >= 1 && n <= 12;
    }
}
