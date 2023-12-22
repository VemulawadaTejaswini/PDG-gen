import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        scanner.close();

        char[] c = input.toCharArray();

        if (c[2] == c[3] && c[4] == c[5]) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}