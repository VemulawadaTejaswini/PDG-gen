import java.util.*;

public class Main {
    static long mod = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int a = s / 100;
        int b = s % 100;

        if (a <= 12 && b <= 12 && a > 0 && b > 0) {
            System.out.println("AMBIGUOUS");
        } else if (b <= 12 && b > 0) {
            System.out.println("YYMM");
        } else if (a <= 12 && a > 0) {
            System.out.println("MMYY");
        } else {
            System.out.println("NA");
        }
    }
}
