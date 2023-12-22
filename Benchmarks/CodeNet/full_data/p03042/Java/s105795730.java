import java.util.*;
public class Main {
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        final String s = sc.next();
        final int si1 = Integer.parseInt(s.substring(0, 2));
        final int si2 = Integer.parseInt(s.substring(2, 4));
        Boolean isYyMm = (1 <= si2 && si2 <= 12);
        Boolean isMmYy = (1 <= si1 && si1 <= 12);
        if (isYyMm && isMmYy) {
            System.out.print("AMBIGUOUS");
        } else if (isYyMm) {
            System.out.print("YYMM");
        } else if (isMmYy) {
            System.out.print("MMYY");
        } else {
            System.out.print("NA");
        }
    }
}
