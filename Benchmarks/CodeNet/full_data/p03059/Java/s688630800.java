import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final String[] inputs = scanner.nextLine().split(" ");
        final int a = Integer.parseInt(inputs[0]);
        final int b = Integer.parseInt(inputs[1]);
        final int t = Integer.parseInt(inputs[2]);

        System.out.println(t / a * b);
    }
}
