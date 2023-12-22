import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        int n = scanner.nextInt();

        int divisor = h > w ? h : w;

        if (n % divisor == 0) {
            System.out.println(n / divisor);
        } else {
            System.out.println((n / divisor) + 1);
        }
    }
}
