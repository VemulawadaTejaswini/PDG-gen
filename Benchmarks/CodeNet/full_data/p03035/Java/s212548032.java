import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a >= 6 && a <= 12) {
            System.out.println(a / 2);
        } else if (a <= 5) {
            System.out.println(0);
        } else {
            System.out.println(b);
        }
    }
}
