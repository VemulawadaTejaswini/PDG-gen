import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long H = sc.nextLong();

        int attackTimesForOne = 0;

        for (int n = 0;; n++) {
            if (Math.pow(2, n) > H) {
                attackTimesForOne = n;
                break;
            }
        }

        System.out.println((long) Math.pow(2, attackTimesForOne) - 1);
    }

}
