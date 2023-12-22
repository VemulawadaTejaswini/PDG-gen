import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        if (n == 3) {
            System.out.println("Yes");
            System.out.println("3");
            System.out.println("2 1 2");
            System.out.println("2 3 1");
            System.out.println("2 2 3");
        } else {
            System.out.println("No");
        }
    }
}
