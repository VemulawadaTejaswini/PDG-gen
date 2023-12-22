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
            long gcd = getGcd(a, b);
            HashSet<Integer> primeFactor = new HashSet<>();
            for (int i = 3; i <= gcd; i += 2) {
                if (gcd % i == 0) {
                    primeFactor.add(i);
                    while(gcd % i == 0) {
                        gcd /= i;
                    }
                    i = i + 2;
                }
            }

            System.out.println(primeFactor.size() + (gcd % 2 == 0 ? 2 : 1));
        }
    }

    // 最大公約数を返す
    public static long getGcd(long a, long b) {
        long temp;
        while ((temp = a % b) != 0) {
            a = b;
            b = temp;
        }
        return b;
    }
}
