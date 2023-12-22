public class Main {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (n == 1 && a != b) System.out.println(0);
        else System.out.println((n - 2) * Math.abs(a - b) + 1);
    }
}