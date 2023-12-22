public class Main {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        long n = scanner.nextLong(), m = scanner.nextLong();
        System.out.println((m * 2 > n ? (m - n * 2) / 4 : 0) + Math.min(n, m / 2));
    }
}