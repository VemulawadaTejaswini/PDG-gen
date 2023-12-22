/**
 * TODO: delete this line
 */


import java.util.Scanner;

/**
 * TODO: Rename to Main
 */
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] as = new int[N];
        int maxA = 0;

        for (int i = 0; i < N; i++) {
            as[i] = scanner.nextInt();
            if (maxA < as[i]) {
                maxA = as[i];
            }
        }

        long lcm = 1;
        int sum = 0;
        for (int i = 0; i < as.length; i++) {
            int a = as[i];
            long temp = lcm(lcm, a);
            lcm = temp;
        }
        for (int a : as) {
            sum += (lcm - 1) % a;
        }
        System.out.println(sum);
    }

    private static long lcm(long m, long n) {
        return m * n / gcd(m, n);
    }

    private static long gcd(long m, long n) {
        if (m < n) return gcd(n, m);
        if (n == 0) return m;
        return gcd(n, m % n);
    }
}