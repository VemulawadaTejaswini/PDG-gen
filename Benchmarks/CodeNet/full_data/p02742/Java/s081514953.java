import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        long H = scanner.nextInt();
        long W = scanner.nextInt();

        if (H == 1 || W == 1) {
            System.out.println(0);
            return;
        }

        System.out.println((H * W + 1) / 2);
    }
}