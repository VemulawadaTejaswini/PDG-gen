import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        scanner.close();

        if (input.equals("")) {
            System.out.println("No");
            return;
        }

        input = input.replace("hi", "");

        if (input.length() == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
