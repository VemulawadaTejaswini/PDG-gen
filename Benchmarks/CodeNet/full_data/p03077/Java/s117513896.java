public class Main {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[]$) {
        long n = scanner.nextLong(), a = scanner.nextLong(), b = scanner.nextLong(), c = scanner.nextLong(), d = scanner.nextLong(), e = scanner.nextLong();
        long min = Math.min(Math.min(Math.min(Math.min(a, b), c), d), e);
        System.out.println((n + min - 1) / min + 4);
    }
}