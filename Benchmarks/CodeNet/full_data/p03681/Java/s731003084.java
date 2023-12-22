public class Main {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        long n = scanner.nextInt(), m = scanner.nextInt(), n1 = 1, m1 = 1;
        for (long i = 2; i <= n; i++)
            n1 = i * n1 % 1000000007;
        for (long i = 2; i <= m; i++)
            m1 = i * m1 % 1000000007;
        if (n == m) System.out.println(n1 * m1 % 1000000007L * 2L % 1000000007L);
        else System.out.println(n1 * m1 % 1000000007L);
    }
}