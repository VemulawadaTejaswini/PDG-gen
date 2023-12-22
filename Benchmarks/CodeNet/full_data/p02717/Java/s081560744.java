import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int i1 = scanner.nextInt();
        int i2 = scanner.nextInt();
        int i3 = scanner.nextInt();

        // b a c -> c a b
        System.out.printf("%d %d %d", i3, i1 ,i2);

        scanner.close();
    }
}