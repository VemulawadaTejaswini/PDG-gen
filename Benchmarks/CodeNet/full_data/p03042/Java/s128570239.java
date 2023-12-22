import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();

        int fore = Integer.valueOf(s.substring(0, 2));
        int latt = Integer.valueOf(s.substring(2, 4));

        boolean isyymm = false;
        boolean ismmyy = false;

        if (fore >= 1 && fore <= 12) {
            ismmyy = true;
        }

        if (latt >= 1 && latt <= 12) {
            isyymm = true;
        }

        if (ismmyy && isyymm) {
            System.out.println("AMBIGUOUS");
        } else if (ismmyy) {
            System.out.println("MMYY");
        } else if (isyymm) {
            System.out.println("YYMM");
        } else {
            System.out.println("NA");
        }
    }
}
