import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();

        if (a == 1 || b == 1) {
            System.out.println(1);

        } else {
            List<Long> primeFactor = new ArrayList<>();
            long target = gcd(a, b);
            for (int i = 2; i < target; i++) {
                if (target % i == 0 && !primeFactor.contains(i)) {
                    primeFactor.add((long)i);
                    target /= i;
                    i = 2;
                }
            }
            int x = 1;
            if (!primeFactor.contains(target)) {
                x++;
            }

            System.out.println(primeFactor.size() + x);
        }
    }

    // 最大公約数を返す
    public static long gcd(long a, long b) {
        long temp;
        while ((temp = a % b) != 0) {
            a = b;
            b = temp;
        }
        return b;
    }
}
