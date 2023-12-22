import java.util.Scanner;

public class Main {

    private static long rec(int n, long x) {
        if (n == 0) {
            return 1;
        }
        long len = (long) Math.pow(2, n + 1) - 3;
        long num = (long) Math.pow(2, n) - 1;
        if (x == 1) {
            return 0;
        }
        if (x <= len + 1) {
            return rec(n - 1, x - 1);
        }
        if (x <= len + 2) {
            return num + 1;
        }
        if (x <= (len + 1) * 2) {
            return num + 1 + rec(n - 1, x - len - 2);
        }
        return num * 2 + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long x = sc.nextLong();
        System.out.println(rec(n, x));
    }
}

