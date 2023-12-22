import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        scanner.close();

        if (input.contains("7")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
