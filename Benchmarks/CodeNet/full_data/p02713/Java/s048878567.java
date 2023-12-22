import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer K = input.nextInt();
        long sum = 0;

        for (int a = 1; a <= K; a++) {
            for (int b = 1; b <= K; b++) {
                for (int c = 1; c <= K; c++) {
                    sum += gcd_triple(a, b, c);
                }
            }
        }
        System.out.println(sum);
    }

    private static int gcd_triple(int a, int b, int c) {
        return gcd(gcd(a, b), c);
    }

    private static int gcd(int n, int m) {
        int bigger = Integer.max(n,m);
        int smaller = Integer.min(n,m);
        int sur = bigger % smaller;

        if (sur == 0) {
            return smaller;
        } else {
            return gcd(smaller, sur);
        }

    }
}