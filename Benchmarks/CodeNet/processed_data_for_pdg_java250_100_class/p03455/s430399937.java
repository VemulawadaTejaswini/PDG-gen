public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        String result = (((a * b) % 2) == 0) ? "Even" : "Odd";
        System.out.print(result);
    }
}
