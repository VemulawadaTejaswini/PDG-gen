import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int money = scanner.nextInt();
        int value = (money / 500) * 1000;
        value += ((money % 500) / 5) * 5;
        System.out.println(value);
    }
}
