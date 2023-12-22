
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        if (B * 2 < A) {
            System.out.println(A - B * 2);
        } else {
            System.out.println(0);
        }
    }
}