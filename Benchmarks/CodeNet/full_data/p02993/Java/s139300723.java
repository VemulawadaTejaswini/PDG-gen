import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final String line = scanner.nextLine();
        System.out.println(
                line.charAt(0) == line.charAt(1) ||
                        line.charAt(1) == line.charAt(2) ||
                        line.charAt(2) == line.charAt(3)
                        ? "Bad" : "Good");
    }
}