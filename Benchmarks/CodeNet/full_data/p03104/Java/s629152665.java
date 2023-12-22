public class Main {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        long a = scanner.nextLong(), b = scanner.nextLong(), ans = 0;
        for (long i = 1; i <= Long.highestOneBit(b); i *= 2)
            ans += (f(b, i) - f(a - 1, i) & 1) * i;
        System.out.println(ans);
    }

    static long f(long x, long bit) {
        return x / (bit * 2) * bit + Math.max(0, (x % (bit * 2)) - bit + 1);
    }
}