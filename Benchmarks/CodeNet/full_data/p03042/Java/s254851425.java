import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final String S = sc.next();

        final int upper = Integer.valueOf(S.substring(0, 2));
        final int lower = Integer.valueOf(S.substring(2, 4));

        if (1 <= upper && upper <= 12 && 1 <= lower && lower <= 12) {
            System.out.println("AMBIGUOUS");
        } else if (1 <= upper && upper <= 12) {
            System.out.println("MMYY");
        } else if (1 <= lower && lower <= 12) {
            System.out.println("YYMM");
        } else {
            System.out.println("NA");
        }
    }
}
