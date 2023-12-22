import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int timePrice = scanner.nextInt() * scanner.nextInt();
        int fixedAmount = scanner.nextInt();

        System.out.println(timePrice < fixedAmount ? timePrice : fixedAmount);
    }
}
