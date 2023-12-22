import java.util.Scanner;

public class Main {

    String s;

    public void solve() {
        Scanner sc = new Scanner(System.in);
        s = sc.next();

        String x = s.substring(0, 2);
        String y = s.substring(2, 4);


        // case-1. month is correct in both cases
        int mm1 = Integer.parseInt(x);
        int mm2 = Integer.parseInt(y);

        if (isMonthCorrect(mm1) && isMonthCorrect(mm2)) {
            System.out.println("AMBIGUOUS");
            return;
        }

        if (!isMonthCorrect(mm1) && isMonthCorrect(mm2)) {
            System.out.println("YYMM");
            return;
        }

        if (isMonthCorrect(mm1) && !isMonthCorrect(mm2)) {
            System.out.println("MMYY");
            return;
        }

        System.out.println("NA");


    }

    boolean isYearCorrect(int year) {
        return false;
    }

    boolean isMonthCorrect(int month) {
        return month >= 1 && month <= 12;
    }

    public static void main(String[] args) {
        new Main().solve();

    }
}
