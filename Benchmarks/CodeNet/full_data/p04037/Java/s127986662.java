import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = 0;
        for (int i = 0; i < n; i++) {
            result ^= scanner.nextInt();
        }
        if (result > 0) {
            System.out.println("First");
        } else {
            System.out.println("Second");
        }
    }
}