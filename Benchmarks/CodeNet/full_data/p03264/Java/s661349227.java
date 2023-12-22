public class Main {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int k = scanner.nextInt();
        System.out.println(Math.pow(k / 2, 2) + ((k & 1) == 0 ? 0 : k / 2));
    }
}