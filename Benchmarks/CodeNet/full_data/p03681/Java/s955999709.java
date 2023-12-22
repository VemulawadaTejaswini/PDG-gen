public class Main {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt(), m = scanner.nextInt(), n1 = 1, m1 = 1;
        for (int i = 2; i <= n; i++)
            n1 = mod1000000007(n1 * i);
        for (int i = 2; i <= m; i++)
            m1 = mod1000000007(m1 * i);

        System.out.println(mod1000000007(mod1000000007(n1 * m1) * (n == m ? 2 : 1)));
    }

    public static int mod1000000007(long l) {
        l %= 1000000007;
        return (int)(l < 0 ? l + 1000000007 : l);
    }
}