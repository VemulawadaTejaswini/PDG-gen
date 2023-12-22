import java.util.*;

public class Main {
    private static final String ex = "575";

    public static void main(String[] args) {
        System.out.println(solve(new Scanner(System.in)));
//        System.out.println(solve(new Scanner(ex)));
    }

    private static String solve(Scanner scanner) {
        String s = scanner.nextLine();
        return s.charAt(0) == s.charAt(2) ? "Yes" : "No";
    }
}
