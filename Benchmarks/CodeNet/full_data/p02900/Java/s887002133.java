import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();

        if (a == 1 || b == 1) {
            System.out.println(1);

        } else {
            int gcd = 2;
            for (int i = 2; i <= (a < b ? b : a); i++) {
                if (a % i == 0 && b % i == 0) {
                    gcd = i;
                }
            }

            HashSet<Integer> primeFactor = new HashSet<>();
            for (int i = 3; i <= gcd; i += 2) {
                if (gcd % i == 0) {
                    primeFactor.add(i);
                    gcd /= i;
                    i = 3;
                }
            }

            System.out.println(primeFactor.size() + (gcd % 2 == 0 ? 2 : 1));
        }
    }
}