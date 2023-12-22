
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long A = scanner.nextLong();
        long B = scanner.nextLong();

        if ((A + B) % 2 != 0) {
            System.out.println("IMPOSSIBLE");
            return;
        }

        System.out.println((A + B) / 2);
    }
}
