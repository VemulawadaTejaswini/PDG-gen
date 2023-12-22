import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int health = scanner.nextInt();
        int attackNumber = scanner.nextInt();

        int sum = 0;
        for (int i = 0; i < attackNumber; i++) {
            sum += scanner.nextInt();
        }
        if (sum >= health) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
