
import java.util.Scanner;


public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long k = (a + b) / 2;
        if ((a + b) % 2 == 1) {
            System.out.println("IMPOSSIBLE");
        } else {
            System.out.println(k);
        }
    }
}
