import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        System.out.println(max != min ? 2 * max - 1: 2 * max);
    }
}
