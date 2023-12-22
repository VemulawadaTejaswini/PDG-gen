import java.util.*;

public class Main {
    public static void main(String args[]) {
        final int fib = 1000000007;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        int[] check = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
            check[i] = 0;
        }
        long a = pow(2, n / 2);

        int ini = n % 2 == 0 ? 1 : 0;
        int count = 0;
        for (int x : array) {
            check[x]++;
            if (check[x] > 2 || (check[x] == 2 && x == 0)) {
                System.out.println(0);
                return;
            }
        }
        if (a > fib) {
            a = a % fib;
        }
        System.out.println(a);
    }

    private static long pow(int base, int n) {
        long ret = 1L;
        for (int i = 0; i < n; i++) {
            ret *= base;
        }
        return ret;
    }
}