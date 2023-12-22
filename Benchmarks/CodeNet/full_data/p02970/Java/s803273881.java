
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int d = scanner.nextInt();
        int number = n / (2 * d + 1);
        if (n % (2 * d + 1) != 0) {
            ++number;
        }
        System.out.println(number);
    }

}
