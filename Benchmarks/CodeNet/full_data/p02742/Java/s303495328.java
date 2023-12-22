import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        long H = scanner.nextInt();
        long W = scanner.nextInt();
        
        if (H % 2 == 1 || W % 2 == 1) {
            System.out.println((H * W + 1) / 2);
            return;
        }

        System.out.println((H * W) / 2);
    }
}
