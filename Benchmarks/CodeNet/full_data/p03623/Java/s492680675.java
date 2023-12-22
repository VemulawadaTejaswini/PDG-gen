import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        double a = Math.abs(x - scanner.nextInt());
        double b = Math.abs(x - scanner.nextInt());

        System.out.println((a > b) ? "B" : "A");

    }
}
