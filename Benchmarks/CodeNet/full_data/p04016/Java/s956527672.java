

import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.next();
        String s = scanner.next();
        if (n.equals(s)) {
            System.out.println(Long.valueOf(n) + 1);
            return;
        }

        long copyN;
        long currentSum;
        long base = 1;
        for (int length = 1; length <= n.length() + 1; ++length) {
            base *= 10;
            copyN = Long.valueOf(n);
            if (base <= copyN) {
                currentSum = 0;
                while (copyN > 0) {
                    currentSum += copyN % base;
                    copyN /= base;
                }
              //  System.out.println("base: " + base + " currentSum: " + currentSum);
            } else {
                base = copyN;
                currentSum = 1;
            }
            if (currentSum == Long.valueOf(s)) {
                System.out.println(base);
                return;
            }
        }
        System.out.println(-1);
    }
}
