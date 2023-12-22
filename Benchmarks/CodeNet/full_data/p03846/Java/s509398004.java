import java.util.*;

public class Main {
    public static void main(String args[]) {
        final double fib = Math.pow(10, 9) + 7;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        double a = Math.pow(2, n / 2);

        int ini = n % 2 == 0 ? 1 : 0;
        int count = 0;
        for (int j = ini; j <= n; j += 2) {
            for (int k = 0; k < n; k++) {
                if (array[k] == j) {
                    count++;
                    if (count > 2 || (count == 2 && j == 0)) {
                        System.out.println(0);
                        return;
                    }
                }
            }
            if (count < 2 && j != 0) {
                System.out.println(0);
                return;
            }
          count = 0;
        }

        if (a > fib) {
            a = a % fib;
        }
        System.out.println((int) a);
    }
}