public class Main {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        long n = scanner.nextInt(), a = 1, b = 1;
        for (int i = 0; i < n; i++) {
            long j = (long)Math.max(Math.ceil(a / (double)(a = scanner.nextInt())), Math.ceil(b / (double)(b = scanner.nextInt())));
            a *= j;
            b *= j;
        }
        System.out.println(a + b);
    }
}